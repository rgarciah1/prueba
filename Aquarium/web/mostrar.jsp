<%-- 
    Document   : mostrar
    Created on : 1/11/2018, 09:14:54 PM
    Author     : beto_
--%>
<%@page import="Clases.Producto"%>
<%@page import="java.util.ArrayList"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <BODY BGCOLOR="#99FF99">
        <h1 align="center">Actualizacion de informacion</h1>
        <form action="ServletAct">
            <table align="center" border="1">
                <%ArrayList<Producto> lista=(ArrayList<Producto>)request.getAttribute("lista");
                  for(int i=0;i<lista.size();i++){
                     Producto u=lista.get(i);
                %>
                <tr>
                    <td> Codigo: </td><td> <input type="text" name="codigo" value="<%=u.getCodigo()%>" readonly="readonly"> </td>
                </tr>
                 <tr>
                   <td> Nombre: </td><td> <input type="text" name="txtNombre" value="<%=u.getNombre()%>" readonly="readonly"> </td>
                </tr>
                 <tr>
                   <td> Agua: </td><td> <input type="text" name="txtAgua" value="<%=u.getAgua()%>" readonly="readonly"> </td>
                </tr>
                 <tr>
                   <td> Cantidad: </td><td> <input type="text" name="cantidad" value="<%=u.getCantidad()%>"> </td>
                </tr>
                <tr>
                   <td> Precio Q: </td><td> <input type="text" name="precio" value="<%=u.getPrecio()%>"> </td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"> <input type="submit" name="btnModificar" value="Modificar"> </td>
                </tr>
                
                
                <input type="hidden" name="comando" value="modificar">
                <%}%>
            </table>
        </form>   
    </body>
    <a href="menu.jsp" colspan="2"><input type="submit" name="btnIndex" value="Regresar"></a>
     
</html>
