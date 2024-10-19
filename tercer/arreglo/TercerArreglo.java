
package tercer.arreglo;

import java.util.Scanner;

public class TercerArreglo {

    public static void main(String[] args) {
        // Hola
        Scanner leer = new Scanner (System.in);
        int Num,i=0,b=0, Par[] = new int [20], Inpar[] = new int[20];
        for(int e=0;e<20;e++){
           System.out.println("Dame un número");
           Num = leer.nextInt();
           if ((Num%2)==0){
               Par[i]=Num;
               i++;
           }
           else{
             Inpar[b]=Num;
             b++;
           }
        }
        System.out.println("Pares: ");
        for(int o=0;o<i;o++){
            System.out.print(Par[o]+"\t");
        }
        System.out.println("\n\nImpares");
        for(int a=0;a<b;a++){
            System.out.print(Inpar[a]+"\t");
        }
    }
    
}
