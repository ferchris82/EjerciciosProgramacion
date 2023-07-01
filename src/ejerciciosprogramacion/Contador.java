
package ejerciciosprogramacion;

//Contador de 1 al 100 usando el bucle While
public class Contador {
    public static void main(String[] args){
        
        int contador = 1;
        
        
        // ciclo while
        while(contador <= 100){
             System.out.println(contador);
             contador ++;
        }
        
        //ciclo for 
        for(int i = 1; i <= 100; i++){
            contador = i;
            System.out.println(contador);
        }
    }
}
