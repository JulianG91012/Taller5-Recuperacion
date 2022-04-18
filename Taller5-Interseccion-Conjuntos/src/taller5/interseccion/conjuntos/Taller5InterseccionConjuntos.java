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
        Comparable[] a = {3,7,8,9,10,11,12};
        Comparable[] b = {3,4,8,9,11};        
        //Se definen 2 listas No Ordenadas para su posterior uso
        Comparable[] c = {"Taller", "Recuperación","Abecedario", "Hola", "Adios"};
        Comparable[] d = {"Recuperación", "Abecedario", "Tamarindo", "Hola"};
        
        //Se crea el conjunto C que define qué conjuntos serán evaluados
        //Conjuntos x = new Conjuntos(a,b);
        //Conjuntos y = new Conjuntos(c,d);
        StdOut.println(Conjuntos.interseccionOrdenados(a, b));
        StdOut.println("El resultado de la Intersección de conjuntos No Ordenados es de:\n" + Conjuntos.interseccionNoOrdeanados(c,d));
    }
    
    
    
}
