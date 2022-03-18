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
public class Ejercicio2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee un número por teclado e indica si es divisible entre 2 (resto = 0).
        //Si no lo es, también debemos indicarlo
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número");
        int numero = Integer.parseInt(lector.next());
        //int i=Integer.parseInt("200");
        if (numero % 2 == 0){
            System.out.println("El "+numero+" es divisible entre dos.");
        }else{
            System.out.println("El "+numero+" no es divisible entre dos.");
        }
    }
    
}
