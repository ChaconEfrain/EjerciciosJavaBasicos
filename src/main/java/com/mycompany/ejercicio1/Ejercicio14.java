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
public class Ejercicio14 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        String nombre = "";
        Scanner lector = new Scanner(System.in);
        while (!nombre.equals("Juan")){
            System.out.println("Ingrese su nombre: ");
            nombre = lector.next();
        }
    }
    
}
