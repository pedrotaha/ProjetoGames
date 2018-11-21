/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view.Operacao;

import br.com.ProjetoGames.data.JogosData;
import br.com.ProjetoGames.data.PlataformaData;
import br.com.ProjetoGames.model.JogosModel;
import br.com.ProjetoGames.model.PlataformaModel;
import br.com.ProjetoGames.model.UsuarioModel;
import br.com.ProjetoGames.view.JFPrincipal;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import java.io.FileInputStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFCadJogo extends javax.swing.JFrame {

    JogosModel jogo = new JogosModel();
    JogosData DAO = new JogosData();
    UsuarioModel obj = new UsuarioModel();
    Calendar cal = Calendar.getInstance();
    int anoAtual = cal.get(Calendar.YEAR);
    int mesAtual = cal.get(Calendar.MONTH) + 1;
    int diaAtual = cal.get(Calendar.DAY_OF_MONTH);
    DefaultListModel MODELO;
    int Enter = 0, log;
    ArrayList<PlataformaModel> lista = new ArrayList<>();
    PlataformaModel selecionado = new PlataformaModel();
    PlataformaData DAOP = new PlataformaData();
    FileInputStream fis;
    File file;

    public JFCadJogo() {
        initComponents();
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        jfcBuscar.setVisible(false);
        mostraPesquisa();
        jlistPlataforma.setVisible(false);
        jscrollpPlataforma.setVisible(false);
        MODELO = new DefaultListModel();
        jlistPlataforma.setModel(MODELO);
        log = 0;
    }

    public JFCadJogo(UsuarioModel obj) {
        initComponents();
        this.obj = obj;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        jfcBuscar.setVisible(false);
        mostraPesquisa();
        jlistPlataforma.setVisible(false);
        jscrollpPlataforma.setVisible(false);
        MODELO = new DefaultListModel();
        jlistPlataforma.setModel(MODELO);
        log = 0;
    }

    public JFCadJogo(UsuarioModel obj, JogosModel jogo , int log) {
        initComponents();
        this.obj = obj;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        jfcBuscar.setVisible(false);
        mostraPesquisa();
        jlistPlataforma.setVisible(false);
        jscrollpPlataforma.setVisible(false);
        MODELO = new DefaultListModel();
        jlistPlataforma.setModel(MODELO);
        this.log = log;
        this.jogo = jogo;
        jbBuscar.setEnabled(false);
        carregarCamposEdit();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jDesktopPane1 = new javax.swing.JDesktopPane();
        jscrollpPlataforma = new javax.swing.JScrollPane();
        jlistPlataforma = new javax.swing.JList<>();
        jlQuantLocacao = new javax.swing.JLabel();
        jlQuantVenda = new javax.swing.JLabel();
        jlTitulo = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlPlataforma = new javax.swing.JLabel();
        jlDataLancamento = new javax.swing.JLabel();
        jlPublicadora = new javax.swing.JLabel();
        jlFaixaEtaria = new javax.swing.JLabel();
        jlImagem = new javax.swing.JLabel();
        jcbFaixaEtaria = new javax.swing.JComboBox<>();
        jftDataLancamento = new javax.swing.JFormattedTextField();
        jtTitulo = new javax.swing.JTextField();
        jtGenero = new javax.swing.JTextField();
        jtPlataforma = new javax.swing.JTextField();
        jtPublicadora = new javax.swing.JTextField();
        jtQuantVenda = new javax.swing.JTextField();
        jtQuantLocacao = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtDir = new javax.swing.JTextField();
        jfcBuscar = new javax.swing.JFileChooser();
        jbSalvar = new javax.swing.JButton();
        jbCancelar = new javax.swing.JButton();
        jlPrecoVenda = new javax.swing.JLabel();
        jtPrecoVenda = new javax.swing.JTextField();
        jlPrecoLocacao = new javax.swing.JLabel();
        jtPrecoLocacao = new javax.swing.JTextField();
        jlSifraLocacao = new javax.swing.JLabel();
        jlSifraVenda = new javax.swing.JLabel();
        jtFundoVenda = new javax.swing.JTextField();
        jtFundoLocacao = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Cadastro Jogos");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jDesktopPane1.setBackground(new java.awt.Color(255, 255, 255));

        jlistPlataforma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlistPlataforma.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                jlistPlataformaMousePressed(evt);
            }
        });
        jlistPlataforma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jlistPlataformaKeyReleased(evt);
            }
        });
        jscrollpPlataforma.setViewportView(jlistPlataforma);

        jDesktopPane1.add(jscrollpPlataforma);
        jscrollpPlataforma.setBounds(240, 100, 380, 130);

        jlQuantLocacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlQuantLocacao.setText("<html>Quantidade para<br \\> Locação:</html>");
        jlQuantLocacao.setToolTipText("");
        jDesktopPane1.add(jlQuantLocacao);
        jlQuantLocacao.setBounds(270, 240, 143, 40);

        jlQuantVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlQuantVenda.setText("<html>Quantidade para<br \\> Venda:</html>");
        jDesktopPane1.add(jlQuantVenda);
        jlQuantVenda.setBounds(12, 243, 143, 40);

        jlTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTitulo.setText("Titulo:");
        jDesktopPane1.add(jlTitulo);
        jlTitulo.setBounds(20, 22, 56, 22);

        jlGenero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlGenero.setText("Gênero:");
        jlGenero.setToolTipText("");
        jDesktopPane1.add(jlGenero);
        jlGenero.setBounds(205, 131, 72, 22);

        jlPlataforma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPlataforma.setText("Plataforma:");
        jDesktopPane1.add(jlPlataforma);
        jlPlataforma.setBounds(240, 22, 101, 22);

        jlDataLancamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDataLancamento.setText("<html>Data de  <br /> Lançamento:</html>");
        jDesktopPane1.add(jlDataLancamento);
        jlDataLancamento.setBounds(510, 240, 115, 44);

        jlPublicadora.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPublicadora.setText("Publicadora:");
        jDesktopPane1.add(jlPublicadora);
        jlPublicadora.setBounds(12, 131, 110, 22);

        jlFaixaEtaria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlFaixaEtaria.setText("Faixa Etária:");
        jDesktopPane1.add(jlFaixaEtaria);
        jlFaixaEtaria.setBounds(471, 131, 109, 22);

        jlImagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlImagem.setText("Imagem da capa:");
        jDesktopPane1.add(jlImagem);
        jlImagem.setBounds(12, 347, 160, 22);

        jcbFaixaEtaria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jcbFaixaEtaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Livre", "+10", "+12", "+14", "+16", "+18" }));
        jDesktopPane1.add(jcbFaixaEtaria);
        jcbFaixaEtaria.setBounds(471, 171, 142, 28);

        try {
            jftDataLancamento.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jftDataLancamento.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jftDataLancamento);
        jftDataLancamento.setBounds(510, 290, 100, 30);

        jtTitulo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jtTitulo);
        jtTitulo.setBounds(12, 72, 159, 28);

        jtGenero.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jtGenero);
        jtGenero.setBounds(205, 171, 219, 28);

        jtPlataforma.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtPlataforma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtPlataformaActionPerformed(evt);
            }
        });
        jtPlataforma.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPlataformaKeyReleased(evt);
            }
        });
        jDesktopPane1.add(jtPlataforma);
        jtPlataforma.setBounds(240, 72, 380, 28);

        jtPublicadora.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jtPublicadora);
        jtPublicadora.setBounds(12, 171, 146, 28);

        jtQuantVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtQuantVenda.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtQuantVendaKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtQuantVenda);
        jtQuantVenda.setBounds(17, 291, 88, 28);

        jtQuantLocacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtQuantLocacao.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtQuantLocacaoKeyTyped(evt);
            }
        });
        jDesktopPane1.add(jtQuantLocacao);
        jtQuantLocacao.setBounds(270, 290, 76, 28);

        jbBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jbBuscar.setText("Buscar");
        jbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbBuscarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbBuscar);
        jbBuscar.setBounds(12, 395, 93, 31);

        jtDir.setEditable(false);
        jtDir.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jtDir);
        jtDir.setBounds(170, 340, 310, 28);

        jfcBuscar.setCurrentDirectory(new java.io.File("C:\\Users"));
        jfcBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jfcBuscar);
        jfcBuscar.setBounds(550, 390, 650, 397);

        jbSalvar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Save_48px.png"))); // NOI18N
        jbSalvar.setText("Salvar");
        jbSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbSalvarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbSalvar);
        jbSalvar.setBounds(140, 410, 170, 50);

        jbCancelar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbCancelar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Cancel_48px.png"))); // NOI18N
        jbCancelar.setText("Cancelar");
        jbCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCancelarActionPerformed(evt);
            }
        });
        jDesktopPane1.add(jbCancelar);
        jbCancelar.setBounds(350, 410, 190, 50);

        jlPrecoVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPrecoVenda.setText("Preço:");
        jDesktopPane1.add(jlPrecoVenda);
        jlPrecoVenda.setBounds(150, 270, 80, 22);

        jtPrecoVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jtPrecoVenda);
        jtPrecoVenda.setBounds(150, 290, 80, 30);

        jlPrecoLocacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPrecoLocacao.setText("Preço:");
        jDesktopPane1.add(jlPrecoLocacao);
        jlPrecoLocacao.setBounds(390, 270, 80, 20);

        jtPrecoLocacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jtPrecoLocacao);
        jtPrecoLocacao.setBounds(390, 290, 80, 30);

        jlSifraLocacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSifraLocacao.setText("R$");
        jDesktopPane1.add(jlSifraLocacao);
        jlSifraLocacao.setBounds(360, 290, 23, 22);

        jlSifraVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSifraVenda.setText("R$");
        jDesktopPane1.add(jlSifraVenda);
        jlSifraVenda.setBounds(120, 290, 30, 16);

        jtFundoVenda.setEditable(false);
        jtFundoVenda.setBackground(new java.awt.Color(204, 204, 255));
        jtFundoVenda.setForeground(new java.awt.Color(255, 255, 255));
        jtFundoVenda.setAutoscrolls(false);
        jtFundoVenda.setEnabled(false);
        jtFundoVenda.setFocusable(false);
        jtFundoVenda.setOpaque(false);
        jtFundoVenda.setRequestFocusEnabled(false);
        jtFundoVenda.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtFundoVenda.setVerifyInputWhenFocusTarget(false);
        jDesktopPane1.add(jtFundoVenda);
        jtFundoVenda.setBounds(10, 240, 230, 90);

        jtFundoLocacao.setEditable(false);
        jtFundoLocacao.setBackground(new java.awt.Color(204, 255, 255));
        jtFundoLocacao.setForeground(new java.awt.Color(255, 255, 255));
        jtFundoLocacao.setAutoscrolls(false);
        jtFundoLocacao.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jtFundoLocacao.setDebugGraphicsOptions(javax.swing.DebugGraphics.NONE_OPTION);
        jtFundoLocacao.setEnabled(false);
        jtFundoLocacao.setFocusable(false);
        jtFundoLocacao.setHighlighter(null);
        jtFundoLocacao.setKeymap(null);
        jtFundoLocacao.setOpaque(false);
        jtFundoLocacao.setRequestFocusEnabled(false);
        jtFundoLocacao.setSelectionColor(new java.awt.Color(255, 255, 255));
        jtFundoLocacao.setVerifyInputWhenFocusTarget(false);
        jDesktopPane1.add(jtFundoLocacao);
        jtFundoLocacao.setBounds(260, 240, 230, 90);

        getContentPane().add(jDesktopPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(1, -5, 650, 470));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbBuscarActionPerformed
        jfcBuscar.setVisible(true);
        buscar();
    }//GEN-LAST:event_jbBuscarActionPerformed

    private void jtPlataformaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtPlataformaActionPerformed
//        jlistPlataforma.setVisible(false);
//        jscrollpPlataforma.setVisible(false);
//        Enter = 1;
    }//GEN-LAST:event_jtPlataformaActionPerformed

    private void jtPlataformaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPlataformaKeyReleased
        if (Enter == 0) {
            listaDePesquisa();
        } else {
            Enter = 0;
        }
        if (evt.getKeyCode() == KeyEvent.VK_DOWN) {
            jlistPlataforma.requestFocusInWindow();
            jlistPlataforma.setSelectedIndex(0);
        }
    }//GEN-LAST:event_jtPlataformaKeyReleased

    private void jlistPlataformaMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlistPlataformaMousePressed
        mostraPesquisa();
        jlistPlataforma.setVisible(false);
        jscrollpPlataforma.setVisible(false);
        jtPlataforma.setText(selecionado.getNome());
    }//GEN-LAST:event_jlistPlataformaMousePressed

    private void jlistPlataformaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jlistPlataformaKeyReleased
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            mostraPesquisa();
            jlistPlataforma.setVisible(false);
            jscrollpPlataforma.setVisible(false);
            jtPlataforma.setText(selecionado.getNome());
        }
        if (evt.getKeyCode() == KeyEvent.VK_UP && jlistPlataforma.getSelectedIndex() == 0) {
            jtPlataforma.requestFocusInWindow();
            selecionado = new PlataformaModel();
        }
    }//GEN-LAST:event_jlistPlataformaKeyReleased

    private void jtQuantVendaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtQuantVendaKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtQuantVendaKeyTyped

    private void jtQuantLocacaoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtQuantLocacaoKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtQuantLocacaoKeyTyped

    private void jbCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCancelarActionPerformed
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
            sair();
        }
    }//GEN-LAST:event_jbCancelarActionPerformed

    private void jbSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbSalvarActionPerformed
        //validar campos, preencher objeto, verificar se jogo já esta cadastrado, manda para o banco, preparar pra editar
        try {
            if (validar()) {
                if (preencherObjeto()) {
                    if (log == 0) {
                        if (DAO.incluir(jogo, file, fis)) {
                            JOptionPane.showMessageDialog(this, "Salvo com sucesso!");
                            fis.close();
                            sair();
                        }
                    }
                    if (log == 1) {
                        if (DAO.editar(jogo)) {
                            JOptionPane.showMessageDialog(this, "Editado com sucesso!");
                            sair();
                        }
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao salvar: \n" + e.getMessage(), "botão salvar", JOptionPane.ERROR_MESSAGE);
        }

    }//GEN-LAST:event_jbSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(JFCadJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCadJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCadJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCadJogo.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCadJogo().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JButton jbCancelar;
    private javax.swing.JButton jbSalvar;
    private javax.swing.JComboBox<String> jcbFaixaEtaria;
    private javax.swing.JFileChooser jfcBuscar;
    private javax.swing.JFormattedTextField jftDataLancamento;
    private javax.swing.JLabel jlDataLancamento;
    private javax.swing.JLabel jlFaixaEtaria;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JLabel jlPlataforma;
    private javax.swing.JLabel jlPrecoLocacao;
    private javax.swing.JLabel jlPrecoVenda;
    private javax.swing.JLabel jlPublicadora;
    private javax.swing.JLabel jlQuantLocacao;
    private javax.swing.JLabel jlQuantVenda;
    private javax.swing.JLabel jlSifraLocacao;
    private javax.swing.JLabel jlSifraVenda;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JList<String> jlistPlataforma;
    private javax.swing.JScrollPane jscrollpPlataforma;
    private javax.swing.JTextField jtDir;
    private javax.swing.JTextField jtFundoLocacao;
    private javax.swing.JTextField jtFundoVenda;
    private javax.swing.JTextField jtGenero;
    private javax.swing.JTextField jtPlataforma;
    private javax.swing.JTextField jtPrecoLocacao;
    private javax.swing.JTextField jtPrecoVenda;
    private javax.swing.JTextField jtPublicadora;
    private javax.swing.JTextField jtQuantLocacao;
    private javax.swing.JTextField jtQuantVenda;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Overwatch_528px_1.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public void windowsClosing() {
        ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
                    sair();
                }
            }
        });
    }

    public void sair() {
        dispose();
        if (log == 0) {
            new JFPrincipal(obj).setVisible(true);
        } else {
            if (log == 1) {
                new JFPesquisarJogo(obj).setVisible(true);
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

    public void buscar() {
        jfcBuscar.removeChoosableFileFilter(jfcBuscar.getAcceptAllFileFilter());
        FileFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());
        jfcBuscar.addChoosableFileFilter(imageFilter);
        jfcBuscar.setFileFilter(imageFilter);
        jfcBuscar.setMultiSelectionEnabled(false);
        jfcBuscar.setFileSelectionMode(JFileChooser.FILES_ONLY);
        int i = jfcBuscar.showSaveDialog(null);
        if (i == 1) {
            jtDir.setText("");
        } else {
            File arquivo = jfcBuscar.getSelectedFile();
            File file = jfcBuscar.getSelectedFile();
            long fileSize = file.length();
            if ((fileSize / 1024) > 1024) {
                JOptionPane.showMessageDialog(this, "Arquivo muito grande, escolha um com até 1MB", "Arquivo Grande", JOptionPane.INFORMATION_MESSAGE);
                jtDir.setText("");
            } else {
                jtDir.setText(arquivo.getPath());
            }
        }
    }

    public void mostraPesquisa() {
        int Linha = jlistPlataforma.getSelectedIndex();
        if (Linha >= 0) {
            selecionado = lista.get(Linha);
        }
    }

    public void listaDePesquisa() {
        if (jtPlataforma.getText().length() > 1) {
            try {
                MODELO.removeAllElements();
                lista = DAOP.pesquisar(jtPlataforma.getText());
                for (PlataformaModel list : lista) {
                    MODELO.addElement(list.getNome());
                }
                if (lista.size() >= 1) {
                    jlistPlataforma.setVisible(true);
                    jscrollpPlataforma.setVisible(true);
                } else {
                    jlistPlataforma.setVisible(false);
                    jscrollpPlataforma.setVisible(false);
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        } else {
            MODELO.removeAllElements();
            jlistPlataforma.setVisible(false);
            jscrollpPlataforma.setVisible(false);
            Enter = 1;
        }
    }

    public boolean validar() throws Exception {
        String msg = new String();
        if (jtTitulo.getText().equals("")) {
            msg = "O título deve ser preenchido\n";
        } else {
            if (jtTitulo.getText().length() < 3 || jtTitulo.getText().length() > 40) {
                msg = "O título deve conter entre 3 e 40 caracteres\n";
            }
        }
        if (jtQuantVenda.getText().equals("")) {
            msg += "Insira uma quantidade para venda\n";
        }
        if (jtQuantLocacao.getText().equals("")) {
            msg += "Insira uma quantidade para locação\n";
        }
        if (jtPublicadora.getText().equals("")) {
            msg += "Informe qual a publicadora\n";
        } else {
            if (jtPublicadora.getText().length() < 3 || jtPublicadora.getText().length() > 40) {
                msg += "A publicadora deve conter entre 3 e 40 caracteres\n";
            }
        }
        if (jtPlataforma.getText().equals("")) {
            msg += "Informe a plataforma do jogo\n";
        } else {
            if (jtPlataforma.getText().length() < 3 || jtPlataforma.getText().length() > 40) {
                msg += "A plataforma deve conter entre 3 e 40 caracteres\n";
            }
        }
        if (jtGenero.getText().equals("")) {
            msg += "Informe o genêro do jogo\n";
        } else {
            if (jtGenero.getText().length() < 3 || jtGenero.getText().length() > 40) {
                msg += "O gênero deve conter entre 3 e 40 caracteres\n";
            }
        }
        if (jcbFaixaEtaria.getSelectedIndex() == 0) {
            msg += "Selecione uma faixa etária para o jogo\n";
        }
        if (log == 0) {
            if (jtDir.getText().equals("")) {
                msg += "Selecione uma imagem da capa do jogo\n";
            }
        }
        if (jftDataLancamento.getText().equals("  /  /    ")) {
            msg += "Informe uma data de lançamento\n";
        } else {
            if (!validaData(jftDataLancamento.getText())) {
                msg += "Data de lançamento Inválida\n";
            }
        }
        if (msg.length() == 0) {
            return true;
        } else {
            throw new Exception(msg);
        }
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
        if (ano > anoAtual) {
            return false;
        } else if (ano == anoAtual && mes > mesAtual) {
            return false;
        } else if (ano == anoAtual && mes == mesAtual && dia > diaAtual) {
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

    public boolean preencherObjeto() throws Exception {
        String valorVenda = new String(), valorAlugar = new String();
        valorVenda = jtPrecoVenda.getText().replace(",", ".");
        valorAlugar = jtPrecoLocacao.getText().replace(",", ".");
        valorVenda = valorVenda.trim();
        valorAlugar = valorAlugar.trim();
        jogo.setDataLancamento(calendario(jftDataLancamento.getText()));
        jogo.setGenero(jtGenero.getText());
        jogo.setPlataforma(jtPlataforma.getText());
        jogo.setPublisher(jtPublicadora.getText());
        jogo.setTitulo(jtTitulo.getText());
        jogo.setDescricao("");
        jogo.setEstado("Novo");
        jogo.setFaixaEtaria("" + jcbFaixaEtaria.getSelectedItem());
        jogo.setSituacao("Diponível");
        jogo.getQuantidadeDisponivel().setQuantidadeAlugar(Integer.parseInt(jtQuantLocacao.getText()));
        jogo.getQuantidadeDisponivel().setQuantidadeVender(Integer.parseInt(jtQuantVenda.getText()));
        jogo.getQuantidadeDisponivel().setValorVender(Float.parseFloat(valorVenda));
        jogo.getQuantidadeDisponivel().setValorAlugar(Float.parseFloat(valorAlugar));
        if (log == 0) {
            file = new File(jtDir.getText());
            fis = new FileInputStream(file);
        }
        //jogo.setImagem(imagem);
        return true;
    }

    public Calendar calendario(String data) {
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");// , Locale.ENGLISH
            cal.setTime(sdf.parse(data));// all done
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage(), "Data de Nascimento", JOptionPane.ERROR_MESSAGE);
        }
        return cal;
    }

    public void carregarCamposEdit() {
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        jtTitulo.setText(jogo.getTitulo());
        jtGenero.setText(jogo.getGenero());
        jtPlataforma.setText(jogo.getPlataforma());
        jtPrecoLocacao.setText("" + jogo.getQuantidadeDisponivel().getValorAlugar());
        jtPrecoVenda.setText("" + jogo.getQuantidadeDisponivel().getValorVender());
        jcbFaixaEtaria.setSelectedItem(jogo.getFaixaEtaria());
        jtPublicadora.setText(jogo.getPublisher());
        jftDataLancamento.setText(dateFormat.format(jogo.getDataLancamento().getTime()));
        jtQuantLocacao.setText("" + jogo.getQuantidadeDisponivel().getQuantidadeAlugar());
        jtQuantVenda.setText("" + jogo.getQuantidadeDisponivel().getQuantidadeVender());
    }
}
//lista.forEach((list) -> {
//    MODELO.addElement(list.getNome());
//});
