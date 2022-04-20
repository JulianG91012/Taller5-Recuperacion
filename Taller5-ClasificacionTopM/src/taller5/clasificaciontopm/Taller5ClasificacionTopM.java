/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package taller5.clasificaciontopm;


import edu.princeton.cs.algs4.*;
import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Julian Gómez
 */
public class Taller5ClasificacionTopM {

    /**
     * @param args the command line arguments
     */ 
    public static void main(String[] args) {
        
        //ADTLlave<String,Integer> llave1 = new ADTLlave<>("Hola",7);
        //StdOut.println(llave1.getKey() + llave1.getValue());
        
        topMPalabras("C:\\DonQuijote.txt",50); 
        
            
        
    }
        //Métodos:
    public static MinPQ<ParejaLlaveValor> TopMPunto6(List<ParejaLlaveValor> datos, int M)
        {
            MinPQ<ParejaLlaveValor> x = new MinPQ<>();
            int i = 0;
            //Se crea la cola
            while(i<datos.size())
            {
                //Lleno el minPQ con todo lo que haya en datos
                x.insert(datos.get(i));
                //Cuando llegue al tope de datos, se elimina el menor
                if(x.size() > M){ x.delMin();}
                i++;
            }
            return x;
            
        }
        public static List<ParejaLlaveValor> contadorDePalabras(String rutaArchivo)
        {
            //Creamos la tabla de simbolos
            ST<String,Integer> tabla1 = new ST<>();
            //Creamos la lista
            List<ParejaLlaveValor> lista1 = new ArrayList<>();
            //Creamos un arreglo de Strings que recibirá el archivo
            String[] arreglo1 = In.readStrings(rutaArchivo);
            int i = 0;
            
            while(i<rutaArchivo.length())
            {
                //Se accede a la posición en el arreglo
                String x = arreglo1[i];
                //Si tiene la llave incrementa el valor a la llave (Contador de repeticiones)
                if(tabla1.contains(x))
                {   
                    tabla1.put(x, tabla1.get(x+1));
                }
                //En el caso contrario, la añade con el valor de 1
                else
                    tabla1.put(x, 1);
                i++;
            }
            //Se guarda en la lista lo que haya en la tabla de simbolos
            for(String llave : tabla1.keys())
            {
                ADTLlave<String, Integer> d = new ADTLlave<>(llave, tabla1.get(llave));
            }
            return lista1;
        }
        
        public static void topMPalabras(String rutaArchivo, int M)
        {
            List<ParejaLlaveValor> lista2 = contadorDePalabras(rutaArchivo);
            //Al MinPQ le paso la información del TopM palabras
            MinPQ<ParejaLlaveValor> y = TopMPunto6(lista2,M); 
            //Debemos mostrar en forma decreciente, para esto se puede usar una pila:
            Stack<ParejaLlaveValor> pila = new Stack<>();
            
            //Se mandan los datos del MinPQ a la pila para que queden en orden decreciente
            for(ParejaLlaveValor ADTLlave : y)
                pila.push(ADTLlave);
            for(ParejaLlaveValor ADTLlave : pila)
                StdOut.println(ADTLlave.getKey() + " " + ADTLlave.getValue());
        }
        

}
