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

public class CarrinhoData {

    //Exemplo: create table pedido_tmp as select * from pedido where num_pedido is null;
    //Armazenar compra do carrinho nas tabelas temporárias até finalizar compra, 
    //dps armazenar nas tabelas originais e dropar as temporárias
    //tabelas: tbjogolocad, tblocacao, tbjogovend, tbvendas
    public boolean inserirCarrinho(JogosOperacaoModel op, UsuarioModel obj) throws Exception {
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "create table if not exists tbjogovend_tmp" + obj.getId() + " as select * from tbjogovend where idvenda is null;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        if (ps1.executeUpdate() > 0) {
            String sql2 = "insert into tbjogovend_tmp" + obj.getId() + " (idjogo, quantidade) values (?,?)";
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
        String sql1 = "create table if not exists tbjogovend_tmp"+obj.getId()+" as select * from tbjogovend where idvenda is null;";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        if (ps1.executeUpdate() > 0) {
            for (JogosOperacaoModel list : op) {
                String sql2 = "insert into tbjogovend_tmp" + obj.getId() + " (idjogo, quantidade) values (?,?)";
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
        String sql = "select * from tbjogovend_tmp" + obj.getId() + ";";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            JogosOperacaoModel car = new JogosOperacaoModel();
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
            car.setJogosModel(jogo);
            car.setQuantidade(rs.getInt("quantidade"));
            ps1.close();
            rs1.close();
        }
        c.getConexao().close();
        ps.close();
        rs.close();
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

    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }
}
