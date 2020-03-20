<%-- 
    Document   : newuser
    Created on : 2/11/2018, 09:33:00 AM
    Author     : beto_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title align="center">NuevoUsuario</title>
    </head>
    <BODY BGCOLOR="#99FF99">
        <h1>Nuevo Usuario</h1>
        <form action="ServletAct">
            <table align="center" border="1">
                <tr>
                   <td> User: </td><td> <input type="text" name="txtNombre" value=""> </td>
                </tr>
                 <tr>
                   <td> Password: </td><td> <input type="text" name="txtPass" value=""> </td>
                </tr>
                
                <tr>
                    <td colspan="2" align="center"> <input type="submit" name="btnNewuser" value="Crear_Usuario"> </td>
                </tr>
                <input type="hidden" name="comando" value="newuser">
            </table>
        </form> 
        <a href="menu.jsp" colspan="2"><input type="submit" name="btnIndex" value="Regresar"></a>
    </body>
</html>
