package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.JogosModel;
import model.JogosOperacaoModel;
import model.LocacaoModel;
import model.QuantidadeModel;
import model.UsuarioModel;

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

    public LocacaoModel dadosLocacao(UsuarioModel objU) throws Exception {
        LocacaoModel dado = new LocacaoModel();
        ArrayList<JogosOperacaoModel> carrinho = new ArrayList<>();
        JogosModel jogo = new JogosModel();
        Conexao c = new Conexao();
        String sql = "select * from tblocacao l, tbusuarios u where u.id = l.idcli and idcli = ?;";
//                "select * from tbjogolocad jl, tbusuarios u, tblocacao l, tbjogos j, tbquantidade q where u.id = l.idcli "
//                + "and l.idlocacao = jl.idlocacao and j.idjogos = jl.idjogo and q.idjogo = j.idjogos and jl.status = 1  "
//                + "and u.id = ?;";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, objU.getId());
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
        return dado;
    }

}
