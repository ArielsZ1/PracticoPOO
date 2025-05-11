public class Competidor {
    private int numeroVehiculo;
    private double tiempo;

    public Competidor(int numeroVehiculo, double tiempo) {
        this.numeroVehiculo = numeroVehiculo;
        this.tiempo = tiempo;
    }

    public int getNumeroVehiculo() { return numeroVehiculo; }
    public double getTiempo()     { return tiempo; }
}
