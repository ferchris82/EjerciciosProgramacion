
package ejerciciosprogramacion;

import java.util.Scanner;


//Pedir 2 números por teclado e indicar si uno es mayor que el otro o si son iguales
public class NumeroMayor {
    
    public static void main(String[] args){
        
        int a = 0, b = 0;
        
        System.out.println("Dame el primer número:");
        Scanner sc1 = new Scanner(System.in);
        a = sc1.nextInt();
        
        System.out.println("Dame el segundo número:");
        Scanner sc2 = new Scanner(System.in);
        b = sc2.nextInt();
        
        if(a > b){
            System.out.println("El número " + a + "es mayor a " + b);
        }else if(b > a){
            System.out.println("El número " + b + "es mayor a " + a);
        }else{
            System.out.println("Los dos números son iguales");
        }
        
    }
}
