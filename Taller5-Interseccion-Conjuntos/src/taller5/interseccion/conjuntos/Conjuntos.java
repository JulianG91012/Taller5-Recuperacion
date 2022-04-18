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
    /*
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
    }*/
    
    public List<Comparable> interseccionOrdenados()
    {
        List<Comparable> intersection = new ArrayList<Comparable>();
        int i = 0;
        int j = 0;
        //Se debe comparar el tamaño de ambos conjuntos, para tomar el menor
        
        
        if(conjunto1.length>conjunto2.length)
        {
            while(j < conjunto2.length){
            //Compara si es mayor
            if(conjunto1[i].compareTo(conjunto2[j]) > 0)
                    j++;
            //Compara si es menor
            else if(conjunto1[i].compareTo(conjunto2[j]) < 0)
                    i++;
            else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
            }
        }
        return intersection;
        
        
    }
    
    public List<Comparable> interseccionNoOrdeanados()
    {
        //Se crea una lista de tipo Comparable para almacenar los elementos que encuentre en común
        List<Comparable> intersection = new ArrayList<Comparable>();
        int i = 0;
        int j = 0;
        Quick.sort(conjunto1);
        Quick.sort(conjunto2);
        
        if(conjunto1.length>conjunto2.length)
        {
            while(j < conjunto2.length){
            //Compara si es mayor
            if(conjunto1[i].compareTo(conjunto2[j]) > 0)
                    j++;
            //Compara si es menor
            else if(conjunto1[i].compareTo(conjunto2[j]) < 0)
                    i++;
            else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
            }
        }
        return intersection;
    }
}

