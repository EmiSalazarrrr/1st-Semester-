
package numfac;

import java.util.Scanner;

public class NumFac {

    public static void main(String[] args) {
        // Declaración de variables
        int Num,Fact;
        Scanner teclado = new Scanner (System.in);
        System.out.print("Dame el número del que quieres saber");
        Num = teclado.nextInt();
        Fact = 1;
        for (int i = Num; i>=1;i--)
            Fact = Fact * i;
        System.out.println("Tu Factorial es = "+Fact);
    }
    
}
