/*
Construir un programa que indique si un número introducido por teclado
es positivo, igual a cero o negativo.
 */
package posneg;

import java.util.Scanner;

public class PosNeg {

    public static void main(String[] args) {
        //Declaración de variables
        int Num;
        Scanner Teclado = new Scanner (System.in);
        System.out.println("Ingresa el número que quieres verificar");
        Num = Teclado.nextInt();
        if (Num>0)
            System.out.println("El número es positivo");
        else 
            if (Num==0)
            System.out.println("El valor es 0");
            else
                System.out.println("El número es negativo");
    }
    
}
