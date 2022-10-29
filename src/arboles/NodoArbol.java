/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 * //Decir que n ario es mi arbol. En mi caso de dos.
 * //Arbol minimo es de dos.
 * //Si es de uno se convierte en una lista.
 * // Si el numero de enlaces es mayor que el enesimo (binario 2)
 * 
 * elemento niveles = 2;
 * condicion donde diga cuantos enlaces tiene un nodo.
 * 
 * si es igual que se vaya a la derecha
 */
public class NodoArbol {
    
    int dato;
    NodoArbol hijoIzquierdo;
    NodoArbol hijoDerecho;
    
    //Método equivalente al create();
    public NodoArbol(int dato) {
        this.dato=dato;
        this.hijoIzquierdo=null;
        this.hijoDerecho=null;
    }
    
   
    
    
    
}
