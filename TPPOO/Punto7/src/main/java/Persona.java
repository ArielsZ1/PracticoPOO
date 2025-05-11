public class Persona {
    private long documento;
    private int edad;
    private char sexo;

    public Persona(long documento, int edad, char sexo) {
        this.documento = documento;
        this.edad = edad;
        this.sexo = sexo;
    }

    public long getDocumento() { return documento; }
    public int getEdad()         { return edad; }
    public char getSexo()        { return sexo; }
}
