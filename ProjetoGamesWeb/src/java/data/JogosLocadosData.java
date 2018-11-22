package data;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import model.JogosModel;
import model.LocacaoModel;
import model.QuantidadeModel;
import model.UsuarioModel;

public class JogosLocadosData {

    public ArrayList<JogosModel> pesquisar(UsuarioModel objU) throws Exception {
        Conexao c = new Conexao();
        ArrayList<JogosModel> dados = new ArrayList<>();
        String sql = "select * from tbjogolocad jl, tbusuarios u, tblocacao l, tbjogos j, tbquantidade q where u.id = l.idcli \n"
                + "and l.idlocacao = jl.idlocacao and j.idjogos = jl.idjogo and q.idjogo = j.idjogos and jl.status = 0 "
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

    public LocacaoModel dadosLocacao(UsuarioModel objU) throws Exception {
        Conexao c = new Conexao();
        LocacaoModel locacao = new LocacaoModel();
        String sql = "select * from tbjogolocad jl, tbusuarios u, tblocacao l, tbjogos j, tbquantidade q where u.id = l.idcli \n"
                + "and l.idlocacao = jl.idlocacao and j.idjogos = jl.idjogo and q.idjogo = j.idjogos and jl.status = 0 "
                + "and u.id = ?;";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setInt(1, objU.getId());
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            locacao.setDataDevolucao(calendario(rs.getString("datadevolucao")));
        }
        locacao.setClienteModel(objU);
        return locacao;
    }

    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }
}
