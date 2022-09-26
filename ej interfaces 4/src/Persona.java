import java.time.LocalDate;

public class Persona {
    private int dni;
    private String nombre;
    private String apellido;
    private LocalDate nacimiento;
    private String ciudadDeProcedencia;

    public Persona(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia) {
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.nacimiento = nacimiento;
        this.ciudadDeProcedencia = ciudadDeProcedencia;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public LocalDate getNacimiento() {
        return nacimiento;
    }

    public void setNacimiento(LocalDate nacimiento) {
        this.nacimiento = nacimiento;
    }

    public String getCiudadDeProcedencia() {
        return ciudadDeProcedencia;
    }

    public void setCiudadDeProcedencia(String ciudadDeProcedencia) {
        this.ciudadDeProcedencia = ciudadDeProcedencia;
    }
}
