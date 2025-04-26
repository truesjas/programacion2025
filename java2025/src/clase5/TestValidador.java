/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

/**
 *
 * @author TRM
 */
public class TestValidador {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String email1 = "usuario@dominio.com";
        String email2 = "usuario.dominio";
        System.out.println(email1 + " es un email válido: " + ValidadorDatos.esEmailValido(email1));
        System.out.println(email2 + " es un email válido: " + ValidadorDatos.esEmailValido(email2));

        String contraseña1 = "miclave123";
        String contraseña2 = "clave";
        System.out.println(contraseña1 + " es una contraseña segura: " + ValidadorDatos.esContraseñaSegura(contraseña1));
        System.out.println(contraseña2 + " es una contraseña segura: " + ValidadorDatos.esContraseñaSegura(contraseña2));
    }    
}
