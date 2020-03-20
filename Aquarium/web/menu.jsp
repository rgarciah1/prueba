<%-- 
    Document   : menu
    Created on : 30/10/2018, 12:38:34 AM
    Author     : beto_
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>menu</title>
    </head>
    <body align="center" BGCOLOR="#99FF99">
        
        <h1 align="center"> <band height="79"/> Menú Principal</h1>
        <table align="center" border="1">
            <tr>
             <th><a href="ingresop.jsp"><img src="imgs/insertar.png" width="80" height="80"><input type="submit" name="btnIngreso" value="Ingreso prod."></a></th>
             <th><a href="ServletAct?comando=Listar"> <img src="imgs/listar.png" width="80" height="80"><input type="submit" name="btnVerif" value="Verificar Inv."></a></th>
            </tr>
            <tr>    
            <th><a href="dispo.jsp"><img src="imgs/consultar.png" width="80" height="80"><input type="submit" name="btnIngreso" value="Consultar"></a></th>
            <th><a href="newuser.jsp"><img src="imgs/editar.png" width="80" height="80"><input type="submit" name="btnNewuser" value="New_user"></a></th>
            </tr>
            <tr>    
                <th><a href="ServletAct?comando=Listacat"><img src="imgs/catalogo.png" width="80" height="80"><input type="submit" name="btnCat" value="Catálogo"></a></th>
                <th><a href="ServletAct?comando=carrito"><img src="imgs/carrito.png" width="80" height="80"><input type="submit" name="btnCar" value="Facturar"></a></th>
                
            </tr>

        </table>
        <div align="center" ><IMG SRC="imgs/angel.png" width="800" height="300"></div>
        <form>
        <a href="index.jsp"  ><input type="submit" name="btnIndex" value="LogOut"></a>
        
        </form>
        
    </body>
     
</html>
