/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.ejercicio1;

/**
 *
 * @author Dell
 */
public class Ejercicio10 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
     // Muestra los números del 1 al 100 (ambos incluidos) divisibles entre 2 y 3
        for (int i = 1; i <= 100; i++){
            if (i % 2 == 0 && i % 3 == 0){
                System.out.println(i);
            }
        }
    }     
}
