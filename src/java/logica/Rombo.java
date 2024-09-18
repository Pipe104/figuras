/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package logica;

/**
 *
 * @author laver
 */
public class Rombo extends Cuadrilatero{
    
    @Override
    public void mostrarDato(){
        this.dato = "Un rombo es un cuadrilatero cuyos cuatro lados tienen la misma longitud pero sus angulos nos son necesariamente rectos";
    }
    
    @Override
    public void mostrarArea(){
        this.area = "(a*b)/2, a y b son las longitudes de las diagonales";
    }
}
