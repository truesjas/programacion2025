/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase4;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class Estudiante {
    // Attributes
    private int id;
    private String name;
    private double gpa;

    // Constructor
    public Estudiante(int id, String name, double gpa) {    
        this.id = id;
        this.name = name;
        this.gpa = gpa;
    }

//    public Estudiante(int id, String name, double gpa) {
//        this.id = id;
//        this.name = name;
//        this.gpa = gpa;
//    }
    // Methods
    public void printDetails() {
        System.out.println("ID: " + id + ", Name: " + name + ", GPA: " + gpa);
    }

    public void updateGPA(double newGPA) {
        this.gpa = this.gpa + newGPA;
        System.out.println("Updated GPA for " + this.name + ": " + this.gpa);
    }

    // Getters and Setters
//    public int getId() {
//        return id;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public double getGPA() {
//        return gpa;
//    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}