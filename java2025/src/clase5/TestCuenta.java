/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class TestCuenta {
    
    public static void main(String[] args){  
        Cuenta cuentaTest=new Cuenta();  
        //cuentaTest.inicializarValores(832345,"Juan Perez",1000);  
        //cuentaTest.setNroCuenta(832345);
        cuentaTest.inicializarValores(2345);
        cuentaTest.setNombre("Juan Perez");
        cuentaTest.setSaldo(1000.0f);
        cuentaTest.mostrarCuenta();
        cuentaTest.visualizarSaldo();
        cuentaTest.depositar(40000);  
        cuentaTest.visualizarSaldo();
        cuentaTest.extraccion(15000);  
        cuentaTest.visualizarSaldo();
    }   
}
