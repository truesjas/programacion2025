/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase5;

/**
 *
 * @author TRM
 */
public class ValidadorDatos {
    public static boolean esEmailValido(String email) {
        return email.contains("@") && email.contains(".");
    }

    public static boolean esContraseñaSegura(String contraseña) {
        return contraseña.length() >= 8 && contieneNumero(contraseña);
    }

    private static boolean contieneNumero(String texto) {
        for (char c : texto.toCharArray()) {
            if (Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
