/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view.Operacao;

import br.com.ProjetoGames.data.CarrinhoData;
import br.com.ProjetoGames.model.JogosOperacaoModel;
import br.com.ProjetoGames.model.UsuarioModel;
import br.com.ProjetoGames.model.VendaModel;
import br.com.ProjetoGames.view.JFPrincipal;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Pedro
 */
public class JFCarrinhoVenda extends javax.swing.JFrame {

    int percent;
    UsuarioModel obj = new UsuarioModel();
    VendaModel venda = new VendaModel();
    ArrayList<JogosOperacaoModel> lista;
    ArrayList<JogosOperacaoModel> united = new ArrayList<>();
    int log;
    DefaultTableModel mp;
    float total;
    float subTotal;
    ArrayList<JogosOperacaoModel> car = new ArrayList<>();

    public JFCarrinhoVenda() {
        initComponents();
        lista = new ArrayList<>();
        log = 0;
        total = 0;
        subTotal = 0;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mp = (DefaultTableModel) jtbCarrinho.getModel();
    }

    public JFCarrinhoVenda(UsuarioModel obj, int log) {
        initComponents();
        lista = new ArrayList<>();
        this.log = log;
        this.obj = obj;
        total = 0;
        subTotal = 0;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mp = (DefaultTableModel) jtbCarrinho.getModel();
        try {
            mp.setNumRows(0);
            //getCarrinho();
            getCarrinhoUlt();
            if (!car.isEmpty()) {
                jbFinalizarCompra.setEnabled(true);
                jbRemover.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public JFCarrinhoVenda(UsuarioModel obj, int log, ArrayList<JogosOperacaoModel> lista) {
        initComponents();
        this.lista = lista;
        this.log = log;
        this.obj = obj;
        total = 0;
        subTotal = 0;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mp = (DefaultTableModel) jtbCarrinho.getModel();
        try {
            //carregarCarrinho();
            getCarrinhoUlt();
            jtSubTotal.setText("" + subTotal);
            total = subTotal;
            jtTotal.setText("" + total);
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao carregar o carrinho", JOptionPane.ERROR_MESSAGE);
        }
    }

    public JFCarrinhoVenda(UsuarioModel obj, int log, ArrayList<JogosOperacaoModel> car, int dif) {
        initComponents();
        this.car = car;
        this.log = log;
        this.obj = obj;
        lista = new ArrayList<>();
        total = 0;
        subTotal = 0;
        setIcon();
        windowsClosing();
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mp = (DefaultTableModel) jtbCarrinho.getModel();
        try {
            //getCarrinho();
            getCarrinhoUlt();
            jtSubTotal.setText("" + subTotal);
            total = subTotal;
            jtTotal.setText("" + total);
            if (!car.isEmpty()) {
                jbFinalizarCompra.setEnabled(true);
                jbRemover.setEnabled(true);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Erro ao carregar o carrinho", JOptionPane.ERROR_MESSAGE);
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

        jspCarrinho = new javax.swing.JScrollPane();
        jtbCarrinho = new javax.swing.JTable();
        jlSubTotal = new javax.swing.JLabel();
        jlSifraSubTotal = new javax.swing.JLabel();
        jtSubTotal = new javax.swing.JTextField();
        jlTotal = new javax.swing.JLabel();
        jlSifraTotal = new javax.swing.JLabel();
        jtTotal = new javax.swing.JTextField();
        jlCupom = new javax.swing.JLabel();
        jtCupom = new javax.swing.JTextField();
        jlDesconto = new javax.swing.JLabel();
        jtDesconto = new javax.swing.JTextField();
        jlPorcentagem = new javax.swing.JLabel();
        jlMenos = new javax.swing.JLabel();
        jbFinalizarCompra = new javax.swing.JButton();
        jbRemover = new javax.swing.JButton();
        jlAplicar = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jtbCarrinho.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtbCarrinho.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Título", "Plataforma", "Unidade", "Quantidade", "Total"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jspCarrinho.setViewportView(jtbCarrinho);

        jlSubTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSubTotal.setText("SubTotal:");

        jlSifraSubTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSifraSubTotal.setText("R$");

        jtSubTotal.setEditable(false);
        jtSubTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtSubTotal.setEnabled(false);

        jlTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTotal.setText("Total:");

        jlSifraTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSifraTotal.setText("R$");

        jtTotal.setEditable(false);
        jtTotal.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtTotal.setEnabled(false);

        jlCupom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCupom.setText("Cupom:");

        jtCupom.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N

        jlDesconto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDesconto.setText("Desconto:");

        jtDesconto.setEditable(false);
        jtDesconto.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jtDesconto.setEnabled(false);

        jlPorcentagem.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlPorcentagem.setText("%");
        jlPorcentagem.setToolTipText("");

        jlMenos.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlMenos.setText("-");

        jbFinalizarCompra.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbFinalizarCompra.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Checkout_48px.png"))); // NOI18N
        jbFinalizarCompra.setText("Finalizar Compra");
        jbFinalizarCompra.setEnabled(false);
        jbFinalizarCompra.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbFinalizarCompraActionPerformed(evt);
            }
        });

        jbRemover.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbRemover.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Trash_Can_48px.png"))); // NOI18N
        jbRemover.setText("Remover");
        jbRemover.setEnabled(false);
        jbRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbRemoverActionPerformed(evt);
            }
        });

        jlAplicar.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlAplicar.setText("Aplicar");
        jlAplicar.setToolTipText("");
        jlAplicar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlAplicarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlAplicarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlAplicarMouseExited(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jspCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, 601, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jbFinalizarCompra, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(40, 40, 40)))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlSifraTotal)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jlTotal)
                            .addComponent(jlDesconto)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlMenos)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jlPorcentagem))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jtCupom, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlCupom, javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(jlSifraSubTotal)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jlSubTotal, javax.swing.GroupLayout.Alignment.LEADING)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlAplicar, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jbRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(jlSubTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSifraSubTotal)
                            .addComponent(jtSubTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addComponent(jlCupom)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtCupom, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlAplicar))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jlDesconto)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jtDesconto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jlPorcentagem)
                            .addComponent(jlMenos))
                        .addGap(36, 36, 36)
                        .addComponent(jlTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jlSifraTotal)
                            .addComponent(jtTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(jbFinalizarCompra, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jspCarrinho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jbRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbRemoverActionPerformed
        try {
//            if (united.isEmpty()) {
//                if (!lista.isEmpty()) {
//                    subTotal -= lista.get(jtbCarrinho.getSelectedRow()).getJogosModel().getQuantidadeDisponivel().getValorVender() * lista.get(jtbCarrinho.getSelectedRow()).getQuantidade();
//                    total -= lista.get(jtbCarrinho.getSelectedRow()).getJogosModel().getQuantidadeDisponivel().getValorVender() * lista.get(jtbCarrinho.getSelectedRow()).getQuantidade();
//                    lista.remove(jtbCarrinho.getSelectedRow());
//                    mp.removeRow(jtbCarrinho.getSelectedRow());
//                    attDesconto();
//                    jtSubTotal.setText("" + subTotal);
//                    jtTotal.setText("" + total);
//                } else {
//                    if (!car.isEmpty()) {
//                        CarrinhoData DAO = new CarrinhoData();
//                        if (DAO.removeItem(obj, car.get(jtbCarrinho.getSelectedRow()))) {
//                            subTotal -= car.get(jtbCarrinho.getSelectedRow()).getJogosModel().getQuantidadeDisponivel().getValorVender() * car.get(jtbCarrinho.getSelectedRow()).getQuantidade();
//                            total -= car.get(jtbCarrinho.getSelectedRow()).getJogosModel().getQuantidadeDisponivel().getValorVender() * car.get(jtbCarrinho.getSelectedRow()).getQuantidade();
//                            car.remove(jtbCarrinho.getSelectedRow());
//                            mp.removeRow(jtbCarrinho.getSelectedRow());
//                            attDesconto();
//                            jtSubTotal.setText("" + subTotal);
//                            jtTotal.setText("" + total);
//                        }
//                    } else {
//                        JOptionPane.showMessageDialog(this, "Carrinho Vazio!");
//                    }
//                }
//            } else {
//                CarrinhoData DAO = new CarrinhoData();
//                JogosOperacaoModel selecionado = united.get(jtbCarrinho.getSelectedRow() - (lista.size() - 1));
//                if (DAO.removeItem(obj, selecionado)) {
//                    subTotal -= selecionado.getJogosModel().getQuantidadeDisponivel().getValorVender() * selecionado.getQuantidade();
//                    total -= selecionado.getJogosModel().getQuantidadeDisponivel().getValorVender() * selecionado.getQuantidade();
//                    united.remove(jtbCarrinho.getSelectedRow());
//                    mp.removeRow(jtbCarrinho.getSelectedRow());
//                    attDesconto();
//                    jtSubTotal.setText("" + subTotal);
//                    jtTotal.setText("" + total);
//                }
//            }
            if (!united.isEmpty()) {
                subTotal -= united.get(jtbCarrinho.getSelectedRow()).getJogosModel().getQuantidadeDisponivel().getValorVender() * united.get(jtbCarrinho.getSelectedRow()).getQuantidade();
                total -= united.get(jtbCarrinho.getSelectedRow()).getJogosModel().getQuantidadeDisponivel().getValorVender() * united.get(jtbCarrinho.getSelectedRow()).getQuantidade();
                united.remove(jtbCarrinho.getSelectedRow());
                mp.removeRow(jtbCarrinho.getSelectedRow());
                attDesconto();
                jtSubTotal.setText("" + subTotal);
                jtTotal.setText("" + total);
            } else {
                JOptionPane.showMessageDialog(this, "Carrinho Vazio!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
        if (car.isEmpty() && lista.isEmpty()) {
            jbFinalizarCompra.setEnabled(false);
            jbRemover.setEnabled(false);
        }
    }//GEN-LAST:event_jbRemoverActionPerformed

    private void jbFinalizarCompraActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbFinalizarCompraActionPerformed
        try {
            if (!lista.isEmpty() || !car.isEmpty()) {
                //CarrinhoData DAO = new CarrinhoData();
                //carrinhoBanco();
                inserirCarBanco();
                venda.setClienteModel(obj);
                venda.setDesconto(percent);
                venda.setValor(total);
                venda.setTipo("Entrega");
                new JFPagamento(obj, venda, 1).setVisible(true);
                dispose();
            } else {
                JOptionPane.showMessageDialog(this, "Carrinho Vazio!");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage(), "Finalizar Compra", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_jbFinalizarCompraActionPerformed

    private void jlAplicarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAplicarMouseEntered
        jlAplicar.setForeground(Color.RED);
    }//GEN-LAST:event_jlAplicarMouseEntered

    private void jlAplicarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAplicarMouseExited
        jlAplicar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jlAplicarMouseExited

    private void jlAplicarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlAplicarMouseClicked
        if (validarCupom()) {
            if (percent > 0) {
                jtDesconto.setText("" + percent);
                attDesconto();
                jtDesconto.setEnabled(false);
                jlAplicar.setEnabled(false);
            } else {
                jtCupom.setText("");
            }
        }
    }//GEN-LAST:event_jlAplicarMouseClicked

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
            java.util.logging.Logger.getLogger(JFCarrinhoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFCarrinhoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFCarrinhoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFCarrinhoVenda.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFCarrinhoVenda().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbFinalizarCompra;
    private javax.swing.JButton jbRemover;
    private javax.swing.JLabel jlAplicar;
    private javax.swing.JLabel jlCupom;
    private javax.swing.JLabel jlDesconto;
    private javax.swing.JLabel jlMenos;
    private javax.swing.JLabel jlPorcentagem;
    private javax.swing.JLabel jlSifraSubTotal;
    private javax.swing.JLabel jlSifraTotal;
    private javax.swing.JLabel jlSubTotal;
    private javax.swing.JLabel jlTotal;
    private javax.swing.JScrollPane jspCarrinho;
    private javax.swing.JTextField jtCupom;
    private javax.swing.JTextField jtDesconto;
    private javax.swing.JTextField jtSubTotal;
    private javax.swing.JTextField jtTotal;
    private javax.swing.JTable jtbCarrinho;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\_Projetos\\ProjetoGames\\ProjetoGames2\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Shopping_Cart_528px_1.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    public void windowsClosing() {
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                sair();
            }
        });
    }

    public void sair() {
        try {
            ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
            if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nVoltar?", "Botão Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
                dispose();
                if (log == 0) {
                    new JFPrincipal(obj).setVisible(true);
                } else {
                    if (log == 1) {
                        new JFVenda(obj).setVisible(true);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public boolean validarCupom() {
        try {
            if (!jtCupom.getText().equals("")) {
                CarrinhoData CDAO = new CarrinhoData();
                percent = CDAO.validarCupom(jtCupom.getText(), obj);
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Erro: " + e.getMessage());
        }
        return true;
    }

    public void getCarrinhoUlt() throws Exception {
        mp.setNumRows(0);
        CarrinhoData DAO = new CarrinhoData();
        car = DAO.getCarrinho(obj);
        for (JogosOperacaoModel list : car) {
            united.add(list);
        }
        for (JogosOperacaoModel list : lista) {
            united.add(list);
        }
        for (int i = 0; i < united.size() - 1; i++) {
            for (int n = i + 1; n < united.size(); n++) {
                if (n != i && united.get(i).getJogosModel().getIdJogos() == united.get(n).getJogosModel().getIdJogos()) {
                    united.get(i).setQuantidade(united.get(i).getQuantidade() + united.get(n).getQuantidade());
                    united.remove(n);
                }
            }
        }
        jbFinalizarCompra.setEnabled(true);
        jbRemover.setEnabled(true);
        for (JogosOperacaoModel list : united) {
            subTotal += list.getJogosModel().getQuantidadeDisponivel().getValorVender() * list.getQuantidade();
            mp.addRow(new String[]{list.getJogosModel().getTitulo(), list.getJogosModel().getPlataforma(), "R$" + list.getJogosModel().getQuantidadeDisponivel().getValorVender(), "" + list.getQuantidade(), "R$" + list.getJogosModel().getQuantidadeDisponivel().getValorVender() * list.getQuantidade()});
        }
    }

    public void carregarCarrinho() throws Exception {
        mp.setNumRows(0);
        jbFinalizarCompra.setEnabled(true);
        jbRemover.setEnabled(true);
        for (JogosOperacaoModel list : lista) {
            boolean ver = true;
            subTotal += list.getJogosModel().getQuantidadeDisponivel().getValorVender() * list.getQuantidade();
            for (int i = 0; i < mp.getRowCount(); i++) {
                if (list.getJogosModel().getTitulo().equals(mp.getValueAt(i, 0))) {
                    mp.setValueAt(list.getQuantidade(), i, 2);
                    ver = false;
                }
            }
            if (ver) {
                mp.addRow(new String[]{list.getJogosModel().getTitulo(), list.getJogosModel().getPlataforma(), "" + list.getJogosModel().getQuantidadeDisponivel().getValorVender(), "" + list.getQuantidade(), "" + list.getJogosModel().getQuantidadeDisponivel().getValorVender() * list.getQuantidade()});
            }
        }
        getCarrinho();
    }

    public void getCarrinho() throws Exception {
        CarrinhoData DAO = new CarrinhoData();
        car = DAO.getCarrinho(obj);
        for (JogosOperacaoModel list : car) {
            boolean ver = true;
            subTotal += list.getJogosModel().getQuantidadeDisponivel().getValorVender() * list.getQuantidade();
            for (int i = 0; i < mp.getRowCount(); i++) {
                if (list.getJogosModel().getTitulo().equals(mp.getValueAt(i, 0))) {
                    mp.setValueAt(list.getQuantidade(), i, 2);
                    ver = false;
                }
            }
            if (ver) {
                mp.addRow(new String[]{list.getJogosModel().getTitulo(), list.getJogosModel().getPlataforma(), "" + list.getJogosModel().getQuantidadeDisponivel().getValorVender(), "" + list.getQuantidade(), "" + list.getJogosModel().getQuantidadeDisponivel().getValorVender() * list.getQuantidade()});
            }
        }
        if (!lista.isEmpty()) {
            for (JogosOperacaoModel list : lista) {
                united.add(list);
            }
            for (JogosOperacaoModel list : car) {
                united.add(list);
            }
        }
    }

    public void carrinhoBanco() throws Exception {
        CarrinhoData DAO = new CarrinhoData();
        DAO.inserirCarrinhoCompleto(lista, obj);
//        for (JogosOperacaoModel list : lista) {
//            if (!DAO.inserirCarrinho(list, obj)) {
//                throw new Exception("Não foi possível inserir no carrinho de sua conta!");
//            }
//        }
    }

    public void inserirCarBanco() throws Exception {
        if (united.isEmpty()) {
            for (JogosOperacaoModel list : car) {
                united.add(list);
            }
            for (JogosOperacaoModel list : lista) {
                united.add(list);
            }
        }
        for (int i = 0; i < united.size() - 1; i++) {
            for (int n = i + 1; n < united.size(); n++) {
                if (n != i && united.get(i).getJogosModel().getIdJogos() == united.get(n).getJogosModel().getIdJogos()) {
                    united.get(i).setQuantidade(united.get(i).getQuantidade() + united.get(n).getQuantidade());
                    united.remove(n);
                }
            }
        }
        CarrinhoData DAO = new CarrinhoData();
        DAO.inserirCar(united, obj);
    }

    public void attDesconto() {
        total = subTotal - ((subTotal * percent) / 100);
        jtTotal.setText("" + total);
    }
}
