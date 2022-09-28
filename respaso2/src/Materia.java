public class Materia {
    private String materia;
    private int horasDeTrabajo;

    public Materia(String materia, int horasDeTrabajo) {
        this.materia = materia;
        this.horasDeTrabajo = horasDeTrabajo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public int getHorasDeTrabajo() {
        return horasDeTrabajo;
    }

    public void setHorasDeTrabajo(int horasDeTrabajo) {
        this.horasDeTrabajo = horasDeTrabajo;
    }
}
