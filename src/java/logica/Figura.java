/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author laver
 */
public class Figura {
    String tipo;
    String nombre;
    String dato;
    String area;
    
    public String getTipo(){
        return tipo;
    }
    
    public void setTipo(String tipo){
        this.tipo = tipo;
    }
    
    public String getNombre(){
        return nombre;
    }
    
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    
    public void mostrarDato(){
        this.dato = "dato curioso";
    }
    
    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }
    
    public void mostrarArea(){
        this.area = "area";
    }
    
    public String getArea(){
        return area;
    }
    
    public void setArea(String area){
        this.area = area;
    }
}
