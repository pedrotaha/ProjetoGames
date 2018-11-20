package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import model.UsuarioModel;
import java.util.ArrayList;
import data.UsuarioData;

public final class EsqueceuSenha_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <link rel=\"stylesheet\" type=\"text/css\" href=\"css/layout.css\" />\n");
      out.write("        <script type=\"text/javascript\" src=\"js/script.js\"></script>\n");
      out.write("        <title>Esqueceu a Senha?</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        ");
 UsuarioModel obj = new UsuarioModel();
            obj = (UsuarioModel) request.getAttribute("objUser");
            if (obj == null) {
                obj = new UsuarioModel();
            }
            String acao = null;
            acao = (String) request.getAttribute("acao");
            if (acao == null) {
                acao = "esqueceuSenha";
            }
        
      out.write("\n");
      out.write("        <div class='brand'>\n");
      out.write("\n");
      out.write("        </div>\n");
      out.write("        <div class='login'>\n");
      out.write("            <div class='login_title'>\n");
      out.write("                <span>Esqueceu a Senha?</span>\n");
      out.write("            </div>\n");
      out.write("            <form action=\"UsuarioServlet?acao=");
      out.print(acao);
      out.write("\" method=\"post\">\n");
      out.write("                <div class='login_fields'>\n");
      out.write("                    <div class='login_fields__user'>\n");
      out.write("                        <div class='icon'>\n");
      out.write("                            <img src='img/user_icon_copy.png'>\n");
      out.write("                        </div>\n");
      out.write("                        <input placeholder='Login' type='text' name=\"login\" />\n");
      out.write("                        <div class='validation'>\n");
      out.write("                            <img src='img/tick.png'>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class='login_fields__password'>\n");
      out.write("                        <div class='icon'>\n");
      out.write("                            <img src='img/gmail.png'>\n");
      out.write("                        </div>\n");
      out.write("                        <input placeholder='E-mail' type='text' name=\"email\" />\n");
      out.write("                        <div class='validation'>\n");
      out.write("                            <img src='img/tick.png'>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                    <div class='login_fields__submit'>\n");
      out.write("                        <input type='submit' value='Enviar' />\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </form>\n");
      out.write("            <div class='love'>\n");
      out.write("                <p>Feito com <img src=\"img/love_copy.png\" /> por Garnet Games </a></p>\n");
      out.write("            </div>\n");
      out.write("\n");
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
