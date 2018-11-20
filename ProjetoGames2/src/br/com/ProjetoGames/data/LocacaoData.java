package br.com.ProjetoGames.data;

import br.com.ProjetoGames.model.JogosOperacaoModel;
import br.com.ProjetoGames.model.LocacaoModel;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class LocacaoData extends OperacaoData{
    
    //Exemplo: create table pedido_tmp as select * from pedido where num_pedido is null;
    //Armazenar compra do carrinho nas tabelas temporárias até finalizar compra, 
    //dps armazenar nas tabelas originais e dropar as temporárias
    //tabelas: tbjogolocad, tblocacao, tbjogolocad, tblocacao
    public boolean finalizarLocacao(LocacaoModel locacao) throws Exception {//, JogosOperacaoModel lista, UsuarioModel obj
        //insere na tabela tblocacao os detalhes
        //select * from tbjogolocad_tmp+obj.getId()+";"
        //select max(id) from tblocacao;
        //resultado: insert on table tbjogolocad
        //select idjogos da tbjogolocad_tmp+obj.getId()+";"
        //para atualizar a quantidade restante em estoque na tabela tbquantidade
        //"drop table tbjogolocad_tmp+obj.getId()+";"
        ArrayList<JogosOperacaoModel> lista = new ArrayList<>();
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        SimpleDateFormat fmt = new SimpleDateFormat("HH:mm:ss");
        Conexao c = new Conexao();
        c.getConexao().setAutoCommit(false);
        String sql1 = "insert into tblocacao (idcli,idfunc,datalocacao,hora,datadevolucao,valor,formapagamento, desconto) values (?,?,?,?,?,?,?,?);";
        PreparedStatement ps1 = c.getConexao().prepareStatement(sql1);
        ps1.setInt(1, locacao.getClienteModel().getId());
        ps1.setInt(2, locacao.getFuncionarioModel().getId());
        ps1.setString(3, dateFormat.format(locacao.getDataOperacao().getTime())); 
        ps1.setString(4, fmt.format(locacao.getDataOperacao().getTime()));
        ps1.setString(5, dateFormat.format(locacao.getDataDevolucao().getTime())); 
        ps1.setFloat(6, locacao.getValor());
        ps1.setString(7, locacao.getFormaPagamento());
        ps1.setInt(8, locacao.getDesconto());
        if (ps1.executeUpdate() > 0) {
            int id = 0;
            String sql2 = "select max(idlocacao) as \"idlocacao\" from tblocacao;";
            PreparedStatement ps2 = c.getConexao().prepareStatement(sql2);
            ResultSet rs2 = ps2.executeQuery();
            if (rs2.next()) {
                id = rs2.getInt("idlocacao");
            }
            String sql3 = "select * from tbjogolocad_tmp" + locacao.getClienteModel().getId() + ";";
            PreparedStatement ps3 = c.getConexao().prepareStatement(sql3);
            ResultSet rs3 = ps3.executeQuery();
            while (rs3.next()) {
                JogosOperacaoModel jogoOp = new JogosOperacaoModel();
                jogoOp.getJogosModel().setIdJogos(rs3.getInt("idjogo"));
                jogoOp.setQuantidade(rs3.getInt("quantidade"));
                lista.add(jogoOp);
            }
            for (JogosOperacaoModel list : lista) {
                String sql4 = "insert into tbjogolocad (idlocacao, idJogo, quantidade) values (?,?,?)";
                PreparedStatement ps4 = c.getConexao().prepareStatement(sql4);
                ps4.setInt(1, id);
                ps4.setInt(2, list.getJogosModel().getIdJogos());
                ps4.setInt(3, list.getQuantidade());
                ps4.executeUpdate();
                ps4.close();
            }
            for (JogosOperacaoModel list : lista) {
                String sql6 = "update tbquantidade set quantidadeAlugar = quantidadeAlugar - ? where idjogo = ?";
                PreparedStatement ps6 = c.getConexao().prepareStatement(sql6);
                ps6.setInt(1, list.getQuantidade());
                ps6.setInt(2, list.getJogosModel().getIdJogos());
                ps6.executeUpdate();
            }
            String sql5 = "drop table if exists tbjogolocad_tmp" + locacao.getClienteModel().getId() + ";";
            PreparedStatement ps5 = c.getConexao().prepareStatement(sql5);
            ps5.executeUpdate();
            ps5.close();
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
        throw new Exception("Não foi possível cadastrar a locacao!");
    }

    public Calendar calendario(String data) throws Exception {
        Calendar cal = new GregorianCalendar();
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
        cal.setTime(sdf.parse(data));
        return cal;
    }

}
