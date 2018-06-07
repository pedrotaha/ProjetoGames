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
import br.com.ProjetoGames.view.control.Criptografar;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.KeyEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.*;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.*;
import javax.mail.internet.*;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;


/**
 *
 * @author Pedro
 */
public class JFLogin extends javax.swing.JFrame {

    Calendar cal = new GregorianCalendar();
    UsuarioData DAO;
    UsuarioModel obj;
    FuncionarioModel objF;
    FuncionarioData DAOF;

    public JFLogin() {
        initComponents();
        setIcon();
        obj = new UsuarioModel();
        DAO = new UsuarioData();
        objF = new FuncionarioModel();
        DAOF = new FuncionarioData();
        windowsClosing();
        cal = Calendar.getInstance();
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

        jlUsuario = new javax.swing.JLabel();
        jlSenha = new javax.swing.JLabel();
        jtUsuario = new javax.swing.JTextField();
        jpfSenha = new javax.swing.JPasswordField();
        jlLogin = new javax.swing.JLabel();
        jlSair = new javax.swing.JLabel();
        jlEsquecer = new javax.swing.JLabel();
        jlCadastrar = new javax.swing.JLabel();
        jlAnimation = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Garnet Games");
        setMaximumSize(new java.awt.Dimension(600, 373));
        setMinimumSize(new java.awt.Dimension(600, 370));
        setPreferredSize(new java.awt.Dimension(600, 370));
        setResizable(false);
        setSize(new java.awt.Dimension(600, 373));
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jlUsuario.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlUsuario.setText("Usuário:");
        getContentPane().add(jlUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 34, 101, 45));

        jlSenha.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlSenha.setText("Senha:");
        getContentPane().add(jlSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(12, 143, 101, 45));

        jtUsuario.setBackground(null);
        jtUsuario.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jtUsuario.setForeground(new java.awt.Color(255, 255, 255));
        jtUsuario.setCursor(new java.awt.Cursor(java.awt.Cursor.TEXT_CURSOR));
        jtUsuario.setOpaque(false);
        jtUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtUsuarioActionPerformed(evt);
            }
        });
        jtUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jtUsuarioKeyPressed(evt);
            }
        });
        getContentPane().add(jtUsuario, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 34, 281, 45));

        jpfSenha.setBackground(null);
        jpfSenha.setFont(new java.awt.Font("Arial", 1, 24)); // NOI18N
        jpfSenha.setForeground(new java.awt.Color(255, 255, 255));
        jpfSenha.setOpaque(false);
        jpfSenha.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                jpfSenhaKeyPressed(evt);
            }
        });
        getContentPane().add(jpfSenha, new org.netbeans.lib.awtextra.AbsoluteConstraints(131, 143, 281, 45));

        jlLogin.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlLogin.setText("Login");
        jlLogin.setToolTipText("");
        jlLogin.addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                jlLoginMouseDragged(evt);
            }
            public void mouseMoved(java.awt.event.MouseEvent evt) {
                jlLoginMouseMoved(evt);
            }
        });
        jlLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlLoginMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlLoginMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlLoginMouseExited(evt);
            }
        });
        getContentPane().add(jlLogin, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 230, 90, 40));

        jlSair.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlSair.setText("Sair");
        jlSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlSairMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlSairMouseExited(evt);
            }
        });
        getContentPane().add(jlSair, new org.netbeans.lib.awtextra.AbsoluteConstraints(450, 220, 120, 60));

        jlEsquecer.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlEsquecer.setText("Esqueceu a senha?");
        jlEsquecer.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlEsquecerMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlEsquecerMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlEsquecerMouseExited(evt);
            }
        });
        getContentPane().add(jlEsquecer, new org.netbeans.lib.awtextra.AbsoluteConstraints(370, 300, 230, 30));

        jlCadastrar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jlCadastrar.setText("Cadastrar");
        jlCadastrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jlCadastrarMouseClicked(evt);
            }
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                jlCadastrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                jlCadastrarMouseExited(evt);
            }
        });
        getContentPane().add(jlCadastrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 300, 130, -1));

        jlAnimation.setIcon(new javax.swing.ImageIcon(getClass().getResource("/br/com/ProjetoGames/imagens/1490974935_Nier.gif"))); // NOI18N
        getContentPane().add(jlAnimation, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -30, 620, 400));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jtUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtUsuarioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtUsuarioActionPerformed

    private void jlLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginMouseClicked
        login();
    }//GEN-LAST:event_jlLoginMouseClicked

    private void jlLoginMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginMouseEntered
        jlLogin.setForeground(Color.RED);
    }//GEN-LAST:event_jlLoginMouseEntered

    private void jlLoginMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginMouseDragged

    }//GEN-LAST:event_jlLoginMouseDragged

    private void jlLoginMouseMoved(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginMouseMoved

    }//GEN-LAST:event_jlLoginMouseMoved

    private void jlLoginMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlLoginMouseExited
        jlLogin.setForeground(Color.BLACK);
    }//GEN-LAST:event_jlLoginMouseExited

    private void jlSairMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSairMouseClicked
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
            System.exit(0);
        }
    }//GEN-LAST:event_jlSairMouseClicked

    private void jlSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSairMouseEntered
        jlSair.setForeground(Color.RED);
    }//GEN-LAST:event_jlSairMouseEntered

    private void jlSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlSairMouseExited
        jlSair.setForeground(Color.BLACK);
    }//GEN-LAST:event_jlSairMouseExited

    private void jlEsquecerMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlEsquecerMouseEntered
        jlEsquecer.setForeground(Color.RED);
    }//GEN-LAST:event_jlEsquecerMouseEntered

    private void jlEsquecerMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlEsquecerMouseExited
        jlEsquecer.setForeground(Color.BLACK);
    }//GEN-LAST:event_jlEsquecerMouseExited

    private void jlEsquecerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlEsquecerMouseClicked
          new JFRecuperacaoSenha().setVisible(true);
          dispose();
//        String email = JOptionPane.showInputDialog("Informe o seu e-mail:");
//        String login = JOptionPane.showInputDialog("Informe o login");
//        try {
//            obj = DAO.verEmailLogin(login, email);
//            obj.setSenha(aleatorio());
//            sendEmail();
//            obj.setSenha(Criptografar.encriptografar(obj.getSenha()));
//            DAO.alterarSenha(obj);
//        } catch (Exception e) {
//            JOptionPane.showMessageDialog(this, "Login ou E-mail inexistentes! \n" + e.getMessage(),
//                    "Recuperar Senha", JOptionPane.ERROR_MESSAGE);
//        }
    }//GEN-LAST:event_jlEsquecerMouseClicked

    private void jlCadastrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrarMouseEntered
        jlCadastrar.setForeground(Color.RED);
    }//GEN-LAST:event_jlCadastrarMouseEntered

    private void jlCadastrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrarMouseExited
        jlCadastrar.setForeground(Color.BLACK);
    }//GEN-LAST:event_jlCadastrarMouseExited

    private void jlCadastrarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jlCadastrarMouseClicked
        new JFCadCliente(0).setVisible(true);
        dispose();
    }//GEN-LAST:event_jlCadastrarMouseClicked

    private void jtUsuarioKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtUsuarioKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jtUsuarioKeyPressed

    private void jpfSenhaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jpfSenhaKeyPressed
        if (evt.getKeyCode() == KeyEvent.VK_ENTER) {
            login();
        }
    }//GEN-LAST:event_jpfSenhaKeyPressed

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
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFLogin.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFLogin().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jlAnimation;
    private javax.swing.JLabel jlCadastrar;
    private javax.swing.JLabel jlEsquecer;
    private javax.swing.JLabel jlLogin;
    private javax.swing.JLabel jlSair;
    private javax.swing.JLabel jlSenha;
    private javax.swing.JLabel jlUsuario;
    private javax.swing.JPasswordField jpfSenha;
    private javax.swing.JTextField jtUsuario;
    // End of variables declaration//GEN-END:variables
private void setIcon() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\Icones\\video-game-controller-icon.png");
        setIconImage(imagemTituloJanela.getImage());
    }

    private void login() {
        try {
            obj = DAO.validarUsuario(jtUsuario.getText(), Criptografar.encriptografar(jpfSenha.getText()));
            new JFPrincipal(obj).setVisible(true);
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Falha no Login: \n" + e.getMessage(),
                    "Botão Acessar", JOptionPane.ERROR_MESSAGE);
        }
    }

    public void windowsClosing() {
        ImageIcon imagemTituloJanela = new ImageIcon("C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\ProjetoGames\\src\\br\\com\\ProjetoGames\\imagens\\524d20cabd4731dffd6453fb707ab1d2b2b11c52_00.gif");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.addWindowListener(new WindowAdapter() {
            public void windowClosing(WindowEvent we) {
                if (JOptionPane.showConfirmDialog(null, "Deseja \nRealmente \nSair?", "Botão Sair", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE, imagemTituloJanela) == JOptionPane.YES_OPTION) {
                    dispose();
                    System.exit(0);
                }
            }
        });
    }

    public String aleatorio() {
        Random gerador = new Random(19700621 * cal.get(Calendar.DAY_OF_MONTH));
        Random rand = new Random(19700621);//Random float
        float result = ((10 + rand.nextInt(30)) + (rand.nextFloat())) * gerador.nextInt(900) * cal.get(Calendar.DAY_OF_MONTH) * cal.get(Calendar.HOUR) * cal.get(Calendar.MINUTE) * cal.get(Calendar.SECOND);
        String caracteresSalgados = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";//Random String
        StringBuilder sao = new StringBuilder();
        Random geradorS = new Random(cal.get(Calendar.HOUR) * cal.get(Calendar.DAY_OF_MONTH));
        while (sao.length() < 18) { // tamanho da String aleatória
            int index = (int) (geradorS.nextFloat() * caracteresSalgados.length());
            sao.append(caracteresSalgados.charAt(index));
        }
        String stringSalgada = sao.toString();
        String resultS = "" + result;
        final int aLength = stringSalgada.length();
        final int bLength = resultS.length();
        final int min = Math.min(aLength, bLength);
        final StringBuilder sb = new StringBuilder(aLength + bLength);
        for (int i = 0; i < min; i++) {
            sb.append(stringSalgada.charAt(i));
            sb.append(resultS.charAt(i));
        }
        if (aLength > bLength) {
            sb.append(stringSalgada, bLength, aLength);
        } else if (aLength < bLength) {
            sb.append(resultS, aLength, bLength);
        }
        return sb.toString();
    }

     public void sendEmail() {
        // Recipient's email ID needs to be mentioned.
        String to = obj.getEmail();

        // Sender's email ID needs to be mentioned
        String from = "pedro.m.taha@gmail.com";
        final String username = "pedro.m.taha@gmail.com";//change accordingly
        final String password = "P@34221467";//change accordingly

        // Assuming you are sending email through relay.jangosmtp.net
        String host = "localhost";

        Properties props = new Properties();
        props.put("mail.smtp.auth", "true");
        props.put("mail.smtp.starttls.enable", "true");
        props.put("mail.smtp.host", "smtp.gmail.com");
        props.put("mail.smtp.port", "587");

        Session session = Session.getInstance(props,
                new javax.mail.Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(username, password);
            }
        });

        try {

            // Create a default MimeMessage object.
            Message message = new MimeMessage(session);

            // Set From: header field of the header.
            message.setFrom(new InternetAddress(from));

            // Set To: header field of the header.
            message.setRecipients(Message.RecipientType.TO,
                    InternetAddress.parse(to));

            // Set Subject: header field
            message.setSubject("Recuperação de senha - Garnet Games");

            // This mail has 2 part, the BODY and the embedded image
            MimeMultipart multipart = new MimeMultipart("related");

            // first part (the html)
            BodyPart messageBodyPart = new MimeBodyPart();//WIDTH = \"229\" HEIGHT = \"300\"
            String htmlText = "<H2 ALIGN = \"left\" STYLE = \" font-family = Arial; font-size: 12pt\"><img src=\"cid:image\" ALIGN = \"top\" >Ol&aacute; "+obj.getNome()+", esta &eacute; uma mensagem de recupera&ccedil;&atilde;o de senha da <BIG><BLINK>Garnet Games!</BLINK></BIG><br />Use esta senha tempor&aacute;ria: <BIG>"+obj.getSenha()+"</BIG></H2><br /><br />"
                    + "<H3 ALIGN = \"left\" STYLE = \" font-family = Arial; font-size: 12pt\">N&atilde;o foi voc&ecirc;? Entre no sistema com a senha tempor&aacute;ria e mude a senha para uma diferente da antiga.<br /><br /><br /><br /><br /><br />"
                    + "<HR SIZE = 2 WIDTH = 100% NOSHADE><br />Para entrar em contado com administrador do sistema envie um e-mail para <BIG><ADDRESS>pedro.m.taha@gmail.com</ADDRESS></BIG></H3>";
            messageBodyPart.setContent(htmlText, "text/html");
            // add it
            multipart.addBodyPart(messageBodyPart);

            // second part (the image)
            messageBodyPart = new MimeBodyPart();
            DataSource fds = new FileDataSource(
                    "C:\\Users\\Pedro\\Documents\\NetBeansProjects\\Luciene\\_Projetos\\ProjetoGames\\ProjetoGames2\\src\\br\\com\\ProjetoGames\\imagens\\GarnetGamesLogo.jpg");

            messageBodyPart.setDataHandler(new DataHandler(fds));
            messageBodyPart.setHeader("Content-ID", "<image>");

            // add image to the multipart
            multipart.addBodyPart(messageBodyPart);

            // put everything together
            message.setContent(multipart);
            // Send message
            Transport.send(message);

            JOptionPane.showMessageDialog(this,"Uma mensagem foi enviada para sua caixa de e-mails.");

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }
    
}
