/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.data.UsuarioData;
import br.com.ProjetoGames.model.UsuarioModel;
import br.com.ProjetoGames.view.control.Criptografar;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Pedro
 */
public class JFTrocarSenha extends javax.swing.JFrame {

    UsuarioModel obj = new UsuarioModel();

    public JFTrocarSenha() {
        initComponents();
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
    }

    public JFTrocarSenha(UsuarioModel obj) {
        initComponents();
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        this.obj = obj;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlSenhaAntiga = new javax.swing.JLabel();
        jlSenhaNova = new javax.swing.JLabel();
        jlRedigite = new javax.swing.JLabel();
        jpfSenhaAntiga = new javax.swing.JPasswordField();
        jpfSenhaNova = new javax.swing.JPasswordField();
        jpfRedigite = new javax.swing.JPasswordField();
        jLabel1 = new javax.swing.JLabel();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Trocar a Senha");

        jlSenhaAntiga.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSenhaAntiga.setText("Senha Antiga:");

        jlSenhaNova.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSenhaNova.setText("Senha Nova:");

        jlRedigite.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlRedigite.setText("Redigite a nova:");

        jpfSenhaAntiga.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jpfSenhaNova.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jpfRedigite.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/know-how-hacked-what-to-2.jpg"))); // NOI18N
        jLabel1.setToolTipText("");

        jbSalvar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Save_48px.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Cancel_48px.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.setToolTipText("");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jpfRedigite, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpfSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jpfSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 435, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlRedigite)
                                .addComponent(jlSenhaNova, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jlSenhaAntiga, javax.swing.GroupLayout.Alignment.LEADING))
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 492, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(71, 71, 71)
                        .addComponent(jbCancelar)))
                .addContainerGap(62, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(50, 50, 50)
                .addComponent(jlSenhaAntiga)
                .addGap(18, 18, 18)
                .addComponent(jpfSenhaAntiga, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(24, 24, 24)
                .addComponent(jlSenhaNova)
                .addGap(18, 18, 18)
                .addComponent(jpfSenhaNova, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(jlRedigite)
                .addGap(18, 18, 18)
                .addComponent(jpfRedigite, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jbCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if(validar()){
                if(troca()){
                    JOptionPane.showMessageDialog(this, "Senha alterada com sucesso!!!","Salvar",JOptionPane.INFORMATION_MESSAGE);
                    dispose();
                    new JFPrincipal(obj).setVisible(true);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: "+e.getMessage(),"Alterar Senha",JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
            dispose();
            new JFPrincipal(obj).setVisible(true);
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

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
            java.util.logging.Logger.getLogger(JFTrocarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFTrocarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFTrocarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFTrocarSenha.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFTrocarSenha().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jlRedigite;
    private javax.swing.JLabel jlSenhaAntiga;
    private javax.swing.JLabel jlSenhaNova;
    private javax.swing.JPasswordField jpfRedigite;
    private javax.swing.JPasswordField jpfSenhaAntiga;
    private javax.swing.JPasswordField jpfSenhaNova;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Forgot_Password_528px.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public void windowsClosing() {
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
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

    public boolean validar() throws Exception {
        String msg = new String();
        UsuarioData DAO = new UsuarioData();
        obj = DAO.pegarSenha(obj);
        String senha = Criptografar.encriptografar(jpfSenhaAntiga.getText());
        if (jpfSenhaNova.getText().equals("")) {
            msg = "A nova senha deve ser preenchida\n";
        } else {
            if (jpfSenhaNova.getText().length() < 8 || jpfSenhaNova.getText().length() > 50) {
                msg += "A nova senha deve conter entre 8 e 50 caracteres\n";
            }
        }
        if (!senha.equals(obj.getSenha())) {
            msg += "A senha antiga está incorreta\n";
        }
        if(!jpfSenhaNova.getText().equals(jpfRedigite.getText())){
            msg += "A senha nova e a redigitação não estão iguais\n";
        }
        if(msg.length() == 0){
            return true;
        }else{
            throw new Exception(msg);
        }
    }
    
    public boolean troca() throws Exception{
        UsuarioData DAO = new UsuarioData();
        obj.setSenha(Criptografar.encriptografar(jpfSenhaNova.getText()));
        if(DAO.alterarSenha(obj)){
            return true;
        }else{
            throw new Exception("Erro ao alterar a senha");
        }
    }
}
