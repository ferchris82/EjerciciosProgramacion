
package ejerciciosprogramacion;

// Lee un número  por teclado y muestra por consola, el carácter al que pertenece en la tabla ASCII.

import java.util.Scanner;

public class TablaASCII {
    
    public static void main(String[] args) {
        
        System.out.println("Dame el número para saber al que pertenece en la tabla ASCII");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        //Realizo un casteo
        char character = (char)num; 
        
        System.out.println("Caracter correspondiente en la tabla ASCII a: " + character);
        
        
    }
}
