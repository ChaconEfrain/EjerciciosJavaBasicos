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
public class Ejercicio6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
// Hacer un algoritmo en Pseint para una heladería se tienen 4 tipos de empleados 
	// ordenados de la siguiente forma con su número identificador y salario diario correspondiente:
	//  1	Cajero (56$/día).
	//  2  Servidor (64$/día).
	//  3  Preparador de mezclas (80$/día).
	//  4 Mantenimiento (48$/día).
	
	//El dueño de la tienda desea tener un programa donde sólo ingrese dos números enteros que representen
        //al número identificador del empleado y la cantidad 
	//de días que trabajó en la semana (6 día)
        int salario = 0;
        Scanner lector = new Scanner(System.in);
        System.out.println("Ingrese el número de empleado: ");
        char empleado = lector.next().charAt(0);
        System.out.println("Ingrese la cantidad de días trabajados: ");
        int dias = Integer.parseInt (lector.next());
        switch (empleado){
            case '1':
                salario = dias * 56;
                break;
            case '2':
                salario = dias * 64;
                break;
            case '3':
                salario = dias * 80;
                break;
            case '4':
                salario = dias * 48;
                break;
            default:
                System.out.println("El número de empleado es incorrecto");
                //Preguntar a Joel por qué no se ejecuta el default?
        }
        System.out.println("El salario correspondiente es: $" + salario);    
}
    
}
