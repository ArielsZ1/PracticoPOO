public class Cliente {
    private String dni;
    private int servicio;
    private double monto;

    public Cliente(String dni, int servicio, double monto) {
        this.dni = dni;
        this.servicio = servicio;
        this.monto = monto;
    }

    public String getDni() { return dni; }
    public int getServicio() { return servicio; }
    public double getMonto() { return monto; }
}
