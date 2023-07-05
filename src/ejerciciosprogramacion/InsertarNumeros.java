package ejerciciosprogramacion;

//Crear una aplicacion que nos permita insertar números hasta que insertemos un -1
import java.util.Scanner;

public class InsertarNumeros {

    public static void main(String[] args) {

        System.out.println("Dame un numero");
        Scanner sc = new Scanner(System.in);
        int numero = sc.nextInt();

        while (numero != -1) {
            System.out.println("Tu número es: " + numero);
            numero = sc.nextInt();
        }
        System.out.println("Fin");
    }
}
