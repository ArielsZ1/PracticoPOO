import java.util.Scanner;

public class Carrera {
    public static void main(String[] args) {
        final int TOTAL = 12;
        Competidor[] competidores = new Competidor[TOTAL];
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese número de vehículo y tiempo (segundos) de cada competidor:");
        sc.nextLine(); // Consumir línea pendiente si la hubiera

        System.out.print("Competidor 1 - Vehículo: ");
        int num = sc.nextInt();
        System.out.print("Competidor 1 - Tiempo: ");
        double t = sc.nextDouble();
        competidores[0] = new Competidor(num, t);
        double mejorTiempo = t;
        int vehiculoGanador = num;

        for (int i = 1; i < TOTAL; i++) {
            System.out.printf("Competidor %d - Vehículo: ", i+1);
            num = sc.nextInt();
            System.out.printf("Competidor %d - Tiempo: ", i+1);
            t = sc.nextDouble();
            competidores[i] = new Competidor(num, t);

            if (t < mejorTiempo) {
                mejorTiempo = t;
                vehiculoGanador = num;
            }
        }

        // Mostrar resultado
        System.out.println("\n--- Resultado de la Carrera ---");
        System.out.printf("Vehículo ganador: %d%n", vehiculoGanador);
        System.out.printf("Mejor tiempo: %.2f segundos%n", mejorTiempo);

        sc.close();
    }
}
