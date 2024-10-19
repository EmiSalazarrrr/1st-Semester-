/*
Un vendedor recibe un sueldo base más 10% por comisiones por ventas. 
El vendedor desea saber cuanto dinero obtendrá por concepto de comisiones por 
las tres eventas que realizó en el mes tomando en cuenta su sueldo base 
y sus comisiones.
 */
package sueldob;

import java.util.Scanner;

public class SueldoB {

    public static void main(String[] args) {
        // Declaración de variables
        int Sueldob,Venta1,Venta2,Venta3,Comi1,Comi2,Comi3,Comit,Sueldot;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese su sueldo base");
        Sueldob = teclado.nextInt();
        System.out.println("Ingresa el precio de su primer venta");
        Venta1 = teclado.nextInt();
        System.out.println("Ingresa el precio de su segunda venta");
        Venta2 = teclado.nextInt();
        System.out.println("Ingresa el precio de su tercer venta");
        Venta3 = teclado.nextInt();
        Comi1 = Venta1*10/100;
        Comi2 = Venta2*10/100;
        Comi3 = Venta3*10/100;
        Comit = Comi1+Comi2+Comi3;
        Sueldot = Sueldob+Comit;
        System.out.println("Tu sueldo total será de: "+Sueldot);
        
    }
    
}
