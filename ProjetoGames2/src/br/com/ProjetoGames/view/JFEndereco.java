/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.data.UsuarioData;
import br.com.ProjetoGames.model.UsuarioModel;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Pedro
 */
public class JFEndereco extends javax.swing.JFrame {

    DefaultListModel MODELO;
    UsuarioData DAO = new UsuarioData();
    int Enter = 0;
    String[] codig;
    ArrayList<UsuarioModel> lista = new ArrayList<>();
    UsuarioModel selecionado = new UsuarioModel();
    UsuarioModel selecionadoKey = new UsuarioModel();

    public JFEndereco() {
        initComponents();
        mostraPesquisa();
        Lista.setVisible(false);
        MODELO = new DefaultListModel();
        setIcon();
        windowsClosing();
        Lista.setModel(MODELO);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlRua = new javax.swing.JLabel();
        jlNumero = new javax.swing.JLabel();
        jlBairro = new javax.swing.JLabel();
        jlCidade = new javax.swing.JLabel();
        jlUf = new javax.swing.JLabel();
        jlPais = new javax.swing.JLabel();
        jlCep = new javax.swing.JLabel();
        jlComplemento = new javax.swing.JLabel();
        jtNumero = new javax.swing.JTextField();
        jtBairro = new javax.swing.JTextField();
        jtCidade = new javax.swing.JTextField();
        jtRua = new javax.swing.JTextField();
        jtComplemento = new javax.swing.JTextField();
        jcbUf = new javax.swing.JComboBox<>();
        jcbPais = new javax.swing.JComboBox<>();
        jftCep = new javax.swing.JFormattedTextField();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jtPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Lista = new javax.swing.JList<>();

        setTitle("Endereço");
        setMinimumSize(new java.awt.Dimension(805, 495));
        getContentPane().setLayout(null);

        jlRua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlRua.setText("Rua:");
        getContentPane().add(jlRua);
        jlRua.setBounds(12, 34, 31, 17);

        jlNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNumero.setText("N°:");
        getContentPane().add(jlNumero);
        jlNumero.setBounds(182, 34, 20, 17);

        jlBairro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlBairro.setText("Bairro:");
        getContentPane().add(jlBairro);
        jlBairro.setBounds(272, 34, 47, 17);

        jlCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCidade.setText("Cidade:");
        getContentPane().add(jlCidade);
        jlCidade.setBounds(463, 34, 53, 17);

        jlUf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlUf.setText("UF:");
        getContentPane().add(jlUf);
        jlUf.setBounds(12, 128, 23, 17);

        jlPais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlPais.setText("Pais:");
        getContentPane().add(jlPais);
        jlPais.setBounds(151, 130, 33, 17);

        jlCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCep.setText("CEP:");
        getContentPane().add(jlCep);
        jlCep.setBounds(300, 130, 32, 17);

        jlComplemento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlComplemento.setText("Complemento:");
        getContentPane().add(jlComplemento);
        jlComplemento.setBounds(433, 135, 101, 17);

        jtNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });
        getContentPane().add(jtNumero);
        jtNumero.setBounds(182, 69, 42, 23);

        jtBairro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBairroActionPerformed(evt);
            }
        });
        getContentPane().add(jtBairro);
        jtBairro.setBounds(272, 69, 144, 23);

        jtCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCidadeActionPerformed(evt);
            }
        });
        getContentPane().add(jtCidade);
        jtCidade.setBounds(463, 70, 151, 23);

        jtRua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRuaActionPerformed(evt);
            }
        });
        getContentPane().add(jtRua);
        jtRua.setBounds(12, 69, 132, 23);

        jtComplemento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(jtComplemento);
        jtComplemento.setBounds(433, 165, 151, 23);

        jcbUf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbUf.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        getContentPane().add(jcbUf);
        jcbUf.setBounds(12, 164, 114, 23);

        jcbPais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        getContentPane().add(jcbPais);
        jcbPais.setBounds(151, 164, 114, 23);

        try {
            jftCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jftCep);
        jftCep.setBounds(300, 164, 92, 23);

        jbSalvar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Save_48px.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        getContentPane().add(jbSalvar);
        jbSalvar.setBounds(47, 425, 155, 57);

        jbCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Cancel_48px.png"))); // NOI18N
        jbCancelar.setText("Cancelar Tudo");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        getContentPane().add(jbCancelar);
        jbCancelar.setBounds(285, 425, 251, 57);

        jtPesquisar.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        jtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPesquisarActionPerformed(evt);
            }
        });
        jtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisarKeyReleased(evt);
            }
        });
        getContentPane().add(jtPesquisar);
        jtPesquisar.setBounds(47, 232, 499, 40);

        Lista.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        Lista.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                ListaMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                ListaMouseExited(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                ListaMousePressed(evt);
            }
        });
        Lista.addListSelectionListener(new javax.swing.event.ListSelectionListener() {
            public void valueChanged(javax.swing.event.ListSelectionEvent evt) {
                ListaValueChanged(evt);
            }
        });
        jScrollPane1.setViewportView(Lista);

        getContentPane().add(jScrollPane1);
        jScrollPane1.setBounds(47, 268, 499, 150);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtNumeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtNumeroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtNumeroActionPerformed

    private void jtBairroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtBairroActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtBairroActionPerformed

    private void jtCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtCidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtCidadeActionPerformed

    private void jtRuaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtRuaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtRuaActionPerformed

    private void jtComplementoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtComplementoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtComplementoActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        if (JOptionPane.showConfirmDialog(null, "Deseja Realmente Cancelar?",
                "Botão Sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
            new JFLogin().setVisible(true);
            dispose();
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPesquisarActionPerformed
        Lista.setVisible(false);
        Enter = 1;
    }//GEN-LAST:event_jtPesquisarActionPerformed

    private void jtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarKeyReleased
        if (Enter == 0) {
            listaDePesquisa();
        } else {
            Enter = 0;
        }
    }//GEN-LAST:event_jtPesquisarKeyReleased

    private void ListaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMousePressed
        mostraPesquisa();
        Lista.setVisible(false);
        jtPesquisar.setText(selecionado.getNome());
    }//GEN-LAST:event_ListaMousePressed

    private void ListaValueChanged(javax.swing.event.ListSelectionEvent evt) {//GEN-FIRST:event_ListaValueChanged

    }//GEN-LAST:event_ListaValueChanged

    private void ListaMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseEntered

    }//GEN-LAST:event_ListaMouseEntered

    private void ListaMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ListaMouseExited

    }//GEN-LAST:event_ListaMouseExited

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
            java.util.logging.Logger.getLogger(JFEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFEndereco.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFEndereco().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JList<String> Lista;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbPais;
    private javax.swing.JComboBox<String> jcbUf;
    private javax.swing.JFormattedTextField jftCep;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlPais;
    private javax.swing.JLabel jlRua;
    private javax.swing.JLabel jlUf;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTextField jtRua;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Add_User_Male_96px.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public void windowsClosing() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(null, "Deseja Realmente Sair?",
                        "Botão Sair", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION) {
                    dispose();
                }
            }
        });
    }

    public void mostraPesquisa() {
        int Linha = Lista.getSelectedIndex();
        if (Linha >= 0) {
            selecionado = lista.get(Linha);
        }
    }

    public void listaDePesquisa() {
        if (jtPesquisar.getText().length() > 1) {
            try {
                MODELO.removeAllElements();
                codig = new String[4];
                lista = DAO.pesquisar(jtPesquisar.getText());
                for (UsuarioModel list : lista) {
                    MODELO.addElement(list.getNome());
                }
                if (lista.size() >= 1) {
                    Lista.setVisible(true);
                } else {
                    Lista.setVisible(false);
                }
                //resultadoPesquisa();
            } catch (Exception e) {

            }
        } else {
            MODELO.removeAllElements();
            Lista.setVisible(false);
            Enter = 1;
        }
    }
}
