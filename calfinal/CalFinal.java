/*
Obtener la calificación final de un estudiante, considerando que las tareas 
corresponden al 30%, la participación corresponde al 20% y el examen 50%
 */
package calfinal;

import java.util.Scanner;

public class CalFinal {

    public static void main(String[] args) {
        //Declaración de variables
        int Tareas, Part, Exam, CalT, CalP, CalE, CalFinal;
        Scanner teclado = new Scanner (System.in);
        System.out.println("Ingrese el puntaje de tareas");
        Tareas = teclado.nextInt();//Se le dará el valor aquí a las tareas
        System.out.println("Ingrese el puntaje de participación");
        Part = teclado.nextInt();//Se le dará el valor a las participaciones
        System.out.println("Ingrese el puntaje del examen");
        Exam = teclado.nextInt();//Se le dará el puntaje al examen
        CalT = (Tareas*30)/100;
        CalP = (Part*20)/100;
        CalE = (Exam*50)/100;
        CalFinal = CalT+CalP+CalE;
        System.out.println("Su calificación final es: "+CalFinal);
       
    }
    
}
