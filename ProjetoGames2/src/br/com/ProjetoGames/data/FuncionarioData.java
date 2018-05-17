package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.FuncionarioModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FuncionarioData extends UsuarioData {

    public boolean incluir(FuncionarioModel obj) throws Exception {
        UsuarioData DAO = new UsuarioData();
        if (DAO.incluir(obj)) {
            Conexao c = new Conexao();
            c.getConexao().setAutoCommit(false);
            String sql = "Insert into tbfuncionarios (idusuario,salario,cargo,cargahoraria,estadocivil) values (?,?,?,?,?)";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ps.setFloat(2, obj.getSalario());
            ps.setString(3, obj.getCargo());
            ps.setString(4, obj.getCargaHoraria());
            ps.setString(5, obj.getEstadoCivil());
            if (ps.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                return true;
            } else {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                throw new Exception("Ocorreu erro ao salvar o Funcionário");
            }
        } else {
            throw new Exception("Ocorreu erro ao salvar");
        }
    }

    public ArrayList<FuncionarioModel> pesquisarF(String pesq) throws Exception {
        Conexao c = new Conexao();
        ArrayList<FuncionarioModel> listaF = new ArrayList<>();
        ArrayList<UsuarioModel> lista = super.pesquisar(pesq);
        for (UsuarioModel list : lista) {
            if (list.getTipoUsuarioModel().getId() < 1) {
                lista.remove(list);
            } else {
                FuncionarioModel obj = new FuncionarioModel();
                obj.setId(list.getId());
                obj.setNome(list.getNome());
                obj.setCpf(list.getCpf());
                obj.setEmail(list.getEmail());
                obj.setEnderecoModel(list.getEnderecoModel());
                obj.setLogin(list.getLogin());
                obj.setSexo(list.getSexo());
                obj.setTelefone(list.getTelefone());
                obj.setTipoUsuarioModel(list.getTipoUsuarioModel());
                obj.setDataCadastro(list.getDataCadastro());
                obj.setDataNasc(list.getDataNasc());
                String sql = "Select * from tbusuarios u, tbfuncionarios f where u.id = f.idusuario and u.id = " + list.getId() + " order by nome";
                PreparedStatement ps = c.getConexao().prepareStatement(sql);
                ResultSet rs = ps.executeQuery();
                while (rs.next()) {
                    obj.setCargaHoraria(rs.getString("cargahoraria"));
                    obj.setCargo(rs.getString("cargo"));
                    obj.setEstadoCivil(rs.getString("estadocivil"));
                    obj.setSalario(rs.getFloat("salario"));
                }
                listaF.add(obj);
            }
        }
        return listaF;
    }

    public boolean excluir(int id) throws Exception {
        if (super.excluir(id)) {
            Conexao c = new Conexao();
            c.getConexao().setAutoCommit(false);
            String sql = "Delete from tbfuncionarios where idusuario=?";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            if (ps.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                return true;
            } else {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                throw new Exception("Não foi possível excluir o Funcionário.");
            }
        } else {
            throw new Exception("Não foi possível excluir.");
        }
    }

    public boolean editar(FuncionarioModel obj) throws Exception {
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        if (super.editar(obj)) {
            String sql = "Update tbfuncionarios set cargo=?, cargahoraria=?, estadocivil=?, salario=? where idusuario=?";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setString(1, obj.getCargo());
            ps.setString(2, obj.getCargaHoraria());
            ps.setString(3, obj.getEstadoCivil());
            ps.setFloat(4, obj.getSalario());
            ps.setInt(5, obj.getId());
            if (ps.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                return true;
            } else {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                throw new Exception("Não foi possível atualizar o Funcionário.");
            }
        } else {
            c.getConexao().rollback();
            c.getConexao().setAutoCommit(true);
            throw new Exception("Não foi possível atualizar.");
        }

    }

    public FuncionarioModel validarFuncionario(String user, String senha) throws Exception {
        try {
            FuncionarioModel func = null;
            Conexao c = new Conexao();
            UsuarioModel obj = super.validarUsuario(user, senha);
            String sql = "select * from tbfuncionarios where id=?";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                func = new FuncionarioModel(obj, 0, "", "", "");
                func.setCargaHoraria(rs.getString("cargahoraria"));
                func.setCargo(rs.getString("cargo"));
                func.setEstadoCivil(rs.getString("estadocivil"));
                func.setSalario(rs.getFloat("salario"));
                return func;
            }
        } catch (Exception e) {
            throw new Exception("Login Inválido.");
        }
        throw new Exception("Login Inválido.");
    }
    
    public FuncionarioModel validarFuncionarioObj(UsuarioModel obj) throws Exception {
        try {
            FuncionarioModel func = null;
            Conexao c = new Conexao();
            String sql = "select * from tbfuncionarios where id=?";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                func = new FuncionarioModel(obj, 0, "", "", "");
                func.setCargaHoraria(rs.getString("cargahoraria"));
                func.setCargo(rs.getString("cargo"));
                func.setEstadoCivil(rs.getString("estadocivil"));
                func.setSalario(rs.getFloat("salario"));
                return func;
            }
        } catch (Exception e) {
            throw new Exception("Login Inválido.");
        }
        throw new Exception("Login Inválido.");
    }
}
