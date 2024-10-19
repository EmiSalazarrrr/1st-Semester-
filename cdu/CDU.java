/*
Resolver un problema que reciba un número entre el 0 y 999 
y determine el número de UNIDADES, DECENAS Y CENTENAS
que tiene ese número
 */
package cdu;

import java.util.Scanner;

public class CDU {

    public static void main(String[] args) {
        // Declaración de variables
        int Num, C, D, U; //Num es un número de 3 cifras
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un número de 3 cifras (0-999)");
        Num = teclado.nextInt(); //Recibe un entero desde el teclado
                                 //y lo asigna a Num
        C = Num/100; 
        U = Num%10;
        D = Num%100/10;
        System.out.println(Num+" está compuesto por: "+
                C+" Centenas "+ D+" Decenas y "+ U+" Unidades.");
                                 
    }
    
}
