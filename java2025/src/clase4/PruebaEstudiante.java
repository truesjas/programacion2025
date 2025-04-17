/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class PruebaEstudiante {
    
    public static void main(String[] args) {
        // Creating objects (instances of the Student class)
        Estudiante student1 = new Estudiante(1001, "John Doe", 3.8);
        Estudiante student2 = new Estudiante(1002, "Jane Smith", 4.0);

        // Calling methods
        student1.printDetails();
        student2.printDetails();

        // Updating GPA
        student1.updateGPA(3.9);
        //System.out.println("Updated GPA for " + student1.getName() + ": " + student1.getGpa());
        student1.printDetails();
    }    
}
