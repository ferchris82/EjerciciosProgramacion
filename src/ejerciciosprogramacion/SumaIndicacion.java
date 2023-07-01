package ejerciciosprogramacion;

//Realizar la suma del 1 al número que indiquemos, este debe ser mayor que 1
import java.util.Scanner;

public class SumaIndicacion {

    public static void main(String[] args) {

        System.out.println("Dame un numero mayor a 1");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        
        if(num > 1){
            num++;
            System.out.println(num);
        }

    }
}
