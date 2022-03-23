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
        discriminante = Math.pow(b, 2) - (4*a*c);
        if (discriminante > 0){
            x1 = ((b*(-1)) + Math.sqrt(discriminante)) / 2*a;
            x1 = ((b*(-1)) - Math.sqrt(discriminante)) / 2*a;
            System.out.println("El valor de x1 es " +x1+ " y el valor de x2 es " +x2);
        }else{
            System.out.println("El discriminante es menor que cero.");
        }
    }
    
}
