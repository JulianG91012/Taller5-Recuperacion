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
        List<Comparable> intersection = new ArrayList<>();
        int i = 0, j = 0;
        //Si el segundo conjunto es menor al primero
        if(conjunto1.length>conjunto2.length)
        {
            //Se repite el ciclo hasta que no hayan más valores a revisar en el conjunto más pequeño
            while(j <= (conjunto2.length-1))
            {
                //Compara si es mayor
                if(conjunto1[i].compareTo(conjunto2[j]) > 0){j++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) < 0){i++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
                }
            }
        }
        //Si el primer conjunto es menor al segundo
        else if(conjunto1.length<conjunto2.length)
        {
            while(i <= (conjunto1.length-1))
            {
                //Compara si es mayor
                if(conjunto1[i].compareTo(conjunto2[j]) > 0){j++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) < 0){i++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
                }
            }
        }
        //Si ambos tienen el mismo tamaño
        else if(conjunto1.length == conjunto2.length)
        {
            while(i <= (conjunto1.length-1) && j<= (conjunto2.length-1))
            {
            //Compara si es mayor
                if(conjunto1[i].compareTo(conjunto2[j]) > 0){j++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) < 0){i++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
                }
            } 
        }
        return intersection;
    }
    
    public static List<Comparable> interseccionNoOrdeanados(Comparable[] conjunto1, Comparable[] conjunto2)
    {
        Quick.sort(conjunto1);
        Quick.sort(conjunto2);
        //Se crea una lista de tipo Comparable para almacenar los elementos que encuentre en común
        List<Comparable> intersection = new ArrayList<>();
        int i = 0, j = 0;
        //Si el segundo conjunto es menor al primero
        if(conjunto1.length>conjunto2.length)
        {
            //Se repite el ciclo hasta que no hayan más valores a revisar en el conjunto más pequeño
            while(i <= (conjunto2.length-1))
            {
                //Compara si es mayor
                if(conjunto1[i].compareTo(conjunto2[j]) > 0){j++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) < 0){ i++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
                }
            }
        }
        //Si el primer conjunto es menor al segundo
        else if(conjunto1.length<conjunto2.length)
        {
            while(j <= (conjunto1.length-1))
            {
                //Compara si es mayor
                if(conjunto1[i].compareTo(conjunto2[j]) > 0){j++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) < 0){i++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
                }
            }
        }
        //Si ambos conjuntos son del mismo tamaño
        else if(conjunto1.length == conjunto2.length)
        {
            while(i <= (conjunto1.length-1) && j<= (conjunto2.length-1))
            {
            //Compara si es mayor
                if(conjunto1[i].compareTo(conjunto2[j]) > 0){j++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) < 0){i++;}
                else if(conjunto1[i].compareTo(conjunto2[j]) == 0)
                {
                    intersection.add(conjunto1[i]);
                    i++;
                    j++;
                }
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