
package intervalos;

import java.util.Scanner;

public class Intervalos {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        int Num, LI, LS, CNFI = 0 , SNI = 0;
        boolean Ban = false;
        
        //obtener los límites del intervalo
        do{
            System.out.println("Dame los intervalos. LS <= LS");
            System.out.print("Limite inferior = ");
            LI = teclado.nextInt();
            System.out.print("Limite Superior = ");
            LS = teclado.nextInt();
        } while (LI>LS); //Fin del primer ciclo do-while
        do{
            System.out.print("Dame un número entero ");
            Num = teclado.nextInt();
            if (Num >= LI && Num <= LS){//Dentro del límite
                SNI += Num; //Aquí ya se acumula
                if (Num == LI || Num == LS)
                    Ban = true;
            }
            else 
                CNFI++;
        }while (Num != 0);
    }
   
}
