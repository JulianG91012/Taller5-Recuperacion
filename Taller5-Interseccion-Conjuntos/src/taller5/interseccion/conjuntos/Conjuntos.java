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
    /*
    private Comparable[] conjunto1;
    private Comparable[] conjunto2;
    
    //Constructor que toma dos conjuntos para evaluarlos
    public Conjuntos(Comparable[] a, Comparable[] b)
    {
        conjunto1 = a;
        conjunto2 = b;
    }
    */
    public Conjuntos()
    { 
    }
    public static List<Comparable> interseccionOrdenados(Comparable[] conjunto1, Comparable[] conjunto2)
    {
        //Se crea una lista Dinámica para guardar la cantidad de elementos en común
        List<Comparable> intersection = new ArrayList<Comparable>();
        //Se crean los indicadores de las posiciones para ambos conjuntos
        int i = 0;
        int j = 0;
        //Se crean variables para almacenar el tamaño mínimo y máximo de los conjuntos
        int tamMin = 0;
        int tamMax = 0;
        //Se evalúa cuál de los dos conjuntos es menor y mayor
        if(conjunto1.length > conjunto2.length)
        {
            tamMin = conjunto2.length;
            tamMax = conjunto1.length;
        }
        else
        {
            tamMin = conjunto1.length;
            tamMax = conjunto2.length;
        }
        //Se crean dos conjuntos que tomarán los valores de los ingresados
        Comparable[] conjPequeño = new Comparable[tamMin];
        Comparable[] conjGrande = new Comparable[tamMax];
        if(conjunto1.length>=conjunto2.length)
        {
            conjPequeño = conjunto2;
            conjGrande = conjunto1;
        }
        else if(conjunto1.length<conjunto2.length)
        {
            conjPequeño = conjunto1;
            conjGrande = conjunto2;
        }
        //Ciclo para realizar comparaciones segun el tamaño del ciclo más pequeño
        while(j < tamMin){
            //Compara si es mayor
            if(conjGrande[i].compareTo(conjPequeño[j]) > 0)
            {
                    j++;
            }
            //Compara si es menor
            else if(conjGrande[i].compareTo(conjPequeño[j]) < 0)
            {
                    i++;
            }
            else if(conjGrande[i].compareTo(conjPequeño[j]) == 0)
            {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
            }
        }
        return intersection;
    }
    
    public static List<Comparable> interseccionNoOrdeanados(Comparable[] conjunto1, Comparable[] conjunto2)
    {
        Quick.sort(conjunto1);
        Quick.sort(conjunto2);
        //Se crea una lista de tipo Comparable para almacenar los elementos que encuentre en común
        List<Comparable> intersection = new ArrayList<Comparable>();
        int i = 0;
        int j = 0;
        int tamMin = 0;
        int tamMax = 0;
        if(conjunto1.length > conjunto2.length)
        {
            tamMin = conjunto2.length;
            tamMax = conjunto1.length;
        }
        else
        {
            tamMin = conjunto1.length;
            tamMax = conjunto2.length;
        }
        Comparable[] conjPequeño = new Comparable[tamMin];
        Comparable[] conjGrande = new Comparable[tamMax];
        //Se debe comparar el tamaño de ambos conjuntos, para tomar el menor
        //El conjunto 2 es más pequeño: j
        if(conjunto1.length>=conjunto2.length)
        {
            conjPequeño = conjunto2;
            conjGrande = conjunto1;
        }
        //El conjunto 1 es más pequeño: i
        else if(conjunto1.length<conjunto2.length)
        {
            conjPequeño = conjunto1;
            conjGrande = conjunto2;
        }
        
        //Ciclo para realizar comparaciones segun el tamaño del ciclo más pequeño
        while(j < tamMin && i < tamMax){
            //Compara si es mayor
            if(conjGrande[i].compareTo(conjPequeño[j]) > 0)
            {
                    j++;
            }
            //Compara si es menor
            else if(conjGrande[i].compareTo(conjPequeño[j]) < 0)
            {
                    i++;
            }
            else if(conjGrande[i].compareTo(conjPequeño[j]) == 0)
            {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
            }
        }
        return intersection;
        
    }
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