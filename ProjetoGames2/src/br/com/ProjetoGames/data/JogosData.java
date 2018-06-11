package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.JogosModel;
import br.com.ProjetoGames.model.QuantidadeModel;
import java.io.File;
import java.io.FileInputStream;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class JogosData {

    public boolean incluir(JogosModel obj, File file, FileInputStream fis) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql = "Insert into tbjogos (titulo,genero,estado,situacao,descricao,plataforma,datalancamento,publisher,faixaetaria,imagem) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, obj.getTitulo());
        ps.setString(2, obj.getGenero());
        ps.setString(3, obj.getEstado());
        ps.setString(4, obj.getSituacao());
        ps.setString(5, obj.getDescricao());
        ps.setString(6, obj.getPlataforma());
        ps.setString(7, dateFormat.format(obj.getDataLancamento().getTime()));
        ps.setString(8, obj.getPublisher());
        ps.setString(9, obj.getFaixaEtaria());
        ps.setBinaryStream(10, fis, (int) file.length());
        if (ps.executeUpdate() > 0) {
            c.getConexao().commit();
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            ps.close();
            fis.close();
            return true;
        } else {
            c.getConexao().rollback();
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            ps.close();
            fis.close();
            throw new Exception("Erro ao salvar");
        }
    }

    public ArrayList<JogosModel> pesquisar(String pesq) throws Exception {
        ArrayList<JogosModel> dados = new ArrayList<>();
        String sql = "Select * from tbjogos j, tbquantidade q where j.idjogos = q.idjogo and titulo ilike '%" + pesq + "%' order by titulo";
        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            JogosModel obj = new JogosModel();
            obj.setIdJogos(rs.getInt("id"));
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

    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }

    public boolean excluir(int id) throws Exception {
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "Delete from tbquantidade where idjogo = ?";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.setInt(1, id);
        if (ps1.executeUpdate() > 0) {
            String sql2 = "Delete from tbjogos where idjogos = ?";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setInt(1, id);
            if (ps2.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                ps1.close();
                ps2.close();
                return true;
            } else {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                ps1.close();
                ps2.close();
                throw new Exception("Não foi possível excluir.");
            }
        }
        c.getConexao().rollback();
        c.getConexao().setAutoCommit(true);
        c.getConexao().close();
        ps1.close();
        return false;
    }

    public boolean editar(JogosModel obj, File file, FileInputStream fis) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "Update tbquantidade set quantidadeAlugar=?, quantidadeVender=?, valorAlugar=?,valorVender=? where idjogo=?";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.setInt(1, obj.getQuantidadeDisponivel().getQuantidadeAlugar());
        ps1.setInt(2, obj.getQuantidadeDisponivel().getQuantidadeVender());
        ps1.setFloat(3, obj.getQuantidadeDisponivel().getValorAlugar());
        ps1.setFloat(4, obj.getQuantidadeDisponivel().getValorVender());
        ps1.setInt(5, obj.getIdJogos());
        if (ps1.executeUpdate() > 0) {
            String sql2 = "Update tbjogos set titulo=?, genero=?, estado=?, situacao=?, descricao=?, plataforma=?, datalancamento=?, publisher=?, faixaetaria=?, imagem=? where idjogos=?";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setString(1, obj.getTitulo());
            ps2.setString(2, obj.getGenero());
            ps2.setString(3, obj.getEstado());
            ps2.setString(4, obj.getSituacao());
            ps2.setString(5, obj.getDescricao());
            ps2.setString(6, obj.getPlataforma());
            ps2.setString(7, dateFormat.format(obj.getDataLancamento().getTime()));
            ps2.setString(8, obj.getPublisher());
            ps2.setString(9, obj.getFaixaEtaria());
            ps2.setBinaryStream(10, fis, (int) file.length());
            ps2.setInt(11, obj.getIdJogos());
            if (ps2.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                ps1.close();
                ps2.close();
                fis.close();
                return true;
            } else {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                ps1.close();
                ps2.close();
                fis.close();
                throw new Exception("Não foi possível atualizar.");
            }
        } else {
            c.getConexao().rollback();
            c.getConexao().setAutoCommit(true);
            fis.close();
            throw new Exception("Não foi possível atualizar, erro no Endereço.");
        }
    }

    public boolean jogoUnico(JogosModel obj) throws Exception {
        ArrayList<JogosModel> lista = pesquisar("%%");
        String msg = new String();
        for (JogosModel list : lista) {
            if (list.getTitulo().equals(obj.getTitulo())) {
                throw new Exception("Jogo já cadastrado!\n");
            }
        }
        return true;
    }
}
