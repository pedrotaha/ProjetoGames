/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.data.TipoUsuarioData;
import br.com.ProjetoGames.data.UsuarioData;
import br.com.ProjetoGames.model.EnderecoModel;
import br.com.ProjetoGames.model.TipoUsuarioModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Locale;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;

/**
 *
 * @author Pedro
 */
public class JFCadCliente extends javax.swing.JFrame {

    EnderecoModel end = new EnderecoModel();
    int frameCount = 0;
    JIFEndereco janela = new JIFEndereco();
    int loge;
    UsuarioModel obj;
    private ArrayList<TipoUsuarioModel> dadosTipoUsuario;
    Calendar cal = Calendar.getInstance();
    
    public JFCadCliente() {
        initComponents();
        frameCount = 0;
        jtEndereco.setText("Clique aqui!");
        jbFuncionario.setVisible(false);
        loge = 0;
        setIcon();
        windowsClosing();
        internoClosed();
        carregarTipo();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);

    }

    public JFCadCliente(int log) {
        initComponents();
        frameCount = 0;
        jtEndereco.setText("Clique aqui!");
        jbFuncionario.setVisible(false);
        loge = log;
        setIcon();
        windowsClosing();
        internoClosed();
        carregarTipo();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
    }

    public JFCadCliente(UsuarioModel obj, int log) {
        initComponents();
        frameCount = 0;
        jtEndereco.setText("Clique aqui!");
        jbFuncionario.setVisible(false);
        loge = log;
        this.obj = obj;
        setIcon();
        windowsClosing();
        internoClosed();
        carregarTipo();
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

        jdpPrincipal = new javax.swing.JDesktopPane();
        jlUsuario = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jlSenha = new javax.swing.JLabel();
        jlEmail = new javax.swing.JLabel();
        jlCpf = new javax.swing.JLabel();
        jtEmail = new javax.swing.JTextField();
        jlTelefone = new javax.swing.JLabel();
        jlEndereco = new javax.swing.JLabel();
        jtEndereco = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jlDataNasc = new javax.swing.JLabel();
        jftCpf = new javax.swing.JFormattedTextField();
        jftDataNasc = new javax.swing.JFormattedTextField();
        jbSalvar = new javax.swing.JButton();
        jpfSenha = new javax.swing.JPasswordField();
        jbCancelar = new javax.swing.JButton();
        jbLimpar = new javax.swing.JButton();
        jlSexo = new javax.swing.JLabel();
        jcbSexo = new javax.swing.JComboBox<>();
        jbShiro = new javax.swing.JLabel();
        jbTipo = new javax.swing.JLabel();
        jcbTipo = new javax.swing.JComboBox<>();
        jlNome = new javax.swing.JLabel();
        jtNome = new javax.swing.JTextField();
        jbFuncionario = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Usuário");
        setMaximumSize(new java.awt.Dimension(900, 500));
        setMinimumSize(new java.awt.Dimension(897, 456));
        setPreferredSize(new java.awt.Dimension(900, 389));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosed(java.awt.event.WindowEvent evt) {
                formWindowClosed(evt);
            }
        });
        getContentPane().setLayout(null);

        jdpPrincipal.setBackground(new java.awt.Color(255, 255, 255));
        jdpPrincipal.setForeground(new java.awt.Color(255, 255, 255));
        jdpPrincipal.setMinimumSize(new java.awt.Dimension(897, 456));

        jlUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlUsuario.setText("Usuário:");
        jdpPrincipal.add(jlUsuario);
        jlUsuario.setBounds(12, 23, 93, 17);

        jtUsuario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtUsuario.setMaximumSize(new java.awt.Dimension(6, 23));
        jdpPrincipal.add(jtUsuario);
        jtUsuario.setBounds(12, 69, 135, 31);

        jlSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlSenha.setText("Senha:");
        jdpPrincipal.add(jlSenha);
        jlSenha.setBounds(180, 23, 93, 17);

        jlEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEmail.setText("E-mail:");
        jdpPrincipal.add(jlEmail);
        jlEmail.setBounds(12, 152, 61, 17);

        jlCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlCpf.setText("CPF:");
        jdpPrincipal.add(jlCpf);
        jlCpf.setBounds(341, 23, 62, 17);

        jtEmail.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jdpPrincipal.add(jtEmail);
        jtEmail.setBounds(12, 187, 260, 30);

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlTelefone.setText("Telefone:");
        jdpPrincipal.add(jlTelefone);
        jlTelefone.setBounds(489, 23, 66, 17);

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlEndereco.setText("Endereço:");
        jdpPrincipal.add(jlEndereco);
        jlEndereco.setBounds(350, 155, 72, 14);

        jtEndereco.setEditable(false);
        jtEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtEndereco.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtEnderecoMouseClicked(evt);
            }
        });
        jdpPrincipal.add(jtEndereco);
        jtEndereco.setBounds(350, 187, 263, 30);

        jtTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtTelefone.setMaximumSize(new java.awt.Dimension(6, 23));
        jtTelefone.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtTelefoneKeyTyped(evt);
            }
        });
        jdpPrincipal.add(jtTelefone);
        jtTelefone.setBounds(489, 68, 86, 32);

        jlDataNasc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlDataNasc.setText("<html>Data de<br />Nascimento:</html>");
        jdpPrincipal.add(jlDataNasc);
        jlDataNasc.setBounds(606, 15, 130, 34);

        try {
            jftCpf.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("###.###.###-##")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jftCpf.setMaximumSize(new java.awt.Dimension(6, 23));
        jftCpf.setPreferredSize(new java.awt.Dimension(6, 23));
        jdpPrincipal.add(jftCpf);
        jftCpf.setBounds(341, 68, 117, 32);

        try {
            jftDataNasc.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataNasc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jdpPrincipal.add(jftDataNasc);
        jftDataNasc.setBounds(606, 68, 81, 32);

        jbSalvar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Save_48px.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jdpPrincipal.add(jbSalvar);
        jbSalvar.setBounds(10, 350, 149, 52);

        jpfSenha.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jpfSenha.setMaximumSize(new java.awt.Dimension(6, 23));
        jdpPrincipal.add(jpfSenha);
        jpfSenha.setBounds(180, 68, 127, 32);

        jbCancelar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Cancel_48px.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jdpPrincipal.add(jbCancelar);
        jbCancelar.setBounds(370, 350, 175, 52);

        jbLimpar.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jbLimpar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Broom_48px.png"))); // NOI18N
        jbLimpar.setText("Limpar");
        jbLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbLimparActionPerformed(evt);
            }
        });
        jdpPrincipal.add(jbLimpar);
        jbLimpar.setBounds(190, 350, 157, 52);

        jlSexo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlSexo.setText("Sexo:");
        jdpPrincipal.add(jlSexo);
        jlSexo.setBounds(743, 32, 39, 17);

        jcbSexo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbSexo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Masculino", "Feminino" }));
        jdpPrincipal.add(jcbSexo);
        jcbSexo.setBounds(743, 67, 114, 32);

        jbShiro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/53dd6dc8578795657635e45c5aaf18a2.jpg"))); // NOI18N
        jdpPrincipal.add(jbShiro);
        jbShiro.setBounds(520, 50, 380, 440);

        jbTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbTipo.setText("Tipo:");
        jdpPrincipal.add(jbTipo);
        jbTipo.setBounds(12, 250, 60, 20);

        jcbTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jcbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>" }));
        jcbTipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbTipoActionPerformed(evt);
            }
        });
        jdpPrincipal.add(jcbTipo);
        jcbTipo.setBounds(12, 290, 130, 30);

        jlNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jlNome.setText("Nome:");
        jdpPrincipal.add(jlNome);
        jlNome.setBounds(200, 250, 50, 17);

        jtNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtNome.setMaximumSize(new java.awt.Dimension(6, 23));
        jtNome.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtNomeKeyTyped(evt);
            }
        });
        jdpPrincipal.add(jtNome);
        jtNome.setBounds(200, 290, 135, 31);

        jbFuncionario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jbFuncionario.setText("Funcionário");
        jdpPrincipal.add(jbFuncionario);
        jbFuncionario.setBounds(380, 290, 130, 30);

        getContentPane().add(jdpPrincipal);
        jdpPrincipal.setBounds(0, 0, 900, 460);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowClosed(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowClosed

    }//GEN-LAST:event_formWindowClosed

    private void jbLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_jbLimparActionPerformed

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nCancelar?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
            sair();
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        try {
            if (validarCampos()) {
                if (preencherObjeto()) {
                    UsuarioData DAO = new UsuarioData();
                    if (obj.getId() <= 0) {
//                        if (DAO.incluir(obj)) {
//                            JOptionPane.showMessageDialog(this, "Salvo com Sucesso\n", "Salvar", JOptionPane.INFORMATION_MESSAGE);
//                            jbLimparActionPerformed(evt);
//                        }
                    }
                    if (obj.getId() >= 1) {
//                        if (DAO.editar(obj)) {
//                            JOptionPane.showMessageDialog(this, "Editado com Sucesso", "Editar", JOptionPane.INFORMATION_MESSAGE);
//                            limparCampos();
//                            atualizarTabela();
//                        }
                    }
                    sair();
                }
           }
        } catch (Exception e) {
            if (obj.getId() <= 0) {
                JOptionPane.showMessageDialog(this, "Falha ao Salvar\n" + e.getMessage(),
                        "Salvar", JOptionPane.ERROR_MESSAGE);
            }
            if (obj.getId() >= 1) {
                JOptionPane.showMessageDialog(this, "Falha ao Editar\n" + e.getMessage(),
                        "Editar", JOptionPane.ERROR_MESSAGE);
            }
        }
    }//GEN-LAST:event_jbSalvarActionPerformed

    private void jtEnderecoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtEnderecoMouseClicked
        if (frameCount == 0) {
            jdpPrincipal.add(janela);
            janela.setVisible(true);
            frameCount++;
            jbCancelar.setEnabled(false);
            jbSalvar.setEnabled(false);
            jbLimpar.setEnabled(false);
        }
    }//GEN-LAST:event_jtEnderecoMouseClicked

    private void jtTelefoneKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtTelefoneKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtTelefoneKeyTyped

    private void jtNomeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtNomeKeyTyped
        campoSemNumero(evt);
    }//GEN-LAST:event_jtNomeKeyTyped

    private void jcbTipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbTipoActionPerformed
        if(jcbTipo.getSelectedIndex() > 1){
            
        }
    }//GEN-LAST:event_jcbTipoActionPerformed

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
            java.util.logging.Logger.getLogger(JFCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadCliente.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadCliente().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbFuncionario;
    private javax.swing.JButton jbLimpar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JLabel jbShiro;
    private javax.swing.JLabel jbTipo;
    private javax.swing.JComboBox<String> jcbSexo;
    private javax.swing.JComboBox<String> jcbTipo;
    private javax.swing.JDesktopPane jdpPrincipal;
    private javax.swing.JFormattedTextField jftCpf;
    private javax.swing.JFormattedTextField jftDataNasc;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlEmail;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtEmail;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Add_User_Male_96px.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public void windowsClosing() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
                    sair();
                }
            }
        });
    }

    public void internoClosed() {
        janela.addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameClosed(InternalFrameEvent e) {
                frameCount--;
                jtEndereco.setText("Registrado com sucesso!");
                jbCancelar.setEnabled(true);
                jbSalvar.setEnabled(true);
                jbLimpar.setEnabled(true);
            }
        });
    }

    public void sair() {
        dispose();
        if (loge == 1) {
            new JFPrincipal().setVisible(true);
        } else {
            if (loge == 0) {
                new JFLogin().setVisible(true);
            } else if (loge == 2) {
                //new JFPesquisarUser().setVisible(true);
            }
        }
    }

    public boolean salvar() {
        return true;
    }

    public void carregarTipo() {
        try {
            TipoUsuarioData DAOTipo = new TipoUsuarioData();
            dadosTipoUsuario = DAOTipo.carregarCombo();
            for (TipoUsuarioModel tipo : dadosTipoUsuario) {
                jcbTipo.addItem(tipo.getDescricao());
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Erro:" + e.getMessage());
        }
    }

    private void limparCampos() {
        jtNome.setText("");
        jtEmail.setText("");
        jtEndereco.setText("Clique aqui!");
        jtTelefone.setText("");
        jtUsuario.setText("");
        jpfSenha.setText("");
        jftCpf.setText("");
        jftDataNasc.setText("");
        jcbSexo.setSelectedIndex(0);
        jcbTipo.setSelectedIndex(0);
    }

    private boolean validarCampos() throws Exception {
        String msg = new String();
        if (jtNome.getText().equals("")) {
            msg = "O campo nome deve ser preenchido\n";
        } else {//Não pode ser <3 ou >40( varchar(40) )
            if (jtNome.getText().length() < 3 || jlNome.getText().length() > 40) {
                msg = "O nome deve ter entre 3 e 40 caracteres\n";
            }
        }
        if (jtEmail.getText().equals("")) {
            msg += "O e-mail deve ser preenchido\n";
        } else {
            if (jtEmail.getText().length() < 5 || jtEmail.getText().length() > 40) {
                msg += "O e-mail deve ser entre 5 e 40 caracteres\n";
            } else {
                if (!jtEmail.getText().contains("@") || !jtEmail.getText().contains(".")) {
                    msg += "O e-mail deve conter @ e .\n";
                }
            }
        }
        if (jftCpf.getText().equals("   .   .   -  ")) {
            msg += "O CPF deve ser preenchido\n";
        } else {
            if (jftCpf.getText().contains(" ")) {
                msg += "Há campos vazios no CPF\n";
            }
        }
        if (jtTelefone.getText().equals("")) {
            msg += "O Telefone deve ser preenchido\n";
        } else {
            if (jtTelefone.getText().length() < 10 || jtTelefone.getText().length() > 11) {
                msg += "O Telefone deve conter DDD + número(entre 10 e 11 caracteres)\n";
            }
        }
        if (jtEndereco.getText().equals("Clique aqui!")) {
            msg += "O Endereço deve ser preenchido\n";
        }
        if (jtUsuario.getText().equals("")) {
            msg += "O Usuário deve ser preenchido\n";
        } else {
            if (jtUsuario.getText().length() < 3 || jtUsuario.getText().length() > 40) {
                msg += "O Usuário deve ter entre 3 e 40 caracteres\n";
            }
        }
        if (jpfSenha.getText().equals("")) {
            msg += "A senha deve ser preenchida\n";
        } else {
            if (jpfSenha.getText().length() <= 8 || jpfSenha.getText().length() > 50) {
                msg += "A senha deve conter entre 8 e 50 caracteres\n";
            }
        }
        if (jftDataNasc.getText().equals("  /  /    ")) {
            msg += "A data de nascimento deve ser preenchido\n";
        } else {
            if (jftDataNasc.getText().contains(" ")) {
                msg += "Há campos vazios na data de nascimento\n";
            }
        }
        if (jcbSexo.getSelectedIndex() == 0) {
            msg += "Selecione um sexo\n";
        }
        if (jcbTipo.getSelectedIndex() == 0) {
            msg += "Selecione um tipo de usuário\n";
        }
        if (msg.length() == 0) {
            return true;
        } else {
            throw new Exception(msg);
        }
    }

    private boolean preencherObjeto() throws Exception {
        obj.setNome(jtNome.getText());
        obj.setCpf(jftCpf.getText());
        obj.setTelefone(jtTelefone.getText());
        obj.setEmail(jtEmail.getText());
        obj.setSexo(jcbSexo.getItemAt(jcbSexo.getSelectedIndex()));
        obj.setDataNasc(calendario(jftDataNasc.getText()));
        obj.setLogin(jtUsuario.getText());
        obj.setSenha(jpfSenha.getText());
        obj.setDataCadastro(dataAtual());
        obj.setTipoUsuarioModel(dadosTipoUsuario.get(jcbTipo.getSelectedIndex()));
        obj.setEnderecoModel(janela.preencherObjeto());//Fazer o insert correto

        return true;
    }

    public Calendar calendario(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("DD/MM/YYYY", Locale.ENGLISH);
            cal.setTime(sdf.parse(data));// all done
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Data de Nascimento", JOptionPane.ERROR_MESSAGE);
        }
        return cal;
    }

    public Calendar dataAtual() {
        Calendar cal = new GregorianCalendar();
        int year = cal.get(Calendar.YEAR);
        int month = cal.get(Calendar.MONTH);
        int day = cal.get(Calendar.DAY_OF_MONTH);
        int second = cal.get(Calendar.SECOND);
        int minute = cal.get(Calendar.MINUTE);
        int hour = cal.get(Calendar.HOUR_OF_DAY);
        cal.set(year, month, hour, minute, second);
        return cal;
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
}

//    public void vetoableChange(PropertyChangeEvent pce) throws PropertyVetoException {
//        if (pce.getPropertyName().equals(IS_CLOSED_PROPERTY)) {
//            boolean changed = ((Boolean) pce.getNewValue()).booleanValue();
//            if (changed) {
//                int option = JOptionPane.showOptionDialog(this, "Close "
//                        + getTitle() + "?",
//                        "Close Confirmation",
//                        JOptionPane.YES_NO_OPTION,
//                        JOptionPane.QUESTION_MESSAGE,
//                        null, null, null);
//                if (option != JOptionPane.YES_OPTION) {
//                    throw new PropertyVetoException("Cancelled", null);
//                }
//            }
//        }
//    }