package ejerciciosprogramacion;


import java.util.Scanner;

//Invertir una cadena

public class InversorPalabras {
    
    //Metodo Main
    public static void main(String[] args) {
        
        //Declara variables 
        String palabra = "", palabraInvertida = "";
        int longitudPalabra = 0;
        
        //Crear un objeto
        Scanner entrada = new Scanner(System.in);
        
        //Enviar mensaje desde consola
        System.out.println("Escribe una palabra o frase: ");
        palabra = entrada.nextLine();
        
        longitudPalabra = palabra.length();
        
        while (longitudPalabra != 0) {            
            palabraInvertida += palabra.substring(longitudPalabra -1, longitudPalabra);
            longitudPalabra--;
        }
        
        System.out.println("Palabra invertida: " + palabraInvertida);
        System.out.println("");
    }
}
