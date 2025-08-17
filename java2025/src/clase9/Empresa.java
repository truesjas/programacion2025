/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase9;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class Empresa {
    
    private List<Persona> empleados;

    public Empresa() {
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Persona empleado) {
        empleados.add(empleado);
    }

    public void imprimirNominas() {
        for (Persona persona : empleados) {
            System.out.println("Nombre: " + persona.getNombre());
            System.out.println("Edad: " + persona.getEdad());

            if (persona instanceof EmpleadoAsalariado) {
                EmpleadoAsalariado empleadoAsalariado = (EmpleadoAsalariado) persona;
                System.out.println("Salario: $" + empleadoAsalariado.calcularSalario());
            } else if (persona instanceof EmpleadoPorHora) {
                EmpleadoPorHora empleadoHorasExtras = (EmpleadoPorHora) persona;
                System.out.println("Salario: $" + empleadoHorasExtras.calcularSalario());
            } else if (persona instanceof EmpleadoPorComision) {
                EmpleadoPorComision empleadoComision = (EmpleadoPorComision) persona;
                System.out.println("Ventas realizadas:");
                double ventasTotales = 0.0;
                for (Venta venta : empleadoComision.getVentasRealizadas()) {
                    System.out.println("- Fecha: " + venta.getFecha() + ", Cliente: " + venta.getCliente().getNombre() + ", Total: $" + venta.getTotal());
                    ventasTotales += venta.getTotal();
                }
                System.out.println("Salario: $" + empleadoComision.calcularSalario());
                System.out.println("Ventas totales: $" + ventasTotales);
            }

            System.out.println();
        }
    }    
}
