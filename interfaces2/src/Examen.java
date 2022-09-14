import java.time.LocalDate;

public class Examen {
    private String fecha;
    private int duracion;
    private float nota;

    public Examen(String fecha, int duracion, float nota) {
        this.fecha = fecha;
        this.duracion = duracion;
        this.nota = nota;
    }

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

    public float getNota() {
        return nota;
    }

    public void setNota(float nota) {
        this.nota = nota;
    }
}
