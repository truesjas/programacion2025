package clase10.interfase;

import java.math.BigDecimal;

public class Gerente extends Empleado implements ElegibleParaBono{
    private BigDecimal bonoPorcentaje;

    public Gerente(String nombre, BigDecimal salarioBase, BigDecimal bonoPorcentaje) {
        super(nombre, salarioBase);
        this.bonoPorcentaje = bonoPorcentaje;
    }

    @Override
    public BigDecimal calcularSalarioTotal() {
        return this.salarioBase.add(calcularBono());
    }

    @Override
    public BigDecimal calcularBono() {
        return this.salarioBase.
                multiply(this.bonoPorcentaje.divide(new BigDecimal(100)));
    }
}
