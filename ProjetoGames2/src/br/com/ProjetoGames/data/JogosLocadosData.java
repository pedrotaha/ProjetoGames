package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.JogosModel;
import br.com.ProjetoGames.model.JogosOperacaoModel;
import br.com.ProjetoGames.model.LocacaoModel;
import br.com.ProjetoGames.model.QuantidadeModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JogosLocadosData {

    public ArrayList<JogosModel> pesquisar(UsuarioModel objU) throws Exception {
        Conexao c = new Conexao();
        ArrayList<JogosModel> dados = new ArrayList<>();
        String sql = "select * from tbjogolocad jl, tbusuarios u, tblocacao l, tbjogos j, tbquantidade q where u.id = l.idcli "
                + "and l.idlocacao = jl.idlocacao and j.idjogos = jl.idjogo and q.idjogo = j.idjogos  and jl.status = 1 "
                + "and u.id = ?;";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, objU.getId());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            JogosModel obj = new JogosModel();
            obj.setIdJogos(rs.getInt("idjogos"));
            obj.setTitulo(rs.getString("titulo"));
            obj.setDescricao(rs.getString("descricao"));
            obj.setDataLancamento(calendario(rs.getString("datalancamento")));
            obj.setEstado(rs.getString("estado"));
            obj.setFaixaEtaria(rs.getString("faixaetaria"));
            obj.setGenero(rs.getString("genero"));
            obj.setPlataforma(rs.getString("plataforma"));
            obj.setPublisher(rs.getString("publisher"));
            obj.setSituacao(rs.getString("situacao"));
            obj.setQuantidadeDisponivel(new QuantidadeModel(rs.getInt("quantidadeAlugar"), rs.getInt("quantidadeVender"), rs.getFloat("valorAlugar"), rs.getFloat("valorVender")));
            obj.setImagem(rs.getBytes("imagem"));//imagem or 1??
//            String sql2 = "select imagem from tbjogos where idjogos = ?";
//            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
//            ps2.setInt(1, rs.getInt(obj.getIdJogos()));
//            ResultSet rs2 = ps.executeQuery();
//            while(rs2.next()){
//                byte[] imgBytes = rs.getBytes(1);
//            }

            dados.add(obj);
        }
        c.getConexao().close();
        ps.close();
        rs.close();
        return dados;
    }

//    public LocacaoModel dadosLocacao(UsuarioModel objU) throws Exception {
//        Conexao c = new Conexao();
//        LocacaoModel locacao = new LocacaoModel();
//        String sql = "select * from tbjogolocad jl, tbusuarios u, tblocacao l, tbjogos j, tbquantidade q where u.id = l.idcli "
//                + "and l.idlocacao = jl.idlocacao and j.idjogos = jl.idjogo and q.idjogo = j.idjogos and jl.status = 1  "
//                + "and u.id = ?;";
//        PreparedStatement ps = c.getConexao().prepareStatement(sql);
//        ps.setInt(1, objU.getId());
//        ResultSet rs = ps.executeQuery();
//        while (rs.next()) {
//            locacao.setDataDevolucao(calendario(rs.getString("datadevolucao")));
//        }
//        locacao.setClienteModel(objU);
//        return locacao;
//    }
    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }

    public ArrayList<LocacaoModel> dadosLocacao(UsuarioModel objU) throws Exception {
        int help = 0;
        ArrayList<LocacaoModel> dados = new ArrayList<>();
        LocacaoModel dado = null;
        JogosOperacaoModel jogoloc = null;
        ArrayList<JogosOperacaoModel> carrinho = null;
        JogosModel jogo = null;
        Conexao c = new Conexao();
        String sql = "select * from tblocacao l, tbusuarios u, tbjogolocad jl where u.id = l.idcli and jl.status = 1 "
                + "and l.idlocacao = jl.idlocacao and idcli = ? order by l.idlocacao;";
//                "select * from tbjogolocad jl, tbusuarios u, tblocacao l, tbjogos j, tbquantidade q where u.id = l.idcli "
//                + "and l.idlocacao = jl.idlocacao and j.idjogos = jl.idjogo and q.idjogo = j.idjogos and jl.status = 1  "
//                + "and u.id = ?;";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, objU.getId());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            dado = new LocacaoModel();
            carrinho = new ArrayList<>();
            if (rs.getInt("idlocacao") != help) {
                dado.setClienteModel(objU);
                dado.setDataDevolucao(calendario(rs.getString("datadevolucao")));
                dado.setDataOperacao(calendario(rs.getString("datalocacao")));
                dado.setDesconto(rs.getInt("desconto"));
                dado.setValor(rs.getFloat("valor"));
                dado.setFormaPagamento(rs.getString("formapagamento"));
                dado.setId(rs.getInt("idlocacao"));
                String sql1 = "select * from tbjogolocad jl, tbusuarios u, tblocacao l, tbjogos j, tbquantidade q where u.id = l.idcli "
                        + "and l.idlocacao = jl.idlocacao and j.idjogos = jl.idjogo and q.idjogo = j.idjogos and jl.status = 1  "
                        + "and u.id = ? and l.idlocacao = ?;";
                PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
                ps1.setInt(1, objU.getId());
                ps1.setInt(2, dado.getId());
                ResultSet rs1 = ps1.executeQuery();
                while (rs1.next()) {
                    jogoloc = new JogosOperacaoModel();
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
                    jogo.setQuantidadeDisponivel(new QuantidadeModel(rs1.getInt("quantidadeAlugar"), rs1.getInt("quantidadeVender"), rs1.getFloat("valorAlugar"), rs1.getFloat("valorVender")));
                    jogo.setDataLancamento(calendario(rs1.getString("datalancamento")));
                    jogo.setImagem(rs1.getBytes("imagem"));
                    jogoloc.setJogosModel(jogo);
                    jogoloc.setQuantidade(rs1.getInt("quantidade"));
                    carrinho.add(jogoloc);
                }
                dado.setJogosOperacaoModel(carrinho);
                dados.add(dado);
                ps1.close();
                rs1.close();
                help = dado.getId();
            }
        }
        c.getConexao().close();
        ps.close();
        rs.close();
        return dados;
    }

}
