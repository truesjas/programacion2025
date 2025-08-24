package clase10.interfase;

import java.math.BigDecimal;

public class Developer extends Empleado implements Adicionable{
    private BigDecimal horasExtra;

    public Developer(String nombre, BigDecimal salarioBase, BigDecimal horasExtra) {
        super(nombre, salarioBase);
        this.horasExtra = horasExtra;
    }

    @Override
    public BigDecimal calcularSalarioTotal() {
        return this.salarioBase.add(calcularAdicional());
    }

    @Override
    public BigDecimal calcularAdicional() {
        return this.horasExtra.multiply(new BigDecimal(50));
    }
}
