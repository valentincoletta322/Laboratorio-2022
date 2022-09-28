public class Escrito extends Examen{
    private float nota;

    public Escrito(String fecha, int duracion, float nota) {
        this.setFecha(fecha);
        this.setDuracion(duracion);
        this.nota = nota;
    }
    public float getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = nota;
    }

    @Override
    boolean estaAprobado(){
        if (this.nota>=6) return true;
        else return false;
    }

}
