/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package clase8;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author TRM
 */
public class AdivinarPalabra {    

    private static ArrayList<String> palabras = new ArrayList<>(); // Lista de palabras a adivinar
    private static String palabraSecreta; // Palabra que el jugador debe adivinar
    private static char[] palabraOculta; // Palabra oculta, con guiones bajos
    private static int intentosRestantes; // Número de intentos restantes

    private static final int MAX_INTENTOS = 6; // Número máximo de intentos

    public static void main(String[] args) {
        inicializarPalabras(); // Inicializa la lista de palabras
        jugar(); // Llama al método para iniciar el juego
    }

    /**
     * Inicializa la lista de palabras a adivinar.
     */
    private static void inicializarPalabras() {
        palabras.add("programacion");
        palabras.add("computadora");
        palabras.add("java");
        palabras.add("desarrollo");
        palabras.add("algoritmo");
        palabras.add("inteligencia");
        palabras.add("artificial");
        palabras.add("tecnologia");
        palabras.add("universidad");
        palabras.add("ingenieria");
    }

    /**
     * Selecciona una palabra aleatoria de la lista.
     */
    private static void seleccionarPalabra() {
        Random random = new Random();
        int indice = random.nextInt(palabras.size()); // Genera un índice aleatorio dentro del rango de la lista
        palabraSecreta = palabras.get(indice); // Obtiene la palabra de la lista usando el índice aleatorio
        palabraOculta = new char[palabraSecreta.length()]; // Crea un array de caracteres del tamaño de la palabra
        for (int i = 0; i < palabraOculta.length; i++) {
            palabraOculta[i] = '_'; // Inicializa la palabra oculta con guiones bajos
        }
        intentosRestantes = MAX_INTENTOS; // Establece el número de intentos restantes
    }

    /**
     * Muestra la palabra oculta al jugador.
     */
    private static void mostrarPalabraOculta() {
        System.out.print("Palabra oculta: ");
        for (char letra : palabraOculta) {
            System.out.print(letra + " "); // Imprime cada letra o guion bajo separado por un espacio
        }
        System.out.println();
    }

    /**
     * Obtiene una letra ingresada por el jugador.
     * @return la letra ingresada por el jugador en minúscula.
     */
    private static char obtenerLetra() {
        Scanner scanner = new Scanner(System.in);
        String input;
        do {
            System.out.print("Ingrese una letra: ");
            input = scanner.nextLine().toLowerCase(); // Lee la entrada del usuario, la convierte a minúsculas
        } while (input.length() != 1 || !Character.isLetter(input.charAt(0))); // Valida que la entrada sea una sola letra
        return input.charAt(0); // Devuelve el primer carácter de la entrada
    }

    /**
     * Verifica si la letra ingresada por el jugador está en la palabra secreta.
     * @param letra la letra ingresada por el jugador.
     * @return true si la letra está en la palabra, false de lo contrario.
     */
    private static boolean verificarLetra(char letra) {
        boolean encontrada = false;
        for (int i = 0; i < palabraSecreta.length(); i++) {
            if (palabraSecreta.charAt(i) == letra) { // Compara la letra con cada carácter de la palabra secreta
                encontrada = true;
                palabraOculta[i] = letra; // Actualiza la palabra oculta con la letra encontrada
            }
        }
        return encontrada;
    }

    /**
     * Muestra el resultado del juego.
     */
    private static void mostrarResultado() {
        if (intentosRestantes == 0) {
            System.out.println("¡Perdiste! La palabra era: " + palabraSecreta);
        } else {
            System.out.println("¡Ganaste! Adivinaste la palabra: " + palabraSecreta);
        }
    }

    /**
     * Método principal que controla el flujo del juego.
     */
    public static void jugar() {
        seleccionarPalabra(); // Selecciona la palabra a adivinar
        Scanner scanner = new Scanner(System.in);

        while (intentosRestantes > 0) { // El juego continúa mientras queden intentos
            mostrarPalabraOculta(); // Muestra la palabra oculta
            System.out.println("Intentos restantes: " + intentosRestantes); // Muestra los intentos restantes
            char letra = obtenerLetra(); // Obtiene una letra del jugador

            if (!verificarLetra(letra)) { // Si la letra no está en la palabra
                intentosRestantes--; // Decrementa los intentos restantes
                System.out.println("Letra incorrecta.");
            } else {
                System.out.println("Letra correcta.");
            }

            if (String.valueOf(palabraOculta).equals(palabraSecreta)) { // Si la palabra oculta es igual a la palabra secreta
                break; // El jugador adivinó la palabra, termina el ciclo
            }
        }
        mostrarResultado(); // Muestra el resultado final del juego
        scanner.close();
    }    
}
