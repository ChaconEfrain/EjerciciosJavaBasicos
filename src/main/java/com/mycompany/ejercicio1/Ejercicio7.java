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
public class Ejercicio7 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int suma = 0;
        int contador = 1;
        while (contador <= 100){
            System.out.println(contador);
            suma = suma + contador;
            contador++;
        } 
        System.out.println(suma);
    }
    
}
