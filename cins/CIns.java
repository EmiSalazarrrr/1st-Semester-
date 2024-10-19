/*
En la escuela de artes se tiene un costo de inscripción de $1500 pesos.
A los alumnos con promedio mayor o igual a 9 se les da un descuento de 20%
 */
package cins;

import java.util.Scanner;

public class CIns {

    public static void main(String[] args) {
        //Declaración de variables
        int Promedio;
        float Descuento, CostoInscripción;
        Scanner teclado = new Scanner (System.in);
        CostoInscripción = 1500;
        System.out.println("Ingresa el promedio del alumno");
        Promedio = teclado.nextInt();
        if (Promedio>=9) 
                CostoInscripción -= CostoInscripción*0.20;
        System.out.println("El costo de la inscripción es: "+CostoInscripción);
        
    }
    
}
