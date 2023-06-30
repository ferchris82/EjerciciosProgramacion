
package ejerciciosprogramacion;

//Operaciones Aritmeticas numeros ingresados por el usuario

import java.util.Scanner;

public class OperacionesAritmeticas {
    public static void main(String[] args) {
        
        //Declaracion variables enteras
        double numUno = 50, numDos = 20;
               
        Scanner sc1 = new Scanner(System.in);
        System.out.println("Dame el primer numero:");
        numUno = sc1.nextInt();
        
        Scanner sc2 = new Scanner(System.in);
        System.out.println("Dame el segundo numero");
        numDos = sc2.nextInt();
                
        System.out.println("La suma de los numeros es: " + (numUno + numDos));
        System.out.println("La resta de los numeros es: " + (numUno - numDos));
        System.out.println("La multiplicacion de los numeros es: " + (numUno * numDos));
        System.out.println("La division de los numeros es: " + (numUno / numDos));
        System.out.println("El residuo de los numeros es: " + (numUno % numDos));
        
        
    }
}
