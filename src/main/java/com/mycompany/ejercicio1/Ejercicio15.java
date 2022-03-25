/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

import java.util.Scanner;

/**
 *
 * @author Dell
 */
public class Ejercicio15 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // perdirle numeros al usuario y si escribe un numero mayor a 1000 acabar el programa
        int numero = 0;
        Scanner lector = new Scanner(System.in);
        while (numero <= 1000){
            System.out.println("Ingrese un número: ");
            numero = lector.nextInt();
        }
    }
    
}
