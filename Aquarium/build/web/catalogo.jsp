<%-- 
    Document   : catalogo
    Created on : 2/11/2018, 10:51:00 PM
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
        <h1 align="center">Catálogo de Productos</h1>
       
        <table align="center" border="1">
            <tr>
                <th>Codigo</th><th>Nombre</th><th>Agua</th><th>Disponible</th><th>Precio Q</th><th> agregar</th><th></th>
            <tr>
         <%
             //int cant=0;
             ArrayList<Producto> lista=(ArrayList<Producto>)request.getAttribute("lista");
             for(int i=0;i<lista.size();i++){
                 Producto u=lista.get(i);
                 //cant++;
                 %>
                  <tr> 
                     
                     <th><%=u.getCodigo()%></th>                     
                     <th><%=u.getNombre()%></th>
                     <th><%=u.getAgua()%></th>
                     <th><%=u.getCantidad()%></th>
                     <th><%=u.getPrecio()%></th>
                     <th><a href="ServletAct?comando=aggcarr&codigo=<%=u.getCodigo()%>&txtNombre=<%=u.getNombre()%>&txtAgua=<%=u.getAgua()%>&precio=<%=u.getPrecio()%>"><input type="submit" name="btnAggcrr" value="Carrito"></th>
                            </tr> 
                              
                   <%   
             }
         %>         
       </table> 
        <div align="center"><IMG SRC="imgs/globo.png" width="800" height="275">
     <a href="menu.jsp" colspan="2"><input type="submit" name="btnIndex" value="Regresar"></a>
    
    
    </body>
   
    
    
   
    
    
    
</html>
