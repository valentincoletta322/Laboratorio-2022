import java.util.HashSet;

public class Main {
    private HashSet<Alumno> alumnos;

    public Main(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    public HashSet<Alumno> getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(HashSet<Alumno> alumnos) {
        this.alumnos = alumnos;
    }

    private int cantAprobados(){
        int cont=0;
        for(Alumno unAlumno:this.alumnos){
            if (unAlumno.estaAprobado()) cont++;
        }
        return cont;
    }

}

