/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package genericidad;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ACER
 */
public class Genericidad {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Inserte numero de persona: ");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt() - 1;
        
        PersonaDatos persona1 = new PersonaDatos("Jesus",20 , "Famisanar","08/06/04");
        PersonaDatos persona2 = new PersonaDatos("Ana",51 , "Famisanar","18/09/73");
        
        List<PersonaDatos> lista = new ArrayList<PersonaDatos>();
        lista.add(persona1);
        lista.add(persona2);
        
        Pair<String, Integer> PairDatosP = new Pair<String, Integer>();
        Pair<String, String> PairDatosEps = new Pair<String, String>();
        
        PairDatosP.agregar(lista.get(i).getNombre(), lista.get(i).getEdad());
        PairDatosEps.agregar(lista.get(i).getEps(), lista.get(i).getFecha());
        
        System.out.println("First: " + PairDatosP.getFirst());
        System.out.println("Second: " + PairDatosP.getSecond());
        System.out.println("los datos de la persona son: " + PairDatosP.toString() + PairDatosEps.toString());
    }
    
}
