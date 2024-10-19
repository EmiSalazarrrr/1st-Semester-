
package funciones1;

import java.util.Scanner;

public class Funciones1 {

    public static float Monto (int Watts){
        float Cobro = 0;
        for (int c=1;c<=4;c++){
           switch (c){
               case 1: 
                   if(Watts<=100){ //cobrar todos al precio correspondiente
                       Cobro += Watts * 2.5;
                       break;
                   }
                   else{
                       Cobro +=100 *2.5;
                       Watts -= 100;
                   }
                   break;
               case 2:
                    if(Watts<=200){ //cobrar todos al precio correspondiente
                       Cobro += Watts * 5.0;
                       break;
                    }
                   else{
                       Cobro +=200 *5.0;
                       Watts -= 200;
                   }
                   break;
               case 3: 
                    if(Watts<=300){ //cobrar todos al precio correspondiente
                       Cobro += Watts * 7.5;
                       break;
                    }
                   else{
                       Cobro +=300 *7.5;
                       Watts -= 300;
                   }
                   break;
               case 4:
                   Cobro += Watts * 7.0;
                   break;
           }
       } 
     
       return Cobro;
        
    }
    
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int Kwh;
        System.out.println("Cuántos Kilo watts consumiste?");
        Kwh = leer.nextInt();
        System.out.println("Para "+Kwh+" Kwh, el cobro es de= "+Monto(Kwh));
    }
    
}
