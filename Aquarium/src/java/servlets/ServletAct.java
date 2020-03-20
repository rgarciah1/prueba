/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package servlets;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author beto_
 */
import java.sql.*;
import herram.conexion;
import java.util.ArrayList;
import Clases.Usuario;
import Clases.Producto;
import net.sf.jasperreports.engine.JasperCompileManager;
@WebServlet(name = "ServletAct", urlPatterns = {"/ServletAct"})
public class ServletAct extends HttpServlet {

    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    protected void processRequest(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.setContentType("text/html;charset=UTF-8");
        
        String accion=request.getParameter("comando");
        Connection con=conexion.getConexion();
        
              
        if(accion.equals("oklogin")){
          String nam=request.getParameter("txtNombre");
          String passw=request.getParameter("txtPass");
         // request.getRequestDispatcher("menu.jsp").forward(request, response); 
            try{
                 //request.getRequestDispatcher("menu.jsp").forward(request, response); 
                PreparedStatement sta=con.prepareStatement("SELECT * FROM `usuarios` WHERE name=? and pass=?"); 
                sta.setString(1,nam);
                sta.setString(2,passw);
                ResultSet rs=sta.executeQuery();
                //String pass="";            
               
                if(rs.next()){
                  request.getRequestDispatcher("menu.jsp").forward(request, response);  
          
                
               /* Usuario u=new Usuario(rs.getInt(1),rs.getString(2),rs.getString(3));
                String pass=u.getPassword();
                if(nam.equals(passw)){
               //request.setCharacterEncoding("menu.jsp");
             
               request.getRequestDispatcher("menu.jsp").forward(request, response);  */
          }else{
           
        request.getRequestDispatcher("errorL.jsp").forward(request, response);  
            
        } 
                
            }catch(Exception e){
                
            }
            
          
            
        } else if(accion.equals("Listar")){
            try{
            PreparedStatement sta=con.prepareStatement("select * from productos"); 
            ResultSet rs=sta.executeQuery();
            
            ArrayList<Producto> lista=new ArrayList<Producto>();
            while(rs.next()){
                Producto u=new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
                lista.add(u);
            }
            request.setAttribute("lista",lista );
            request.getRequestDispatcher("Listado.jsp").forward(request, response);
            }catch(Exception e){
            }
            
        }else if(accion.equals("Listacat")){
            try{
            PreparedStatement sta=con.prepareStatement("select * from productos"); 
            ResultSet rs=sta.executeQuery();
            
            ArrayList<Producto> lista=new ArrayList<Producto>();
            while(rs.next()){
                Producto u=new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
                lista.add(u);
            }
            request.setAttribute("lista",lista );
            request.getRequestDispatcher("catalogo.jsp").forward(request, response);
            }catch(Exception e){
            }
            
        }else if(accion.equals("busqueda")){
            int codi =Integer.parseInt(request.getParameter("codigo"));
            try{
                PreparedStatement sta=con.prepareStatement("select * from productos where cod=?"); 
                sta.setInt(1,codi);
                ResultSet rs=sta.executeQuery();
                
                ArrayList<Producto> lista=new ArrayList<Producto>();
            while(rs.next()){
                Producto u=new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
                lista.add(u);
            }
            request.setAttribute("lista",lista );
            request.getRequestDispatcher("Listado.jsp").forward(request, response);  
            }catch(Exception e){
            }
        } else if(accion.equals("insertar")){
            String nom =request.getParameter("txtNombre");
            int cant =Integer.parseInt(request.getParameter("cantidad"));
            String agua =request.getParameter("txtAgua");
            int precio =Integer.parseInt(request.getParameter("precio"));
            try{
              PreparedStatement staCod=con.prepareStatement("select max(cod)+1 from productos"); 
              ResultSet rsCod=staCod.executeQuery();
              int cod=0;
              while(rsCod.next()){
                Producto u=new Producto(rsCod.getInt(1),"","",0,0);
                cod=u.getCodigo();
              }  
              PreparedStatement sta=con.prepareStatement("insert into productos values(?,?,?,?,?)"); 
              sta.setInt(1,cod);
              sta.setString(2,nom);
              sta.setString(3,agua);
              sta.setInt(4,cant);
              sta.setInt(5,precio);
              
              sta.executeUpdate();
              request.getRequestDispatcher("menu.jsp").forward(request, response);  
            }catch(Exception e){
            }
            
        }else if(accion.equals("aggcarr")){
          // int cod =Integer.parseInt(request.getParameter("codigo"));
            String nom =request.getParameter("txtNombre");
           // int cant =Integer.parseInt(request.getParameter("cantidad"));
            String agua =request.getParameter("txtAgua");
            int precio =Integer.parseInt(request.getParameter("precio"));
             try{
              PreparedStatement staCod=con.prepareStatement("select max(cod)+1 from carrito"); 
              ResultSet rsCod=staCod.executeQuery();
              int cod=0;
              while(rsCod.next()){
                Producto u=new Producto(rsCod.getInt(1),"","",0,0);
                cod=u.getCodigo();
              } 
              PreparedStatement sta=con.prepareStatement("insert into carrito values(?,?,?,0,?)"); 
              sta.setInt(1,cod);
              sta.setString(2,nom);
              sta.setString(3,agua);
              //sta.setInt(4,cant);
              sta.setInt(4,precio);
              
              sta.executeUpdate();
              request.getRequestDispatcher("menu.jsp").forward(request, response);  
            }catch(Exception e){
            }
            
        }else if(accion.equals("borrar")){
            int codi =Integer.parseInt(request.getParameter("codigo"));

            try{                
                PreparedStatement sta=con.prepareStatement("delete from productos where cod=?"); 
                sta.setInt(1,codi);
                
                sta.executeUpdate();
            request.getRequestDispatcher("ServletAct?comando=Listar").forward(request, response);  
            }catch(Exception e){
            }
        }else if(accion.equals("borrarcarr")){
            int codi =Integer.parseInt(request.getParameter("codigo"));

            try{                
                PreparedStatement sta=con.prepareStatement("delete from carrito where cod=?"); 
                sta.setInt(1,codi);
                
                sta.executeUpdate();
 
            request.getRequestDispatcher("ServletAct?comando=carrito").forward(request, response);
            }catch(Exception e){
            }
        }else if(accion.equals("mostrar")){
            int codi =Integer.parseInt(request.getParameter("codigo"));
             try{
                PreparedStatement sta=con.prepareStatement("select * from productos where cod=?"); 
                sta.setInt(1,codi);
                
                ResultSet rs=sta.executeQuery();
                ArrayList<Producto> lista=new ArrayList<Producto>();
            while(rs.next()){
               Producto u=new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
                lista.add(u);
            }
            request.setAttribute("lista",lista );
            request.getRequestDispatcher("mostrar.jsp").forward(request, response);  
            }catch(Exception e){
            }
        }else if(accion.equals("modificar")){
            int cod =Integer.parseInt(request.getParameter("codigo"));
            String nom =request.getParameter("txtNombre");
            int cant =Integer.parseInt(request.getParameter("cantidad"));
            String agua =request.getParameter("txtAgua");
            int precio =Integer.parseInt(request.getParameter("precio"));
            try{
              
              PreparedStatement sta=con.prepareStatement("update productos set nombre=?,agua=?,cantidad=?,precio=? where cod=?"); 
             
              sta.setString(1,nom);
              sta.setString(2,agua);
              sta.setInt(3,cant);
              sta.setInt(4,precio);
              sta.setInt(5,cod);
              
              sta.executeUpdate();
              request.getRequestDispatcher("menu.jsp").forward(request, response);  
            }catch(Exception e){
            }
            
        }else if(accion.equals("newuser")){
            String nombre =request.getParameter("txtNombre");
            String passw =request.getParameter("txtPass");
            int codi=0;
            
            try{
              PreparedStatement staCod=con.prepareStatement("select max(cod)+1 from usuarios"); 
              ResultSet rsCod=staCod.executeQuery();
              
              while(rsCod.next()){
                Usuario u=new Usuario(rsCod.getInt(1),"","");
                codi=u.getCodigo();
              }  
              PreparedStatement sta=con.prepareStatement("INSERT INTO usuarios(cod, name, pass) VALUES (?,?,?)"); 
              sta.setInt(1,codi);
              sta.setString(2,nombre);
              sta.setString(3,passw);
              sta.executeUpdate();
              request.getRequestDispatcher("menu.jsp").forward(request, response);  
            }catch(Exception e){
            }
            
        } else if(accion.equals("carrito")){
            try{
            PreparedStatement sta=con.prepareStatement("select * from carrito"); 
            ResultSet rs=sta.executeQuery();
            
            ArrayList<Producto> lista=new ArrayList<Producto>();
            while(rs.next()){
                Producto u=new Producto(rs.getInt(1),rs.getString(2),rs.getString(3),rs.getInt(4),rs.getInt(5));
                lista.add(u);
            }
            request.setAttribute("carrito",lista );
            request.getRequestDispatcher("carrito.jsp").forward(request, response);
            }catch(Exception e){
            }
        }else if(accion.equals("descargar")){
            //String nom =request.getParameter("txtNombre");
            int z =Integer.parseInt(request.getParameter("for"));
            int i=0;
            try{
                for(i=0;i<z;i++){   
              //for(i=0;i<lista.size();i++){
            //i++;
              String cant =("cantidad"+(i+1));
            //request.getParameter(cant)
            
            //request.getRequestDispatcher("menu.jsp").forward(request, response);
            String can = request.getParameter(cant);
            int c = Integer.parseInt(can);
            
              PreparedStatement sta=con.prepareStatement("update carrito set cantidad=? where cod=?;"); 
              sta.setInt(1,c);
              //sta.setString(2,agua);
              sta.setInt(2,i);
              //sta.setInt(4,precio);
              //sta.setInt(5,cod);
              
              sta.executeUpdate();
             } 
                
            
                
                
                
             request.getRequestDispatcher("factura.jsp").forward(request, response);
             
        
            }catch(Exception e){
            }
             try{                
                PreparedStatement sta=con.prepareStatement("delete from carrito "); 
               
                
                sta.executeUpdate();
 
           // request.getRequestDispatcher("menu.jsp").forward(request, response);
            }catch(Exception e){
            }
              
        }
        
      //  try (PrintWriter out = response.getWriter()) {
            /* TODO output your page here. You may use following sample code. */
        //    out.println("<!DOCTYPE html>");
        //  out.println("<html>");
        //    out.println("<head>");
        //   out.println("<title>Servlet ServletAct</title>");            
        //    out.println("</head>");
        //    out.println("<body>");
        //    out.println("<h1>Servlet ServletAct at " + request.getContextPath() + "</h1>");
        //    out.println("</body>");
        //    out.println("</html>");
        //}
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequest(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}

