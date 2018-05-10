/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.data.localizar.LocalData;
import br.com.ProjetoGames.model.EnderecoModel;
import br.com.ProjetoGames.model.localizar.LocalModel;
import java.awt.Font;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Pedro
 */
public class JIFEndereco extends javax.swing.JInternalFrame {

    ArrayList<LocalModel> listaP = new ArrayList<>();
    ArrayList<LocalModel> listaE = new ArrayList<>();
    ArrayList<LocalModel> listaC = new ArrayList<>();
    LocalData DAO = new LocalData();

    public JIFEndereco() {
        initComponents();
        this.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        jtCidade.setVisible(false);
        jtEstado.setVisible(false);
        jcbCidade.setVisible(false);
        jcbEstado.setVisible(false);
        try {
            local();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }

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
        jlEstado = new javax.swing.JLabel();
        jlPais = new javax.swing.JLabel();
        jlCep = new javax.swing.JLabel();
        jlComplemento = new javax.swing.JLabel();
        jtRua = new javax.swing.JTextField();
        jtNumero = new javax.swing.JTextField();
        jtBairro = new javax.swing.JTextField();
        jcbCidade = new javax.swing.JComboBox<>();
        jtCidade = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jtEstado = new javax.swing.JTextField();
        jcbPais = new javax.swing.JComboBox<>();
        jftCep = new javax.swing.JFormattedTextField();
        jtComplemento = new javax.swing.JTextField();
        jbVoltar = new javax.swing.JButton();

        setClosable(true);
        setMinimumSize(new java.awt.Dimension(656, 402));
        setName(""); // NOI18N
        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                formInternalFrameClosing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlRua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlRua.setText("Rua:");
        getContentPane().add(jlRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, -1, -1));

        jlNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNumero.setText("N°:");
        getContentPane().add(jlNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 34, -1, -1));

        jlBairro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlBairro.setText("Bairro:");
        getContentPane().add(jlBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 34, -1, -1));

        jlCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCidade.setText("Cidade:");
        getContentPane().add(jlCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 276, -1, -1));

        jlEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEstado.setText("Estado:");
        getContentPane().add(jlEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 278, -1, -1));

        jlPais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlPais.setText("Pais:");
        getContentPane().add(jlPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 203, -1, -1));

        jlCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCep.setText("CEP:");
        getContentPane().add(jlCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 35, -1, -1));

        jlComplemento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlComplemento.setText("Complemento:");
        getContentPane().add(jlComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 132, -1, -1));

        jtRua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtRua.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtRuaActionPerformed(evt);
            }
        });
        jtRua.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtRuaKeyTyped(evt);
            }
        });
        getContentPane().add(jtRua, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 69, 132, -1));

        jtNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtNumero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtNumeroActionPerformed(evt);
            }
        });
        jtNumero.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNumeroKeyTyped(evt);
            }
        });
        getContentPane().add(jtNumero, new org.netbeans.lib.awtextra.AbsoluteConstraints(182, 69, 42, -1));

        jtBairro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtBairro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtBairroActionPerformed(evt);
            }
        });
        jtBairro.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtBairroKeyTyped(evt);
            }
        });
        getContentPane().add(jtBairro, new org.netbeans.lib.awtextra.AbsoluteConstraints(272, 69, 144, -1));

        jcbCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        getContentPane().add(jcbCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(170, 310, -1, -1));

        jtCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtCidadeActionPerformed(evt);
            }
        });
        jtCidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtCidadeKeyTyped(evt);
            }
        });
        getContentPane().add(jtCidade, new org.netbeans.lib.awtextra.AbsoluteConstraints(172, 312, 151, -1));

        jcbEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        jcbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbEstadoActionPerformed(evt);
            }
        });
        getContentPane().add(jcbEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 312, -1, -1));

        jtEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtEstado.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtEstadoKeyTyped(evt);
            }
        });
        getContentPane().add(jtEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 310, 151, -1));

        jcbPais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        jcbPais.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbPaisActionPerformed(evt);
            }
        });
        getContentPane().add(jcbPais, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 237, -1, -1));

        try {
            jftCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        getContentPane().add(jftCep, new org.netbeans.lib.awtextra.AbsoluteConstraints(461, 69, 92, -1));

        jtComplemento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtComplementoActionPerformed(evt);
            }
        });
        getContentPane().add(jtComplemento, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 162, 151, -1));

        jbVoltar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Undo_48px.png"))); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });
        getContentPane().add(jbVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(400, 128, -1, -1));

        pack();
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

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        sair();
    }//GEN-LAST:event_jbVoltarActionPerformed

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        sair();
    }//GEN-LAST:event_formInternalFrameClosing

    private void jtNumeroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNumeroKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtNumeroKeyTyped

    private void jtCidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtCidadeKeyTyped
        campoSemNumero(evt);
    }//GEN-LAST:event_jtCidadeKeyTyped

    private void jtBairroKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtBairroKeyTyped
        campoSemNumero(evt);
    }//GEN-LAST:event_jtBairroKeyTyped

    private void jtRuaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtRuaKeyTyped
        campoSemNumero(evt);
    }//GEN-LAST:event_jtRuaKeyTyped

    private void jcbPaisActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbPaisActionPerformed
        try {
            if (jcbPais.getSelectedItem().equals("Brazil")) {
                jtEstado.setVisible(false);
                jtCidade.setVisible(false);
                jcbEstado.setVisible(true);
                listaE = DAO.pesquisarEstado();
                for (LocalModel local : listaE) {
                    jcbEstado.addItem(local.getNome());
                }
            }
            if (!jcbPais.getSelectedItem().equals("Brazil") && jcbPais.getSelectedIndex() != 0) {
                jtEstado.setVisible(true);
                jtCidade.setVisible(true);
                jcbEstado.setSelectedIndex(0);
                jcbCidade.setSelectedIndex(0);
                jcbEstado.setVisible(false);
                jcbCidade.setVisible(false);
            }
            if (jcbPais.getSelectedIndex() == 0) {
                jtCidade.setVisible(false);
                jtEstado.setVisible(false);
                jcbCidade.setVisible(false);
                jcbEstado.setVisible(false);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Pesquisar Estados", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jcbPaisActionPerformed

    private void jcbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbEstadoActionPerformed
        try {
            if (jcbEstado.getSelectedIndex() != 0) {
                jcbCidade.setVisible(true);
                jcbCidade.removeAllItems();
                jcbCidade.addItem("<Selecione>");
                listaC = DAO.pesquisarCidade(listaE.get(jcbEstado.getSelectedIndex() - 1).getId());
                for (LocalModel local : listaC) {
                    jcbCidade.addItem(local.getNome());
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Pesquisar Cidades", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jcbEstadoActionPerformed

    private void jtEstadoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtEstadoKeyTyped
        campoSemNumero(evt);
    }//GEN-LAST:event_jtEstadoKeyTyped


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbVoltar;
    private javax.swing.JComboBox<String> jcbCidade;
    private javax.swing.JComboBox<String> jcbEstado;
    private javax.swing.JComboBox<String> jcbPais;
    private javax.swing.JFormattedTextField jftCep;
    private javax.swing.JLabel jlBairro;
    private javax.swing.JLabel jlCep;
    private javax.swing.JLabel jlCidade;
    private javax.swing.JLabel jlComplemento;
    private javax.swing.JLabel jlEstado;
    private javax.swing.JLabel jlNumero;
    private javax.swing.JLabel jlPais;
    private javax.swing.JLabel jlRua;
    private javax.swing.JTextField jtBairro;
    private javax.swing.JTextField jtCidade;
    private javax.swing.JTextField jtComplemento;
    private javax.swing.JTextField jtEstado;
    private javax.swing.JTextField jtNumero;
    private javax.swing.JTextField jtRua;
    // End of variables declaration//GEN-END:variables
    public boolean validar() throws Exception {
        String msg = new String();
        if (jtRua.getText().equals("")) {
            msg = "O campo rua deve ser preenchido\n";
        } else {
            if (jtRua.getText().length() < 3 || jtRua.getText().length() > 40) {
                msg = "A rua deve ter entre 3 e 40 caracteres\n";
            }
        }
        if (jtBairro.getText().equals("")) {
            msg += "O bairro deve ser preenchido\n";
        } else {
            if (jtBairro.getText().length() < 5 || jtBairro.getText().length() > 40) {
                msg += "O bairro deve ser entre 5 e 40 caracteres\n";
            }
        }
        if (jftCep.getText().equals("     -   ")) {
            msg += "O CEP deve ser preenchido\n";
        } else {
            if (jftCep.getText().contains(" ")) {
                msg += "Há campos vazios no CEP\n";
            }
        }
        if (jtNumero.getText().length() != 4) {
            msg += "O número da casa deve conter 4 caracteres\n";
        }
        if (jcbPais.getSelectedIndex() == 0) {
            msg += "Selecione um Pais\n";
        }
        if (jcbPais.getSelectedItem().equals("Brazil")) {
            if (jcbEstado.getSelectedIndex() == 0) {
                msg += "Selecione um Estado\n";
            } else {
                if (jcbCidade.getSelectedIndex() == 0) {
                    msg += "Selecione uma Cidade\n";
                }
            }
        }
        if (!jcbPais.getSelectedItem().equals("Brazil") && jcbPais.getSelectedIndex() != 0) {
            if (jtEstado.getText().length() < 5 || jtEstado.getText().length() > 40) {
                msg += "O Estado deve ser entre 5 e 40 caracteres\n";
            }
            if (jtCidade.getText().length() < 5 || jtCidade.getText().length() > 40) {
                msg += "A Cidade deve ser entre 5 e 40 caracteres\n";
            }
        }
        if (msg.length() == 0) {
            return true;
        } else {
            throw new Exception(msg);
        }
    }

    public EnderecoModel preencherObjeto() {
        EnderecoModel end = new EnderecoModel();
        end.setBairro(jtBairro.getText());
        end.setRua(jtRua.getText());
        end.setNumero(Integer.parseInt(jtNumero.getText()));
        end.setCep(jftCep.getText());
        end.setComplemento(jtComplemento.getText());
        end.setPais(jcbPais.getItemAt(jcbPais.getSelectedIndex()));
        if (jcbPais.getSelectedItem().equals("Brazil")) {
            end.setEstado(jcbEstado.getItemAt(jcbEstado.getSelectedIndex()));
            end.setCidade(jcbCidade.getItemAt(jcbCidade.getSelectedIndex()));
        }else{
            end.setEstado(jtEstado.getText());
            end.setCidade(jtCidade.getText());
        }
        return end;
    }

    public void sair() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nVoltar?", "Botão Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
            try {
                if (validar()) {
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao validar: "+e.getMessage(), "Voltar", JOptionPane.ERROR_MESSAGE);
            }

        }
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

    void local() throws Exception {
        listaP = DAO.pesquisarPais();
        for (LocalModel local : listaP) {
            jcbPais.addItem(local.getNome());
        }

    }
}
