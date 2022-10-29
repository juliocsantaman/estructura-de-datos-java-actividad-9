/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class ArbolBinario {
    
    NodoArbol raiz;
    
    
    public ArbolBinario() {
        this.raiz=null;
        
    }
    
    //Método para insertar un nodo en el árbol.
    public void add(int dato) {
        
        NodoArbol nuevo = new NodoArbol(dato);
        
        if(this.raiz == null) {
            
            this.raiz = nuevo;
            
        } else {
            NodoArbol auxiliar=raiz;
            NodoArbol padre;
            
            while(true){
                padre=auxiliar;
                if(dato<auxiliar.dato) {
                    auxiliar=auxiliar.hijoIzquierdo;
                    if(auxiliar==null) {
                        padre.hijoIzquierdo=nuevo;
                        return;
                    }
                } else {
                    auxiliar=auxiliar.hijoDerecho;
                    if(auxiliar==null) {
                        padre.hijoDerecho=nuevo;
                        return;
                    }
                }
            }
            
            
        }
    }
    
    
    //Método para saber cuando el árbol está vacío.
    public boolean isEmpty() {
        
        return raiz==null;
    }
    
    
    //Método para recorrer el árbol binario en inOrden.
    /*
        1. Recorrer el subarbol izquierdo inOrden.
        2. Examinar la ráiz.
        3. Recorrer el subarbol derecho inOrden.
        
    */
     public void inOrden(NodoArbol r) {
         
         if(r!=null) {
             inOrden(r.hijoIzquierdo);
             
             System.out.println(r.dato);
             
             inOrden(r.hijoDerecho);
             
         }
     }
     
     //Método para recorrer el árbol binario en preOrden.
     /*
        1. Examinar la raiz.
        2. Recorrer el subárbol izquierdo en preOrden.
        3. Recorrer el subárbol derecho en preOrden.
     */
     public void preOrden(NodoArbol r) {
         
         if(r!=null) {
             
             System.out.println(r.dato);
             
             preOrden(r.hijoIzquierdo);
             
             preOrden(r.hijoDerecho);
             
         }
     }
     
     
     //Método para recorrer el árbol binario en postOrden
     /*
        1. Recorrer el subárbol izquierdo en postOrden.
        2. Recorrer el subárbol derecho en postOrden.
        3. Examinar la raíz.
     */
     public void postOrden(NodoArbol r) {
         
         if(r!=null) {
             
             postOrden(r.hijoIzquierdo);
             
             postOrden(r.hijoDerecho);
             
             System.out.println(r.dato);
  
         }
     }
    
}
