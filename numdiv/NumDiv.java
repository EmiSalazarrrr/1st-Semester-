/*
Desarrolla un programa que lea dos números enteros por teclado y determine 
si el primero de ellos es divisible por el segundo.
Mostrar en pantalla el resultado.
 */
package numdiv;

import java.util.Scanner;

public class NumDiv {

    public static void main(String[] args) {
        //Declaración de variables
        int Num1, Num2;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el primer número");
        Num1 = teclado.nextInt();
        System.out.println("Ingrese el segundo número");
        Num2 = teclado.nextInt();
        if ((Num1%Num2)==0)
            System.out.println("Los números son divisibles");
        else 
            System.out.println("Los números NO son divisibles");
    }
    
}
