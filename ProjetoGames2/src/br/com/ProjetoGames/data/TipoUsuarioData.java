package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.TipoUsuarioModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class TipoUsuarioData {
    public ArrayList<TipoUsuarioModel> carregarCombo() throws Exception{
        Conexao c = new Conexao();
        ArrayList<TipoUsuarioModel> dados = new ArrayList<>();
        String sql="Select * from tbtipousuarios order by nivel";
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while(rs.next()){
            TipoUsuarioModel obj = new TipoUsuarioModel();
            obj.setId(rs.getInt("idTipo"));
            obj.setDescricao(rs.getString("descricao"));
            obj.setNivel(rs.getInt("nivel"));
            dados.add(obj); //<-- Adiciona o objeto à lista
        }
        c.getConexao().close();
        ps.close();
        rs.close();
        return dados;
    }
}
