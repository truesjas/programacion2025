/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8.ejecutables;

import clase8.entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestPersonaArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // create an empty arrayList
      ArrayList<Persona> arrayList = new ArrayList<>();

      // use add() method to add elements in the arrayList
      arrayList.add(new Persona("Diego",10));
      arrayList.add(new Persona("Juan",30));
      arrayList.add(new Persona("Agustin",50));

      Iterator<Persona> iterator = arrayList.iterator();
      iterator.forEachRemaining(i -> System.out.println(i));
    }
    
}
