/*

 */
package fswitch;

import java.util.Scanner;

public class FSwitch {

    public static void main(String[] args) {
        Scanner Leer = new Scanner(System.in);
        int NUM, V;
        double VAL;
        System.out.println("Dame el Valor de NUM");
        NUM = Leer.nextInt();
        System.out.println("Dame el Valor de V");
        V = Leer.nextInt();
        
        switch (NUM){
            case 1: VAL = 100 * V;
                break;
            case 2: VAL = Math.pow(100, V);
                break;
            case 3: VAL = 100 / V;
                break;
            default:
                VAL = 0;
      
        }
        System.out.println("El resultado es "+VAL);    
    }
    
}
