/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class ListaSimple {
    public static void main(String[] args)
  {
    ArrayList<String> lista = new ArrayList<String>();
    lista.add("RE00999"); 
    lista.add("RE00998"); 
    lista.add("REA1001");
    lista.add("REA1000");
    Collections.sort(lista);
    Collections.sort(lista, Collections.reverseOrder());
    System.out.println(lista);
    for (String datos: lista) {
        System.out.println(datos);
    }
  }    
}
