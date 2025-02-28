package Notas;
    public class GestorNotas {
    private double[] notas;

    public GestorNotas(int cantidad) {
        this.notas = new double[cantidad];
    }
    public void ingresarNotas(double[] valores) {
        for (int i = 0; i < notas.length; i++) {
            notas[i] = valores[i];
        }
    }
    public double obtenerNotaMaxima() {
        double max = notas[0];
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }
    public double calcularPorcentajeAprobados() {
        int aprobados = 0;
        for (double nota : notas) {
            if (nota > 3.0) {
                aprobados++;
            }
        }
        return (aprobados / (double) notas.length) * 100;
    }
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return suma / notas.length;
    }
    public double obtenerNotaMinima() {
        double min = notas[0];
        for (double nota : notas) {
            if (nota < min) {
                min = nota;
            }
        }
        return min;
    }
    public int obtenerPosicionMenorNota() {
        double menor = obtenerNotaMinima();
        int posicion = 0;

        for (int i = 0; i < notas.length; i++) {
            if (notas[i] == menor) {
                posicion = i;
                break;
            }
        }
        return posicion + 1;
    }
}