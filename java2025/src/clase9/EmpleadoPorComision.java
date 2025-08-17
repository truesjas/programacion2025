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
public class EmpleadoPorComision extends Persona{
    
    private double salarioBase;
    private double comisionPorcentaje;
    private List<Venta> ventasRealizadas;

    public EmpleadoPorComision(String nombre, int edad, double salarioBase, double comisionPorcentaje) {
        super(nombre, edad);
        this.salarioBase = salarioBase;
        this.comisionPorcentaje = comisionPorcentaje;
        this.ventasRealizadas = new ArrayList<>();
    }

    public void realizarVenta(Venta venta) {
        ventasRealizadas.add(venta);
    }

    public double calcularSalario() {
        double ventasTotales = 0.0;
        for (Venta venta : ventasRealizadas) {
            ventasTotales += venta.getTotal();
        }
        return salarioBase + (comisionPorcentaje * ventasTotales);
    }

    public double getSalarioBase() {
        return salarioBase;
    }

    public double getComisionPorcentaje() {
        return comisionPorcentaje;
    }

    public List<Venta> getVentasRealizadas() {
        return ventasRealizadas;
    }
    
    
    
}
