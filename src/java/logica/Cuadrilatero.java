/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author laver
 */
public class Cuadrilatero extends Figura{
    
    @Override
    public void mostrarDato(){
        this.dato = "Los cuadrilateros tienen 4 lados";
    }
    
    @Override
    public void mostrarArea(){
        this.area = "El area depende del tipo de cuadrilatero";
    }
}
