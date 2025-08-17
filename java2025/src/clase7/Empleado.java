/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase7;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class Empleado implements Comparable<Empleado>{
    private String nombre;
    private int edad;
    private double salario;

    // Constructor, getters y setters

    public Empleado(String nombre, int edad, double salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public double getSalario() {
        return salario;
    }

   /* @Override
    public int compareTo(Empleado otro) {
        return Double.compare(this.salario, otro.salario);
    }*/
    @Override
    public int compareTo(Empleado otro){
        return this.getNombre().compareTo(otro.getNombre());
    }
    /*@Override
    public int compareTo(Empleado otro){
        return Integer.compare(this.getEdad(), otro.getEdad());
    }*/
}
