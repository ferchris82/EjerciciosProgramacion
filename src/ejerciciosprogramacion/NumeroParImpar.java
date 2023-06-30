
package ejerciciosprogramacion;

import java.util.Scanner;

//Indicar si un numero es par o impar
public class NumeroParImpar {
    
    public static void main(String[] args) {
        
        System.out.println("Cual número quieres saber si es par o impar");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num % 2 == 0){
            System.out.println("Tu número es par");
        }else{
            System.out.println("Tu número es impar");
        }
    }
}
