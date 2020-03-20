/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package herram;
import java.sql.*;
/**
 *
 * @author alumno
 */


public class conexion {
public static Connection getConexion(){
    Connection conn=null;
    try{
        Class.forName("com.mysql.jdbc.Driver");
        conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/pez?user=root&paasword=");
        System.out.println("Conexion exitosa");
    }catch(Exception e){
        System.out.println("Fallo de conexion"+e);
    }
    return conn;
}

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        conexion.getConexion();
    }
    
}
