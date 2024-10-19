/*
Desarrolla un programa que acepte el precio de 4 artículos
y realice la suma, si la suma es mayor a 1500 imprimir 
"El precoo está fueraa del presupuesto" en caso contrario
"El precio está dentro del presupuesto.
*/
package pkg4arti;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Declaración de variables.
        float Precio1, Precio2, Precio3, Precio4, SumaP;
        Scanner Teclado = new Scanner (System.in);
        System.out.println("Ingrese la cantidad del primer producto");
        Precio1 = Teclado.nextFloat();
        System.out.println("Ingrese la cantidad del segundo producto");
        Precio2 = Teclado.nextFloat();
        System.out.println("Ingrese la cantidad del tercer producto");
        Precio3 = Teclado.nextFloat();
        System.out.println("Ingrese la cantidad del cuarto producto");
        Precio4 = Teclado.nextFloat();
        SumaP = Precio1+Precio2+Precio3+Precio4;
        if (SumaP>1500)
            System.out.println("El precio está dentro de tu presupuesto");
        else
            System.out.println("El precio está fuera de tu presupuesto");
    }
    
}
