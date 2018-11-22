<%@page import="model.UsuarioModel"%>
<%@page import="model.JogosModel"%>
<%@page import="model.LocacaoModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.UsuarioData"%>
<%@page import="data.JogosLocadosData"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" type="text/css" href="css/layout.css" />
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
        <script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="//cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
        <link href="//cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css" rel="stylesheet">
        <link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap/css/bootstrap.css">
        <link rel="stylesheet" type="text/css" href="css/projetoCSS.css">
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
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
            <div class="mostrarProdutos">
                <form action="" method="post" name="myform"> <%-- serve para o link da em cima na mostrar oque voce ta escrevendo "post"--%>
                    <input type="hidden" name="acao" value="<%=acao%>">
                </form>
                <table class= "table table-bordered table-hover" id="tabelaProduto">
                    <thead>
                        <tr>
                            <th>Produto</th>
                            <th>Tipo</th>
                            <th>Tarja</th>
                            <th>Valor</th>
                        </tr>
                    </thead>
                    <tbody>
                        <%
                            JogosModel objJogo = new JogosModel();
                            LocacaoModel objLoc = new LocacaoModel();
                            JogosLocadosData DAO = new JogosLocadosData();
                            ArrayList<JogosModel> dados = DAO.pesquisar(obj);
                            objLoc = DAO.dadosLocacao(obj);
                            for (JogosModel c : dados) {
                                objJogo = c;
                        %>
                        <tr>
                            <td><%=objJogo.getTitulo()%></td>
                            <td><%=objJogo.getPlataforma()%></td>
                            <td><%=objJogo.getPublisher()%></td>
                            <td><%=objLoc.getDataDevolucao()%></td>
                        </tr>
                        <% }
                        %>
                    </tbody>
                </table>
                <div class='love'>
                    <p>Feito com <img src="img/love_copy.png" /> por Garnet Games </a></p>
                </div>

                </body>
                </html>
