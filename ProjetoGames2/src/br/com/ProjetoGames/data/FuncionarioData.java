package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.EnderecoModel;
import br.com.ProjetoGames.model.FuncionarioModel;
import br.com.ProjetoGames.model.TipoUsuarioModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class FuncionarioData extends UsuarioData {

    public boolean incluir(FuncionarioModel obj) throws Exception {
        if (super.incluir(obj)) {
            Conexao c = new Conexao();
            c.getConexao().setAutoCommit(false);
            String sql = "Insert into tbusuario (idusuario,salario,cargo,cargahoraria,estadocivil) values (?,?,?,?,?)";
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
        ArrayList<FuncionarioModel> listaF = new ArrayList<>();
        ArrayList<UsuarioModel> lista = super.pesquisar(pesq);
        for (UsuarioModel list : lista) {
            if (list.getTipoUsuarioModel().getId() < 1) {
                lista.remove(list);
            }else{
                FuncionarioModel obj = new FuncionarioModel();
                obj.setNome(list.getNome());
                obj.setCpf(list.getCpf());
                obj.setEmail(list.getEmail());
                obj.setEnderecoModel(list.getEnderecoModel());
                obj.setId(list.getId());
                obj.setLogin(list.getLogin());
                obj.setSexo(list.getSexo());
                obj.setTelefone(list.getTelefone());
                obj.setTipoUsuarioModel(list.getTipoUsuarioModel());
                obj.setDataCadastro(list.getDataCadastro());
                obj.setDataNasc(list.getDataNasc());
                listaF.add(obj);
            }
        }
        S
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
        return listaF;
    }

    public boolean excluir(int id) throws Exception {
        return true;
    }

    public boolean editar(FuncionarioModel obj) throws Exception {
        return true;
    }
}
