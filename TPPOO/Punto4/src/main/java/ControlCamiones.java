import java.util.Scanner;

// Una clase para la representacion de los camiones
class Camion {
    String patente;
    String chofer;
    String tipoCarga;
    String horaEgreso;

    // Constructor
    public Camion(String patente, String chofer, String tipoCarga, String horaEgreso) {
        this.patente = patente;
        this.chofer = chofer;
        this.tipoCarga = tipoCarga;
        this.horaEgreso = horaEgreso;
    }

    //mostrar los datos del camión
    public void mostrarDatos() {
        System.out.printf("Patente: %s | Chofer: %s | Carga: %s | Hora egreso: %s%n",
                patente, chofer, tipoCarga, horaEgreso);
    }
}

public class ControlCamiones {
    public static void main(String[] args) {
        final int TOTAL_CAMIONES = 30;
        Camion[] flota = new Camion[TOTAL_CAMIONES];
        Scanner sc = new Scanner(System.in);

        int contTé = 0;

        for (int i = 0; i < TOTAL_CAMIONES; i++) {
            System.out.printf("Camión %d de %d:%n", i + 1, TOTAL_CAMIONES);
            System.out.print("  Patente: ");
            String patente = sc.nextLine();
            System.out.print("  Chofer (Nombre y apellido): ");
            String chofer = sc.nextLine();
            System.out.print("  Tipo de carga (madera, yerba o té): ");
            String tipo = sc.nextLine().toLowerCase();
            System.out.print("  Hora de egreso (HH:MM): ");
            String hora = sc.nextLine();

            if (tipo.equals("té") || tipo.equals("te")) {
                contTé++;
            }

            flota[i] = new Camion(patente, chofer, tipo, hora);
            System.out.println();
        }

        System.out.println("----- Datos de egreso de camiones -----");
        for (Camion cam : flota) {
            cam.mostrarDatos();
        }

        System.out.printf("%nTotal de camiones que cargaron té: %d%n", contTé);

        sc.close();
    }
}


