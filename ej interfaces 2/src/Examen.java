import java.time.LocalDate;

public abstract class Examen {
    private String fecha;
    private int duracion;

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    abstract boolean estaAprobado();
}
