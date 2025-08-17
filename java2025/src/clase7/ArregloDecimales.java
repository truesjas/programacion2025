/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.Scanner;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class ArregloDecimales {
    private Scanner teclado;
    private double[] decimales;
    
    public void cargar()
    {
        teclado=new Scanner(System.in);
        decimales=new double[5];
        for(int i=0;i<5;i++) {
            System.out.print("Ingrese el Decimal "+"["+ i +"]:");
            decimales[i]=teclado.nextInt();
        }	
    }
    
    public void imprimir() {
        for(int i=0;i<5;i++) {
            System.out.println("El elemento "+"["+ i +"] es:"+this.decimales[i]);
        }
    }    
}
