import java.time.LocalDate;

public class Medico extends Planilla{
    private String especialidad;
    private String servicio;
    private int numeroConsultorio;

    public Medico(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, String especialidad, String servicio, int numeroConsultorio, int codigo, String cargo, int numeroHorasExtra, LocalDate ingreso, String area, int salario, int porcentajeAdicional) {
        super(dni, nombre, apellido, nacimiento, ciudadDeProcedencia,codigo,numeroHorasExtra, ingreso, area, cargo, salario, porcentajeAdicional);
        this.especialidad = especialidad;
        this.servicio = servicio;
        this.numeroConsultorio = numeroConsultorio;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public String getServicio() {
        return servicio;
    }

    public void setServicio(String servicio) {
        this.servicio = servicio;
    }

    public int getNumeroConsultorio() {
        return numeroConsultorio;
    }

    public void setNumeroConsultorio(int numeroConsultorio) {
        this.numeroConsultorio = numeroConsultorio;
    }
}
