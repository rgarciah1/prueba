package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clases.Producto;
import java.util.*;

public final class catalogo_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Lista</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <h1 align=\"center\">Catálogo de Productos</h1>\n");
      out.write("       \n");
      out.write("        <table align=\"center\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Codigo</th><th>Nombre</th><th>Agua</th><th>Disponible</th><th>Precio Q</th><th>Cantidad</th><th></th>\n");
      out.write("            <tr>\n");
      out.write("         ");

             ArrayList<Producto> lista=(ArrayList<Producto>)request.getAttribute("lista");
             for(int i=0;i<lista.size();i++){
                 Producto u=lista.get(i);
                 
      out.write("\n");
      out.write("                  <tr> \n");
      out.write("                     <th>");
      out.print(u.getCodigo());
      out.write("</th>\n");
      out.write("                     <th>");
      out.print(u.getNombre());
      out.write("</th>\n");
      out.write("                     <th>");
      out.print(u.getAgua());
      out.write("</th>\n");
      out.write("                     <th>");
      out.print(u.getCantidad());
      out.write("</th>\n");
      out.write("                     <th>");
      out.print(u.getPrecio());
      out.write("</th>\n");
      out.write("                    \n");
      out.write("                     <th><a href=\"ServletAct?comando=aggcarr&codigo=");
      out.print(u.getCodigo());
      out.write("&txtNombre=");
      out.print(u.getNombre());
      out.write("&txtAgua=");
      out.print(u.getAgua());
      out.write("&precio=");
      out.print(u.getPrecio());
      out.write("\"><input type=\"submit\" name=\"btnAggcrr\" value=\"+Carrito\"></th>\n");
      out.write("                     <!--<th><a href=\"ServletAct?comando=mostrar&codigo=");
//=u.getCodigo()
      out.write("\"><img src=\"imgs/editar.png\"></th>\n");
      out.write("                         <td> Cantidad: </td><td> <input type=\"text\" name=\"cantidad\" value=\"\"> \n");
      out.write("                         -->\n");
      out.write("                 \n");
      out.write("                             </tr> \n");
      out.write("                              \n");
      out.write("                   ");
   
             }
         
      out.write("         \n");
      out.write("       </table>  \n");
      out.write("       <form action=\"ServletAct\">\n");
      out.write("       <table align=\"center\" border=\"1\">\n");
      out.write("           </table>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("    <a href=\"menu.jsp\" colspan=\"2\"><input type=\"submit\" name=\"btnIndex\" value=\"Regresar\"></a>\n");
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
