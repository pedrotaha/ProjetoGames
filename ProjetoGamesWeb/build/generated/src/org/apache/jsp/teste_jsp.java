package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.text.DateFormat;
import model.UsuarioModel;
import model.JogosModel;
import model.LocacaoModel;
import model.JogosOperacaoModel;
import java.util.ArrayList;
import data.UsuarioData;
import data.JogosLocadosData;
import java.text.SimpleDateFormat;

public final class teste_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/layout.css\" />\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1\" />\n");
      out.write("        <script src=\"https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\" src=\"https://cdn.datatables.net/1.10.10/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-3.2.1.min.js\"></script>\n");
      out.write("        <script src=\"//cdn.datatables.net/1.10.15/js/jquery.dataTables.min.js\"></script>\n");
      out.write("        <link href=\"//cdn.datatables.net/1.10.15/css/jquery.dataTables.min.css\" rel=\"stylesheet\" />\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/bootstrap/bootstrap/css/bootstrap.css\" />\n");
      out.write("        <!--<link rel=\"stylesheet\" type=\"text/css\" href=\"css/projetoCSS.css\" />-->\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        <title>Jogos Locados</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <header>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <img src='img/GarnetGamesLogo.jpg' alt=\"Logo Garnet Games\" class=\"logoGarnet\" />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </header>\n");
      out.write("            ");
 UsuarioModel obj = new UsuarioModel();
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
            
      out.write("\n");
      out.write("            <div class=\"row\">\n");
      out.write("                <div class=\"col-md-12\">\n");
      out.write("                    <span><font color=\"white\" size=\"7\">Bem-vindo, ");
      out.print(obj.getNome());
      out.write(".</font></span>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class='login_title'>\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <span><font color=\"white\" size=\"5\">Jogos Locados por você no momento: </font></span>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div style=\"clear:both;\"></div>\n");
      out.write("            <div class=\"mostrarProdutos\">\n");
      out.write("                <div class=\"row\">\n");
      out.write("                    <div class=\"col-md-12\">\n");
      out.write("                        <form action=\"\" method=\"post\" name=\"myform\"> ");
      out.write("\n");
      out.write("                            <input type=\"hidden\" name=\"acao\" value=\"");
      out.print(acao);
      out.write("\">\n");
      out.write("                        </form>\n");
      out.write("                        <table class= \"table table-bordered table-hover\" id=\"tabelaProduto\">\n");
      out.write("                            <thead>\n");
      out.write("                                <tr>\n");
      out.write("                                    <th>Título</th>\n");
      out.write("                                    <th>Plataforma</th>\n");
      out.write("                                    <th>Publisher</th>\n");
      out.write("                                    <th>Data Devolução</th>\n");
      out.write("                                </tr>\n");
      out.write("                            </thead>\n");
      out.write("                            <tbody>\n");
      out.write("                                ");

                                    try {
                                        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                                        JogosModel objJogo = new JogosModel();
                                        LocacaoModel objLoc;
                                        JogosLocadosData DAO = new JogosLocadosData();
                                        ArrayList<JogosModel> dados = DAO.pesquisar(obj);
                                        ArrayList<LocacaoModel> dadosLoc = DAO.dadosLocacao(obj);
                                        for (LocacaoModel c : dadosLoc) {
                                            objLoc = c;
                                            for (JogosOperacaoModel d : objLoc.getJogosOperacaoModel()) {
                                
      out.write("\n");
      out.write("                                <tr>\n");
      out.write("                                    <td>");
      out.print(d.getJogosModel().getTitulo());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(d.getJogosModel().getPlataforma());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(d.getJogosModel().getPublisher());
      out.write("</td>\n");
      out.write("                                    <td>");
      out.print(dateFormat.format(objLoc.getDataDevolucao().getTime()));
      out.write("</td>\n");
      out.write("                                </tr>\n");
      out.write("                                ");

                                            }
                                        }
                                    } catch (Exception e) {
                                        System.out.println(e.getMessage());
                                    }
                                
      out.write("\n");
      out.write("                            </tbody>\n");
      out.write("                        </table>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("\n");
      out.write("            <script>\n");
      out.write("                $(document).ready(function () {\n");
      out.write("                    $('#tabelaProduto').DataTable({\n");
      out.write("                        \"language\": {\n");
      out.write("                            \"lengthMenu\": \"Mostrando _MENU_ registros por página\",\n");
      out.write("                            \"zeroRecords\": \"Nada encontrado\",\n");
      out.write("                            \"info\": \"Mostrando página _PAGE_ de _PAGES_\",\n");
      out.write("                            \"infoEmpty\": \"Nenhum registro disponível\",\n");
      out.write("                            \"infoFiltered\": \"(filtrado de _MAX_ registros no total)\"\n");
      out.write("                        }\n");
      out.write("                    });\n");
      out.write("                });\n");
      out.write("            </script>\n");
      out.write("            <div class='love'>\n");
      out.write("                <p>Feito com <img src=\"img/love_copy.png\" /> por Garnet Games </a></p>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
