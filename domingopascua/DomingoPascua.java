/*
Construir un programa que determine fechas de domingos de Pascua.
 */
package domingopascua;

import java.util.Scanner;

public class DomingoPascua {

    public static void main(String[] args) {
        //Declaración de variables
        int Año, A, B, C, D, E, N, N2;
        Scanner Teclado = new Scanner (System.in);
        System.out.println("Ingresa el año que deseas consultar");
        Año = Teclado.nextInt();
        A = Año % 19;
        B = Año % 4;
        C = Año % 7;
        D = (19 * A + 24) % 30;
        E = (2 * B + 4 * C + 6 * D + 5) % 7;
        N = (22 + D + E); //N será el número de día del mes de marzo o abril.
        N2 = N-31;//Puse una segunda N porque me salían 2 salidas en vez de 1
        if (N<=31)
            System.out.println("El domingo de pascua será en marzo el día "+N);
        else //Aquí se usará la variable de N2
            if (N>31)
                System.out.println("El domingo de pascua será en abril el día "+N2);
        
    }
    
    
}
