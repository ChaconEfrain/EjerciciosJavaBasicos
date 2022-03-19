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
public class Ejercicio8 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Hacer un programa para ingresar un número entre 1 y 12 y
        //reportar el mes que le cotresponde
        String mes = null; //preguntar a Joel por "null".
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese un número entre 1 y 12:");
        int numero = Integer.parseInt(lector.next());
        switch (numero){
            case 1:
                mes = "Enero";
                break;
            case 2:
                mes = "Febrero";
                break;
            case 3:
                mes = "Marzo";
                break;
            case 4:
                mes = "Abril";
                break;
            case 5:
                mes = "Mayo";
                break;
            case 6:
                mes = "Junio";
                break;
            case 7:
                mes = "Julio";
                break;
            case 8:
                mes = "Agosto";
                break;
            case 9:
                mes = "Septiembre";
                break;
            case 10:
                mes = "Octubre";
                break;  
            case 11:
                mes = "Noviembre";
                break;
            case 12:
                mes = "Diciembre";
                break;
            default:
                System.out.println("El número ingresado es inválido.");
        }
        System.out.println("El mes correspondiente es: " + mes);
    }
    
}
