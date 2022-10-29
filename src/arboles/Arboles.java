/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arboles;

import java.util.Scanner;

/**
 *
 * @author Julio Cesar Santaman Cruz.
 */
public class Arboles {

    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        int opcion=0, elemento;
        ArbolBinario arbol=new ArbolBinario();
        do {
            try {
                
                System.out.println("1. Agregar un nodo.");
                System.out.println("2. Recorrer el árbol binario inOrden.");
                System.out.println("3. Recorrer el árbol binario preOrden.");
                System.out.println("4. Salir.");
                System.out.print("Elige una opción: ");
                opcion=entrada.nextInt();
                
                System.out.println();
                
                switch(opcion) {
                    case 1:
                        System.out.print("Ingresa el número del elemento: ");
                        elemento=entrada.nextInt();
                        System.out.println("Agregando nodo...");

                        arbol.add(elemento);
                        break;
                        
                    case 2:
                        
                        if(!arbol.isEmpty()) {
                            arbol.inOrden(arbol.raiz);
                        } else {
                            System.out.println("Error: No se puede recorrer el árbol porque está vacío.");
                        }
                        
                        break;
                        
                        
                    case 3:
                        if(!arbol.isEmpty()) {
                            arbol.preOrden(arbol.raiz);
                        } else {
                            System.out.println("Error: No se puede recorrer el árbol porque está vacío.");
                        }
                        
                        break;
                        
                    
                    case 4:
                        System.out.println("Aplicación finalizada.");
                        System.exit(0);
                        break;
                        
                        
                    default: System.out.println("Elige una opción válida.");
                }
                
            } catch (Exception e) {
                System.out.println("Error.");
            }
        } while (opcion!=4);
        
        
    }
    
}
