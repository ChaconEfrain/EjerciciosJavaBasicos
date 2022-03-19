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
public class Ejercicio9 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Escribir un programa que nos solicite un número positivo y nos muestre
        //desde 1 hasta el número ingresado de uno en uno.
        int contador = 1;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número positivo: ");
        int numero = Integer.parseInt(lector.next());
        System.out.println("La secuencia es:");
        while (contador <= numero){
            System.out.println(contador);
            contador++;
        }
    }
    
}
