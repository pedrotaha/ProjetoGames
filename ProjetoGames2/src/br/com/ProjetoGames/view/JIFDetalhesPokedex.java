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
public class JIFDetalhesPokedex extends javax.swing.JInternalFrame {

    UsuarioModel obj = new UsuarioModel();
    FuncionarioModel objFunc = new FuncionarioModel();
    DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

    public JIFDetalhesPokedex() {
        initComponents();
        obj = new UsuarioModel();
        randomImages();
        this.setDefaultCloseOperation(JInternalFrame.DO_NOTHING_ON_CLOSE);
        Font font = new Font(Font.SANS_SERIF, Font.PLAIN, 30);
        UIManager.put("OptionPane.messageFont", font);
        UIManager.put("OptionPane.buttonFont", font);
        mudarIcon();
    }

    public JIFDetalhesPokedex(UsuarioModel obj) {
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

    public JIFDetalhesPokedex(FuncionarioModel obj) {
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

        jlVoltar = new javax.swing.JLabel();
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
        jlEndereco = new javax.swing.JLabel();
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
        jtEndereco = new javax.swing.JTextField();
        jlPokemon = new javax.swing.JLabel();
        jlPokedex = new javax.swing.JLabel();

        setClosable(true);
        setTitle("Detalhes do Usuário");
        setMinimumSize(new java.awt.Dimension(1032, 660));
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

        jlVoltar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlVoltarMouseClicked(evt);
            }
        });
        getContentPane().add(jlVoltar, new org.netbeans.lib.awtextra.AbsoluteConstraints(810, 0, 200, 50));

        jlCpf.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCpf.setText("CPF:");
        getContentPane().add(jlCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(700, 130, 67, -1));

        jlId.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlId.setText("ID:");
        getContentPane().add(jlId, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 80, -1, -1));

        jlTelefone.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTelefone.setText("Telefone:");
        getContentPane().add(jlTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 270, 107, -1));

        jlNome.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlNome.setText("Nome:");
        getContentPane().add(jlNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(690, 80, 67, -1));

        jlSexo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSexo.setText("Sexo:");
        getContentPane().add(jlSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 190, 67, -1));

        jlDataCadastro.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDataCadastro.setText("<html>Data de<br />Cadastro:</html>");
        getContentPane().add(jlDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(600, 310, 86, -1));

        jlDataNasc.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlDataNasc.setText("<html>Data de<br />Nascimento:</html>");
        getContentPane().add(jlDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 190, -1, -1));

        jlTipo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlTipo.setText("Tipo:");
        getContentPane().add(jlTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 130, 67, -1));

        jlCargo.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCargo.setText("Cargo:");
        getContentPane().add(jlCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 480, 67, -1));

        jlCargaHoraria.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlCargaHoraria.setText("Carga Horária:");
        getContentPane().add(jlCargaHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 470, 158, -1));

        jlSalario.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlSalario.setText("Salário:");
        getContentPane().add(jlSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 470, -1, -1));

        jlEstadoCivil.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlEstadoCivil.setText("Estado Civil:");
        getContentPane().add(jlEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 470, 126, -1));

        jlEndereco.setFont(new java.awt.Font("Arial", 1, 18)); // NOI18N
        jlEndereco.setText("Endereço:");
        getContentPane().add(jlEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 410, 94, -1));

        jtId.setEditable(false);
        jtId.setBackground(new java.awt.Color(232, 48, 48));
        jtId.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtId.setToolTipText("");
        jtId.setBorder(null);
        jtId.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtId.setEnabled(false);
        getContentPane().add(jtId, new org.netbeans.lib.awtextra.AbsoluteConstraints(540, 80, 25, -1));

        jtNome.setEditable(false);
        jtNome.setBackground(new java.awt.Color(232, 48, 48));
        jtNome.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtNome.setToolTipText("");
        jtNome.setBorder(null);
        jtNome.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtNome.setEnabled(false);
        getContentPane().add(jtNome, new org.netbeans.lib.awtextra.AbsoluteConstraints(770, 80, 132, -1));

        jtCpf.setEditable(false);
        jtCpf.setBackground(new java.awt.Color(248, 248, 248));
        jtCpf.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtCpf.setToolTipText("");
        jtCpf.setBorder(null);
        jtCpf.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtCpf.setEnabled(false);
        getContentPane().add(jtCpf, new org.netbeans.lib.awtextra.AbsoluteConstraints(790, 130, 117, -1));

        jtTelefone.setEditable(false);
        jtTelefone.setBackground(new java.awt.Color(248, 248, 248));
        jtTelefone.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtTelefone.setToolTipText("");
        jtTelefone.setBorder(null);
        jtTelefone.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtTelefone.setEnabled(false);
        getContentPane().add(jtTelefone, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 270, 120, -1));

        jtSexo.setEditable(false);
        jtSexo.setBackground(new java.awt.Color(248, 152, 216));
        jtSexo.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtSexo.setToolTipText("");
        jtSexo.setBorder(null);
        jtSexo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtSexo.setEnabled(false);
        getContentPane().add(jtSexo, new org.netbeans.lib.awtextra.AbsoluteConstraints(820, 210, 113, -1));

        jtDataNasc.setEditable(false);
        jtDataNasc.setBackground(new java.awt.Color(168, 112, 248));
        jtDataNasc.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtDataNasc.setToolTipText("");
        jtDataNasc.setBorder(null);
        jtDataNasc.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtDataNasc.setEnabled(false);
        getContentPane().add(jtDataNasc, new org.netbeans.lib.awtextra.AbsoluteConstraints(640, 200, 90, 30));

        jtDataCadastro.setEditable(false);
        jtDataCadastro.setBackground(new java.awt.Color(248, 248, 248));
        jtDataCadastro.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtDataCadastro.setToolTipText("");
        jtDataCadastro.setBorder(null);
        jtDataCadastro.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtDataCadastro.setEnabled(false);
        getContentPane().add(jtDataCadastro, new org.netbeans.lib.awtextra.AbsoluteConstraints(730, 320, 120, -1));

        jtTipo.setEditable(false);
        jtTipo.setBackground(new java.awt.Color(248, 248, 248));
        jtTipo.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtTipo.setToolTipText("");
        jtTipo.setBorder(null);
        jtTipo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtTipo.setEnabled(false);
        getContentPane().add(jtTipo, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 130, 163, -1));

        jtCargo.setEditable(false);
        jtCargo.setBackground(new java.awt.Color(248, 248, 248));
        jtCargo.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtCargo.setToolTipText("");
        jtCargo.setBorder(null);
        jtCargo.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtCargo.setEnabled(false);
        getContentPane().add(jtCargo, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 510, 194, -1));

        jtCargaHoraria.setEditable(false);
        jtCargaHoraria.setBackground(new java.awt.Color(248, 248, 248));
        jtCargaHoraria.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtCargaHoraria.setToolTipText("");
        jtCargaHoraria.setBorder(null);
        jtCargaHoraria.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtCargaHoraria.setEnabled(false);
        getContentPane().add(jtCargaHoraria, new org.netbeans.lib.awtextra.AbsoluteConstraints(350, 510, 158, -1));

        jtEstadoCivil.setEditable(false);
        jtEstadoCivil.setBackground(new java.awt.Color(248, 248, 248));
        jtEstadoCivil.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtEstadoCivil.setToolTipText("");
        jtEstadoCivil.setBorder(null);
        jtEstadoCivil.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtEstadoCivil.setEnabled(false);
        getContentPane().add(jtEstadoCivil, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 510, 126, -1));

        jtSalario.setEditable(false);
        jtSalario.setBackground(new java.awt.Color(248, 248, 248));
        jtSalario.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtSalario.setToolTipText("");
        jtSalario.setBorder(null);
        jtSalario.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtSalario.setEnabled(false);
        getContentPane().add(jtSalario, new org.netbeans.lib.awtextra.AbsoluteConstraints(590, 510, 108, -1));

        jtEndereco.setEditable(false);
        jtEndereco.setBackground(new java.awt.Color(248, 248, 248));
        jtEndereco.setFont(new java.awt.Font("Nintendo DS BIOS", 1, 24)); // NOI18N
        jtEndereco.setToolTipText("");
        jtEndereco.setBorder(null);
        jtEndereco.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        jtEndereco.setEnabled(false);
        getContentPane().add(jtEndereco, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 410, 690, -1));
        getContentPane().add(jlPokemon, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 130, 220, 170));

        jlPokedex.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/Pokedex Entry empty.png"))); // NOI18N
        getContentPane().add(jlPokedex, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, -1, -1));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void formInternalFrameClosing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_formInternalFrameClosing
        sair();
    }//GEN-LAST:event_formInternalFrameClosing

    private void jlVoltarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlVoltarMouseClicked
        sair();
    }//GEN-LAST:event_jlVoltarMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlCargaHoraria;
    private javax.swing.JLabel jlCargo;
    private javax.swing.JLabel jlCpf;
    private javax.swing.JLabel jlDataCadastro;
    private javax.swing.JLabel jlDataNasc;
    private javax.swing.JLabel jlEndereco;
    private javax.swing.JLabel jlEstadoCivil;
    private javax.swing.JLabel jlId;
    private javax.swing.JLabel jlNome;
    private javax.swing.JLabel jlPokedex;
    private javax.swing.JLabel jlPokemon;
    private javax.swing.JLabel jlSalario;
    private javax.swing.JLabel jlSexo;
    private javax.swing.JLabel jlTelefone;
    private javax.swing.JLabel jlTipo;
    private javax.swing.JLabel jlVoltar;
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
        ImageIcon icon = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\_Projetos\\ProjetoGames\\ProjetoGames2\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\icons8_Pokedex_528px.png");
        this.setFrameIcon(icon);
    }

    public void sair() {
        try {
            ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
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

    public void changeToENG() {
        obj.getEnderecoModel().setRua(obj.getEnderecoModel().getRua().replace("ç","c"));
        obj.getEnderecoModel().setRua(obj.getEnderecoModel().getRua().replace("ã","a"));
        obj.getEnderecoModel().setRua(obj.getEnderecoModel().getRua().replace("õ","o"));
        obj.getEnderecoModel().setRua(obj.getEnderecoModel().getRua().trim());
        obj.getEnderecoModel().setBairro(obj.getEnderecoModel().getBairro().replace("ç","c"));
        obj.getEnderecoModel().setBairro(obj.getEnderecoModel().getBairro().replace("ã","a"));
        obj.getEnderecoModel().setBairro(obj.getEnderecoModel().getBairro().replace("õ","o"));
        obj.getEnderecoModel().setBairro(obj.getEnderecoModel().getBairro().trim());
        obj.getEnderecoModel().setCidade(obj.getEnderecoModel().getCidade().replace("ç","c"));
        obj.getEnderecoModel().setCidade(obj.getEnderecoModel().getCidade().replace("ã","a"));
        obj.getEnderecoModel().setCidade(obj.getEnderecoModel().getCidade().replace("õ","o"));
        obj.getEnderecoModel().setCidade(obj.getEnderecoModel().getCidade().trim());
        obj.getEnderecoModel().setEstado(obj.getEnderecoModel().getEstado().replace("ç","c"));
        obj.getEnderecoModel().setEstado(obj.getEnderecoModel().getEstado().replace("ã","a"));
        obj.getEnderecoModel().setEstado(obj.getEnderecoModel().getEstado().replace("õ","o"));
        obj.getEnderecoModel().setEstado(obj.getEnderecoModel().getEstado().trim());
        obj.getEnderecoModel().setPais(obj.getEnderecoModel().getPais().replace("ç","c"));
        obj.getEnderecoModel().setPais(obj.getEnderecoModel().getPais().replace("ã","a"));
        obj.getEnderecoModel().setPais(obj.getEnderecoModel().getPais().replace("õ","o"));
        obj.getEnderecoModel().setPais(obj.getEnderecoModel().getPais().trim());
        objFunc.setCargaHoraria(objFunc.getCargaHoraria().replace("ç","c"));
        objFunc.setCargaHoraria(objFunc.getCargaHoraria().replace("ã","a"));
        objFunc.setCargaHoraria(objFunc.getCargaHoraria().replace("õ","o"));
        objFunc.setCargaHoraria(objFunc.getCargaHoraria().trim());
        objFunc.setCargo(objFunc.getCargo().replace("ç","c"));
        objFunc.setCargo(objFunc.getCargo().replace("ã","a"));
        objFunc.setCargo(objFunc.getCargo().replace("õ","o"));
        objFunc.setCargo(objFunc.getCargo().trim());
        objFunc.setEstadoCivil(objFunc.getEstadoCivil().replace("ç","c"));
        objFunc.setEstadoCivil(objFunc.getEstadoCivil().replace("ã","a"));
        objFunc.setEstadoCivil(objFunc.getEstadoCivil().replace("õ","o"));
        objFunc.setEstadoCivil(objFunc.getEstadoCivil().trim());
        obj.setNome(obj.getNome().replace("ç", "c"));
        obj.setNome(obj.getNome().replace("ã", "a"));
        obj.setNome(obj.getNome().replace("õ", "o"));
        obj.setNome(obj.getNome().trim());
        
    }

    public void preencherCampos() {
        changeToENG();
        jtId.setText("" + obj.getId());
        jtNome.setText(obj.getNome());
        jtCpf.setText(obj.getCpf());
        jtTipo.setText(obj.getTipoUsuarioModel().getDescricao());
        jtDataNasc.setText(dateFormat.format(obj.getDataNasc().getTime()));
        jtTelefone.setText(obj.getTelefone());
        jtDataCadastro.setText(dateFormat.format(obj.getDataCadastro().getTime()));
        jtSexo.setText(obj.getSexo());
        String estado = obj.getEnderecoModel().getEstado().replace("ã", "a");
        estado = estado.trim();
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
            File dir = new File("C:\\Users\\Pedro\\Downloads\\Project content\\pokedex\\pokemon\\main-sprites\\black-white\\");
            File[] files = dir.listFiles();
            File file = null;
            Random rand = new Random(19700621 * obj.getId());
            if (files.length <= obj.getId()) {
                file = files[obj.getId()];
            } else {
                file = files[rand.nextInt(files.length)];
            }
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
