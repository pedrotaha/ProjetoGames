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
        <title>Página Inicial</title>
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
                acao = "login";
            }
            String msg = (String) request.getAttribute("msg");
            if (msg == null) {
                msg = new String();
            }
        %>
        <div class='brand'>

        </div>
        <div class='login'>
            <span>Bem-vindo, <%=obj.getNome()%>.</span>
            <div class='login_title'>
                <br/>
                <span>Jogos Locados por você no momento: </span>
            </div>
            <form action="UsuarioServlet?acao=<%=acao%>" method="post">
                <div class='login_fields'>
                    <div class='login_fields__user'>
                        <div class='icon'>
                            <img src='img/user_icon_copy.png'>
                        </div>
                        <input placeholder='Login' type='text' name="login" value="<%=obj.getLogin()%>" />
                        <div class='validation'>
                            <img src='img/tick.png'>
                        </div>
                    </div>
                    <div class='login_fields__password'>
                        <div class='icon'>
                            <img src='img/lock_icon_copy.png'>
                        </div>
                        <input placeholder='Senha' type='password' name="senha" value="<%=obj.getSenha()%>" />
                        <div class='validation'>
                            <img src='img/tick.png'>
                        </div>
                    </div>
                    <div class='login_fields__submit'>
                        <input type='submit' value='Entrar' />
                        <div class='forgot'>
                            <a href='EsqueceuSenha.jsp'>Esqueceu a senha?</a>
                        </div>
                    </div>
                </div>
            </form>
            <div class='success'>
                <h2>Autenticado com Sucesso!</h2>
                <p>Bem-vindo</p>
            </div>
            <div class='disclaimer'>
                <p>Garnet Games</p>
            </div>
        </div>
        <div class='authent'>
            <img src='https://s3-us-west-2.amazonaws.com/s.cdpn.io/217233/puff.svg'>
            <p>Autenticando...</p>
        </div>
        <div class='love'>
            <p>Feito com <img src="img/love_copy.png" /> por Garnet Games </a></p>
        </div>

    </body>
</html>
