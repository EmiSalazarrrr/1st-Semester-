/*
Desarrolle un programa que le dé un número real del teclado 
y determine si pertenece al intervalo (0,10)
indicando el resultado en la pantalla
 */
package numint;

import java.util.Scanner;

public class NumInt {

    public static void main(String[] args) {
        //Decalaración de variable 
        float NumR;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el número real que quiera comprobar");
        NumR = teclado.nextFloat();
        if ((NumR>=0)&&(NumR<=10))
            System.out.println("El número está dentro de los intervalos");
        else 
            System.out.println("El número NO está dentro de los intervalos");
        
    }
    
}
