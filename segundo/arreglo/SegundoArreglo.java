
package segundo.arreglo;

import java.util.Scanner;

public class SegundoArreglo {

    public static void main(String[] args) {
        //Declaración de las variables y creación del arreglo
        Scanner leer = new Scanner(System.in);
        int mayor, Num[] = new int [10];
        for (int i = 0;i<10;i++){
            System.out.println("Ingresa un número");
            Num[i] = leer.nextInt();
        }
        mayor = Num[0];
        for (int o = 1; o <= 9;o++){
            if (mayor<Num[o])
                mayor=Num[o];
        }
        for(int e = 0; e < 10; e++){
            System.out.println(Num[e]+"\t"+"La diferencia es de = "+(mayor-Num[e]));  
        }
    }
    
}
