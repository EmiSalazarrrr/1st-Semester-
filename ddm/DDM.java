/*
Hacer un programa que lea el número del mes del año 
e imprima la cantidad de días que tiene ese mes
 */
package ddm;

import java.util.Scanner;

public class DDM {

    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        //Declaración de variables 
        int NMes;
        
        //Leer NMes
        System.out.print("Dame el número del mes ");
        NMes = teclado.nextInt();
        
        //Condición multiple para determinar el número del día de NMes
        switch (NMes){
            case 1:
            case 3:
            case 5: 
            case 7: 
            case 8:
            case 10:
            case 12:
                System.out.println("31 días");
                break;
            case 4:
            case 6: 
            case 9:
            case 11:
                System.out.println("30 días");
                break;
            case 2:
                System.out.print("Dame el año para saber si es viciesto ");
                int Ao = teclado.nextInt();
                if (Ao % 4 == 0)
                    System.out.println("29 días");
                else 
                    System.out.println("28 días");
                break;
            default:
                System.out.println("Número de mes fuera de rango");
        }
    }
    
}
