/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8.ejecutables;

import clase8.entidades.Persona;
import java.util.ArrayList;
import java.util.Arrays;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestPersonaAddAll {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Persona> arrayList = new ArrayList<>();

        // use add() method to add elements in the arrayList
        arrayList.add(new Persona("Diego",10));
        arrayList.add(new Persona("Juan",30));
        arrayList.add(new Persona("Agustin",50));
        arrayList.addAll(0, Arrays.asList(new Persona("Pedro",70), new Persona("Matias", 80)));
        System.out.println("ArrayList = " + arrayList);
    }
    
}
