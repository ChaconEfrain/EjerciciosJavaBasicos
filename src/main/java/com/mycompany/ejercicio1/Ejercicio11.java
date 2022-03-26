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
public class Ejercicio11 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Realiza una aplicación que nos calcule una ecuación de segundo grado. 
        //Debes pedir las variables a, b y c por teclado y comprobar antes que 
        //el discriminante (operación en la raíz cuadrada). Para la raíz cuadrada 
        //usa el método sqlrt de Math. Te recomiendo que uses mensajes de traza.
        
        ejecutar();
    }
    public static double calcularDiscriminante(int a, int b, int c){
        double discriminante = Math.pow(b, 2) - (4*a*c);
        return discriminante;
    }
    public static double calcular_x1(int a, int b, double discriminante){
        double x1 = ((b*(-1)) + Math.sqrt(discriminante)) / 2*a;
        return x1;
    }
    public static double calcular_x2(int a, int b, double discriminante){
        double x2 = ((b*(-1)) - Math.sqrt(discriminante)) / 2*a;
        return x2;
    }
    public static void ejecutar(){
    double discriminante = 0;
        double x1 = 0;
        double x2 = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Introduzca el valor de la variable 'a':");
        int a = Integer.parseInt(lector.next());
        System.out.println("Introduzca el valor de la variable 'b':");
        int b = Integer.parseInt(lector.next());
        System.out.println("Introduzca el valor de la variable 'c':");
        int c = Integer.parseInt(lector.next());
        discriminante = calcularDiscriminante(a, b, c);
        if (discriminante > 0){
            x1 = calcular_x1(a, b, discriminante);
            x2 = calcular_x2(a, b, discriminante);
            System.out.println("El valor de x1 es " +x1+ " y el valor de x2 es " +x2);
        }else{
            System.out.println("El discriminante es menor que cero.");
        }
    
}
}
