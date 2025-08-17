/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.Arrays;
import java.util.Scanner;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class ArregloEnteros {
    private Scanner teclado;
    private int[] enteros;
    
    public void cargar(){
        
        teclado= new Scanner(System.in);
        enteros= new int[5];
        for(int i=0;i<5;i++) {
            System.out.print("Ingrese el Entero "+"["+ i +"]:");
            enteros[i]=teclado.nextInt();
        }	
    }
    
    public void imprimir() {
        for(int i=0;i<5;i++) {
            System.out.println("El elemento "+"["+ i +"] es:"+this.enteros[i]);
        }
    }

    public void ordenar(){
        Arrays.sort(enteros);
    }

    public void ordenarSeleccion() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (enteros[f] > enteros[f+1]) {
                    int aux;
                    aux=enteros[f];
                    enteros[f]=enteros[f+1];
                    enteros[f+1]=aux;
                }
            }
        }
    }
}
