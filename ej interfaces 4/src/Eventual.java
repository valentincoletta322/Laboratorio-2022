import java.time.LocalDate;

public class Eventual extends Empleado{
    private int honorariosPorHora;
    private int horasTotales;
    private LocalDate fechaDeTermino;

    public Eventual(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int codigo, int numeroHorasExtra, LocalDate ingreso, String area, String cargo, int honorariosPorHora, int horasTotales, LocalDate fechaDeTermino) {
        super(dni, nombre, apellido, nacimiento, ciudadDeProcedencia, codigo, numeroHorasExtra, ingreso, area, cargo);
        this.honorariosPorHora = honorariosPorHora;
        this.horasTotales = horasTotales;
        this.fechaDeTermino = fechaDeTermino;
    }

    public int getHonorariosPorHora() {
        return honorariosPorHora;
    }

    public void setHonorariosPorHora(int honorariosPorHora) {
        this.honorariosPorHora = honorariosPorHora;
    }

    public int getHorasTotales() {
        return horasTotales;
    }

    public void setHorasTotales(int horasTotales) {
        this.horasTotales = horasTotales;
    }

    public LocalDate getFechaDeTermino() {
        return fechaDeTermino;
    }

    public void setFechaDeTermino(LocalDate fechaDeTermino) {
        this.fechaDeTermino = fechaDeTermino;
    }
}
