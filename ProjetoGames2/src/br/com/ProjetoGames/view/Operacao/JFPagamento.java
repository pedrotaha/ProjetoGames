/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view.Operacao;

import br.com.ProjetoGames.data.Conexao;
import br.com.ProjetoGames.data.LocacaoData;
import br.com.ProjetoGames.data.VendaData;
import br.com.ProjetoGames.model.LocacaoModel;
import br.com.ProjetoGames.model.UsuarioModel;
import br.com.ProjetoGames.model.VendaModel;
import br.com.ProjetoGames.view.JFPrincipal;
import static br.com.ProjetoGames.view.control.ValidarCartaoCred.getCardID;
import static br.com.ProjetoGames.view.control.ValidarCartaoCred.getCardName;
import static br.com.ProjetoGames.view.control.ValidarCartaoCred.validCC;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.InputMismatchException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.engine.JasperReport;
import net.sf.jasperreports.engine.util.JRLoader;
import net.sf.jasperreports.view.JasperViewer;

/**
 *
 * @author Pedro
 */
public class JFPagamento extends javax.swing.JFrame {

    UsuarioModel obj = new UsuarioModel();
    UsuarioModel user = new UsuarioModel();
    VendaModel venda = new VendaModel();
    LocacaoModel locacao = new LocacaoModel();
    Calendar cal = Calendar.getInstance();
    int anoAtual = cal.get(Calendar.YEAR);
    int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
    int mesAtual = cal.get(Calendar.MONTH) + 1;
    int log;
    float recebido, troco;

    public JFPagamento() {
        initComponents();
        log = 0;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        setFake();
    }

    public JFPagamento(UsuarioModel obj) {
        initComponents();
        this.obj = obj;
        log = 0;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        setFake();
    }

    public JFPagamento(UsuarioModel obj, VendaModel venda, int log) {
        initComponents();
        this.obj = obj;
        this.log = log;
        this.venda = venda;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        setFake();
        jtTotal.setText("" + venda.getValor());
        carregarCombo();
    }

    public JFPagamento(UsuarioModel obj, LocacaoModel locacao, int log) {
        initComponents();
        this.obj = obj;
        this.log = log;
        this.locacao = locacao;
        this.user = locacao.getFuncionarioModel();
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        setFake();
        jtTotal.setText("" + locacao.getValor());
        carregarCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jrbAvista = new javax.swing.JRadioButton();
        jrbCartao = new javax.swing.JRadioButton();
        jlFormaPagamento = new javax.swing.JLabel();
        jtNumeroCartao = new javax.swing.JTextField();
        jlNumeroCartao = new javax.swing.JLabel();
        jlParcelas = new javax.swing.JLabel();
        jcbParcelas = new javax.swing.JComboBox<>();
        jlNomeCartao = new javax.swing.JLabel();
        jtNomeCartao = new javax.swing.JTextField();
        jlCpfCartao = new javax.swing.JLabel();
        jftCpfCartao = new javax.swing.JFormattedTextField();
        jlDataValidadeC = new javax.swing.JLabel();
        jftDataValidadeC = new javax.swing.JFormattedTextField();
        jlTotal = new javax.swing.JLabel();
        jtRecebido = new javax.swing.JTextField();
        jlSifraRecebido = new javax.swing.JLabel();
        jlRecebido = new javax.swing.JLabel();
        jlSifraTotal = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jlTroco = new javax.swing.JLabel();
        jlSifraTroco = new javax.swing.JLabel();
        jtTroco = new javax.swing.JTextField();
        jlCvc = new javax.swing.JLabel();
        jtCvc = new javax.swing.JTextField();
        jbFinalizar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finalizar Pagamento");
        setMaximumSize(new java.awt.Dimension(690, 620));
        setMinimumSize(new java.awt.Dimension(690, 620));
        setPreferredSize(new java.awt.Dimension(690, 620));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jrbAvista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jrbAvista.setText("À vista");
        jrbAvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAvistaActionPerformed(evt);
            }
        });
        getContentPane().add(jrbAvista, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 80, -1, -1));

        jrbCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jrbCartao.setText("Cartão de Crédito");
        jrbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCartaoActionPerformed(evt);
            }
        });
        getContentPane().add(jrbCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(134, 80, -1, -1));

        jlFormaPagamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFormaPagamento.setText("Forma de Pagamento:");
        getContentPane().add(jlFormaPagamento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 26, -1, -1));

        jtNumeroCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtNumeroCartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNumeroCartaoKeyTyped(evt);
            }
        });
        getContentPane().add(jtNumeroCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 157, 267, -1));

        jlNumeroCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNumeroCartao.setText("Número do Cartão:");
        getContentPane().add(jlNumeroCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 160, -1, -1));

        jlParcelas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlParcelas.setText("Parcelas:");
        getContentPane().add(jlParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(96, 223, -1, -1));

        jcbParcelas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jcbParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        getContentPane().add(jcbParcelas, new org.netbeans.lib.awtextra.AbsoluteConstraints(196, 220, -1, -1));

        jlNomeCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNomeCartao.setText("Nome Impresso no Cartão:");
        getContentPane().add(jlNomeCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 285, -1, -1));

        jtNomeCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtNomeCartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNomeCartaoKeyTyped(evt);
            }
        });
        getContentPane().add(jtNomeCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(265, 282, 267, -1));

        jlCpfCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCpfCartao.setText("CPF do Portador do Cartão:");
        getContentPane().add(jlCpfCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 342, -1, -1));

        try {
            jftCpfCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpfCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(jftCpfCartao, new org.netbeans.lib.awtextra.AbsoluteConstraints(263, 339, 175, -1));

        jlDataValidadeC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDataValidadeC.setText("Data de Validade do Cartão:");
        getContentPane().add(jlDataValidadeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 413, -1, -1));

        try {
            jftDataValidadeC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataValidadeC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        getContentPane().add(jftDataValidadeC, new org.netbeans.lib.awtextra.AbsoluteConstraints(273, 410, 100, -1));

        jlTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTotal.setText("Total à pagar:");
        getContentPane().add(jlTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, -1, -1));

        jtRecebido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtRecebido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRecebidoKeyTyped(evt);
            }
        });
        getContentPane().add(jtRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 180, 60, -1));

        jlSifraRecebido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSifraRecebido.setText("R$");
        getContentPane().add(jlSifraRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 180, -1, -1));

        jlRecebido.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlRecebido.setText("Recebido:");
        getContentPane().add(jlRecebido, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 150, -1, -1));

        jlSifraTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSifraTotal.setText("R$");
        getContentPane().add(jlSifraTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 310, -1, -1));

        jtTotal.setEditable(false);
        jtTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtTotal.setEnabled(false);
        getContentPane().add(jtTotal, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 310, 60, -1));

        jlTroco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTroco.setText("Troco:");
        getContentPane().add(jlTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 400, -1, -1));

        jlSifraTroco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSifraTroco.setText("R$");
        getContentPane().add(jlSifraTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 430, -1, -1));

        jtTroco.setEditable(false);
        jtTroco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtTroco.setEnabled(false);
        getContentPane().add(jtTroco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 430, 60, -1));

        jlCvc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCvc.setText("CVC:");
        getContentPane().add(jlCvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 470, -1, -1));

        jtCvc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtCvc.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCvcKeyTyped(evt);
            }
        });
        getContentPane().add(jtCvc, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 470, 60, -1));

        jbFinalizar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbFinalizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Card_Payment_48px_1.png"))); // NOI18N
        jbFinalizar.setText("Finalizar");
        jbFinalizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarActionPerformed(evt);
            }
        });
        getContentPane().add(jbFinalizar, new org.netbeans.lib.awtextra.AbsoluteConstraints(80, 520, -1, -1));

        jbCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Cancel_48px.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar, new org.netbeans.lib.awtextra.AbsoluteConstraints(340, 520, -1, -1));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbAvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAvistaActionPerformed
        if (jrbCartao.isSelected()) {
            jrbCartao.setSelected(false);
        }
        tratarCampos(false);
    }//GEN-LAST:event_jrbAvistaActionPerformed

    private void jrbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCartaoActionPerformed
        if (jrbAvista.isSelected()) {
            jrbAvista.setSelected(false);
        }
        tratarCampos(true);
    }//GEN-LAST:event_jrbCartaoActionPerformed

    private void jtNumeroCartaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroCartaoKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtNumeroCartaoKeyTyped

    private void jtNomeCartaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeCartaoKeyTyped
        campoSemNumero(evt);
    }//GEN-LAST:event_jtNomeCartaoKeyTyped

    private void jtCvcKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCvcKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtCvcKeyTyped

    private void jtRecebidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRecebidoKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtRecebidoKeyTyped

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nCancelar?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
            dispose();
            if (log == 1) {
                new JFCarrinhoVenda(obj, 1).setVisible(true);
            } else {
                if (log == 2) {
                    new JFCarrinhoLocacao(obj, 1, user).setVisible(true);
                }
            }
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbFinalizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarActionPerformed
        try {
            if (validar()) {
                if (preencherObj()) {
                    if (log == 1) {
                        VendaData DAO = new VendaData();
                        if (DAO.finalizarCompra(venda)) {
                            JOptionPane.showMessageDialog(this, "Obrigado pela preferência!!!");
                            gerarRelatorio();
                            dispose();
                            new JFPrincipal(obj).setVisible(true);
                        }
                    }
                } else {
                    if (log == 2) {
                        LocacaoData DAO = new LocacaoData();
                        if (DAO.finalizarLocacao(locacao)) {
                            JOptionPane.showMessageDialog(this, "Obrigado pela preferência!!!");
                            gerarRelatorio();
                            dispose();
                            new JFPrincipal(user).setVisible(true);
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jbFinalizarActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPagamento.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPagamento().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFinalizar;
    private javax.swing.JComboBox<String> jcbParcelas;
    private javax.swing.JFormattedTextField jftCpfCartao;
    private javax.swing.JFormattedTextField jftDataValidadeC;
    private javax.swing.JLabel jlCpfCartao;
    private javax.swing.JLabel jlCvc;
    private javax.swing.JLabel jlDataValidadeC;
    private javax.swing.JLabel jlFormaPagamento;
    private javax.swing.JLabel jlNomeCartao;
    private javax.swing.JLabel jlNumeroCartao;
    private javax.swing.JLabel jlParcelas;
    private javax.swing.JLabel jlRecebido;
    private javax.swing.JLabel jlSifraRecebido;
    private javax.swing.JLabel jlSifraTotal;
    private javax.swing.JLabel jlSifraTroco;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JLabel jlTroco;
    private javax.swing.JRadioButton jrbAvista;
    private javax.swing.JRadioButton jrbCartao;
    private javax.swing.JTextField jtCvc;
    private javax.swing.JTextField jtNomeCartao;
    private javax.swing.JTextField jtNumeroCartao;
    private javax.swing.JTextField jtRecebido;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JTextField jtTroco;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Card_Payment_528px_1.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public void windowsClosing() {
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
                    dispose();
                    new JFCarrinhoVenda(obj, 1).setVisible(true);
                }
            }
        });
    }

    public void carregarCombo() {
        if (log == 1) {
            for (int i = 1; i < 6; i++) {
                float total = venda.getValor() / i;
                jcbParcelas.addItem(i + "X " + "R$ " + Math.round(total));
            }
        } else {
            if (log == 2) {
                for (int i = 1; i < 6; i++) {
                    float total = locacao.getValor() / i;
                    jcbParcelas.addItem(i + "X " + "R$ " + Math.round(total));
                }
            }
        }
    }

    public boolean validar() throws Exception {
        String msg = new String();
        if ((!jrbAvista.isSelected()) && (!jrbCartao.isSelected())) {
            throw new Exception("Selecione um método de pagamento");
        }
        if (jrbAvista.isSelected()) {
            if (jtRecebido.getText().equals("")) {
                msg = "O campo Recebido deve ser preenchido\ncom a quantidade em dinheiro que o cliente pagou.\n";
            } else {
                String recebidoSt = jtRecebido.getText().replace(",", ".");
                recebidoSt = jtRecebido.getText().trim();
                recebido = Float.parseFloat(recebidoSt);
                if (recebido - Float.parseFloat(jtTotal.getText()) < 0) {
                    msg += "O valor recebido não paga o total.\n";
                } else {
                    troco = recebido - Float.parseFloat(jtTotal.getText());
                    jtTroco.setText("" + troco);
                }
            }
        } else {
            if (jrbCartao.isSelected()) {
                if (jtCvc.getText().equals("")) {
                    msg += "O campo CVC deve ser preenchido\n";
                } else {
                    if (jtCvc.getText().length() < 3 || jtCvc.getText().length() > 3) {
                        msg += "O campo CVC deve conter 3 números\n";
                    }
                }
                if (jtNomeCartao.getText().equals("")) {
                    msg += "O campo Nome deve ser preenchido\n";
                } else {
                    if (jtNomeCartao.getText().length() < 3 || jtNomeCartao.getText().length() > 40) {
                        msg += "O campo Nome deve conter entre 3 e 40 caracteres\n";
                    }
                }
                if (jtNumeroCartao.getText().equals("")) {
                    msg += "O campo Número do Cartão deve ser preenchido\n";
                }
                if (jftCpfCartao.getText().equals("   .   .   -  ")) {
                    msg += "O campo CPF deve ser preenchido\n";
                } else {
                    if (!isCPF(jftCpfCartao.getText())) {
                        msg += "CPF inválido\n";
                    }
                }
                if (jftDataValidadeC.getText().equals("  /  /    ")) {
                    msg += "A Data de Vencimento deve ser preenchida\n";
                } else {
                    if (!validaData(jftDataValidadeC.getText())) {
                        msg += "Data inválida\n";
                    }
                }
                if (jcbParcelas.getSelectedIndex() == 0) {
                    msg += "Selecione um número de parcelas\n";
                }
                if (validarCartao().equals("This card is invalid or unsupported!")) {
                    msg += "Cartão inválido ou não suportado\n";
                }
            }
        }
        if (msg.length() == 0) {
            return true;
        } else {
            throw new Exception(msg);
        }
    }

    public boolean preencherObj() throws Exception {
        if (log == 1) {
            venda.setDataOperacao(dataAtual());
            if (jrbCartao.isSelected()) {
                String cartao = validarCartao();
                venda.setFormaPagamento("À Prazo: " + cartao + " - " + jcbParcelas.getSelectedItem().toString());
            } else {
                if (jrbAvista.isSelected()) {
                    venda.setFormaPagamento("À Vista: " + jtRecebido.getText() + " - Troco: " + jtTroco.getText());
                }
            }
            return true;
        } else {
            if (log == 2) {
                locacao.setDataOperacao(dataAtual());
                locacao.setDataDevolucao(dataDevolucao());
                if (jrbCartao.isSelected()) {
                    String cartao = validarCartao();
                    locacao.setFormaPagamento("À Prazo: " + cartao + " - " + jcbParcelas.getSelectedItem().toString());
                } else {
                    if (jrbAvista.isSelected()) {
                        locacao.setFormaPagamento("À Vista: " + jtRecebido.getText() + " - Troco: " + jtTroco.getText());
                    }
                }
                return true;
            } else {
                return false;
            }
        }
    }

    public void tratarCampos(boolean n) {
        jtNomeCartao.setVisible(n);
        jtNumeroCartao.setVisible(n);
        jlCpfCartao.setVisible(n);
        jlDataValidadeC.setVisible(n);
        jlNomeCartao.setVisible(n);
        jlNumeroCartao.setVisible(n);
        jlParcelas.setVisible(n);
        jcbParcelas.setVisible(n);
        jftCpfCartao.setVisible(n);
        jftDataValidadeC.setVisible(n);
        jtCvc.setVisible(n);
        jlCvc.setVisible(n);
        if (n) {
            jlTotal.setVisible(false);
            jlTroco.setVisible(false);
            jlSifraTroco.setVisible(false);
            jlSifraTotal.setVisible(false);
            jlSifraRecebido.setVisible(false);
            jlRecebido.setVisible(false);
            jtTotal.setVisible(false);
            jtTroco.setVisible(false);
            jtRecebido.setVisible(false);
        } else {
            jlTotal.setVisible(true);
            jlTroco.setVisible(true);
            jlSifraTroco.setVisible(true);
            jlSifraTotal.setVisible(true);
            jlSifraRecebido.setVisible(true);
            jlRecebido.setVisible(true);
            jtTotal.setVisible(true);
            jtTroco.setVisible(true);
            jtRecebido.setVisible(true);
        }
    }

    public void setFake() {
        jtNomeCartao.setVisible(false);
        jtNumeroCartao.setVisible(false);
        jlCpfCartao.setVisible(false);
        jlDataValidadeC.setVisible(false);
        jlNomeCartao.setVisible(false);
        jlNumeroCartao.setVisible(false);
        jlParcelas.setVisible(false);
        jcbParcelas.setVisible(false);
        jftCpfCartao.setVisible(false);
        jftDataValidadeC.setVisible(false);
        jtCvc.setVisible(false);
        jlCvc.setVisible(false);
        jlTotal.setVisible(false);
        jlTroco.setVisible(false);
        jlSifraTroco.setVisible(false);
        jlSifraTotal.setVisible(false);
        jlSifraRecebido.setVisible(false);
        jlRecebido.setVisible(false);
        jtTotal.setVisible(false);
        jtTroco.setVisible(false);
        jtRecebido.setVisible(false);
    }

    public boolean validaData(String data) {
        GregorianCalendar calendar = new GregorianCalendar();
        int dia = 0, mes = 0, ano = 0;
        String diaStr = data.substring(0, 2);
        String mesStr = data.substring(3, 5);
        String anoStr = data.substring(6, 10);
        try {
            dia = Integer.parseInt(diaStr);
            mes = Integer.parseInt(mesStr);
            ano = Integer.parseInt(anoStr);
        } catch (Exception e) {
            return false;
        }
        if (ano < anoAtual) {
            return false;
        } else if (ano <= anoAtual && mes < mesAtual) {
            return false;
        } else if (ano <= anoAtual && mes <= mesAtual && dia <= diaAtual) {
            return false;
        } else if (dia < 1 || mes < 1 || ano < 1) {
            return false;
        } else if (mes == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) {
            if (dia <= 31) {
                return true;
            } else {
                return false;
            }
        } else if (mes == 4 || mes == 6 || mes == 9 || mes == 11) {
            if (dia <= 30) {
                return true;
            } else {
                return false;
            }
        } else if (mes == 2) {
            if (calendar.isLeapYear(ano)) {
                if (dia <= 29) {
                    return true;
                } else {
                    return false;
                }
            } else if (dia <= 28) {
                return true;
            } else {
                return false;
            }
        } else if (mes > 12) {
            return false;
        }

        return true;
    }

    private void campoSemNumero(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321";
        if (caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    private void campoComNumero(java.awt.event.KeyEvent evt) {
        String caracteres = "0987654321";
        if (!caracteres.contains(evt.getKeyChar() + "")) {
            evt.consume();
        }
    }

    public Calendar dataAtual() {
        Calendar calen = Calendar.getInstance();
        return calen;
    }
    
    public Calendar dataDevolucao() {
        Calendar calen = Calendar.getInstance();
        calen.add(calen.DAY_OF_MONTH, +3);
        return calen;
    }

    public String validarCartao() throws Exception {
        String aCard = jtNumeroCartao.getText();
        if (getCardID(aCard) > -1) {
            String goodBad = new String();
            if (validCC(aCard)) {
                goodBad = "good";
            } else {
                goodBad = "bad";
            }
            return ("É um " + getCardName(getCardID(aCard)) + " - Número " + aCard);// + " " + goodBad;
        } else {
            return ("This card is invalid or unsupported!");
        }
    }

    public boolean isCPF(String CPF) {
        String cpf = CPF.replace(".", "");
        cpf = cpf.replace("-", "");
        cpf = cpf.trim();
        CPF = cpf;
        if (CPF.equals("00000000000") || CPF.equals("11111111111")
                || CPF.equals("22222222222") || CPF.equals("33333333333")
                || CPF.equals("44444444444") || CPF.equals("55555555555")
                || CPF.equals("66666666666") || CPF.equals("77777777777")
                || CPF.equals("88888888888") || CPF.equals("99999999999")
                || (CPF.length() != 11)) {
            return (false);
        }

        char dig10, dig11;
        int sm, i, r, num, peso;

// "try" - protege o codigo para eventuais erros de conversao de tipo (int)
        try {
// Calculo do 1o. Digito Verificador
            sm = 0;
            peso = 10;
            for (i = 0; i < 9; i++) {
// converte o i-esimo caractere do CPF em um numero:
// por exemplo, transforma o caractere '0' no inteiro 0         
// (48 eh a posicao de '0' na tabela ASCII)         
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig10 = '0';
            } else {
                dig10 = (char) (r + 48); // converte no respectivo caractere numerico
            }
// Calculo do 2o. Digito Verificador
            sm = 0;
            peso = 11;
            for (i = 0; i < 10; i++) {
                num = (int) (CPF.charAt(i) - 48);
                sm = sm + (num * peso);
                peso = peso - 1;
            }

            r = 11 - (sm % 11);
            if ((r == 10) || (r == 11)) {
                dig11 = '0';
            } else {
                dig11 = (char) (r + 48);
            }

// Verifica se os digitos calculados conferem com os digitos informados.
            if ((dig10 == CPF.charAt(9)) && (dig11 == CPF.charAt(10))) {
                return (true);
            } else {
                return (false);
            }
        } catch (InputMismatchException erro) {
            return (false);
        }
    }

    public void gerarRelatorio() {
        try {
            Conexao con = new Conexao();
            JasperReport relatorio = (JasperReport) JRLoader.loadObjectFromFile("src\\br\\com\\ProjetoGames\\relatorio\\relatorioVenda.jasper");
            JasperPrint impressao = JasperFillManager.fillReport(relatorio,
                    null, con.getConexao());
            JasperViewer visualizador = new JasperViewer(impressao, false);
            visualizador.setVisible(true);
        } catch (Exception erro) {
            JOptionPane.showMessageDialog(null, "Erro =" + erro.getMessage());
        }
    }
}
