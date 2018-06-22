package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.JogosOperacaoModel;
import br.com.ProjetoGames.model.VendaModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class VendaData extends OperacaoData {

    //Exemplo: create table pedido_tmp as select * from pedido where num_pedido is null;
    //Armazenar compra do carrinho nas tabelas temporárias até finalizar compra, 
    //dps armazenar nas tabelas originais e dropar as temporárias
    //tabelas: tbjogolocad, tblocacao, tbjogovend, tbvendas
    public boolean finalizarCompra(VendaModel venda) throws Exception {//, JogosOperacaoModel lista, UsuarioModel obj
        //insere na tabela tbvendas os detalhes
        //select * from tbjogovend_tmp+obj.getId()+";"
        //select max(id) from tbvendas;
        //resultado: insert on table tbjogovend
        //select idjogos da tbjogovend_tmp+obj.getId()+";"
        //para atualizar a quantidade restante em estoque na tabela tbquantidade
        //"drop table tbjogovend_tmp+obj.getId()+";"
        ArrayList<JogosOperacaoModel> lista = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "insert into tbvendas (idcli,datacompra,hora,valor,formapagamento,tipo, desconto) values (?,?,?,?,?,?,?);";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.setInt(1, venda.getClienteModel().getId());
        ps1.setString(2, dateFormat.format(venda.getDataOperacao()));
        ps1.setString(3, fmt.format(venda.getDataOperacao()));
        ps1.setFloat(4, venda.getValor());
        ps1.setString(5, venda.getFormaPagamento());
        ps1.setString(6, venda.getTipo());
        ps1.setInt(7, venda.getDesconto());
        if (ps1.executeUpdate() > 0) {
            int id = 0;
            String sql2 = "select max(idvenda) as \"idvenda\" from tbvendas;";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                id = rs2.getInt("idvenda");
            }
            String sql3 = "select * from tbjogovend_tmp" + venda.getClienteModel().getId() + ";";
            PreparedStatement ps3 = c.getConexao().prepareStatement(sql3);
            ResultSet rs3 = ps3.executeQuery();
            while (rs3.next()) {
                JogosOperacaoModel jogoOp = new JogosOperacaoModel();
                jogoOp.getJogosModel().setIdJogos(rs3.getInt("idjogo"));
                jogoOp.setQuantidade(rs3.getInt("quantidade"));
                lista.add(jogoOp);
            }
            for (JogosOperacaoModel list : lista) {
                String sql4 = "insert into tbjogovend (idvenda, idjogo quantidade) values (?,?,?)";
                PreparedStatement ps4 = c.getConexao().prepareStatement(sql4);
                ps4.setInt(1, id);
                ps4.setInt(2, list.getJogosModel().getIdJogos());
                ps4.setInt(3, list.getQuantidade());
                ps4.executeUpdate();
                ps4.close();
            }
            c.getConexao().commit();
            c.getConexao().setAutoCommit(true);
            c.getConexao().close();
            ps1.close();
            ps2.close();
            ps3.close();
            rs2.close();
            rs3.close();
            return true;
        }
        c.getConexao().rollback();
        c.getConexao().setAutoCommit(true);
        c.getConexao().close();
        ps1.close();
        throw new Exception("Não foi possível cadastrar a venda!");
    }

    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }

}
