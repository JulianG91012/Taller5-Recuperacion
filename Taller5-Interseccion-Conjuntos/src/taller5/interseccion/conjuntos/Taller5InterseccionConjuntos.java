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
        Comparable[] a = {3,7,8,9,10,11,12,13};
        Comparable[] b = {3,4,8,9,11,12}; 
        Comparable[] f = {"D", "E", "F", "G", "H"};
        Comparable[] e = {"A", "B", "C", "D", "E", "G", "H"};
        //Se definen 2 listas No Ordenadas para su posterior uso
        Comparable[] c = {"Taller", "Recuperación","Abecedario", "Hola", "Adios"};
        Comparable[] d = {"Recuperación", "Abecedario", "Tamarindo", "Hola"};
        
        
        StdOut.println("El resultado de la intersección Ordenada, a b es: " + Conjuntos.interseccionOrdenados(a, b));
        StdOut.println("El resultado de la intersección Ordenada, b a es: " + Conjuntos.interseccionOrdenados(b, a));
        StdOut.println("El resultado de la intersección Ordenada, e f es: " + Conjuntos.interseccionOrdenados(e, f));
        StdOut.println("El resultado de la intersección Ordenada, f e es: " + Conjuntos.interseccionOrdenados(f, e));
        StdOut.println("El resultado de la intersección Ordenada, la versión de prueba a b es de " + Conjuntos.interseccionOrdenadaPrueba(a,b));
        StdOut.println("El resultado de la intersección Ordenada, la versión de prueba b a es de " + Conjuntos.interseccionOrdenadaPrueba(b,a));
        StdOut.println("El resultado de la intersección Ordenada, la versión de prueba a a es de " + Conjuntos.interseccionOrdenadaPrueba(a,a));
        StdOut.println("El resultado de la intersección Ordenada, la versión de prueba a a es de " + Conjuntos.interseccionOrdenadaPrueba(b,b));
        StdOut.println("El resultado de la intersección Ordenada, la versión de prueba e f es de " + Conjuntos.interseccionOrdenadaPrueba(e,f));
        StdOut.println("El resultado de la intersección Ordenada, la versión de prueba f e es de " + Conjuntos.interseccionOrdenadaPrueba(f,e));
        //StdOut.println("El resultado de la intersección Ordenada, la versión de prueba es de " + Conjuntos.interseccionOrdenadaPrueba(a,b));
        //StdOut.println("El resultado de la intersección Ordenada, prueba 2 es " + Conjuntos.interseccionOrdenados(e, f));
        //StdOut.println("El resultado de la intersección Ordenada, la versión de prueba 2 es de " + Conjuntos.interseccionOrdenadaPrueba(e,f));
        //StdOut.println("El resultado de la Intersección de conjuntos No Ordenados es de:\n" + Conjuntos.interseccionNoOrdeanados(c,d));
    }
    
    
    
}
