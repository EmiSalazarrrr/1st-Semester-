package matrizcuadrada;

import java.util.Scanner;

public class MatrizCuadrada {
    public static void main(String[] args) {
        Scanner leer = new Scanner (System.in);
        final int N = 3;
        int Matriz[][]=new int [N][N], opc,ban=0,f,c;//ban = 0 pq no hay datos en la matriz
        char SN;
        do{
            System.out.println("1. Leer los datos de la matriz"
                    + "\n2.Imprimir los elementos de la fila X"
                    + "\n3.Imprimir los elementos de la columna X"
                    + "\n4.Imprimir elementos de la diagonal principal"
                    + "\n5.Imprimir elementos de l diagonal inversa"
                    + "\n6.Llenar la matriz con 0´s y solo la diagonal con 1"
                    + "\n7.Mostrar la matriz completa"
                    + "\n8.Imprimir los elementos arriba de la diagonal principal"
                    + "\n0.Terminar.");
            System.out.println("Opción = ");
            opc = leer.nextInt();
            switch (opc){
                case 1:
                    if (ban==1){
                        System.out.println("Ya hay datos almacenados. "
                                + "Desea modificarlos?[S/N]");
                        SN = leer.next().charAt(0);
                        if (SN == 'N'|| SN == 'n')
                            break;
                    }
                    ban=1;
                    System.out.println("Dame los datos de la Matriz");
                    for(f =0;f<N;f++)
                        for(c = 0;c<N;c++){
                            System.out.println("["+f+"]["+c+"] = ");
                            Matriz [f][c] = leer.nextInt();
                        }  
                    break;
                case 2:
                    if (ban==0){
                        System.out.println("No existe datos en la fila");
                        break;
                    }
                    do{
                    System.out.println("Imprimir elementos de la fia = ");
                     f = leer.nextInt();
                    }while(f>=N||f<0);
                    for (c=0;c<N;c++)
                        System.out.println(Matriz[f][c]+"\n");
                    break;
                case 3:
                    if (ban==0){
                        System.out.println("No hay datos en la columna aún");
                        break;
                    }
                    do{ 
                        System.out.println("Imprimir elementos de la columna = ");
                        c = leer.nextInt();                                                                                                
                    }while(c>=0||c<0);
                    for (f=0;f<N;f++)
                        System.out.println(Matriz[f][c]+"\n");
                    break;
                case 4:
                    if (ban==0){
                        System.out.println("No hay datos en la columna aún");
                        break;
                    }
                        System.out.println("Elementos de la diagonal principal");
                    for (int x=0;x<N;x++)
                        System.out.print(Matriz[x][x]+"\t");
                    break;
                case 5:
                    if (ban==0){
                        System.out.println("No hay datos en la diagonal");
                        break;
                    }
                    /*for(f=2;f<-1;f--)
                        for (c=0;c<N;c++){
                            System.out.println("Los números son: "
                                    +Matriz[f][c]);
                        }
                    break; 
                    */
                    System.out.println("Elementos de la diagonal invertida\n");
                    for(c=N-1;c>=0;c--){
                        System.out.println(Matriz[N-1-c][c]+"\t");
                    }
                    System.out.println("\n");
                case 6: 
                    for(f=0;f<N;f++)
                        for(c=0;c<N;c++)
                            if(f==c)
                                Matriz[f][c]=1;
                            else 
                                Matriz[f][c]=0;
                case 7:
                    if (ban==0){
                        System.out.println("No hay datos en la matriz");
                        break;
                    }
                    System.out.println("Los datos de la matriz son: ");
                    for (f=0;f<N;f++){
                        c = N-N+f;
                        System.out.println(Matriz[f][c]);
                    }
                    break;
                case 8:
                case 0:
                    System.out.println("Su proceso ha terminado.");
                    break;
            }
        }while(opc !=0);
    }
    
}