/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5.interseccion.conjuntos;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author Julian Gómez
 */
public class Taller5InterseccionConjuntos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Comparable[] a = {1,2,3,4,4};
        Comparable[] b = {3,4,5,6};
        
        Conjuntos c = new Conjuntos(a,b);
        
        StdOut.println("El resultado de la Intersección es de:" + c.interseccionOrdenada());
    }
    
}
