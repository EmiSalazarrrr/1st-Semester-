
package multiplos;

import java.util.Scanner;

public class Multiplos {
    
    public static boolean EsMultiplo(int Num1, int Num2){
        if (Num1 % Num2 == 0)
            return true;
        return false;
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int A, B;
        System.out.println("Dasme dos valores enteros: ");
        A = leer.nextInt();
        B = leer.nextInt();
        if ( EsMultiplo(A,B) || EsMultiplo (B,A))
            System.out.println("Uno de los números es múltiplo del otro");
        else 
            System.out.println("Ningúno es múltiplo del otro");
    }
    
}
