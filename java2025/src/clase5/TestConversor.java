/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase5;

/**
 *
 * @author TRM
 */
public class TestConversor {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        double temperaturaCelsius = 25;
        double temperaturaFahrenheit = ConversorUnidades.celsiusAFahrenheit(temperaturaCelsius);
        System.out.println(temperaturaCelsius + " grados Celsius son " + temperaturaFahrenheit + " grados Fahrenheit.");

        double distanciaKilometros = 100;
        double distanciaMillas = ConversorUnidades.kilometrosAMillas(distanciaKilometros);
        System.out.println(distanciaKilometros + " kilómetros son " + distanciaMillas + " millas.");
    }
    
}
