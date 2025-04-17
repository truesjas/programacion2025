/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestCar {
    public static void main(String[] args) {
        // Creating objects
        Car car1 = new Car("Toyota", "Camry", 2018, 25000.0);
        Car car2 = new Car("Honda", "Civic", 2020, 15000.0);        

        // Calling methods
        car1.displayInfo();
        car2.displayInfo();

        // Driving the cars
        car1.drive(100.0);
        car2.drive(200.0);

        System.out.println("Updated mileage for " + car1.getMake() + " " + car1.getModel() + ": " + car1.getMileage());
        System.out.println("Updated mileage for " + car2.getMake() + " " + car2.getModel() + ": " + car2.getMileage());
        
        car1.setMake("Audi");
        car1.setModel("Q5");
        
        car1.displayInfo();
    }    
}
