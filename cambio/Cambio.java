/*
Hacer un programa que lea un número que representa 
la cantidad que se debe dar de cambio
por una compra e imprima el mínimo número de billetes y 
monedas que de debe dar de cambio. 
Las denominaciones son 200, 100, 50, 20, 10, 5, 1
 */
package cambio;

import java.util.Scanner;

public class Cambio {

    public static void main(String[] args) {
        //Declaración de variables
        int Precio, CantidadCambio,resto;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Introduce la cantidad de cambio ");
        Precio = teclado.nextInt();
        int billetesDe200 = Precio / 200;
        resto = Precio % 200;
        int billetesDe100 = resto / 100;
        resto = resto % 100;
        int billetesDe50 = resto / 50;
        resto = resto % 50;
        int billetesDe20 = resto / 20;
        resto = resto % 20;
        int monedasDe10 = resto / 10;
        resto = resto % 10;
        int monedasDe5 = resto / 5;
        int monedasDe1 = resto % 5;
        System.out.println("Cambio mínimo:");
        System.out.println("Billetes de 200: " + billetesDe200);
        System.out.println("Billetes de 100: " + billetesDe100);
        System.out.println("Billetes de 50: " + billetesDe50);
        System.out.println("Billetes de 20: " + billetesDe20);
        System.out.println("Monedas de 10: " + monedasDe10);
        System.out.println("Monedas de 5: " + monedasDe5);
        System.out.println("Monedas de 1: " + monedasDe1);
    }
}

            
        
    
    

