/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.interseccion.conjuntos;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Julian Gómez
 */
public class Conjuntos {
    
    private Comparable[] conjunto1;
    private Comparable[] conjunto2;
    
    //Constructor que toma dos conjuntos para evaluarlos
    public Conjuntos(Comparable[] a, Comparable[] b)
    {
        conjunto1 = a;
        conjunto2 = b;
    }
    
    public List<Comparable> interseccionOrdenada()
    {
        //Se crea una lista de tipo Comparable para almacenar los elementos que encuentre en común
        List<Comparable> intersection = new ArrayList<Comparable>();
        
        //Ciclo foreach
        for(Comparable i : conjunto1) {
            for(Comparable j : conjunto2) {
                if(j.equals(i)) {
                    intersection.add(j);
                }
            }
        }
        return intersection;
    }
    
}

