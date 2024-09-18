/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author laver
 */
public class Cuadrado extends Cuadrilatero{
    
    @Override
    public void mostrarDato(){
        this.dato = "Un cuadrado es un cuadrilátero regular con cuatro lados iguales y cuatro ángulos rectos (90°).";
    }
    
    @Override
    public void mostrarArea(){
        this.area = "Lado^2";
    }
}
