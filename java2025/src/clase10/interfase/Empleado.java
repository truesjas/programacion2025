package clase10.interfase;

import java.math.BigDecimal;

public abstract class Empleado {

    protected String nombre;
    protected BigDecimal salarioBase;

    public Empleado(String nombre, BigDecimal salarioBase) {
        this.nombre = nombre;
        this.salarioBase = salarioBase;
    }

    // Método concreto: implementado una vez y heredado por todas las subclases.
    public void mostrarInfo() {
        System.out.println("Nombre: " + this.nombre + ", Salario Base: $" + this.salarioBase);
    }

    // Método abstracto: obliga a las subclases a implementar su propia lógica de cálculo de pago.
    public abstract BigDecimal calcularSalarioTotal();
}
