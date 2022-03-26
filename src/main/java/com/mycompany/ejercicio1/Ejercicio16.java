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
public class Ejercicio16 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       ejecutar();
    }
    
    public static int calcularPerimetro(int lado1, int lado2, int lado3, int lado4){
        int perimetro = lado1 + lado2 + lado3 + lado4;
        return perimetro;
    }
    
    public static void ejecutar(){
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese la medida del lado 1: ");
        int lado1 = lector.nextInt();
        System.out.println("Ingrese la medida del lado 2: ");
        int lado2 = lector.nextInt();
        System.out.println("Ingrese la medida del lado 3: ");
        int lado3 = lector.nextInt();
        System.out.println("Ingrese la medida del lado 4: ");
        int lado4 = lector.nextInt();
        int perimetro = calcularPerimetro(lado1, lado2, lado3, lado4);
        System.out.println("El perímetro es " + perimetro);
    }
}
