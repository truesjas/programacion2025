/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase9;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class SistemaGestion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Empresa empresa = new Empresa();

        // Crear empleados
        EmpleadoAsalariado empleadoAsalariado = new EmpleadoAsalariado("Juan Pérez", 30, 3000.0);
        EmpleadoPorHora empleadoHorasExtras = new EmpleadoPorHora("María García", 25, 15.0, 160);

        // Crear empleado por comisión, clientes y ventas
        EmpleadoPorComision empleadoComision = new EmpleadoPorComision("Carlos Rodríguez", 35, 2000.0, 0.05);
        Cliente cliente1 = new Cliente("Cliente A");
        Cliente cliente2 = new Cliente("Cliente B");
        Cliente cliente3 = new Cliente("Cliente C");
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
        try{
            Date fechaVta1 = formatoFecha.parse("15/04/2024");
            Date fechaVta2 = formatoFecha.parse("01/05/2024");
            Date fechaVta3 = formatoFecha.parse("20/05/2024");
            Venta venta1 = new Venta(fechaVta1, 10000.0, cliente1);
            Venta venta2 = new Venta(fechaVta2, 15000.0, cliente2);
            Venta venta3 = new Venta(fechaVta3, 25000.0, cliente3);
            empleadoComision.realizarVenta(venta1);
            empleadoComision.realizarVenta(venta2);
            empleadoComision.realizarVenta(venta3);
        }catch(ParseException e){
            e.printStackTrace();
        }       

        // Agregar empleados a la empresa
        empresa.agregarEmpleado(empleadoAsalariado);
        empresa.agregarEmpleado(empleadoHorasExtras);
        empresa.agregarEmpleado(empleadoComision);

        // Imprimir nóminas
        empresa.imprimirNominas();
    
    }    
}
