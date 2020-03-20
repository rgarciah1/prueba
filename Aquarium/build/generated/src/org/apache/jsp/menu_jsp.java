package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class menu_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>menu</title>\n");
      out.write("    </head>\n");
      out.write("    <body align=\"center\" BGCOLOR=\"#99FF99\">\n");
      out.write("        \n");
      out.write("        <h1 align=\"center\"> <band height=\"79\"/> Menú Principal</h1>\n");
      out.write("        <table align=\"center\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("             <th><a href=\"ingresop.jsp\"><img src=\"imgs/insertar.png\" width=\"80\" height=\"80\"><input type=\"submit\" name=\"btnIngreso\" value=\"Ingreso prod.\"></a></th>\n");
      out.write("             <th><a href=\"ServletAct?comando=Listar\"> <img src=\"imgs/listar.png\" width=\"80\" height=\"80\"><input type=\"submit\" name=\"btnVerif\" value=\"Verificar Inv.\"></a></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>    \n");
      out.write("            <th><a href=\"dispo.jsp\"><img src=\"imgs/consultar.png\" width=\"80\" height=\"80\"><input type=\"submit\" name=\"btnIngreso\" value=\"Consultar\"></a></th>\n");
      out.write("            <th><a href=\"newuser.jsp\"><img src=\"imgs/editar.png\" width=\"80\" height=\"80\"><input type=\"submit\" name=\"btnNewuser\" value=\"New_user\"></a></th>\n");
      out.write("            </tr>\n");
      out.write("            <tr>    \n");
      out.write("                <th><a href=\"ServletAct?comando=Listacat\"><img src=\"imgs/catalogo.png\" width=\"80\" height=\"80\"><input type=\"submit\" name=\"btnCat\" value=\"Catálogo\"></a></th>\n");
      out.write("                <th><a href=\"ServletAct?comando=carrito\"><img src=\"imgs/carrito.png\" width=\"80\" height=\"80\"><input type=\"submit\" name=\"btnCar\" value=\"Facturar\"></a></th>\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("\n");
      out.write("        </table>\n");
      out.write("        <div align=\"center\" ><IMG SRC=\"imgs/angel.png\" width=\"800\" height=\"300\"></div>\n");
      out.write("        <form>\n");
      out.write("        <a href=\"index.jsp\"  ><input type=\"submit\" name=\"btnIndex\" value=\"LogOut\"></a>\n");
      out.write("        \n");
      out.write("        </form>\n");
      out.write("        \n");
      out.write("    </body>\n");
      out.write("     \n");
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
