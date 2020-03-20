package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Clases.Producto;
import java.util.*;

public final class carrito_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <script> \n");
      out.write("     function capturar()\n");
      out.write("    {\n");
      out.write("    var porId=document.getElementById(\"nombre\").value;\n");
      out.write("    \n");
      out.write("            document.getElementById(\"resultado\").innerHTML=\" \\\n");
      out.write("            Por elementos: \"+porElementos+\"\\\n");
      out.write(" \\\n");
      out.write("\n");
      out.write("        \n");
      out.write("    }\n");
      out.write("    </script>\n");
      out.write("    \n");
      out.write("    </head>\n");
      out.write("    <BODY BGCOLOR=\"#99FF99\">\n");
      out.write("        <h1 align=\"center\">Carrito de Compras</h1>\n");
      out.write("        \n");
      out.write("        <table align=\"center\" border=\"1\">\n");
      out.write("            <tr>\n");
      out.write("                <th>Codigo</th><th>Nombre</th><th>Agua</th><th>Precio Q</th><th>Cantidad</th>\n");
      out.write("            <tr>\n");
      out.write("         ");
int i=0, c=0;
             ArrayList<Producto> lista=(ArrayList<Producto>)request.getAttribute("carrito");
             for(i=0;i<lista.size();i++){
                 Producto u=lista.get(i);
                 c=i;
                 
      out.write("\n");
      out.write("                  <tr> \n");
      out.write("                     <th>");
      out.print(u.getCodigo()+1);
      out.write("</th>\n");
      out.write("                     <th>");
      out.print(u.getNombre());
      out.write("</th>\n");
      out.write("                     <th>");
      out.print(u.getAgua());
      out.write("</th>\n");
      out.write("                     <th>");
      out.print(u.getPrecio());
      out.write("</th>\n");
      out.write("                     <th><form id=\"form1\"></th>\n");
      out.write("                     <input type=\"text\" name=\"cantidad");
      out.print(c+1);
      out.write("\" value=\"\"  >\n");
      out.write("                     <th><a href=\"ServletAct?comando=borrarcarr&codigo=");
      out.print(u.getCodigo());
      out.write("\"><img src=\"imgs/eliminar.png\"width=\"80\" height=\"80\"></th>\n");
      out.write("                     <a href=\"factura.jsp\">Ver Reporte General de Cliente</a>\n");
      out.write("                     \n");
      out.write("                     \n");
      out.write("                    \n");
      out.write("                  </tr>\n");
      out.write("                    \n");
      out.write("                  ");
   
             }
             
         
      out.write("\n");
      out.write("         \n");
      out.write("         <th> <input type=\"submit\" name=\"facturar\" value=\"Facturar\" onclick=\"capturar()\" align=\"center\"> </th>         \n");
      out.write("       </table>  \n");
      out.write("         \n");
      out.write("       \n");
      out.write("       <div align=\"center\"><IMG SRC=\"imgs/payaso.png\" width=\"800\" height=\"275\">\n");
      out.write("         </body>\n");
      out.write("        <input type=\"hidden\" name=\"for\" value=\"");
      out.print(i++);
      out.write("\"  > \n");
      out.write("        <input type=\"hidden\" name=\"comando\" value=\"descargar\"  > \n");
      out.write("        <a href=\"menu.jsp\" colspan=\"2\"><input type=\"submit\" name=\"btnIndex\" value=\"Regresar\"></a>\n");
      out.write("    \n");
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
