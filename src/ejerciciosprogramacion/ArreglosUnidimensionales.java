
package ejerciciosprogramacion;

import javax.swing.JOptionPane;

public class ArreglosUnidimensionales {
    public static void main(String[] args) {
        
        //Declaracion variables
        String[] nombres = null; //Arreglo que permite almacenar cadenas nombres 
        Double[] notas = null; //Arreglo que permite almacenar las notas de los estudiantes
        String listaAprobados = null; //Cadena con el listado de los estudiantes que aprobaron
        String listaNoAprobados = null; //Cadena con el listado de los estudiantes que no aprobaron
        int cantidad = 0; //Cantidad de estudiantes que se van a registrar.
        
        //Zona de declaración de la lógica de negocio
        cantidad = Integer.parseInt(JOptionPane.showInputDialog(null, "¿Cuantos estudiantes desea registrar?",
            "Cantidad de estudiantes",JOptionPane.QUESTION_MESSAGE));
        
        if(cantidad < 1){
            cantidad = 10;
        }
        nombres = new String[cantidad];
        notas = new Double[cantidad];
        
        //Estructura de control iterativas(for,for each, while, do while).
        for(int iteracion = 0; iteracion < cantidad; iteracion ++){
            
            nombres[iteracion] = JOptionPane.showInputDialog(null,"Ingrese el nombre del estudiante número" + (iteracion + 1),
                    "Ingreso de estudiantes.", JOptionPane.INFORMATION_MESSAGE);
            
            notas[iteracion] = Double.parseDouble(JOptionPane.showInputDialog(null, "¿Nota del estudiante " + nombres[iteracion] + "?",
                    "Ingreso de nota para el estudiante.", JOptionPane.QUESTION_MESSAGE));
        }
        listaAprobados = "";
        listaNoAprobados = "";
        
        for(int iteracion = 0; iteracion < notas.length; iteracion++){
            if(notas[iteracion] <3.0){
                listaNoAprobados += nombres[iteracion] + "\n";
            }else{
                listaAprobados += nombres[iteracion] + "\n";
            }
            
        }
        JOptionPane.showMessageDialog(null, "Los estudiantes que aprobaron el curso de programación fueron:\n" + listaAprobados,
                "Lista de aprobados", JOptionPane.INFORMATION_MESSAGE);
        JOptionPane.showMessageDialog(null, "Los estudiantes que NO aprobaron el curso de programación fueron:\n" + listaNoAprobados,
                "Lista de no aprobados", JOptionPane.ERROR_MESSAGE);
        /**
         * Se ha terminado el programa
         */
    }
}
