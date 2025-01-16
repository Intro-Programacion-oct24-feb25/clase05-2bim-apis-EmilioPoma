/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package paquete03;

import org.apache.commons.lang3.math.NumberUtils;
/**
 *
 * @author utpl
 */
public class ejemplo03 {
    public static void main(String[] args) {
        String[] dataInicial = {"100", "90", "1n", "10", "H1", "H2"};
        int[] dataFinal = obtenerDataFinal (dataInicial);
        for (int i = 0; i < dataFinal.length; i++){
            System.out.printf("%d\n", dataFinal[i]);
        }
        
    }

    public static int[] obtenerDataFinal(String[] a){
        int [] data = new int[6];
        for (int i = 0; i < a.length; i++){
            data[i] = NumberUtils.toInt(a[i]);
    }
        return data;
    }
}
