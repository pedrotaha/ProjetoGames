<%@page import="java.text.DateFormat"%>
<%@page import="model.UsuarioModel"%>
<%@page import="model.JogosModel"%>
<%@page import="model.LocacaoModel"%>
<%@page import="model.JogosOperacaoModel"%>
<%@page import="java.util.ArrayList"%>
<%@page import="data.UsuarioData"%>
<%@page import="data.JogosLocadosData"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <!--<link rel="stylesheet" type="text/css" href="css/layout.css" />-->
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1" />
        <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js"></script>
        <script type="text/javascript" src="https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js"></script>
        <script src="//code.jquery.com/jquery-3.2.1.min.js"></script>
        <script src="//cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js"></script>
        <link href="//cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css" rel="stylesheet" />
        <link rel="stylesheet" type="text/css" href="css/bootstrap/bootstrap/css/bootstrap.css" />
        <link rel="stylesheet" type="text/css" href="css/projetoCSS.css" />
        <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css" />
        <script type="text/javascript" src="js/script.js"></script>
        <title>Jogos Locados</title>
    </head>
    <body>
        <div class="container">
            <header>
                <div class="row">
                    <div class="col-md-12">
                        <img src='img/GarnetGamesLogo.jpg' alt="Logo Garnet Games" class="logoGarnet" />
                    </div>
                </div>
            </header>
            <% UsuarioModel obj = new UsuarioModel();
                obj = (UsuarioModel) request.getAttribute("objUser");
                if (obj == null) {
                    obj = new UsuarioModel();
                }
                String acao = null;
                acao = (String) request.getAttribute("acao");
                if (acao == null) {
                    acao = "mostrar";
                }
                String msg = (String) request.getAttribute("msg");
                if (msg == null) {
                    msg = new String();
                }
            %>
            <div class="row">
                <div class="col-md-12">
                    <span><font color="white" size="7">Bem-vindo, <%=obj.getNome()%>.</font></span>
                </div>
            </div>
            <div class='login_title'>
                <div class="row">
                    <div class="col-md-12">
                        <span><font color="white" size="5">Jogos Locados por você no momento: </font></span>
                    </div>
                </div>
            </div>
            <div style="clear:both;"></div>
            <div class="mostrarProdutos">
                <div class="row">
                    <div class="col-md-12">
                        <form action="" method="post" name="myform"> <%-- serve para o link da em cima na mostrar oque voce ta escrevendo "post"--%>
                            <input type="hidden" name="acao" value="<%=acao%>">
                        </form>
                        <table class= "table table-bordered table-hover" id="tabelaProduto">
                            <thead>
                                <tr>
                                    <th>Título</th>
                                    <th>Plataforma</th>
                                    <th>Publisher</th>
                                    <th>Data Devolução</th>
                                </tr>
                            </thead>
                            <tbody>
                                <%
                                   // try {
                                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                        JogosModel objJogo = new JogosModel();
                                        LocacaoModel objLoc;
                                        JogosLocadosData DAO = new JogosLocadosData();
                                        //ArrayList<JogosModel> dados = DAO.pesquisar(obj);
                                        //ArrayList<LocacaoModel> dadosLoc = DAO.dadosLocacao(obj);
                                        //for (LocacaoModel c : dadosLoc) {
                                            //objLoc = c;
                                            //for (JogosOperacaoModel d : objLoc.getJogosOperacaoModel()) {
                                %>
                                <tr>
                                    <td><%//=d.getJogosModel().getTitulo()%></td>
                                    <td><%//=d.getJogosModel().getPlataforma()%></td>
                                    <td><%//=d.getJogosModel().getPublisher()%></td>
                                    <td><%//=dateFormat.format(objLoc.getDataDevolucao().getTime())%></td>
                                </tr>
                                <%
                                            //}
                                       // }
                                    //} catch (Exception e) {
                                        //System.out.println(e.getMessage());
                                   // }
                                %>
                            </tbody>
                        </table>
                    </div>
                </div>
            </div>

            <script>
                $(document).ready(function () {
                    $('#tabelaProduto').DataTable({
                        "language": {
                            "lengthMenu": "Mostrando _MENU_ registros por página",
                            "zeroRecords": "Nada encontrado",
                            "info": "Mostrando página _PAGE_ de _PAGES_",
                            "infoEmpty": "Nenhum registro disponível",
                            "infoFiltered": "(filtrado de _MAX_ registros no total)"
                        }
                    });
                });
            </script>
            <div class='love'>
                <p>Feito com <img src="img/love_copy.png" /> por Garnet Games </a></p>
            </div>
        </div>
    </body>
</html>
