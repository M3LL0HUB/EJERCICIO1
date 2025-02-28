package Notas;
import java.util.Scanner;
public class Notas {
    public static void main(String[] args) {
        Scanner JM = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de estudiantes: ");
        int cantidad = JM.nextInt();
        
        GestorNotas OBJ = new GestorNotas(cantidad);
        double[] notas = new double[cantidad];

        System.out.println("Ingrese las notas:");
        for (int i = 0; i < cantidad; i++) {
            System.out.print("Nota " + (i + 1) + ": ");
            notas[i] = JM.nextDouble();
        }
        OBJ.ingresarNotas(notas);

        System.out.println("\nResultados:");
        System.out.printf("Mayor nota: %.2f\n\n", OBJ.obtenerNotaMaxima());
        System.out.printf("Porcentaje de aprobados: %.2f%%\n", OBJ.calcularPorcentajeAprobados());
        System.out.printf("Promedio de notas: %.2f\n", OBJ.calcularPromedio());
        System.out.printf("Menor nota: %.2f\n", OBJ.obtenerNotaMinima());
        System.out.printf("Posicion de la menor nota: %d\n", OBJ.obtenerPosicionMenorNota());
    }
}