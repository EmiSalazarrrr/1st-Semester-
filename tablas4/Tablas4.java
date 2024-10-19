/*
Tabla de multiplicar con ciclo for
 */
package tablas4;

import java.util.Scanner;

public class Tablas4 {

    public static void main(String[] args) {
        //Declaración de variables
        int X;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Dime la tabla que deseas");
        X = teclado.nextInt();
        for(int i=1;i<=10;i++)
            System.out.println(+X+" x "+i+"\t = "+X*i);
            
    }
    
}
