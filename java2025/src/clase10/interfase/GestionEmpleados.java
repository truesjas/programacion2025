package clase10.interfase;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class GestionEmpleados {

    public static void main(String[] args) {
        List<Empleado> equipo = new ArrayList<>();

        // Creamos instancias de los diferentes tipos de empleados.
        Empleado gerente = new Gerente("Ana López",
                new BigDecimal("60000.0"), new BigDecimal("10.0"));
        Empleado dev = new Developer("Pedro García",
                new BigDecimal("45000.0"), new BigDecimal("15.0"));

        equipo.add(gerente);
        equipo.add(dev);


        // El código no necesita saber si el objeto es un Gerente o un Developer,
        // solo que es un Empleado.
        System.out.println("--- Calculando salarios del equipo ---");
        for (Empleado e : equipo) {
            e.mostrarInfo();
            System.out.println("Salario Total: $" + e.calcularSalarioTotal());
            System.out.println("------------------------------------");
        }
    }
}
