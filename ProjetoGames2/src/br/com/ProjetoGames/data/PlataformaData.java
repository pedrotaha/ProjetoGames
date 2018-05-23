package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.PlataformaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class PlataformaData {

    public ArrayList<PlataformaModel> pesquisar(String pesq) throws Exception {
        ArrayList<PlataformaModel> dados = new ArrayList<>();
        String sql = "Select * from tbplataformas where nomeplataforma ilike '%" + pesq + "%' order by nomeplataforma";
        Conexao c = new Conexao();
        PreparedStatement ps = c.getConexao().prepareStatement(sql);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            PlataformaModel obj = new PlataformaModel();
            obj.setId(rs.getInt("idplataforma"));
            obj.setNome(rs.getString("nomeplataforma"));
            obj.setDataLancamento(calendario(rs.getString("datalancamento")));
            dados.add(obj);
        }
        return dados;
    }

    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }
}
