import java.util.Scanner;

public class Productos {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresar la cantidad de productos: ");
        int n = sc.nextInt();
        int[] cantidades = new int[n];
        double[] costos = new double[n];

        cargarProductos(cantidades, costos, sc);
        procesarProductos(cantidades, costos);

        sc.close();
    }

    public static void cargarProductos(int[] cantidades, double[] costos, Scanner sc) {
        for (int i = 0; i < cantidades.length; i++) {
            System.out.printf("Cantidad del producto %d: ", i + 1);
            cantidades[i] = sc.nextInt();
            System.out.printf("Costo unitario del producto %d: $", i + 1);
            costos[i] = sc.nextDouble();
        }
    }

    public static void procesarProductos(int[] cantidades, double[] costos) {
        System.out.println("\n-- Resultados de Productos --");
        for (int i = 0; i < cantidades.length; i++) {
            double total = cantidades[i] * costos[i];
            System.out.printf("Producto %d: %d × $%.2f = $%.2f",
                    i + 1, cantidades[i], costos[i], total);
            if (total > 1000.0) {
                System.out.print("  <-- Superó los $1000");
            }
            System.out.println();
        }
    }
}
