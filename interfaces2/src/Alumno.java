import java.util.HashSet;

public class Alumno {
    private int dni;
    private String apellido;
    private String nombre;
    private HashSet<Examen> examenes;

    public Alumno(HashSet<Examen> examenes) {
        this.dni = 1;
        this.nombre="juan";
        this.apellido="juano";
        this.examenes = examenes;
    }

    public boolean estaAprobado(){

        for(Examen unExamen:this.examenes){
            if (!unExamen.estaAprobado()) return false;
        }

        return true;
    }

}