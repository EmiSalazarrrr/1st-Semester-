
package numcapicuoa;

import java.util.Scanner;

public class NumCapicuoa {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int Num, Digs[] = new int [5], i=0, x=0,y,Ban=0;
        System.out.print("Dame el número que quieres verificar ");
        Num = leer.nextInt();
        
        while (Num!=0){
            Digs[i++] = Num % 10;
            Num = Num/10;
        }
        /*
        Digs [0] = Num/10000;
        Digs [1] = (Num -(Digs[0]*10000))/1000;
        Digs [2] = (Num -(Digs[0]*10000)-(Digs[1]*1000))/100;
        Digs [3] = (Num -(Digs[0]*10000)-(Digs[1]*1000)-(Digs[2]*100))/10;
        Digs [4] = (Num -(Digs[0]*10000)-(Digs[1]*1000)-(Digs[2]*100)-(Digs[3]*10));
        */
        y=i-1;
        while(x<y){
            if (Digs[x]!=Digs[y]){
               Ban=1;
               break;
            }
            x++;
            y--;
        }       
        if (Ban==0)
            System.out.println("El número es capicua");
        else   
            System.out.println("El número NO es capicua");
        
    }
    
}
