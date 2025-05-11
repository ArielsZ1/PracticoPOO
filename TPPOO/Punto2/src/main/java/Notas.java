import java.util.Scanner;

public class Notas {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar la cantidad de notas: ");
        int n = sc.nextInt();
        double[] notas = new double[n];

        cargarNotas(notas, sc);
        int aprobados = contarAprobados(notas);
        int desaprobados = n - aprobados;

        System.out.printf("Cantidad de los aprobados (>=6): %d%n", aprobados);
        System.out.printf("Cantidad de los desaprobados (<6): %d%n", desaprobados);

        sc.close();
    }

    public static void cargarNotas(double[] notas, Scanner sc) {
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Nota %d: ", i + 1);
            notas[i] = sc.nextDouble();
        }
    }

    public static int contarAprobados(double[] notas) {
        int cuenta = 0;
        for (double nota : notas) {
            if (nota >= 6.0) {
                cuenta++;
            }
        }
        return cuenta;
    }
}
