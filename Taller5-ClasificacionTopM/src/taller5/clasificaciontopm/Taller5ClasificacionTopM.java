/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5.clasificaciontopm;

import edu.princeton.cs.algs4.StdOut;

/**
 *
 * @author Julian Gómez
 */
public class Taller5ClasificacionTopM {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        
        ADTLlave<String,Integer> llave1 = new ADTLlave<>("Hola",7);
        StdOut.println(llave1.getKey() + llave1.getValue());
    }
    
}
