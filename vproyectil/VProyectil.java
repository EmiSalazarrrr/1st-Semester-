/*
Resolver un problema que calcule la velocidad de un proyectil 
que recorre 3km en 5 minutox.
El resultado tiene que ir en minutos / segundos 
recordar que velocidad = espacipo / tiempo 
 */
package vproyectil;

import java.util.Scanner;

public class VProyectil {

    public static void main(String[] args) {
        // Declaración de variables
        float K,V; //Kilometros = K y Velocidad = V
        int min,mt,s; //min = minutos, mt  metros y s = segundos 
        Scanner teclado = new Scanner (System.in);  
        System.out.println("Ingrese los kilometros que recorrió el proyectil");
        K = teclado.nextFloat();
        System.out.println("Ingrese el tiempo que duró el proyectil en el aire");
        min = teclado.nextInt();
        mt = (int)K*100; //int va a declarar que me va a dar un valor entero
        s = min*60;
        V = mt/s;
        System.out.println("La velocidad del proyectil es de "+V+ 
                " m/s");
        
        
    }
    
}
