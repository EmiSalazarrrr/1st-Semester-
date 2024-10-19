/*
Pedir el nombre del cliente y al final desplegarlo 
junto con el monto de su cuenta
 */
package nbc;

import java.util.Scanner;

public class NBC {

    public static void main(String[] args) {
        // Declaración de variables
        Scanner teclado = new Scanner (System.in);
        teclado.useDelimiter("\n");
        float MCompra, D, MCompra2=0;
        int CBolita;
        String Nombre;
        System.out.println("Dame tu nombre");
        Nombre = teclado.next();
        System.out.println("Dame el monto de tu compra");
        MCompra = teclado.nextInt();
        System.out.println("El color de bolita roja es = 1, el de la amarilla = 2"
                + "y el de la bolita blanca es = 3. Dame el número que te tocó");
        CBolita = teclado.nextInt();
        if (CBolita<0||CBolita>3){
            System.out.println("Este número no es valido, por favor ingresa uno"
                    + " que sea valido");
        }
        switch (CBolita){
            case 1:
                D=(float) (MCompra*.40);
                MCompra2 = MCompra - D;
                break;
            case 2: 
                D=(float) (MCompra*.25);
                MCompra2 = MCompra - D;
                break;
            case 3: 
                MCompra2 = MCompra;
        }
        System.out.println("Su nombre es "+Nombre+" y su total a pagar es "+MCompra2);


        
    }
    
}
