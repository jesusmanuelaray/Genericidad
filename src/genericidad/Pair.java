/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericidad;

/**
 *
 * @author ACER
 */
public class Pair <U, T>{
    private U first;
    private T second;
    
    public U getFirst(){
        return first;
    };
    
    public T getSecond(){
        return second;
    };
    
    //falta el de llamar a los dos
    @Override
    public String toString(){
        return "(" + first + ", "+second+")";
    };
    public void agregar (U a, T b){
        first = a;
        second = b;
    };
}
