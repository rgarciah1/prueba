<%-- 
    Document   : factura
    Created on : 8/11/2018, 09:19:33 PM
    Author     : beto_
--%>

<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="java.io.*"%>
<%@page import="java.util.*"%>

<%@page import="net.sf.jasperreports.engine.*"%>
<%@page import="net.sf.jasperreports.view.JasperViewer"%>

<%@page import="javax.servlet.ServletResponse"%>
<%@page import="herram.conexion" %>


<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>FACTURA</title>
    </head>
    <body>
       
        <%
        File reportfile = new File (application.getRealPath("ReportesPDF/factura.jasper"));
        
        Map<String,Object> parameter = new HashMap();
        
        Connection con=conexion.getConexion();
        
        //String valor = request.getParameter("txtparametro");
        //parameter.put("mar",new String(valor));
        
        //byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), null,con );
        byte[] bytes = JasperRunManager.runReportToPdf(reportfile.getPath(), parameter, con);
        
        
        response.setContentLength(bytes.length);
        ServletOutputStream outputstream = response.getOutputStream();
        outputstream.write(bytes,0,bytes.length);
        
        outputstream.flush();
        outputstream.close();
        %>
        
    </body>
</html>
