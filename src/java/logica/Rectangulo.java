/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author laver
 */
public class Rectangulo extends Cuadrilatero {
 
    @Override
    public void mostrarDato(){
        this.dato = "Un rectangulo es un cuadrilatero con lados opuestos iguales y cuatro angulos rectos";
    }
    
    @Override
    public void mostrarArea(){
        this.area = "base*altura";
    }
}
