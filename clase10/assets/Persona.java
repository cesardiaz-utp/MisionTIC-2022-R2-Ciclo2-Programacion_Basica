import java.io.Serializable;

public class Persona implements Serializable {
    private String dni;
    private String nombres;
    private String apellidos;

    public Persona(String dni, String nombres, String apellidos) {
        this.dni = dni;
        this.nombres = nombres;
        this.apellidos = apellidos;
    }

    public String getDni() {
        return dni;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    @Override
    public String toString() {
        return dni + "\t" + nombres + " " + apellidos;
    }

}
