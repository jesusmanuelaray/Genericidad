/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package genericidad;

/**
 *
 * @author ACER
 */
public class PersonaDatos {
    public String nombre;
    public int edad;
    public String eps;
    public String fechaNacimiento;
    
    public PersonaDatos(String nombre, int edad, String eps, String fechaNacimiento){
        this.nombre = nombre;
        this.edad = edad;
        this.eps = eps;
        this.fechaNacimiento = fechaNacimiento;
    };
    
    public String getNombre(){
        return nombre;
    };
    public Integer getEdad(){
        return edad;
    };
    public String getEps(){
        return eps;
    };
    public String getFecha(){
        return fechaNacimiento;
    };
}
