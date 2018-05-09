package br.com.ProjetoGames.data.localizar;

import br.com.ProjetoGames.model.localizar.LocalModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class LocalData {
        public ArrayList<LocalModel> pesquisarPais() throws Exception {
        ArrayList<LocalModel> dados = new ArrayList<>();
        String sql = "Select sl_nome from pais order by sl_nome";
        ConectLocal c = new ConectLocal();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            LocalModel obj = new LocalModel();
            obj.setNomePais(rs.getString("sl_nome"));
            dados.add(obj);
        }
        return dados;
    }
}
