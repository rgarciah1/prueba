<%-- 
    Document   : index
    Created on : 20/10/2018, 04:09:54 PM
    Author     : alumno
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>AQUARIUM</title>
    </head>
    <BODY BGCOLOR="#99FF99">
        <div align="center"><IMG SRC="imgs/Aquarium.png" width="800" height="275">
           
      <H1>
      <div align="center">Bienvenido al sistema de Acuarium
      </H1>
        <form action="ServletAct">
             
        <table align="center" border="1">
                <tr>
                    <td>Usuario:</td><td><input colspan="2" type ="text" name="txtNombre" value=""></td>
                </tr>
                <tr>
                    <td>Password:</td><td><input colspan="2" type ="password" name="txtPass" value=""></td>
                </tr>

                 <tr>
                     <td colspan="2" align="center">
                         <input type="submit" name="btningresp" value="Ingresar">
                         
                     </td>
                     
                </tr>
                
            </table>
             <input type="hidden" name="comando" value="oklogin">
         </form>     
    </body>
</html>



<!-- 

<form action="ServletAct">
         

<input type="hidden" name="comando" value="oklogin">
         </form>


 <a href="ServletAct?comando=oklogin">
 </a>

-->