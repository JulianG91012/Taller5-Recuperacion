/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package taller5.clasificaciontopm;

/**
 *
 * @author Julian Gómez
 */
public class ADTLlave <K ,Value extends Comparable <Value>> implements ParejaLlaveValor<K,Value>
{
    private K llave;
    private Value valor;

    public ADTLlave(K llave, Value valor)
    {
        this.llave = llave;
        this.valor = valor;
    }   


    public int compareTo(ParejaLlaveValor x)    
    {
        return 0;
    }   
    public K getKey()
    {
        return llave;
    }
    public Value getValue()
    {
        return valor;
    }
}


