public class Oral extends Examen{
    private Satisfaccion satisfaccion;

    public Oral(String fecha, int duracion, Satisfaccion satisfaccion) {
        this.setFecha(fecha);
        this.setDuracion(duracion);
        this.satisfaccion = satisfaccion;
    }

    public Satisfaccion getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(Satisfaccion satisfaccion) {
        this.satisfaccion = satisfaccion;
    }

    @Override
    boolean estaAprobado() {
        if(this.satisfaccion.equals(Satisfaccion.INSUFICIENTE)) return false;
        else return true;
    }
}
