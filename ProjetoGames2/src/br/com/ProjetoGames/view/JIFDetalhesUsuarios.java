/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.ProjetoGames.view;

import br.com.ProjetoGames.model.FuncionarioModel;
import br.com.ProjetoGames.model.UsuarioModel;
import java.awt.Font;
import java.awt.image.BufferedImage;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Random;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author Pedro
 */
public class JIFDetalhesUsuarios extends javax.swing.JInternalFrame {

    UsuarioModel obj = new UsuarioModel();
    FuncionarioModel objFunc = new FuncionarioModel();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public JIFDetalhesUsuarios() {
        initComponents();
        obj = new UsuarioModel();
        randomImages();
        this.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mudarIcon();
    }

    public JIFDetalhesUsuarios(UsuarioModel obj) {
        initComponents();
        this.obj = obj;
        randomImages();
        tratarCampos(false);
        preencherCampos();
        this.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mudarIcon();
    }

    public JIFDetalhesUsuarios(FuncionarioModel obj) {
        initComponents();
        this.objFunc = obj;
        randomImages();
        this.obj = new UsuarioModel(objFunc);
        tratarCampos(true);
        preencherCampos();
        this.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mudarIcon();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jlCpf = new javax.swing.JLabel();
        jlId = new javax.swing.JLabel();
        jlTelefone = new javax.swing.JLabel();
        jlNome = new javax.swing.JLabel();
        jlSexo = new javax.swing.JLabel();
        jlDataCadastro = new javax.swing.JLabel();
        jlDataNasc = new javax.swing.JLabel();
        jlTipo = new javax.swing.JLabel();
        jlCargo = new javax.swing.JLabel();
        jlCargaHoraria = new javax.swing.JLabel();
        jlSalario = new javax.swing.JLabel();
        jlEstadoCivil = new javax.swing.JLabel();
        jtId = new javax.swing.JTextField();
        jtNome = new javax.swing.JTextField();
        jtCpf = new javax.swing.JTextField();
        jtTelefone = new javax.swing.JTextField();
        jtSexo = new javax.swing.JTextField();
        jtDataNasc = new javax.swing.JTextField();
        jtDataCadastro = new javax.swing.JTextField();
        jtTipo = new javax.swing.JTextField();
        jtCargo = new javax.swing.JTextField();
        jtCargaHoraria = new javax.swing.JTextField();
        jtEstadoCivil = new javax.swing.JTextField();
        jtSalario = new javax.swing.JTextField();
        jbVoltar = new javax.swing.JButton();
        jlEndereco = new javax.swing.JLabel();
        jtEndereco = new javax.swing.JTextField();
        jlPokemon = new javax.swing.JLabel();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setMinimumSize(new java.awt.Dimension(731, 547));
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

        jlCpf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCpf.setText("CPF:");

        jlId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlId.setText("ID:");

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTelefone.setText("Telefone:");

        jlNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNome.setText("Nome:");

        jlSexo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSexo.setText("Sexo:");

        jlDataCadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDataCadastro.setText("<html>Data de<br />Cadastro:</html>");

        jlDataNasc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDataNasc.setText("<html>Data de<br />Nascimento:</html>");

        jlTipo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTipo.setText("Tipo:");

        jlCargo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCargo.setText("Cargo:");

        jlCargaHoraria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCargaHoraria.setText("Carga Horária:");

        jlSalario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSalario.setText("Salário:");

        jlEstadoCivil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlEstadoCivil.setText("Estado Civil:");

        jtId.setEditable(false);
        jtId.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtId.setToolTipText("");
        jtId.setEnabled(false);

        jtNome.setEditable(false);
        jtNome.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtNome.setToolTipText("");
        jtNome.setEnabled(false);

        jtCpf.setEditable(false);
        jtCpf.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtCpf.setToolTipText("");
        jtCpf.setEnabled(false);

        jtTelefone.setEditable(false);
        jtTelefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtTelefone.setToolTipText("");
        jtTelefone.setEnabled(false);

        jtSexo.setEditable(false);
        jtSexo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtSexo.setToolTipText("");
        jtSexo.setEnabled(false);

        jtDataNasc.setEditable(false);
        jtDataNasc.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtDataNasc.setToolTipText("");
        jtDataNasc.setEnabled(false);

        jtDataCadastro.setEditable(false);
        jtDataCadastro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtDataCadastro.setToolTipText("");
        jtDataCadastro.setEnabled(false);

        jtTipo.setEditable(false);
        jtTipo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtTipo.setToolTipText("");
        jtTipo.setEnabled(false);

        jtCargo.setEditable(false);
        jtCargo.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtCargo.setToolTipText("");
        jtCargo.setEnabled(false);

        jtCargaHoraria.setEditable(false);
        jtCargaHoraria.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtCargaHoraria.setToolTipText("");
        jtCargaHoraria.setEnabled(false);

        jtEstadoCivil.setEditable(false);
        jtEstadoCivil.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtEstadoCivil.setToolTipText("");
        jtEstadoCivil.setEnabled(false);

        jtSalario.setEditable(false);
        jtSalario.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtSalario.setToolTipText("");
        jtSalario.setEnabled(false);

        jbVoltar.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jbVoltar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Icones/icons8_Undo_48px.png"))); // NOI18N
        jbVoltar.setText("Voltar");
        jbVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbVoltarActionPerformed(evt);
            }
        });

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlEndereco.setText("Endereço:");

        jtEndereco.setEditable(false);
        jtEndereco.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jtEndereco.setToolTipText("");
        jtEndereco.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(123, 123, 123)
                        .addComponent(jlTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jlDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jlEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(73, 73, 73)
                        .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53)
                        .addComponent(jtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(78, 78, 78)
                        .addComponent(jtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, 126, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jlEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 94, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 491, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(44, 44, 44)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(56, 56, 56)
                        .addComponent(jbVoltar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jlSalario))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52)
                        .addComponent(jtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlId)
                                .addGap(45, 45, 45)
                                .addComponent(jlNome, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(103, 103, 103)
                                .addComponent(jlTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(133, 133, 133)
                                .addComponent(jlSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(45, 45, 45)
                                .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(38, 38, 38)
                                .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(37, 37, 37)
                                .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, 113, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addGap(51, 51, 51))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jlId)
                            .addComponent(jlNome)
                            .addComponent(jlTipo)
                            .addComponent(jlSexo))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtSexo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(27, 27, 27)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addComponent(jlTelefone))
                            .addComponent(jlDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jlEstadoCivil))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlPokemon, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jlCpf)))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCpf, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtDataNasc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtEstadoCivil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(17, 17, 17)
                .addComponent(jlEndereco)
                .addGap(18, 18, 18)
                .addComponent(jtEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jlDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(6, 6, 6)
                        .addComponent(jtDataCadastro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jlCargo)
                                .addGap(8, 8, 8)
                                .addComponent(jtCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jbVoltar))))
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jlCargaHoraria)
                    .addComponent(jlSalario))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtCargaHoraria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtSalario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        sair();
    }//GEN-LAST:event_formInternalFrameClosing

    private void jbVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbVoltarActionPerformed
        sair();
    }//GEN-LAST:event_jbVoltarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jbVoltar;
    private javax.swing.JLabel jlCargaHoraria;
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataCadastro;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEstadoCivil;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPokemon;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JTextField jtCargaHoraria;
    private javax.swing.JTextField jtCargo;
    private javax.swing.JTextField jtCpf;
    private javax.swing.JTextField jtDataCadastro;
    private javax.swing.JTextField jtDataNasc;
    private javax.swing.JTextField jtEndereco;
    private javax.swing.JTextField jtEstadoCivil;
    private javax.swing.JTextField jtId;
    private javax.swing.JTextField jtNome;
    private javax.swing.JTextField jtSalario;
    private javax.swing.JTextField jtSexo;
    private javax.swing.JTextField jtTelefone;
    private javax.swing.JTextField jtTipo;
    // End of variables declaration//GEN-END:variables

    public void mudarIcon() {
        ImageIcon icon = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Pokedex_528px.png");
        this.setFrameIcon(icon);
    }

    public void sair() {
        try {
            ImageIcon imagemTituloJanela = new ImageIcon("src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
            if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nVoltar?", "Botão Voltar", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
                obj = new UsuarioModel();
                objFunc = new FuncionarioModel();
                dispose();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }
    }

    public void tratarCampos(boolean n) {
        jlCargaHoraria.setVisible(n);
        jlCargo.setVisible(n);
        jlEstadoCivil.setVisible(n);
        jlSalario.setVisible(n);
        jtCargaHoraria.setVisible(n);
        jtCargo.setVisible(n);
        jtEstadoCivil.setVisible(n);
        jtSalario.setVisible(n);
    }

    public void preencherCampos() {
        jtId.setText("" + obj.getId());
        jtNome.setText(obj.getNome());
        jtCpf.setText(obj.getCpf());
        jtTipo.setText(obj.getTipoUsuarioModel().getDescricao());
        jtDataNasc.setText(dateFormat.format(obj.getDataNasc().getTime()));
        jtTelefone.setText(obj.getTelefone());
        jtDataCadastro.setText(dateFormat.format(obj.getDataCadastro().getTime()));
        jtSexo.setText(obj.getSexo());
        String estado = obj.getEnderecoModel().getEstado().trim();
        jtEndereco.setText("R. " + obj.getEnderecoModel().getRua() + ", " + obj.getEnderecoModel().getNumero() + " - " + obj.getEnderecoModel().getBairro() + ", " + obj.getEnderecoModel().getCidade() + " - "
                + estado + "  " + obj.getEnderecoModel().getCep());
        if (objFunc.getId() > 0) {
            jtCargaHoraria.setText(objFunc.getCargaHoraria());
            jtCargo.setText(objFunc.getCargo());
            jtSalario.setText("" + objFunc.getSalario());
            jtEstadoCivil.setText(objFunc.getEstadoCivil());
        }
    }

    public void randomImages() {
        try {
            File dir = new File("C:\\Users\\Pedro\\Downloads\\pokedex\\pokemon\\main-sprites\\black-white\\");
            File[] files = dir.listFiles();

            Random rand = new Random(19700621 * obj.getId());

            File file = files[rand.nextInt(files.length)];//files[obj.getId()];
            BufferedImage img = ImageIO.read(file);
            jlPokemon.setIcon(new javax.swing.ImageIcon(img));
            //jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/1490974935_Nier.gif")));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
        }

//        String[] filess = File.listFiles();
//        List shuffled = Collections.shuffle( Arrays.asList( filess ) );
    }
}
