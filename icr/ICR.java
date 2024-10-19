/*
Desarrolla un programa tal que dado como dato la cantidad de
artículos a comprar, escriba "Ir a Caja Rápida" en caso de que sea 
menor a 8 artículos.
 */
package icr;

import java.util.Scanner;

public class ICR {

    public static void main(String[] args) {
        //Declaración de variables.
        int CantA;
        Scanner Leer = new Scanner (System.in);
        System.out.println("Introduzca la cantidad de artículos");
        CantA = Leer.nextInt();
        if (CantA<8)
            System.out.println("Ir a la caja rapida.");
    }
    
}
