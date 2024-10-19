
package sumaresta;

import java.util.Scanner;

public class SumaResta {

    public static void main(String[] args) {
        //Declaración de matrices. Odio las matrices.
        int A[][] = new int [3][2];
        int B[][] = new int [2][2];
        int C[][] = new int [3][2];  
        Scanner leer = new Scanner (System.in);
        for (int i = 0; i<3;i++)
            for (int e = 0; e<2;e++){
                System.out.println("Dame un numero para la primer matriz");
                A[i][e] = leer.nextInt();
            }
        for (int i = 0; i<3;i++)
            for (int e = 0; e<2;e++){
                System.out.println("Dame un numero para la segunda matriz");
                B[i][e] = leer.nextInt(); 
            }
        
        for (int i = 0; i<3;i++) //Ciclo para la suma 
            for (int e = 0; e<2;e++){
                C[i][e] = A[i][e] + B[i][e];
            }
        
        System.out.println("La suma es = ");
        for (int i = 0; i<3;i++) //Ciclo para la suma 
            for (int e = 0; e<2;e++){
                System.out.println(C[i][e]);
            }
      
         for (int i = 0; i<3;i++) //Ciclo para la resta 
            for (int e = 0; e<2;e++)
                C[i][e] = A[i][e] - B[i][e];
          
        System.out.println("La resta es = ");
        for (int i = 0; i<3;i++) //Ciclo para la resta 
            for (int e = 0; e<2;e++)
                System.out.println(C[i][e]);
        
       for (int FA = 0; FA<3;FA++) //ciclo para la multiplicación
           for (int CB = 0; CB<3;CB++){ 
               C [FA][CB] = 0;
               for(int CA = 0; CA < 2 ; CA++){
                   C [FA][CB]+= A[FA][CA]*B[CA][CB];
                   
               } 
        
            }
        System.out.println("Resultados = ");
        for (int i = 0; i<3;i++) //Ciclo para la expresión de resultado 
            for (int e = 0; e<2;e++){
                System.out.println(C[i][e]);
    }
    
    }
}
