package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.JogosModel;
import br.com.ProjetoGames.model.JogosOperacaoModel;
import br.com.ProjetoGames.model.QuantidadeModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class CarrinhoLocacaoData {

    //Exemplo: create table pedido_tmp as select * from pedido where num_pedido is null;
    //Armazenar compra do carrinho nas tabelas temporárias até finalizar compra, 
    //dps armazenar nas tabelas originais e dropar as temporárias
    //tabelas: tbjogolocad, tblocacao, tbjogolocad, tbvendas
    public boolean inserirCarrinho(JogosOperacaoModel op, UsuarioModel obj) throws Exception {
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "create table if not exists tbjogolocad_tmp" + obj.getId() + " as select * from tbjogolocad where idlocacao is null;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        if (ps1.executeUpdate() > 0) {
            String sql2 = "insert into tbjogolocad_tmp" + obj.getId() + " (idjogo, quantidade) values (?,?)";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setInt(1, op.getJogosModel().getIdJogos());
            ps2.setInt(2, op.getQuantidade());
            if (ps2.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                ps1.close();
                ps2.close();
                return true;
            }
        }
        c.getConexao().rollback();
        c.getConexao().setAutoCommit(true);
        c.getConexao().close();
        ps1.close();
        throw new Exception("Erro ao inserir no carrinho.");
    }

    public boolean inserirCarrinhoCompleto(ArrayList<JogosOperacaoModel> op, UsuarioModel obj) throws Exception {
        boolean ver = true;
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "create table if not exists tbjogolocad_tmp" + obj.getId() + " as select * from tbjogolocad where idlocacao is null;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.executeUpdate();
        for (JogosOperacaoModel list : op) {
            String sql2 = "insert into tbjogolocad_tmp" + obj.getId() + " (idjogo, quantidade) values (?,?)";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setInt(1, list.getJogosModel().getIdJogos());
            ps2.setInt(2, list.getQuantidade());
            if (!(ps2.executeUpdate() > 0)) {
                ver = false;
                break;
            }
            ps2.close();
        }
        if (ver) {
            c.getConexao().commit();
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            ps1.close();
            return true;
        }
        c.getConexao().rollback();
        c.getConexao().setAutoCommit(true);
        c.getConexao().close();
        ps1.close();
        throw new Exception("Erro ao inserir no carrinho.");
    }

    public ArrayList<JogosOperacaoModel> getCarrinho(UsuarioModel obj) throws Exception {
        ArrayList<JogosOperacaoModel> carrinho = new ArrayList<>();

        JogosModel jogo = new JogosModel();
        Conexao c = new Conexao();
        String sqla = "SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_schema = 'public' AND table_name = 'tbjogolocad_tmp" + obj.getId() + "');";
        PreparedStatement psa = c.getConexao().prepareStatement(sqla);
        ResultSet rsa = psa.executeQuery();
        if (rsa.next()) {
            if (rsa.getBoolean("exists")) {
                String sql = "select * from tbjogolocad_tmp" + obj.getId() + ";";
                PreparedStatement ps = c.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    JogosOperacaoModel jogoloc = new JogosOperacaoModel();
                    String sql1 = "select * from tbjogos j, tbquantidade q where j.idjogos = q.idjogo and idjogos = " + rs.getInt("idjogo") + ";";
                    PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
                    ResultSet rs1 = ps1.executeQuery();
                    while (rs1.next()) {
                        jogo = new JogosModel();
                        jogo.setDescricao(rs1.getString("descricao"));
                        jogo.setEstado(rs1.getString("estado"));
                        jogo.setFaixaEtaria(rs1.getString("faixaetaria"));
                        jogo.setGenero(rs1.getString("genero"));
                        jogo.setIdJogos(rs1.getInt("idJogos"));
                        jogo.setPlataforma(rs1.getString("plataforma"));
                        jogo.setPublisher(rs1.getString("publisher"));
                        jogo.setSituacao(rs1.getString("situacao"));
                        jogo.setTitulo(rs1.getString("titulo"));
                        QuantidadeModel qnt = new QuantidadeModel();
                        qnt.setQuantidadeAlugar(rs1.getInt("quantidadeAlugar"));
                        qnt.setQuantidadeVender(rs1.getInt("quantidadeVender"));
                        qnt.setValorAlugar(rs1.getFloat("valorAlugar"));
                        qnt.setValorVender(rs1.getFloat("valorVender"));
                        jogo.setQuantidadeDisponivel(qnt);
                        jogo.setDataLancamento(calendario(rs1.getString("datalancamento")));
                        jogo.setImagem(rs1.getBytes("imagem"));
                    }
                    jogoloc.setJogosModel(jogo);
                    jogoloc.setQuantidade(rs.getInt("quantidade"));
                    ps1.close();
                    rs1.close();
                    carrinho.add(jogoloc);
                }
                c.getConexao().close();
                ps.close();
                rs.close();
            }
            psa.close();
            rsa.close();
        }
        return carrinho;
    }

    public int validarCupom(String cupom, UsuarioModel obj) throws Exception {
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql = "select * from tbCupons where nomeCupom ='" + cupom + "';";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        int percent = 0;
        if (rs.next()) {
            percent = rs.getInt("percent");
        } else {
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            rs.close();
            ps.close();
            throw new Exception("Cupom Inválido");
        }
        String sql1 = "select * from tbCuponsAtivados where idCupom= " + rs.getInt("idCupom") + " and idCli= " + obj.getId() + " ;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ResultSet rs1 = ps1.executeQuery();
        if (!rs1.next()) {
            String sql2 = "insert into tbcuponsAtivados (idCupom,idCli) values (?,?);";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setInt(1, rs.getInt("idCupom"));
            ps2.setInt(2, obj.getId());
            if (ps2.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                rs.close();
                rs1.close();
                ps.close();
                ps1.close();
                ps2.close();
                return percent;
            } else {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                rs.close();
                rs1.close();
                ps.close();
                ps1.close();
                ps2.close();
                throw new Exception("Cupom já ativado");
            }
        } else {
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            rs.close();
            rs1.close();
            ps.close();
            ps1.close();
            throw new Exception("Cupom já ativado");
        }
    }

    public boolean removeItem(UsuarioModel obj, JogosOperacaoModel lista) throws Exception {
        Conexao c = new Conexao();
        String sql = "delete from tbjogolocad_tmp" + obj.getId() + " where idjogo = ?;";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, lista.getJogosModel().getIdJogos());
        if (ps.executeUpdate() > 0) {
            ps.close();
            c.getConexao().close();
            return true;
        }
        ps.close();
        c.getConexao().close();
        throw new Exception("Erro ao remover o item do carrinho!");
    }

    public boolean inserirCar(ArrayList<JogosOperacaoModel> op, UsuarioModel obj) throws Exception {
        boolean ver = true;
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "create table if not exists tbjogolocad_tmp" + obj.getId() + " as select * from tbjogolocad where idlocacao is null;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.executeUpdate();
        String sqla = "truncate table tbjogolocad_tmp" + obj.getId() + ";";
        PreparedStatement psa = c.getConexao().prepareStatement(sqla);
        psa.executeUpdate();
        for (JogosOperacaoModel list : op) {
            String sql2 = "insert into tbjogolocad_tmp" + obj.getId() + " (idjogo, quantidade) values (?,?)";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setInt(1, list.getJogosModel().getIdJogos());
            ps2.setInt(2, list.getQuantidade());
            if (!(ps2.executeUpdate() > 0)) {
                ver = false;
                break;
            }
            ps2.close();
        }
        if (ver) {
            c.getConexao().commit();
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            ps1.close();
            psa.close();
            return true;
        }
        c.getConexao().rollback();
        c.getConexao().setAutoCommit(true);
        c.getConexao().close();
        ps1.close();
        psa.close();
        throw new Exception("Erro ao inserir no carrinho.");
    }

    public boolean verEstoque(JogosOperacaoModel jogoOp, UsuarioModel obj) throws Exception {
        Conexao c = new Conexao();
        int quantidadeEstoque = 0;
        int quantidadeCar = 0;
        String sqla = "SELECT EXISTS (SELECT 1 FROM information_schema.tables WHERE table_schema = 'public' AND table_name = 'tbjogolocad_tmp" + obj.getId() + "');";
        PreparedStatement psa = c.getConexao().prepareStatement(sqla);
        ResultSet rsa = psa.executeQuery();
        if (rsa.next()) {
            if (rsa.getBoolean("exists")) {
                String sql1 = "select idjogo, quantidade from tbjogolocad_tmp" + obj.getId() + " where idjogo = " + jogoOp.getJogosModel().getIdJogos() + ";";
                PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
                ResultSet rs1 = ps1.executeQuery();
                if (rs1.next()) {
                    quantidadeCar = rs1.getInt("quantidade");
                    quantidadeCar += jogoOp.getQuantidade();
                    String sql2 = "select quantidadevender from tbquantidade where idjogo = " + jogoOp.getJogosModel().getIdJogos() + ";";
                    PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
                    ResultSet rs2 = ps2.executeQuery();
                    while (rs2.next()) {
                        quantidadeEstoque = rs2.getInt("quantidadevender");
                        if ((quantidadeEstoque - quantidadeCar) < 0) {
                            c.getConexao().close();
                            ps1.close();
                            rs1.close();
                            ps2.close();
                            rs2.close();
                            return false;
                        } else {
                            c.getConexao().close();
                            ps1.close();
                            rs1.close();
                            ps2.close();
                            rs2.close();
                            return true;
                        }
                    }
                } else {
                    c.getConexao().close();
                    ps1.close();
                    rs1.close();
                    return true;
                }
            }
        }
        return true;
    }

    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }
}
