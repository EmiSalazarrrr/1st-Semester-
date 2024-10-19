
package promedio;

import java.util.Scanner;

public class Promedio {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int C = 0, Suma = 0, Prom, Calif, N;
        
        System.out.println("¿Cuantas calificaciones son?");
        N = teclado.nextInt();
        
        System.out.println("Dame las "+N+" calificaciones");
        while (C<N){
            System.out.print("= ");
            Calif = teclado.nextInt();
            Suma += Calif; //Acumular en Suma el valor de Calif
            C++;
        }
        Prom = Suma / N;
        System.out.println("El promedio es de= "+Prom);
    }
    
}
