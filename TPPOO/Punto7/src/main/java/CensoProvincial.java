import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CensoProvincial {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Persona> lista = new ArrayList<>();

        int total = 0, varones = 0, mujeres = 0, varones16a65 = 0;
        Persona mayorEdad = null;

        while (true) {                             // Bucle
            System.out.print("Ingresar Numero de Documento (0 para terminar): ");
            long doc = sc.nextLong();
            if (doc == 0) {                        // salida
                break;
            }
            System.out.print("Edad: ");
            int edad = sc.nextInt();
            System.out.print("Sexo (M/F): ");
            char sexo = sc.next().toUpperCase().charAt(0);
            sc.nextLine();

            Persona p = new Persona(doc, edad, sexo);
            lista.add(p);

            total++;
            if (sexo == 'M') {
                varones++;
                if (edad >= 16 && edad <= 65) {
                    varones16a65++;
                }
            } else if (sexo == 'F') {
                mujeres++;
            }

            if (mayorEdad == null || p.getEdad() > mayorEdad.getEdad()) {
                mayorEdad = p;
            }
        }

        double porcentajeVarones16a65 = varones > 0
                ? (varones16a65 * 100.0) / varones
                : 0.0;

        // Salida de resultados
        System.out.printf("%nTotal censados: %d%n", total);
        System.out.printf("Varones: %d%n", varones);
        System.out.printf("Mujeres: %d%n", mujeres);
        System.out.printf("Varones entre 16 y 65 años: %d (%.2f%%)%n",
                varones16a65, porcentajeVarones16a65);
        if (mayorEdad != null) {
            System.out.printf("Mayor edad – Documento: %d | Edad: %d | Sexo: %c%n",
                    mayorEdad.getDocumento(),
                    mayorEdad.getEdad(),
                    mayorEdad.getSexo());
        }

        sc.close();
    }
}
