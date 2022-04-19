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
        //Conjuntos para las pruebas:
        Comparable[] a = {3,7,8,9,10,11,12,13};
        Comparable[] b = {3,4,8,9,11};
        Comparable[] c = {"Taller", "Recuperación","Abecedario", "Hola", "Adios"};
        Comparable[] d = {"Recuperación", "Abecedario", "Tamarindo", "Hola"};
        Comparable[] e = {"A", "B", "C", "D", "E", "G", "H"};
        Comparable[] f = {"D", "E", "F", "G", "H"};
        Comparable[] x = {"Manzana", "Pera", "Piña", "Taller", "Agua"};
        Comparable[] y = {1,2,3,4,5};
        
        
        StdOut.println("Intersección Ordenada, conjuntos numericos diferentes a b es: " + Conjuntos.interseccionOrdenados(a, b));
        StdOut.println("Intersección Ordenada, conjuntos numericos diferentes b a es: " + Conjuntos.interseccionOrdenados(b, a));
        StdOut.println("Intersección Ordenada, conjuntos de strings diferentes, e f es: " + Conjuntos.interseccionOrdenados(e, f));
        StdOut.println("Intersección Ordenada, conjuntos de strings diferentes, f e es: " + Conjuntos.interseccionOrdenados(f, e));
        StdOut.println("Intersección Ordenada, mismo conjunto de numeros a a es: " + Conjuntos.interseccionOrdenados(a,a));
        StdOut.println("Intersección Ordenada, mismo conjunto de numeros b b es: " + Conjuntos.interseccionOrdenados(b,b));
        StdOut.println("Intersección Ordenada, conjuntos numericos diferentes, mismo tamaño y b es: " + Conjuntos.interseccionOrdenados(y,b));
        StdOut.println("Intersección Ordenada, conjuntos numericos diferentes, mismo tamaño b y es: " + Conjuntos.interseccionOrdenados(b,y));
        
        StdOut.println("Intersección No Ordenada, conjuntos String diferentes c d es: " + Conjuntos.interseccionNoOrdeanados(c,d));
        StdOut.println("Intersección No Ordenada, conjuntos String diferentes d c es: " + Conjuntos.interseccionNoOrdeanados(d,c));
        StdOut.println("Intersección No Ordenada, conjuntos String diferentes sin elementos en común d x es: " + Conjuntos.interseccionNoOrdeanados(d,x));
        StdOut.println("Intersección No Ordenada, conjuntos String diferentes sin elementos en común x d es: " + Conjuntos.interseccionNoOrdeanados(x,d));
        StdOut.println("Intersección No Ordenada, conjuntos String diferentes c x es: " + Conjuntos.interseccionNoOrdeanados(c,x));
        StdOut.println("Intersección No Ordenada, conjuntos String diferentes x c es: " + Conjuntos.interseccionNoOrdeanados(x,c));
    }
    
    
    
}
