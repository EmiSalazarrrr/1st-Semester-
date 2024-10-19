/*
Hacer un programa que lea un número arabigos de dos cifras 
y lo imprima en número romano
 */
package numara;

import java.util.Scanner;

public class NumAra {

    public static void main(String[] args) {
        //Declaración de variables 
        int Num,UNum,DNum;
        String NumRD, NumRU, NumR;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el número arabigo de dos cifras");
        Num = teclado.nextInt();
        if (Num < 10 || Num>99){
                System.out.println("Tu número no es compatible");
                return;
        }
        NumRD = "";
        NumRU = "";
        UNum = Num % 10;
        DNum = Num / 10;
        switch (DNum){ //Aquí irán las decenas de cada caso
            case 1: NumRD = "X";
                break;
            case 2: NumRD = "XX";
                break;
            case 3: NumRD = "XXX";
                break;
            case 4: NumRD = "XL";
                break;
            case 5: NumRD = "L";
                break;
            case 6: NumRD = "LX";
                break;
            case 7: NumRD = "LXX";
                break;
            case 8: NumRD = "LXXX";
                break;
            case 9: NumRD = "XC";
        }
        switch(UNum){ //Aquí irán las opciones de cada posible resultado
            case 1: NumRU = "I";
                break;
            case 2: NumRU = "II";
                break;
            case 3: NumRU = "III";
                break;
            case 4: NumRU = "IV";
                break;
            case 5: NumRU = "V";
                break;
            case 6: NumRU = "VI";
                break;
            case 7: NumRU = "VII";
                break;
            case 8: NumRU = "VIII";
                break;
            case 9: NumRU= "IX";
                break;
        }
        NumR = NumRD+NumRU;
        System.out.println("Tu número romano es: "+NumR);
    }
    
}
