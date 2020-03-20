<%-- 
    Document   : Listado
    Created on : 1/11/2018, 06:59:49 PM
    Author     : beto_
--%>

<%@page import="Clases.Producto"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Lista</title>
    </head>
    <BODY BGCOLOR="#99FF99">
        <h1 align="center">Listado de Productos</h1>
        <table align="center" border="1">
            <tr>
                <th>Codigo</th><th>Nombre</th><th>Agua</th><th>Disponible</th><th>Precio Q</th>
            <tr>
         <%
             ArrayList<Producto> lista=(ArrayList<Producto>)request.getAttribute("lista");
             for(int i=0;i<lista.size();i++){
                 Producto u=lista.get(i);
                 %>
                  <tr> 
                     <th><%=u.getCodigo()%></th>
                     <th><%=u.getNombre()%></th>
                     <th><%=u.getAgua()%></th>
                     <th><%=u.getCantidad()%></th>
                     <th><%=u.getPrecio()%></th>
                     <th><a href="ServletAct?comando=borrar&codigo=<%=u.getCodigo()%>"><img src="imgs/eliminar.png"width="80" height="80"></th>
                     <th><a href="ServletAct?comando=mostrar&codigo=<%=u.getCodigo()%>"><img src="imgs/editar.png"width="80" height="80"></th>
                  </tr> 
                  <%   
             }
         %>
       </table>  
    </body>
    <a href="menu.jsp" colspan="2"><input type="submit" name="btnIndex" value="Regresar"></a>
     
</html>
