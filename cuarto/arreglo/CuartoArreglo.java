
package cuarto.arreglo;

import java.util.Scanner;

public class CuartoArreglo {

    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        int AlumA=0,Prom = 0,Prom2, AlumR=0,Calif[] =new int [10];
        
        for (int i=0;i<10;i++){
            System.out.print("Dame una calificación ");
            Calif[i]=leer.nextInt();
        }
        for (int e=0;e<10;e++){
            Prom+=Calif[e];
        }
        Prom2=Prom/10;
        if(Prom2<70)
            AlumR++;
        if(Prom2>70)
            AlumA++;
        for (int a=0;a<10;a++)
            System.out.println("Calificación = "+Calif[a]);
        System.out.println("El promedio es de= "+Prom2);
        System.out.println("Los alumnos aprobados son= "+AlumA);
        System.out.println("Los alumnos reprobados son= "+AlumR);
    }
    
}
