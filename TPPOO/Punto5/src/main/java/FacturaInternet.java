

import java.util.Scanner;

public class FacturaInternet {
    public static void main(String[] args) {
        final int CLIENTES = 5;
        Cliente[] lista = new Cliente[CLIENTES];
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i < CLIENTES; i++) {
            System.out.printf("Client %d/%d%n", i+1, CLIENTES);
            System.out.print("  DNI: ");
            String dni = sc.nextLine();

            System.out.print("  Tipo de servicio (1=30 MB, 2=50 MB, 3=100 MB): ");
            int tipo = sc.nextInt();

            double precioBase;
            switch (tipo) {
                case 1:  precioBase = 750; break;
                case 2:  precioBase = 1100; break;
                case 3:  precioBase = 1500 * 0.95; break;
                default: precioBase = 0;
            }
            sc.nextLine();

            lista[i] = new Cliente(dni, tipo, precioBase);
            System.out.println();
        }


        System.out.println("----- Factura de Consumo Internet -----");
        for (Cliente c : lista) {
            System.out.printf("DNI: %s | Servicio: %d | Monto: $%.2f%n",
                    c.getDni(), c.getServicio(), c.getMonto());
        }

        sc.close(); //Cierre
    }
}

