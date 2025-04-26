/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author Tulio Ruesjas Martin
 */
public class Cuenta {
    
    private int nroCuenta;  
    private String nombre;  
    private float saldo;

    public int getNroCuenta() {
        return nroCuenta;
    }

    public void setNroCuenta(int nroCuenta) {
        this.nroCuenta = nroCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }    

    public void inicializarValores(int nroCuenta,String nombre,float saldo){  
        this.nroCuenta= nroCuenta;  
        this.nombre = nombre;  
        this.saldo = saldo;        
    } 
    
   public void inicializarValores(int nroCuenta){
       this.nroCuenta = nroCuenta;
   }

    void depositar(float importeDeposito){  
        saldo = saldo+importeDeposito;  
        System.out.println("$"+importeDeposito+" depositados");  
    }  

    void extraccion(float importeExtraccion){  
        if(saldo<importeExtraccion){  
            System.out.println("Saldo Insuficiente");  
        }else{  
            saldo=saldo-importeExtraccion;  
            System.out.println("$"+importeExtraccion+" extraidos");  
        }  
    }
    
    void visualizarSaldo(){
        System.out.println("El saldo es: $"+saldo);
    }  

    void mostrarCuenta(){
        System.out.println(nroCuenta+" "+nombre+" "+saldo);
    }    
}
