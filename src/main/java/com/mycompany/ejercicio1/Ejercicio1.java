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
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declara dos variables numéricas (con el valor que desees), muestra por consola la suma, 
        //resta, multiplicación, división y módulo (resto de la división).
        //Estructura para declarar una variable: tipo de dato + nombre de la variable = valor por defecto;
        //Tipos de datos: int, string, boolean, double, char;
        int numero1 = 5;
        int numero2 = 10;
        int totalSuma = 0;
        int totalResta = 0;
        int totalMultiplicacion = 0;
        int totalDivision = 0;
        int totalResiduo = 0;
        //Operadores aritméticos: +, -, *, /, %
        totalSuma = numero1 + numero2;
        totalResta = numero1 - numero2;
        totalMultiplicacion = numero1 * numero2;
        totalDivision = numero1 / numero2;
        totalResiduo = numero2 % numero1;
        System.out.println("La suma es: " + totalSuma);
        System.out.println("La resta es: " + totalResta);
        System.out.println("La multiplicacion es: " + totalMultiplicacion);
        System.out.println("La division es: " + totalDivision);
        System.out.println("El residuo es: " + totalResiduo);
    }
    
}
