/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8.ejecutables;

import clase8.entidades.Persona;
import java.util.ArrayList;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestPersonClear {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> arrayList = new ArrayList<>();

        // use add() method to add elements in the arrayList
        arrayList.add(new Persona("Diego",10));
        arrayList.add(new Persona("Juan",30));
        arrayList.add(new Persona("Agustin",50));
        
        int listSize = arrayList.size();
        System.out.println("La lista tiene "+ listSize +" elementos");
        
        arrayList.clear();
        listSize = arrayList.size();
        System.out.println("La lista tiene "+ listSize +" elementos");
    }
    
}
