import java.util.Scanner;

public class Alumno {
    //vector para notas
    private final double[] notas;

    // Constructor para el tamaño del vector dependiendo la cantidad de notas a ingresar
    public Alumno(int cantidad) {
        notas = new double[cantidad];
    }

    // Cargar las notas desde el teclado
    public void cargarNotas() {
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < notas.length; i++) {
            System.out.print("Ingrese la nota " + (i + 1) + ": ");
            notas[i] = sc.nextDouble();
        }
    }
    // Calcular el promedio de las notas
    public double calcularPromedio() {
        double suma = 0;
        for (double nota : notas) {
            suma += nota;
        }
        return notas.length > 0 ? suma / notas.length : 0;
    }

    // Obtener la nota más alta del vector
    public double notaMasAlta() {
        double max = Double.NEGATIVE_INFINITY;
        for (double nota : notas) {
            if (nota > max) {
                max = nota;
            }
        }
        return max;
    }

    // Mostrar la nota mas alta y el promedio
    public void mostrarResultados() {
        System.out.println("La nota más alta es: " + notaMasAlta());
        System.out.println("El promedio de notas es: " + calcularPromedio());
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese la cantidad de notas: ");
        int cantidad = sc.nextInt();

        Alumno alumno = new Alumno(cantidad);
        alumno.cargarNotas();
        alumno.mostrarResultados();
    }
}
