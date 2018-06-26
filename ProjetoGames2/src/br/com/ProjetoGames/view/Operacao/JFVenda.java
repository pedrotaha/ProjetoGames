/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view.Operacao;

import br.com.ProjetoGames.data.CarrinhoData;
import br.com.ProjetoGames.data.JogosData;
import br.com.ProjetoGames.model.JogosModel;
import br.com.ProjetoGames.model.JogosOperacaoModel;
import br.com.ProjetoGames.model.UsuarioModel;
import br.com.ProjetoGames.view.JFPrincipal;
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

public class JFVenda extends javax.swing.JFrame {

    UsuarioModel obj = new UsuarioModel();
    int frameCount;
    JIFDetalhesJogos janela = new JIFDetalhesJogos();
    JIFCarrinhoVenda janelaC = new JIFCarrinhoVenda();
    ArrayList<JogosModel> dados;
    ArrayList<JogosOperacaoModel> lista;
    JogosModel selecionado;

    public JFVenda() {
        initComponents();
        frameCount = 0;
        dados = new ArrayList<>();
        this.obj = new UsuarioModel();
        selecionado = new JogosModel();
        lista = new ArrayList<>();
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
    }

    public JFVenda(UsuarioModel obj) {
        initComponents();
        frameCount = 0;
        dados = new ArrayList<>();
        lista = new ArrayList<>();
        this.obj = obj;
        selecionado = new JogosModel();
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

        jdpVenda = new javax.swing.JDesktopPane();
        jlPesquisar = new javax.swing.JLabel();
        jtPesquisar = new javax.swing.JTextField();
        jlReaper = new javax.swing.JLabel();
        jspPesquisar = new javax.swing.JScrollPane();
        jtbPesquisar = new javax.swing.JTable();
        jbAdicionar = new javax.swing.JButton();
        jbDetalhes = new javax.swing.JButton();
        jlQuantidade = new javax.swing.JLabel();
        jtQuantidade = new javax.swing.JTextField();
        jbCarrinho = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setTitle("Realizar Venda");

        jdpVenda.setBackground(new java.awt.Color(255, 255, 255));

        jlPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPesquisar.setText("Pesquisar:");

        jtPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtPesquisar.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtPesquisarKeyReleased(evt);
            }
        });

        jlReaper.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/chibi_reaper_by_celestialrayna-db9xyc9 (2).png"))); // NOI18N

        jtbPesquisar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtbPesquisar.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Gênero", "Plataforma", "Preço"
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
        jtbPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtbPesquisarMouseClicked(evt);
            }
        });
        jspPesquisar.setViewportView(jtbPesquisar);

        jbAdicionar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbAdicionar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Buy_48px.png"))); // NOI18N
        jbAdicionar.setText("Adicionar");
        jbAdicionar.setEnabled(false);
        jbAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbAdicionarActionPerformed(evt);
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

        jlQuantidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlQuantidade.setText("Quantidade:");

        jtQuantidade.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtQuantidade.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                jtQuantidadeKeyTyped(evt);
            }
        });

        jbCarrinho.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbCarrinho.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Shopping_Cart_48px.png"))); // NOI18N
        jbCarrinho.setText("Carrinho");
        jbCarrinho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbCarrinhoActionPerformed(evt);
            }
        });

        jdpVenda.setLayer(jlPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jtPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jlReaper, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jspPesquisar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jbAdicionar, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jbDetalhes, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jlQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jtQuantidade, javax.swing.JLayeredPane.DEFAULT_LAYER);
        jdpVenda.setLayer(jbCarrinho, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout jdpVendaLayout = new javax.swing.GroupLayout(jdpVenda);
        jdpVenda.setLayout(jdpVendaLayout);
        jdpVendaLayout.setHorizontalGroup(
            jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpVendaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpVendaLayout.createSequentialGroup()
                        .addGroup(jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jspPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbCarrinho))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addGroup(jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlReaper, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jdpVendaLayout.createSequentialGroup()
                                .addGroup(jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(jbDetalhes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jbAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(40, 40, 40))))
                    .addGroup(jdpVendaLayout.createSequentialGroup()
                        .addComponent(jlPesquisar)
                        .addGap(18, 18, 18)
                        .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 420, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(96, 96, 96)
                        .addComponent(jlQuantidade)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jdpVendaLayout.setVerticalGroup(
            jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jdpVendaLayout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPesquisar)
                    .addComponent(jtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlQuantidade)
                    .addComponent(jtQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jdpVendaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jdpVendaLayout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jbDetalhes)
                        .addGap(44, 44, 44)
                        .addComponent(jbAdicionar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jlReaper, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(jdpVendaLayout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jspPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(35, 35, 35)
                        .addComponent(jbCarrinho)
                        .addContainerGap(187, Short.MAX_VALUE))))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdpVenda)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtQuantidadeKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtQuantidadeKeyTyped
        campoComNumero(evt);
    }//GEN-LAST:event_jtQuantidadeKeyTyped

    private void jtPesquisarKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtPesquisarKeyReleased
        try {
            atualizarT();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jtPesquisarKeyReleased

    private void jbDetalhesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbDetalhesActionPerformed
        try {
            if (frameCount == 0) {
                if (selecionado.getIdJogos() > 0) {
                    jdpVenda.add(janela);
                    janela.setVisible(true);
                    frameCount++;
                    tratarCampos(false);
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }//GEN-LAST:event_jbDetalhesActionPerformed

    private void jtbPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtbPesquisarMouseClicked
        try {
            selecionado = dados.get(jtbPesquisar.getSelectedRow());
            janela = new JIFDetalhesJogos(selecionado);
            internoClosed();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro ao pesquisar: " + e.getMessage());
        }
    }//GEN-LAST:event_jtbPesquisarMouseClicked

    private void jbCarrinhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbCarrinhoActionPerformed
        if (!lista.isEmpty()) {
            new JFCarrinhoVenda(obj, 1, lista).setVisible(true);
            dispose();
        } else {
            try {
                CarrinhoData DAO = new CarrinhoData();
                ArrayList<JogosOperacaoModel> car = DAO.getCarrinho(obj);
                if (!car.isEmpty()) {
                    new JFCarrinhoVenda(obj, 1, car, 1).setVisible(true);
                    dispose();
                } else {
                    JOptionPane.showMessageDialog(this, "Carrinho Vazio!");
                }
            } catch (Exception e) {
                JOptionPane.showMessageDialog(this, e.getMessage());
            }
        }
    }//GEN-LAST:event_jbCarrinhoActionPerformed

    private void jbAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbAdicionarActionPerformed
        if (!jtQuantidade.getText().equals("")) {
            if ((selecionado.getQuantidadeDisponivel().getQuantidadeVender() - Integer.parseInt(jtQuantidade.getText()) >= 0)) {
                JogosOperacaoModel jogoOp = new JogosOperacaoModel();
                jogoOp.setJogosModel(selecionado);
                jogoOp.setQuantidade(Integer.parseInt(jtQuantidade.getText()));
                lista.add(jogoOp);
                if (verEstoque()) {
                    JOptionPane.showMessageDialog(this, "Jogo " + selecionado.getTitulo() + "\nAdicionado com Sucesso!");
                }else{
                    lista.remove(lista.size() - 1);
                }
            } else {
                JOptionPane.showMessageDialog(this, "Quantidade maior que estoque disponível.");
            }
        } else {
            JOptionPane.showMessageDialog(this, "Informe uma quantidade.");
        }
    }//GEN-LAST:event_jbAdicionarActionPerformed

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
            java.util.logging.Logger.getLogger(JFVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbAdicionar;
    private javax.swing.JButton jbCarrinho;
    private javax.swing.JButton jbDetalhes;
    private javax.swing.JDesktopPane jdpVenda;
    private javax.swing.JLabel jlPesquisar;
    private javax.swing.JLabel jlQuantidade;
    private javax.swing.JLabel jlReaper;
    private javax.swing.JScrollPane jspPesquisar;
    private javax.swing.JTextField jtPesquisar;
    private javax.swing.JTextField jtQuantidade;
    private javax.swing.JTable jtbPesquisar;
    // End of variables declaration//GEN-END:variables
    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\_Projetos\\ProjetoGames\\ProjetoGames2\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Buy_528px.png");
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

    public void internoClosed() {
        janela.addInternalFrameListener(new InternalFrameAdapter() {
            public void internalFrameClosed(InternalFrameEvent e) {
                tratarCampos(true);
                frameCount--;
                jdpVenda.remove(janela);
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

    public void tratarCampos(boolean n) {
        jdpVenda.setEnabled(n);
        jtPesquisar.setEnabled(n);
        jtQuantidade.setEnabled(n);
        jtbPesquisar.setEnabled(n);
        jspPesquisar.setEnabled(n);
        jbAdicionar.setEnabled(n);
        jbCarrinho.setEnabled(n);
        jbDetalhes.setEnabled(n);
    }

    public void atualizarT() throws Exception {
        JogosData DAO = new JogosData();
        dados = DAO.pesquisar(jtPesquisar.getText());
        DefaultTableModel mp = (DefaultTableModel) jtbPesquisar.getModel();
        mp.setNumRows(0);
        if (jtPesquisar.getText().length() > 1) {
            jbAdicionar.setEnabled(true);
            jbDetalhes.setEnabled(true);
            for (JogosModel lista : dados) {
                mp.addRow(new String[]{lista.getTitulo(), lista.getGenero(), lista.getPlataforma(), "R$ " + lista.getQuantidadeDisponivel().getValorVender()});
            }
        }
        if (jtPesquisar.getText().length() == 0) {
            jbAdicionar.setEnabled(false);
            jbDetalhes.setEnabled(false);
            selecionado = new JogosModel();
        }
    }

    public boolean verEstoque() {
        try {
            CarrinhoData DAO = new CarrinhoData();
            if (DAO.verEstoque(lista.get(lista.size() - 1), obj)) {
                return true;
            } else {
                JOptionPane.showMessageDialog(this, "Quantidade indisponível em estoque!", "Estoque", JOptionPane.INFORMATION_MESSAGE);
                return false;
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        return false;
    }

}
