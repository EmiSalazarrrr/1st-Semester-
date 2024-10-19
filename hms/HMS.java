/*
Dado una cantidad de X de segundos, calcular el número
de Horas, Minutos y Segudos. 
 */
package hms;

import java.util.Scanner;

public class HMS {

    public static void main(String[] args       ) {
        //Declaración de variables.
        int Segundos, Hr, Min, Seg;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa la cantidad total de segundos");
        Segundos = teclado.nextInt(); //Aquí recibirá la cantidad 
                                      //de segundos en enteros.
        Hr = Segundos/3600;
        Seg = Segundos % 60;
        Min = (Segundos/60)-(Hr*60);
        System.out.println("La cantidad de horas son "+Hr+" horas con "+Min
                +"minutos y "+Seg+" segundos.");
        
    }
    
}
