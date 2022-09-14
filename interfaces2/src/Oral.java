public class Oral extends Examen{
    private Satisfaccion satisfaccion;

    public Oral(String fecha, int duracion, float nota, Satisfaccion satisfaccion) {
        super(fecha, duracion, nota);
        this.satisfaccion = satisfaccion;
    }

    public Satisfaccion getSatisfaccion() {
        return satisfaccion;
    }

    public void setSatisfaccion(Satisfaccion satisfaccion) {
        this.satisfaccion = satisfaccion;
    }
}
