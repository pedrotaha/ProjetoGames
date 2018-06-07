package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.EnderecoModel;
import br.com.ProjetoGames.model.TipoUsuarioModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class UsuarioData {

    public boolean incluir(UsuarioModel obj) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql = "Insert into tbusuarios (nome,cpf,telefone,email,sexo,datanasc,login,senha,datacadastro,idtipo) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getCpf());
        ps.setString(3, obj.getTelefone());
        ps.setString(4, obj.getEmail());
        ps.setString(5, obj.getSexo());
        ps.setString(6, dateFormat.format(obj.getDataNasc().getTime()));
        ps.setString(7, obj.getLogin());
        ps.setString(8, obj.getSenha());
        ps.setString(9, dateFormat.format(obj.getDataCadastro().getTime()));
        ps.setInt(10, obj.getTipoUsuarioModel().getId());
        if (ps.executeUpdate() > 0) {
            String sql2 = "select max(id) as id from tbusuarios";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ResultSet rs = ps2.executeQuery();
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id");
            }
            String sql3 = "Insert into tbendereco (idusuario,pais,estado,cidade,bairro,rua,numero,cep,complemento) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps3 = c.getConexao().prepareStatement(sql3);
            ps3.setInt(1, id);
            ps3.setString(2, obj.getEnderecoModel().getPais());
            ps3.setString(3, obj.getEnderecoModel().getEstado());
            ps3.setString(4, obj.getEnderecoModel().getCidade());
            ps3.setString(5, obj.getEnderecoModel().getBairro());
            ps3.setString(6, obj.getEnderecoModel().getRua());
            ps3.setInt(7, obj.getEnderecoModel().getNumero());
            ps3.setString(8, obj.getEnderecoModel().getCep());
            ps3.setString(9, obj.getEnderecoModel().getComplemento());
            if (ps3.executeUpdate() == 0) {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                ps.close();
                ps2.close();
                ps3.close();
                rs.close();
                throw new Exception("Ocorreu erro ao salvar o Endereço");
            } else {
                if (obj.getTipoUsuarioModel().getNivel() < 1) {
                    c.getConexao().commit();
                    c.getConexao().setAutoCommit(true);
                    c.getConexao().close();
                }
                ps.close();
                ps2.close();
                ps3.close();
                rs.close();
                return true;
            }
        } else {
            throw new Exception("Erro ao salvar");
        }
    }

    public Conexao incluirC(UsuarioModel obj) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql = "Insert into tbusuarios (nome,cpf,telefone,email,sexo,datanasc,login,senha,datacadastro,idtipo) values (?,?,?,?,?,?,?,?,?,?)";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, obj.getNome());
        ps.setString(2, obj.getCpf());
        ps.setString(3, obj.getTelefone());
        ps.setString(4, obj.getEmail());
        ps.setString(5, obj.getSexo());
        ps.setString(6, dateFormat.format(obj.getDataNasc().getTime()));
        ps.setString(7, obj.getLogin());
        ps.setString(8, obj.getSenha());
        ps.setString(9, dateFormat.format(obj.getDataCadastro().getTime()));
        ps.setInt(10, obj.getTipoUsuarioModel().getId());
        if (ps.executeUpdate() > 0) {
            String sql2 = "select max(id) as id from tbusuarios";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ResultSet rs = ps2.executeQuery();
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id");
            }
            String sql3 = "Insert into tbendereco (idusuario,pais,estado,cidade,bairro,rua,numero,cep,complemento) values(?,?,?,?,?,?,?,?,?)";
            PreparedStatement ps3 = c.getConexao().prepareStatement(sql3);
            ps3.setInt(1, id);
            ps3.setString(2, obj.getEnderecoModel().getPais());
            ps3.setString(3, obj.getEnderecoModel().getEstado());
            ps3.setString(4, obj.getEnderecoModel().getCidade());
            ps3.setString(5, obj.getEnderecoModel().getBairro());
            ps3.setString(6, obj.getEnderecoModel().getRua());
            ps3.setInt(7, obj.getEnderecoModel().getNumero());
            ps3.setString(8, obj.getEnderecoModel().getCep());
            ps3.setString(9, obj.getEnderecoModel().getComplemento());
            if (ps3.executeUpdate() == 0) {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                c.getConexao().close();
                ps.close();
                ps2.close();
                ps3.close();
                rs.close();
                throw new Exception("Ocorreu erro ao salvar o Endereço");
            } else {
                if (obj.getTipoUsuarioModel().getNivel() < 1) {
                    c.getConexao().commit();
                    c.getConexao().setAutoCommit(true);
                    c.getConexao().close();
                }
                ps.close();
                ps2.close();
                ps3.close();
                rs.close();
                return c;
            }
        } else {
            throw new Exception("Erro ao salvar");
        }
    }

    public ArrayList<UsuarioModel> pesquisar(String pesq) throws Exception {
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String sql = "Select * from tbusuarios u, tbtipousuarios t, tbendereco e "
                + "where u.idtipo = t.idtipo and u.id = e.idusuario and u.nome ilike '%" + pesq + "%' order by nome";
        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            UsuarioModel obj = new UsuarioModel();
            obj.setId(rs.getInt("id"));
            obj.setNome(rs.getString("nome"));
            obj.setCpf(rs.getString("cpf"));
            obj.setEmail(rs.getString("email"));
            obj.setLogin(rs.getString("login"));
            obj.setSenha("");
            obj.setSexo(rs.getString("sexo"));
            obj.setTelefone(rs.getString("telefone"));
            obj.setDataCadastro(calendario(rs.getString("datacadastro")));//Testar e corrigir
            obj.setDataNasc(calendario(rs.getString("dataNasc")));
            obj.setTipoUsuarioModel(new TipoUsuarioModel(rs.getInt("idTipo"), rs.getString("descricao"), rs.getInt("nivel")));
            obj.setEnderecoModel(new EnderecoModel(rs.getString("pais"), rs.getString("estado"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("rua"), rs.getInt("numero"), rs.getString("cep"), rs.getString("complemento")));
            dados.add(obj);
        }
        c.getConexao().close();
        ps.close();
        rs.close();
        return dados;
    }

    public ArrayList<UsuarioModel> pesquisarTudo() throws Exception {
        ArrayList<UsuarioModel> dados = new ArrayList<>();
        String sql = "Select * from tbusuarios";
        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            UsuarioModel obj = new UsuarioModel();
            obj.setId(rs.getInt("id"));
            obj.setNome(rs.getString("nome"));
            obj.setCpf(rs.getString("cpf"));
            obj.setEmail(rs.getString("email"));
            obj.setLogin(rs.getString("login"));
            dados.add(obj);
        }
        c.getConexao().close();
        ps.close();
        rs.close();
        return dados;
    }

    public boolean excluir(int id) throws Exception {
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "Delete from tbendereco where idusuario=?";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.setInt(1, id);
        if (ps1.executeUpdate() > 0) {
            String sql2 = "Delete from tbusuarios where id=?";
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
        return false;
    }

    public boolean editar(UsuarioModel obj) throws Exception {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "Update tbendereco set pais=?, estado=?, cidade=?,bairro=?, rua=?, numero=?, cep=?, complemento=? where idusuario=?";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.setString(1, obj.getEnderecoModel().getPais());
        ps1.setString(2, obj.getEnderecoModel().getEstado());
        ps1.setString(3, obj.getEnderecoModel().getCidade());
        ps1.setString(4, obj.getEnderecoModel().getBairro());
        ps1.setString(5, obj.getEnderecoModel().getRua());
        ps1.setInt(6, obj.getEnderecoModel().getNumero());
        ps1.setString(7, obj.getEnderecoModel().getCep());
        ps1.setString(8, obj.getEnderecoModel().getComplemento());
        ps1.setInt(9, obj.getId());
        if (ps1.executeUpdate() > 0) {
            String sql2 = "Update tbusuarios set nome=?, cpf=?, telefone=?, email=?, sexo=?, datanasc=?, login=?, idtipo=?, datacadastro=? where id=?";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ps2.setString(1, obj.getNome());
            ps2.setString(2, obj.getCpf());
            ps2.setString(3, obj.getTelefone());
            ps2.setString(4, obj.getEmail());
            ps2.setString(5, obj.getSexo());
            ps2.setString(6, dateFormat.format(obj.getDataNasc().getTime()));
            ps2.setString(7, obj.getLogin());
            ps2.setInt(8, obj.getTipoUsuarioModel().getId());
            ps2.setString(9, dateFormat.format(obj.getDataCadastro().getTime()));
            ps2.setInt(10, obj.getId());
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
                throw new Exception("Não foi possível atualizar.");
            }
        } else {
            c.getConexao().rollback();
            c.getConexao().setAutoCommit(true);
            throw new Exception("Não foi possível atualizar, erro no Endereço.");
        }
    }

    public UsuarioModel validarUsuario(String user, String senha) throws Exception {
        UsuarioModel obj = null;
        Conexao c = new Conexao();
        String sql = "Select * from tbusuarios u, tbendereco e, tbtipousuarios t where u.id = e.idusuario "
                + "and u.idtipo = t.idtipo and login=? and senha=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, user);
        ps.setString(2, senha);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            TipoUsuarioModel tp = new TipoUsuarioModel(rs.getInt("idtipo"), rs.getString("descricao"), rs.getInt("nivel"));
            EnderecoModel end = new EnderecoModel(rs.getString("pais"), rs.getString("estado"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("rua"), rs.getInt("numero"), rs.getString("cep"), rs.getString("complemento"));
            obj = new UsuarioModel(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"), rs.getString("email"),
                    rs.getString("sexo"), end, calendario(rs.getString("datanasc")), rs.getString("login"), "", calendario(rs.getString("datacadastro")), tp);
            c.getConexao().close();
            ps.close();
            rs.close();
            return obj;
        } else {
            c.getConexao().close();
            ps.close();
            rs.close();
            throw new Exception("Login Inválido.");
        }
    }

    public boolean usuarioUnico(UsuarioModel obj) throws Exception {
        ArrayList<UsuarioModel> lista = pesquisarTudo();
        String msg = new String();
        for (UsuarioModel list : lista) {
            if (list.getLogin().equals(obj.getLogin())) {
                msg += "Login já cadastrado!\n";
                if (list.getEmail().equals(obj.getEmail())) {
                    msg += "E-mail já cadastrado!\n";
                }
                throw new Exception(msg);
            } else {
                if (list.getEmail().equals(obj.getEmail())) {
                    msg += "E-mail já cadastrado!\n";
                    if (list.getLogin().equals(obj.getLogin())) {
                        msg += "Login já cadastrado!\n";
                    }
                    throw new Exception(msg);
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

    public boolean alterarSenha(UsuarioModel obj) throws Exception {
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "Update tbusuarios set senha=? where id=?";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.setString(1, obj.getSenha());
        ps1.setInt(2, obj.getId());
        if (ps1.executeUpdate() > 0) {
            c.getConexao().commit();
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            ps1.close();
            return true;
        } else {
            c.getConexao().rollback();
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            ps1.close();
            throw new Exception("Não foi possível atualizar.");
        }
    }

    public UsuarioModel verEmailLogin(String login, String email) throws Exception {
        UsuarioModel obj = null;
        Conexao c = new Conexao();
        String sql = "Select * from tbusuarios u, tbendereco e, tbtipousuarios t where u.id = e.idusuario "
                + "and u.idtipo = t.idtipo and login=? and email=?";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ps.setString(1, login);
        ps.setString(2, email);
        ResultSet rs = ps.executeQuery();
        if (rs.next()) {
            TipoUsuarioModel tp = new TipoUsuarioModel(rs.getInt("idtipo"), rs.getString("descricao"), rs.getInt("nivel"));
            EnderecoModel end = new EnderecoModel(rs.getString("pais"), rs.getString("estado"), rs.getString("cidade"), rs.getString("bairro"), rs.getString("rua"), rs.getInt("numero"), rs.getString("cep"), rs.getString("complemento"));
            obj = new UsuarioModel(rs.getInt("id"), rs.getString("nome"), rs.getString("cpf"), rs.getString("telefone"), rs.getString("email"),
                    rs.getString("sexo"), end, calendario(rs.getString("datanasc")), rs.getString("login"), "", calendario(rs.getString("datacadastro")), tp);
            c.getConexao().close();
            ps.close();
            rs.close();
            return obj;
        } else {
            c.getConexao().close();
            ps.close();
            rs.close();
            throw new Exception("Login Inválido.");
        }
    }
}
