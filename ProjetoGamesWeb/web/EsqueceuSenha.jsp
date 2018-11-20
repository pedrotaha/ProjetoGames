<%@page import="model.UsuarioModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.UsuarioData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/layout.css" />
        <script type="text/javascript" src="js/script.js"></script>
        <title>Esqueceu a Senha?</title>
    </head>
    <body>
        <% UsuarioModel obj = new UsuarioModel();
            obj = (UsuarioModel) request.getAttribute("objUser");
            if (obj == null) {
                obj = new UsuarioModel();
            }
            String acao = null;
            acao = (String) request.getAttribute("acao");
            if (acao == null) {
                acao = "esqueceuSenha";
            }
        %>
        <div class='brand'>

        </div>
        <div class='login'>
            <div class='login_title'>
                <span>Esqueceu a Senha?</span>
            </div>
            <form action="UsuarioServlet?acao=<%=acao%>" method="post">
                <div class='login_fields'>
                    <div class='login_fields__user'>
                        <div class='icon'>
                            <img src='img/user_icon_copy.png'>
                        </div>
                        <input placeholder='Login' type='text' name="login" />
                        <div class='validation'>
                            <img src='img/tick.png'>
                        </div>
                    </div>
                    <div class='login_fields__password'>
                        <div class='icon'>
                            <img src='img/gmail.png'>
                        </div>
                        <input placeholder='E-mail' type='text' name="email" />
                        <div class='validation'>
                            <img src='img/tick.png'>
                        </div>
                    </div>
                    <div class='login_fields__submit'>
                        <input type='submit' value='Enviar' />
                        <div class='forgot'>
                            <a href='Index.jsp'>Voltar ao login</a>
                        </div>
                    </div>
                </div>
            </form>
            <div class='love'>
                <p>Feito com <img src="img/love_copy.png" /> por Garnet Games </a></p>
            </div>

    </body>
</html>
