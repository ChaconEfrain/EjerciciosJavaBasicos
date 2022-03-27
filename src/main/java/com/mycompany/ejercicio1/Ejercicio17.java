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
public class Ejercicio17 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Secuencia de Fibonacci (cada número consecuente es la suma de los dos anteriores)
        int suma = 1, serie = 10, numero1 = 0, numero2 = 1 ;
        for(int i = 1; i <= serie; i++){
            System.out.println(suma);
            suma = numero1 + numero2;
            numero1 = numero2;
            numero2 = suma;
        } 
    }
}    
