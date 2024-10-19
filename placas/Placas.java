/*

 */
package placas;

import java.util.Scanner;

public class Placas {

    public static void main(String[] args) {
        //Declaración de variables
        int Dígito;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingresa el último dígito de la placa");
        Dígito = teclado.nextInt();
        if (Dígito>=10||Dígito<0){
            System.out.println("Este dígito no es aceptado");
                    return;
        }
        switch (Dígito){
            case 0:
            case 9:
                System.out.println("Azul");
                break;
            case 1:
            case 2:
                System.out.println("Amarillo");
                break;
            case 3:
            case 4:
                System.out.println("Rosa");
                break;
            case 5:
            case 6: 
                System.out.println("Roja");
                break;
            case 7:
            case 8:
                System.out.println("Verde");
                break;
        }
    }
    
}
