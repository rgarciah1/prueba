<%-- 
    Document   : dispo
    Created on : 2/11/2018, 12:39:23 AM
    Author     : beto_
--%>

<%@page import="Clases.Producto"%>
<%@page import="java.util.*"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Disponibilidad</title>
    </head>
    <BODY BGCOLOR="#99FF99">
       
    <h1 align="center">Consulta disponibilidad de producto</h1>
        <form action="ServletAct">
            
            <table align="center" border="1">
                <tr>
                    <td>Ingrese Código:</td><td><input type ="text" name="codigo" value=""></td>
                </tr>
                <tr>
                    <td colspan="2" align="center"><input type="submit" name="btnConsulta" value="Consulta"></td>
                </tr>
            </table>
             
            <input type="hidden" name="comando" value="busqueda">
           
            
        </form>
       <div align="center"><IMG SRC="imgs/tortuga.png" width="800" height="275">
    <a href="menu.jsp" colspan="2"><input type="submit" name="btnIndex" value="Regresar"></a>
    </body>
    
     
</html>

