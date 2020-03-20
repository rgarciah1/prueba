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
public class Usuario {
    private int codigo;
    private String nombre;
    private String password;

    public Usuario(int codigo, String nombre, String password) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.password = password;
    }

    public int getCodigo() {
        return codigo;
    }

    public String getNombre() {
        return nombre;
    }


    public String getPassword() {
        return password;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

  
    public void setPassword(String password) {
        this.password = password;
    }

    
}
