/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package taller5.clasificaciontopm;

/**
 *
 * @author Julian Gómez
 * @param <Key>
 */
public interface ParejaLlaveValor <Key, Value extends Comparable<Value>> extends Comparable<ParejaLlaveValor<Key,Value>>
{
    Key getKey();
    Value getValue();
}
 