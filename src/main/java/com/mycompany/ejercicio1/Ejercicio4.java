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
public class Ejercicio4 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Lee un número por teclado que pida el precio de un producto
        //(puede tener decimales) y calcule el precio final con IVA. 
        //El IVA sera una constante que sera del 21%
        
        //Estructura de las constantes: Final + Tipo de dato + Nombre de la constante (Mayúscula) = Valor de la constante;
        
        ejecutar();
    }
    public static double precio_final(double precio_producto, double IVA){
        double precio_final = precio_producto + (precio_producto * IVA);
        return precio_final;
    }
    public static void ejecutar(){
        final double IVA = 0.21;
        Scanner lector = new Scanner (System.in);
        System.out.println("Ingresa el nombre del producto");
        String producto = lector.next(); 
        System.out.println("Ingrese el valor del producto");
        //double precioProducto = lector.nextDouble();
        double precioProducto = Double.parseDouble (lector.next());
        double precioFinal = precio_final(precioProducto, IVA);
        System.out.println("El precio de "+producto+" es " + precioFinal);
}
}
