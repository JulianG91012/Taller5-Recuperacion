/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5.interseccion.conjuntos;

import edu.princeton.cs.algs4.StdOut;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian Gómez
 */
public class Taller5InterseccionConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Se definen 2 listas ordenadas para su posterior uso
        //Comparable[] a = {"A", "B", "C", "D", "E"};
        //Comparable[] b = {"D", "E", "F", "G"};
        Comparable[] a = {7,8,9,10};
        Comparable[] b = {3,4,8};        
        //Se definen 2 listas No Ordenadas para su posterior uso
        Comparable[] c = {"Taller", "Recuperacion","Abecedario"};
        Comparable[] d = {"Recuperación", "Abecedario"};
        //La respuesta debería ser: 1,3,7
        
        //Se crea el conjunto C que define qué conjuntos serán evaluados
        Conjuntos x = new Conjuntos(a,b);
        Conjuntos y = new Conjuntos(c,d);
        StdOut.println("El resultado de la Intersección de conjuntos ordenados es de:\n" + x.interseccionOrdenados());
        StdOut.println("El resultado de la Intersección de conjuntos No Ordenados es de:\n" + y.interseccionNoOrdeanados());
    }
    
    
    
}
