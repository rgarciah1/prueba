<%-- 
    Document   : ingresop
    Created on : 1/11/2018, 08:59:13 PM
    Author     : beto_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ingreso</title>
    </head>
    <BODY BGCOLOR="#99FF99">
        <h1 align="center">- INGRESO -  - DE -  - PRODUCTOS- -NUEVOS-</h1>
        <form action="ServletAct">
            <table align="center" border="1">
                <tr>
                   <td> Codigo: </td><td> <input type="text" name="codigo" value=""> </td>
                </tr>
                 <tr>
                   <td> Nombre: </td><td> <input type="text" name="txtNombre" value=""> </td>
                </tr>
                 <tr>
                   <td> Agua: </td><td> <input type="text" name="txtAgua" value=""> </td>
                </tr>
                 <tr>
                   <td> Cantidad: </td><td> <input type="text" name="cantidad" value=""> </td>
                </tr>
                <tr>
                   <td> Precio Q: </td><td> <input type="text" name="precio" value=""> </td>
                </tr>
                 
                <tr>
                    <td colspan="2" align="center"> <input type="submit" name="btnInsertar" value="Insertar"> </td>
                </tr>
                <input type="hidden" name="comando" value="insertar">
            </table>
        </form>    
    </body>
    <a href="menu.jsp" colspan="2"><input type="submit" name="btnIndex" value="Regresar"></a>
     
</html>
