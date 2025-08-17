/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8.ejecutables;

import clase8.entidades.Persona;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestPersonaIterator {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> arrayList = new ArrayList<>();

      // use add() method to add elements in the arrayList
      arrayList.add(new Persona("Diego",10));
      arrayList.add(new Persona("Juan",30));
      arrayList.add(new Persona("Agustin",50));
      
      Iterator<Persona> personaIterator = arrayList.iterator();
      System.out.println("Mostrar con While");
      while(personaIterator.hasNext()){
          System.out.println("Elemento= " + personaIterator.next());          
      }
      
      //with for
      System.out.println("Mostrar con For");
      for(Persona p: arrayList){
          System.out.println("Elemento= " + p);  
      }
      
      ListIterator<Persona> personaListIterator = arrayList.listIterator();
      //ListIterator<Persona> personaListIterator = arrayList.listIterator(arrayList.size());
      //Display the list backwards
      System.out.println("Mostrar elmentos desde el ultimo al primero");
      while(personaListIterator.hasPrevious()){
          System.out.println("Elemento= " + personaListIterator.previous());
      }
    }    
}
