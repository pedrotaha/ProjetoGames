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
import java.util.ArrayList;
import javax.imageio.ImageIO;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileNameExtensionFilter;

public class JFCadJogo extends javax.swing.JFrame {

    JogosModel jogo = new JogosModel();
    JogosData DAO = new JogosData();
    UsuarioModel obj = new UsuarioModel();
    JIFBuscarImagem janela = new JIFBuscarImagem();

    DefaultListModel MODELO;
    int Enter = 0;
    ArrayList<PlataformaModel> lista = new ArrayList<>();
    PlataformaModel selecionado = new PlataformaModel();
    PlataformaData DAOP = new PlataformaData();

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
        jlTitulo = new javax.swing.JLabel();
        jlGenero = new javax.swing.JLabel();
        jlPlataforma = new javax.swing.JLabel();
        jlDataLancamento = new javax.swing.JLabel();
        jlPublicadora = new javax.swing.JLabel();
        jlFaixaEtaria = new javax.swing.JLabel();
        jlQuantVenda = new javax.swing.JLabel();
        jlQuantLocacao = new javax.swing.JLabel();
        jlImagem = new javax.swing.JLabel();
        jcbFaixaEtaria = new javax.swing.JComboBox<>();
        jFormattedTextField1 = new javax.swing.JFormattedTextField();
        jtTitulo = new javax.swing.JTextField();
        jtGenero = new javax.swing.JTextField();
        jtPlataforma = new javax.swing.JTextField();
        jtPublicadora = new javax.swing.JTextField();
        jtQuantVenda = new javax.swing.JTextField();
        jtQuantLocacao = new javax.swing.JTextField();
        jbBuscar = new javax.swing.JButton();
        jtDir = new javax.swing.JTextField();
        jfcBuscar = new javax.swing.JFileChooser();

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
        jscrollpPlataforma.setBounds(240, 100, 370, 130);

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

        jlQuantVenda.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlQuantVenda.setText("<html>Quantidade para<br \\> Venda:</html>");
        jDesktopPane1.add(jlQuantVenda);
        jlQuantVenda.setBounds(12, 243, 143, 40);

        jlQuantLocacao.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlQuantLocacao.setText("<html>Quantidade para<br \\> Locação:</html>");
        jlQuantLocacao.setToolTipText("");
        jDesktopPane1.add(jlQuantLocacao);
        jlQuantLocacao.setBounds(250, 240, 143, 40);

        jlImagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlImagem.setText("Imagem:");
        jDesktopPane1.add(jlImagem);
        jlImagem.setBounds(12, 347, 78, 22);

        jcbFaixaEtaria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jcbFaixaEtaria.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "<Selecione>", "Livre", "+10", "+12", "+14", "+16", "+18" }));
        jDesktopPane1.add(jcbFaixaEtaria);
        jcbFaixaEtaria.setBounds(471, 171, 142, 28);

        try {
            jFormattedTextField1.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("##/##/####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        jFormattedTextField1.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jFormattedTextField1);
        jFormattedTextField1.setBounds(510, 290, 90, 30);

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
        jtPlataforma.setBounds(240, 72, 370, 28);

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
        jtQuantLocacao.setBounds(250, 290, 76, 28);

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
        jtDir.setBounds(120, 340, 310, 28);

        jfcBuscar.setCurrentDirectory(new java.io.File("C:\\Users\\Pedro\\Pictures"));
        jfcBuscar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jDesktopPane1.add(jfcBuscar);
        jfcBuscar.setBounds(0, 30, 650, 397);

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
        if(evt.getKeyCode() == KeyEvent.VK_UP && jlistPlataforma.getSelectedIndex() == 0){
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
    private javax.swing.JFormattedTextField jFormattedTextField1;
    private javax.swing.JButton jbBuscar;
    private javax.swing.JComboBox<String> jcbFaixaEtaria;
    private javax.swing.JFileChooser jfcBuscar;
    private javax.swing.JLabel jlDataLancamento;
    private javax.swing.JLabel jlFaixaEtaria;
    private javax.swing.JLabel jlGenero;
    private javax.swing.JLabel jlImagem;
    private javax.swing.JLabel jlPlataforma;
    private javax.swing.JLabel jlPublicadora;
    private javax.swing.JLabel jlQuantLocacao;
    private javax.swing.JLabel jlQuantVenda;
    private javax.swing.JLabel jlTitulo;
    private javax.swing.JList<String> jlistPlataforma;
    private javax.swing.JScrollPane jscrollpPlataforma;
    private javax.swing.JTextField jtDir;
    private javax.swing.JTextField jtGenero;
    private javax.swing.JTextField jtPlataforma;
    private javax.swing.JTextField jtPublicadora;
    private javax.swing.JTextField jtQuantLocacao;
    private javax.swing.JTextField jtQuantVenda;
    private javax.swing.JTextField jtTitulo;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\_Projetos\\ProjetoGames\\ProjetoGames2\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Overwatch_528px_1.png");
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
        FileFilter imageFilter = new FileNameExtensionFilter(
                "Image files", ImageIO.getReaderFileSuffixes());
        jfcBuscar.setFileFilter(imageFilter);
        int i = jfcBuscar.showSaveDialog(null);
        if (i == 1) {
            jtDir.setText("");
        } else {
            File arquivo = jfcBuscar.getSelectedFile();
            jtDir.setText(arquivo.getPath());
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

}
//lista.forEach((list) -> {
//    MODELO.addElement(list.getNome());
//});
