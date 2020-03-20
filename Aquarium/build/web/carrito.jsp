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
        <script> 
     function capturar()
    {
    var porId=document.getElementById("nombre").value;
    
            document.getElementById("resultado").innerHTML=" \
            Por elementos: "+porElementos+"\
 \

        
    }
    </script>
    
    </head>
    <BODY BGCOLOR="#99FF99">
        <h1 align="center">Carrito de Compras</h1>
        
        <table align="center" border="1">
            <tr>
                <th>Codigo</th><th>Nombre</th><th>Agua</th><th>Precio Q</th><th>Cantidad</th>
            </tr>
         <%int i=0, c=0;
             ArrayList<Producto> lista=(ArrayList<Producto>)request.getAttribute("carrito");
             for(i=0;i<lista.size();i++){
                 Producto u=lista.get(i);
                 c=i;
                 %>
                  <tr> 
                     <td><%=u.getCodigo()+1%></td>
                     <th><%=u.getNombre()%></th>
                     <th><%=u.getAgua()%></th>
                     <th><%=u.getPrecio()%></th>
                     <th>  <input type="text" name="cantidad<%=c+1%>" value=""  > </th>
                     <th> <a href="ServletAct?comando=borrarcarr&codigo=<%=u.getCodigo()%>"><img src="imgs/eliminar.png"width="80" height="80"> </a></th>
                     
                     
                     
                    
                  </tr>
                    
                  <%   
             }
             
         %>
         <tr>
             <a input type="submit" name="facturar" value="Facturar" onclick="capturar()" align="center"> </a>
         </tr>
       </table>  
         
       
        <div align="center"><IMG SRC="imgs/payaso.png" width="800" height="275">
         
        <input type="hidden" name="for" value="<%=i++%>"  > 
        <input type="hidden" name="comando" value="descargar"  > 
        <a href="menu.jsp" colspan="2"><input type="submit" name="btnIndex" value="Regresar"></a>   
           
           
           </body>
        
    
</html>
