package ejerciciosprogramacion;

//Mostrar de l al 100 los numeros que sean divisibles entre 2 y 3
public class Divisible2Y3 {

    public static void main(String[] args) {

        for (int contador = 1; contador < 100; contador++) {
            if (contador % 2 == 0 && contador % 3 == 0) {
                System.out.println(contador);
            }
        }
    }

}
