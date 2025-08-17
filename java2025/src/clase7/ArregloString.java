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
public class ArregloString {
    private Scanner teclado;
    private String[] nombres;
    
    public void cargar()
    {
        teclado=new Scanner(System.in);
        nombres=new String[5];
        for(int i=0;i<5;i++) {
            System.out.print("Ingrese el Nombre "+"["+ i +"]:");
            nombres[i]=teclado.nextLine();
        }	
    }
    
    public void imprimir() {
        for(int i=0;i<5;i++) {
            System.out.println("El elemento "+"["+ i +"] es:"+this.nombres[i]);
        }
    }
    
    public void ordenar(){
        Arrays.sort(nombres);
    }
    
    public void ordenarSeleccion() {
        for(int k=0;k<4;k++) {
            for(int f=0;f<4-k;f++) {
                if (nombres[f].compareTo(nombres[f+1]) >0) {
                    String aux;
                    aux=nombres[f];
                    nombres[f]=nombres[f+1];
                    nombres[f+1]=aux;
                }
            }
        }
    }
    
}
