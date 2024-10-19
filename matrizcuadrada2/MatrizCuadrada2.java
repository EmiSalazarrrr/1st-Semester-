package matrizcuadrada2;

import java.util.Scanner;

public class MatrizCuadrada2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        leer.useDelimiter("\n"); //Para leer cadenas con espacios
        final int N = 5;
        String Nombre[] = new String[N]; //Nombre del alumno 
        int Calif [][] = new int [N][5], opc, T, e,Prom = 0, Prom2;
        do{
            System.out.println("1. Agregar estudiantes."
                    + "\n2. Agregar calificaciones del Tema x."
                    + "\n3. Mostrar los nombre de estudiantes y sus calificaciones"
                    + "\n4. Imprimir nombre y su promedio"
                    + "\n0. Terminar.");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    System.out.println("Agregar nombres de estudiantes");
                    for (int i = 0; i<N; i++){
                        System.out.print("["+i+"]");
                        Nombre[i]=leer.next();
                    }
                    break;
                case 2: 
                    System.out.println("Agregar calificaciones del tema?");
                    T= leer.nextInt();
                    for (e=0;e<N;e++){
                        System.out.print(Nombre[e]+" = ");
                        Calif[e][T-1] = leer.nextInt();
                    }
                    break;
                case 3:
                    System.out.println("\nRegistros de calificaciones.");
                    for (e=0;e<N;e++){
                        System.out.print("\n"+Nombre[e]+"\t");
                        for(T=0;T<5;T++){
                            System.out.print(Calif[e][T]+"\t");
                        }
                    }
                    break;
                case 4:
                    System.out.println("\nPromedio de cada alumno. ");
                    for (e=0;e<N;e++){
                        Prom=0;
                        System.out.println("\n"+Nombre[e]+"\t");
                        
                        for(T=0;T<5;T++)
                           Prom+=Calif[e][T];
                            Prom2= Prom/5;
                            System.out.print(Prom2);  
                    }
                    break;
            }
        }while(opc!=0);
    }
    
}
