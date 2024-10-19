/*
Encontrar el Máximo Común Divisor con el algoritmo de Euclides
 */
package mcd;

import java.util.Scanner;

public class MCD {

    public static void main(String[] args) {
        // Declaración de variables
        int A, B, Q1,R1,Q2,R2=0,R3;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese los dos números: ");
        A = teclado.nextInt();
        B = teclado.nextInt();
        if (B>A){
            System.out.println("El segundo número debe ser menor que el primero");
            return;
        }
        Q1 = A/B;
        R1 = A % B;
        if (R1!=0){
            do {
               
                Q2 = B/R1;
                R2 = B % R1;
                R3=B = R1;
                R1 = R2;
            }while (R2!=0);
            if (R2==0);
            System.out.println("Tu MCD es "+R3);
        }
        else
            System.out.println("Tu MCD es "+R1);
    }
    
}
