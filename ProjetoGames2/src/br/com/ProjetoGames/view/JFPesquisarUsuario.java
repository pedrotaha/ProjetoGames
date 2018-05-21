/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.data.FuncionarioData;
import br.com.ProjetoGames.data.UsuarioData;
import br.com.ProjetoGames.model.FuncionarioModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class JFPesquisarUsuario extends javax.swing.JFrame {

    int frameCount;
    JIFDetalhesUsuarios janelaP = new JIFDetalhesUsuarios();
    ArrayList<UsuarioModel> dados;
    ArrayList<FuncionarioModel> dadosF;
    UsuarioModel obj, selecionado;
    FuncionarioModel objF, selecionadoF;

    public JFPesquisarUsuario() {
        initComponents();
        frameCount = 0;
        dados = new ArrayList<>();
        this.obj = new UsuarioModel();
        selecionado = new UsuarioModel();
        selecionadoF = new FuncionarioModel();
        dadosF = new ArrayList<>();
        setIcon();
        windowsClosing();
        //internoClosed();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
    }

    public JFPesquisarUsuario(UsuarioModel obj) {//Atual
        initComponents();
        frameCount = 0;
        dados = new ArrayList<>();
        this.obj = obj;
        selecionado = new UsuarioModel();
        selecionadoF = new FuncionarioModel();
        dadosF = new ArrayList<>();
        setIcon();
        windowsClosing();
        //internoClosed();
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

        jdpPesquisarUser = new javax.swing.JDesktopPane();
        jbEditar = new javax.swing.JButton();
        jbExcluir = new javax.swing.JButton();
        jbDetalhes = new javax.swing.JButton();
        jlPesquisar = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtbUsuario = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Pesquisar Usuário");
        setMinimumSize(new java.awt.Dimension(891, 805));
        setPreferredSize(new java.awt.Dimension(891, 805));
        setResizable(false);
        getContentPane().setLayout(null);

        jdpPesquisarUser.setBackground(new java.awt.Color(255, 255, 255));
        jdpPesquisarUser.setForeground(new java.awt.Color(255, 255, 255));

        jbEditar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Edit_Property_48px.png"))); // NOI18N
        jbEditar.setText("Editar");
        jbEditar.setEnabled(false);
        jbEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbEditarActionPerformed(evt);
            }
        });

        jbExcluir.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbExcluir.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Trash_Can_48px.png"))); // NOI18N
        jbExcluir.setText("Excluir");
        jbExcluir.setEnabled(false);
        jbExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbExcluirActionPerformed(evt);
            }
        });

        jbDetalhes.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbDetalhes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Pokedex_48px_1.png"))); // NOI18N
        jbDetalhes.setText("Detalhes");
        jbDetalhes.setEnabled(false);
        jbDetalhes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbDetalhesActionPerformed(evt);
            }
        });

        jlPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPesquisar.setText("Pesquisar:");

        jtPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisarKeyReleased(evt);
            }
        });

        jtbUsuario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtbUsuario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "E-mail", "Telefone", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jtbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbUsuarioMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(jtbUsuario);

        jdpPesquisarUser.setLayer(jbEditar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPesquisarUser.setLayer(jbExcluir, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPesquisarUser.setLayer(jbDetalhes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPesquisarUser.setLayer(jlPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPesquisarUser.setLayer(jtPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpPesquisarUser.setLayer(jScrollPane1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpPesquisarUserLayout = new javax.swing.GroupLayout(jdpPesquisarUser);
        jdpPesquisarUser.setLayout(jdpPesquisarUserLayout);
        jdpPesquisarUserLayout.setHorizontalGroup(
            jdpPesquisarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpPesquisarUserLayout.createSequentialGroup()
                .addGap(346, 346, 346)
                .addComponent(jbDetalhes)
                .addContainerGap(361, Short.MAX_VALUE))
            .addGroup(jdpPesquisarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdpPesquisarUserLayout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addGroup(jdpPesquisarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jdpPesquisarUserLayout.createSequentialGroup()
                            .addComponent(jlPesquisar)
                            .addGap(47, 47, 47)
                            .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 537, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 846, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jdpPesquisarUserLayout.createSequentialGroup()
                            .addComponent(jbEditar)
                            .addGap(539, 539, 539)
                            .addComponent(jbExcluir)))
                    .addGap(0, 17, Short.MAX_VALUE)))
        );
        jdpPesquisarUserLayout.setVerticalGroup(
            jdpPesquisarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpPesquisarUserLayout.createSequentialGroup()
                .addContainerGap(670, Short.MAX_VALUE)
                .addComponent(jbDetalhes)
                .addContainerGap())
            .addGroup(jdpPesquisarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(jdpPesquisarUserLayout.createSequentialGroup()
                    .addGap(0, 16, Short.MAX_VALUE)
                    .addGroup(jdpPesquisarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jdpPesquisarUserLayout.createSequentialGroup()
                            .addGap(3, 3, 3)
                            .addComponent(jlPesquisar))
                        .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGap(18, 18, 18)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 587, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(18, 18, 18)
                    .addGroup(jdpPesquisarUserLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jbEditar)
                        .addComponent(jbExcluir))
                    .addGap(0, 16, Short.MAX_VALUE)))
        );

        getContentPane().add(jdpPesquisarUser);
        jdpPesquisarUser.setBounds(0, 0, 890, 740);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalhesActionPerformed
        if (frameCount == 0) {
            if (selecionado.getId() > 0) {
                jdpPesquisarUser.add(janelaP);
                //internoClosed();
                janelaP.setVisible(true);
                frameCount++;
                tratarCampos(false);
            }
        }
    }//GEN-LAST:event_jbDetalhesActionPerformed

    private void jtbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbUsuarioMouseClicked
        try {
            selecionado = dados.get(jtbUsuario.getSelectedRow());
            if (dados.get(jtbUsuario.getSelectedRow()).getTipoUsuarioModel().getNivel() == 0) {
                janelaP = new JIFDetalhesUsuarios(selecionado);
            } else {
                FuncionarioData DAOF = new FuncionarioData();
                selecionadoF = DAOF.pesquisarObj(selecionado);
                janelaP = new JIFDetalhesUsuarios(selecionadoF);
            }
            internoClosed();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar" + e.getMessage());
        }

    }//GEN-LAST:event_jtbUsuarioMouseClicked

    private void jtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarKeyReleased
        if (obj.getTipoUsuarioModel().getNivel() == 0) {
            try {
                UsuarioData DAO = new UsuarioData();
                dados = DAO.pesquisar(jtPesquisar.getText());
                DefaultTableModel mp = (DefaultTableModel) jtbUsuario.getModel();
                mp.setNumRows(0);
                if (jtPesquisar.getText().length() > 1) {
                    jbEditar.setEnabled(true);
                    jbExcluir.setEnabled(true);
                    jbDetalhes.setEnabled(true);
                    for (UsuarioModel usuario : dados) {
                        mp.addRow(new String[]{usuario.getNome(), usuario.getEmail(), usuario.getTelefone(), usuario.getTipoUsuarioModel().getDescricao()});
                    }
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao pesquisar" + e.getMessage());
            }
        }
        if (jtPesquisar.getText().length() == 0) {
            jbEditar.setEnabled(false);
            jbExcluir.setEnabled(false);
            jbDetalhes.setEnabled(false);
            selecionado = new UsuarioModel();
            selecionadoF = new FuncionarioModel();
        }
    }//GEN-LAST:event_jtPesquisarKeyReleased

    private void jbEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbEditarActionPerformed
        try {
            selecionado = dados.get(jtbUsuario.getSelectedRow());
            if (dados.get(jtbUsuario.getSelectedRow()).getTipoUsuarioModel().getNivel() == 0) {
                new JFCadCliente(selecionado, 2).setVisible(true);
            } else {
                FuncionarioData DAOF = new FuncionarioData();
                selecionadoF = DAOF.pesquisarObj(selecionado);
                new JFCadCliente(obj, selecionadoF, 2).setVisible(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar" + e.getMessage());
        }
        dispose();
    }//GEN-LAST:event_jbEditarActionPerformed

    private void jbExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbExcluirActionPerformed
        ImageIcon imagemTituloJanelaP = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        try {
            if (JOptionPane.showConfirmDialog(this, "Deseja Realmente excluir o registro?",
                    "Botão excluir", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanelaP) == JOptionPane.YES_OPTION) {
                if (dados.get(jtbUsuario.getSelectedRow()).getTipoUsuarioModel().getNivel() == 0) {
                    selecionado = dados.get(jtbUsuario.getSelectedRow());
                    UsuarioData DAO = new UsuarioData();
                    if (DAO.excluir(selecionado.getId())) {
                        JOptionPane.showMessageDialog(this, "Excluido com sucesso");
                    }
                } else {
                    FuncionarioData DAOF = new FuncionarioData();
                    selecionadoF = DAOF.pesquisarObj(selecionado);
                    if (DAOF.excluirF(selecionadoF.getId())) {
                        JOptionPane.showMessageDialog(this, "Excluido com sucesso");
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao excluir:" + e.getMessage());
        }
    }//GEN-LAST:event_jbExcluirActionPerformed

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
            java.util.logging.Logger.getLogger(JFPesquisarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFPesquisarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFPesquisarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFPesquisarUsuario.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFPesquisarUsuario().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton jbDetalhes;
    private javax.swing.JButton jbEditar;
    private javax.swing.JButton jbExcluir;
    private javax.swing.JDesktopPane jdpPesquisarUser;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTable jtbUsuario;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        ImageIcon imagemTituloJanelaP = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\_Projetos\\ProjetoGames\\ProjetoGames2\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Find_User_Male_528px_1.png");
        setIconImage(imagemTituloJanelaP.getImage());
    }

    public void windowsClosing() {
        ImageIcon imagemTituloJanelaP = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanelaP) == JOptionPane.YES_OPTION) {
                    dispose();
                    new JFPrincipal().setVisible(true);
                }
            }
        });
    }

    public void internoClosed() {
        janelaP.addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameClosed(InternalFrameEvent e) {
                tratarCampos(true);
                frameCount--;
                jdpPesquisarUser.remove(janelaP);
            }
        });
    }

    public void tratarCampos(boolean n) {
        jtPesquisar.setEnabled(n);
        jtbUsuario.setEnabled(n);
        jScrollPane1.setEnabled(n);
        jbDetalhes.setEnabled(n);
        jbEditar.setEnabled(n);
        jbExcluir.setEnabled(n);
    }
}
