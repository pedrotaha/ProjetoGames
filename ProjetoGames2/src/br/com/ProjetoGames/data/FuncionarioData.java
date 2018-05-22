package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.FuncionarioModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FuncionarioData extends UsuarioData {

    public boolean incluirF(FuncionarioModel objFunc) throws Exception {
        UsuarioModel obj = new UsuarioModel(objFunc);
        //if (super.incluir(obj)) {
        try {
            Conexao c = super.incluirC(obj);
            String sql2 = "select max(id) as id from tbusuarios";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ResultSet rs = ps2.executeQuery();
            int id = 0;
            if (rs.next()) {
                id = rs.getInt("id");
            }
            String sql = "Insert into tbfuncionarios (idusuario,salario,cargo,cargahoraria,estadocivil) values (?,?,?,?,?)";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setInt(1, id);
            ps.setFloat(2, objFunc.getSalario());
            ps.setString(3, objFunc.getCargo());
            ps.setString(4, objFunc.getCargaHoraria());
            ps.setString(5, objFunc.getEstadoCivil());
            if (ps.executeUpdate() > 0) {
                c.getConexao().commit();
                c.getConexao().setAutoCommit(true);
                return true;
            } else {
                c.getConexao().rollback();
                c.getConexao().setAutoCommit(true);
                throw new Exception("Ocorreu erro ao salvar o Funcionário");
            }
        } catch (Exception e) {
            throw new Exception("Ocorreu erro ao salvar" + e.getMessage());
        }

        //} else {
        //}
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

    public FuncionarioModel pesquisarObj(UsuarioModel objU) throws Exception {
        Conexao c = new Conexao();
        FuncionarioModel obj = new FuncionarioModel(objU, 0, "", "", "");
        String sql = "Select * from tbusuarios u, tbfuncionarios f where u.id = f.idusuario and u.id = " + objU.getId() + " order by nome";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            obj.setCargaHoraria(rs.getString("cargahoraria"));
            obj.setCargo(rs.getString("cargo"));
            obj.setEstadoCivil(rs.getString("estadocivil"));
            obj.setSalario(rs.getFloat("salario"));
        }
        return obj;
    }

    public boolean excluirF(int id) throws Exception {
        if (super.excluir(id)) {
            Conexao c = new Conexao();
            c.getConexao().setAutoCommit(false);
            String sql = "Select * from tbusuarios u, tbfuncionarios f where u.id = f.idusuario and u.id = " + id + " order by nome";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                String sql1 = "Delete from tbfuncionarios where idusuario=?";
                PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
                ps1.setInt(1, id);
                if (ps1.executeUpdate() > 0) {
                    c.getConexao().commit();
                    c.getConexao().setAutoCommit(true);
                    return true;
                } else {
                    c.getConexao().rollback();
                    c.getConexao().setAutoCommit(true);
                    throw new Exception("Não foi possível excluir o Funcionário.");
                }
            }
        } else {
            throw new Exception("Não foi possível excluir.");
        }
        return true;
    }

    public boolean editarF(FuncionarioModel objFunc) throws Exception {
        FuncionarioModel obj1 = new FuncionarioModel();
        UsuarioModel obj = new UsuarioModel(objFunc);
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        if (super.editar(obj)) {
            String sql = "Update tbfuncionarios set cargo=?, cargahoraria=?, estadocivil=?, salario=? where idusuario=?";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setString(1, objFunc.getCargo());
            ps.setString(2, objFunc.getCargaHoraria());
            ps.setString(3, objFunc.getEstadoCivil());
            ps.setFloat(4, objFunc.getSalario());
            ps.setInt(5, objFunc.getId());
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
            FuncionarioModel func;
            Conexao c = new Conexao();
            String sql = "select * from tbfuncionarios where idusuario=?";
            PreparedStatement ps = c.getConexao().prepareStatement(sql);
            ps.setInt(1, obj.getId());
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                func = new FuncionarioModel(obj, rs.getFloat("salario"), rs.getString("cargo"), rs.getString("cargahoraria"), rs.getString("estadocivil"));
                return func;
            }
        } catch (Exception e) {
            throw new Exception("Login Inválido.");
        }
        throw new Exception("Login Inválido.");
    }
}
