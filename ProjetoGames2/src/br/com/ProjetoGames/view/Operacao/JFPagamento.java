/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view.Operacao;

import br.com.ProjetoGames.model.UsuarioModel;
import br.com.ProjetoGames.model.VendaModel;
import br.com.ProjetoGames.view.JFPrincipal;
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

/**
 *
 * @author Pedro
 */
public class JFPagamento extends javax.swing.JFrame {
    
    UsuarioModel obj = new UsuarioModel();
    VendaModel venda = new VendaModel();
    Calendar cal = Calendar.getInstance();
    int anoAtual = cal.get(Calendar.YEAR);
    int log;
    
    public JFPagamento() {
        initComponents();
        log = 0;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Finalizar Pagamento");

        jrbAvista.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jrbAvista.setText("À vista");
        jrbAvista.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbAvistaActionPerformed(evt);
            }
        });

        jrbCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jrbCartao.setText("Cartão de Crédito");
        jrbCartao.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jrbCartaoActionPerformed(evt);
            }
        });

        jlFormaPagamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFormaPagamento.setText("Forma de Pagamento:");

        jtNumeroCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtNumeroCartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNumeroCartaoKeyTyped(evt);
            }
        });

        jlNumeroCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNumeroCartao.setText("Número do Cartão:");

        jlParcelas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlParcelas.setText("Parcelas:");

        jcbParcelas.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jcbParcelas.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "X1", "X2", "X3", "X4", "X5" }));

        jlNomeCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNomeCartao.setText("Nome Impresso no Cartão:");

        jtNomeCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtNomeCartao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNomeCartaoKeyTyped(evt);
            }
        });

        jlCpfCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCpfCartao.setText("CPF do Portador do Cartão:");

        try {
            jftCpfCartao.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpfCartao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jlDataValidadeC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDataValidadeC.setText("Data de Validade do Cartão:");

        try {
            jftDataValidadeC.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataValidadeC.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jrbAvista)
                        .addGap(33, 33, 33)
                        .addComponent(jrbCartao))
                    .addComponent(jlFormaPagamento)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jlNumeroCartao)
                            .addComponent(jlParcelas))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlNomeCartao)
                        .addGap(18, 18, 18)
                        .addComponent(jtNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 267, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCpfCartao)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jftCpfCartao, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDataValidadeC)
                        .addGap(18, 18, 18)
                        .addComponent(jftDataValidadeC, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(158, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jlFormaPagamento)
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jrbAvista)
                    .addComponent(jrbCartao))
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtNumeroCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlNumeroCartao))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlParcelas)
                    .addComponent(jcbParcelas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNomeCartao)
                    .addComponent(jtNomeCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlCpfCartao)
                    .addComponent(jftCpfCartao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlDataValidadeC)
                    .addComponent(jftDataValidadeC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(54, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jrbAvistaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbAvistaActionPerformed
        if(jrbCartao.isSelected()){
            jrbCartao.setSelected(false);
        }
    }//GEN-LAST:event_jrbAvistaActionPerformed

    private void jrbCartaoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jrbCartaoActionPerformed
        if(jrbAvista.isSelected()){
            jrbAvista.setSelected(false);
        }
    }//GEN-LAST:event_jrbCartaoActionPerformed

    private void jtNumeroCartaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroCartaoKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtNumeroCartaoKeyTyped

    private void jtNomeCartaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeCartaoKeyTyped
        campoSemNumero(evt);
    }//GEN-LAST:event_jtNomeCartaoKeyTyped

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
    private javax.swing.JComboBox<String> jcbParcelas;
    private javax.swing.JFormattedTextField jftCpfCartao;
    private javax.swing.JFormattedTextField jftDataValidadeC;
    private javax.swing.JLabel jlCpfCartao;
    private javax.swing.JLabel jlDataValidadeC;
    private javax.swing.JLabel jlFormaPagamento;
    private javax.swing.JLabel jlNomeCartao;
    private javax.swing.JLabel jlNumeroCartao;
    private javax.swing.JLabel jlParcelas;
    private javax.swing.JRadioButton jrbAvista;
    private javax.swing.JRadioButton jrbCartao;
    private javax.swing.JTextField jtNomeCartao;
    private javax.swing.JTextField jtNumeroCartao;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\_Projetos\\ProjetoGames\\ProjetoGames2\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Card_Payment_528px_1.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public void windowsClosing() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
                    dispose();
                    new JFPrincipal(obj).setVisible(true);
                }
            }
        });
    }
    
    public void tratarCampos(boolean n){
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
        if (ano > (anoAtual - 1)) {
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
}