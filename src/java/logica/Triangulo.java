/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author laver
 */
public class Triangulo extends Figura {
 
    @Override
    public void mostrarDato(){
        this.dato = "Los triangulos tienen 3 lados";
    }
    
    @Override
    public void mostrarArea(){
        this.area = "(base*altura)/2";
    }
    
}
