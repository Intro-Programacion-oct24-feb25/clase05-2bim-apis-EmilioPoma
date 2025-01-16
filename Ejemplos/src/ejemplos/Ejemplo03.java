/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplos;

import java.security.SecureRandom;
// import java.security.*;

/**
 *
 * @author reroes
 */
public class Ejemplo03 {

    public static void main(String[] args) {
        // TODO code application logic here
        int numeroElementos = 20;
        int limite = 100;
        int[] valores = obtenerValores(numeroElementos, limite);

        presentarDatos(valores);
    }

    public static int[] obtenerValores(int a, int b) {
        int[] arreglo = new int[a];
        for (int i = 0; i < arreglo.length; i++) {
            arreglo[i] = obtenerNumero(b);
        }
        return arreglo;
    }

    public static int obtenerNumero(int miLimite) {
        // objeto generador de números aleatorios
        SecureRandom numerosAleatorios = new SecureRandom();

        // Returns a pseudorandom, uniformly distributed int value 
        // between 0 (inclusive) and the specified value (exclusive)
        int valorAleatorio = numerosAleatorios.nextInt(miLimite);
        return valorAleatorio;
    }

    public static int obtenerSuma(int a, int b) {
        return a + b;
    }

    public static void presentarDatos(int[] v) {
        for (int i = 0; i < v.length; i++){
            System.out.printf("%d\n", v[i]);
        }

    }
}
