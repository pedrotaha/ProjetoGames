/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.model.EnderecoModel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Pedro
 */
public class JIFEndereco extends javax.swing.JInternalFrame {

    public JIFEndereco() {
        initComponents();
        this.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        try {
            local();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: "+e.getMessage());
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
        jtNumero = new javax.swing.JTextField();
        jtBairro = new javax.swing.JTextField();
        jtCidade = new javax.swing.JTextField();
        jtRua = new javax.swing.JTextField();
        jtComplemento = new javax.swing.JTextField();
        jcbEstado = new javax.swing.JComboBox<>();
        jcbPais = new javax.swing.JComboBox<>();
        jftCep = new javax.swing.JFormattedTextField();
        jbSalvar = new javax.swing.JButton();
        jbVoltar = new javax.swing.JButton();

        setClosable(true);
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

        jlRua.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlRua.setText("Rua:");

        jlNumero.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNumero.setText("N°:");

        jlBairro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlBairro.setText("Bairro:");

        jlCidade.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCidade.setText("Cidade:");

        jlEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEstado.setText("Estado:");

        jlPais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlPais.setText("Pais:");

        jlCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCep.setText("CEP:");

        jlComplemento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlComplemento.setText("Complemento:");

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

        jtComplemento.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtComplemento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtComplementoActionPerformed(evt);
            }
        });

        jcbEstado.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));

        jcbPais.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbPais.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));

        try {
            jftCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCep.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        jbSalvar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Save_48px.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });

        jbVoltar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Undo_48px.png"))); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlEstado))
                                .addGap(25, 25, 25)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(35, 35, 35)
                                        .addComponent(jftCep, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlPais)
                                        .addGap(116, 116, 116)
                                        .addComponent(jlCep)))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlComplemento)
                                    .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(38, 38, 38)
                                        .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jlRua)
                                        .addGap(139, 139, 139)
                                        .addComponent(jlNumero)))
                                .addGap(48, 48, 48)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jlBairro))
                                .addGap(47, 47, 47)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jlCidade)
                                    .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(47, 47, 47)
                        .addComponent(jbSalvar)
                        .addGap(83, 83, 83)
                        .addComponent(jbVoltar)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlRua)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jlNumero)
                                .addComponent(jlBairro)))
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jlCidade)
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtRua, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(jtCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlEstado)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jlCep)
                                    .addComponent(jlPais))))
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(jcbPais, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jftCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(42, 42, 42)
                        .addComponent(jlComplemento)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 87, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbSalvar)
                    .addComponent(jbVoltar))
                .addContainerGap())
        );

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

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed

    }//GEN-LAST:event_jbSalvarActionPerformed

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


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbSalvar;
    private javax.swing.JButton jbVoltar;
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
            if (jtBairro.getText().length() < 3 || jtBairro.getText().length() > 40) {
                msg += "O bairro deve ser entre 5 e 40 caracteres\n";
            }
        }
        if (jtCidade.getText().equals("")) {
            msg += "O bairro deve ser preenchido\n";
        } else {
            if (jtBairro.getText().length() < 3 || jtBairro.getText().length() > 40) {
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

        if (jcbPais.getSelectedIndex() == 0) {
            msg += "Selecione um sexo\n";
        }
        if (jcbEstado.getSelectedIndex() == 0) {
            msg += "Selecione um tipo de usuário\n";
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
        end.setEstado(jcbEstado.getItemAt(jcbEstado.getSelectedIndex()));
        end.setPais(jcbPais.getItemAt(jcbPais.getSelectedIndex()));
        end.setCidade(jtCidade.getText());
        end.setRua(jtRua.getText());
        end.setNumero(Integer.parseInt(jtNumero.getText()));
        end.setCep(jftCep.getText());
        end.setComplemento(jtComplemento.getText());
        return end;
    }

    public void sair() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
            try {
                if (validar()) {
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Preencha todos os campos obrigatórios!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, "Erro ao validar os dados", "Sair", JOptionPane.ERROR_MESSAGE);
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

//    public void localizacao() {
//        try {
//            WebService.setUserName("pedrotaha");
//            ToponymSearchCriteria searchCriteria = new ToponymSearchCriteria();
//
//            searchCriteria.setQ("all countries");
//            ToponymSearchResult searchResult = WebService.search(searchCriteria);
//            for (Toponym toponym : searchResult.getToponyms()) {
//                System.out.println(toponym.getName() + " ");
//                jcbEstado.addItem(toponym.getName());
//            }
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Localizar", JOptionPane.ERROR_MESSAGE);
//        }
//
//    }
//
//    public void  local() throws org.geonames.InvalidParameterException, Exception {
//
//        ToponymSearchCriteria searchCriteria = new ToponymSearchCriteria();
//
//        WebService.setUserName("pedrotaha"); //username
//        try {
//
//            searchCriteria.setCountryCode("DO"); //Country
//            searchCriteria.setLanguage("ES");  //Language
//
//            searchCriteria.setNameEquals("All Countries"); //Location
//            searchCriteria.setMaxRows(1);
//            ToponymSearchResult searchResult = WebService.search(searchCriteria);
//
//            for (Toponym toponym : searchResult.getToponyms()) {
//
//                System.out.println(toponym.getName() + " " + toponym.getCountryName() + " Lat: " + toponym.getLatitude() + " Lon " + toponym.getLongitude());
//            }
//
//        } catch (InvalidParameterException ex) {
//            System.out.println(ex.getMessage());
//        }
//    }
    void local() throws Exception{
        
    }
}
