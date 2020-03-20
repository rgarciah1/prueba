/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Clases;

/**
 *
 * @author alumno
 */
public class Producto {
    private int codigo;
    private String nombre;
    private String agua;
    private int cantidad;
    private int precio;

    public Producto(int codigo, String nombre, String agua, int cantidad, int precio) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.agua = agua;
        this.cantidad = cantidad;
        this.precio = precio;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }


    public String getAgua() {
        return agua;
    }
    
     public int getCantidad() {
        return cantidad;
    }

     public int getPrecio() {
        return precio;
    }
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public void setAgua(String agua) {
        this.agua = agua;
    }
    
      public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

      public void setPrecio(int precio) {
        this.precio = precio;
    }
    public void getTodo (){
		System.out.println("hola mundo hay que mejorar nuestro avance porfa " + precio + " " + cantidad);
	
	}
}
