
package empleados;

import java.util.Scanner;

public class Empleados {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int nE, Gen, Edad, Depto, SueldoM; //Datos de entrada
        int PromSM, cTM10K=0, sSHdepto6=0, sSMm50a=0, PorcMdepto5, PorcMm40a, sSueldos=0;
        int sSueldM =0, cM=0, cMdepto5=0, cMm40a=0;//declaración de contadores
        
        for (int i=1;i<=5;i++){
            System.out.println("Datos del trabajador "+i);
            System.out.print("Número de empleado = ");
            nE = leer.nextInt();
            System.out.print("Género [1 = hombre, 2 = mujer]= ");
            Gen = leer.nextInt();
            System.out.println("Edad = ");
            Edad = leer.nextInt();
            System.out.println("Dame el departamento del empleado= ");
            Depto = leer.nextInt();
            System.out.println("Sueldo mensual= ");
            SueldoM = leer.nextInt();
            switch (Gen){
                case 1: //hombres
                    if (Depto ==6)
                        sSHdepto6+=SueldoM;
                    break;
                case 2: //mujeres
                    sSueldM += SueldoM;
                    cM++;
                    if (Depto == 5)
                        cMdepto5++;
                    if (Edad<40)
                        cMm40a++;
                    if(Edad <50)
                        sSMm50a += SueldoM;
                    break;
                      
            }
            if (SueldoM>10000)
                cTM10K++;
            sSueldos += SueldoM; 
        }
    }
    
}
