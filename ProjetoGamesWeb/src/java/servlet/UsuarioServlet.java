/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlet;

import control.Criptografar;
import data.UsuarioData;
import java.io.IOException;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.Properties;
import java.util.Random;
import javax.activation.DataHandler;
import javax.activation.DataSource;
import javax.activation.FileDataSource;
import javax.mail.BodyPart;
import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.UsuarioModel;

/**
 *
 * @author Pedro
 */
public class UsuarioServlet extends HttpServlet {

    Calendar cal = new GregorianCalendar();
    UsuarioModel obj;
    String msg = new String();

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        try {
            obj = null;
            String acao = request.getParameter("acao");
            UsuarioData DAO = new UsuarioData();
            String login = request.getParameter("login");
            if (acao.equals("login")) {
                String senha = request.getParameter("senha");
                obj = DAO.validarUsuario(login, Criptografar.encriptografar(senha));
                if (obj != null) {
                    request.setAttribute("objUser", obj);
                    getServletContext().getRequestDispatcher("/JogosLocados.jsp").forward(request, response);
                } else {
                    msg = "Usuário ou senha inválidos";
                    request.setAttribute("msg", msg);
                    getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
                }
            } else {
                if (acao.equals("esqueceuSenha")) {
                    String email = request.getParameter("email");
                    obj = DAO.verEmailLogin(login, email);
                    if (obj != null) {
                        obj.setSenha(aleatorio());
                        sendEmail();
                        obj.setSenha(Criptografar.encriptografar(obj.getSenha()));
                        DAO.alterarSenha(obj);
                        msg = "Uma mensagem foi enviada para sua caixa de e-mails.";
                        request.setAttribute("msg", msg);
                        getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
                    } else {
                        msg = "Erro ao Enviar o e-mail";
                        request.setAttribute("msg", msg);
                        getServletContext().getRequestDispatcher("/Index.jsp").forward(request, response);
                    }
                } else {

                }
            }
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }

    public String aleatorio() {
        Random gerador = new Random(19700621 * cal.get(Calendar.DAY_OF_MONTH));
        Random rand = new Random(19700621);//Random float
        float result = ((10 + rand.nextInt(30)) + (rand.nextFloat())) * gerador.nextInt(900) * cal.get(Calendar.DAY_OF_MONTH) * cal.get(Calendar.HOUR) * cal.get(Calendar.MINUTE) * cal.get(Calendar.SECOND);
        String caracteresSalgados = "ABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";//Random String
        StringBuilder sao = new StringBuilder();
        Random geradorS = new Random(cal.get(Calendar.MILLISECOND) * cal.get(Calendar.MINUTE) * cal.get(Calendar.HOUR) * cal.get(Calendar.DAY_OF_MONTH) * 19700621);
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

    public void sendEmail() throws Exception {
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
            String htmlText = "<img src=\"cid:image\"><H2 ALIGN = \"left\" STYLE = \" font-family = Arial; font-size: 12pt\">Ol&aacute; " + obj.getNome() + ", esta &eacute; uma mensagem de recupera&ccedil;&atilde;o de senha da <BIG><BLINK>Garnet Games!</BLINK></BIG><br />Use esta senha tempor&aacute;ria: <BIG>" + obj.getSenha() + "</BIG></H2><br /><br />"
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

        } catch (MessagingException e) {
            throw new RuntimeException(e);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}
