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
public class Ejercicio12 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //pregutarle al usario si quiere continuar con el proceso con un bool data type
        Scanner lector = new Scanner(System.in);
        boolean continuar = true;
        while (continuar == true){
            double total = 0;
        System.out.println("Ingrese el primer número: ");
        double numero1 = Double.parseDouble (lector.next());
        System.out.println("Ingrese el segundo número: ");
        double numero2 = Double.parseDouble (lector.next());
        System.out.println("¿Qué operación quieres realizar? (+,-,*,/)");
        //Hola
        char operacion = lector.next().charAt(0);
        switch (operacion){
            case '+':
                total = numero1 + numero2;
                break;
            case '-':
                total = numero1 - numero2;
                break;
            case '*':
                total = numero1 * numero2;
                break;
            case '/':
                total = numero1 / numero2;
                break;
            default:
                System.out.println("El operador no es válido");
        }
        System.out.println("El resultado de la operación es: " + total);
        System.out.println("Desea continuar? escriba true o false: ");
            continuar = lector.nextBoolean();
    }
            
        }
    }
    

