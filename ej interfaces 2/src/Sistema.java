import java.time.LocalDate;
import java.util.HashSet;

public class Sistema {
    private HashSet<Alumno> alumnos;

    public Sistema(HashSet<Alumno> alumnos) {
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

    public static void main(String[] args){
        HashSet<Examen> examenes = new HashSet<>();
        HashSet<Examen> examenes2 = new HashSet<>();
        Oral oral1 = new Oral("LocalDate.now()",10, Satisfaccion.EXCELENTE);
        Escrito escrito1 = new Escrito("LocalDate.now()", 10, 6);
        Oral oral2 = new Oral("LocalDate.now()",10, Satisfaccion.SUFICIENTE);
        Escrito escrito2 = new Escrito("LocalDate.now()", 10, 10);
        examenes.add(oral1);
        examenes.add(escrito1);
        examenes2.add(oral2);
        examenes2.add(escrito2);
        Alumno a1 = new Alumno(examenes);
        Alumno a2 = new Alumno (examenes2);
        HashSet<Alumno> alumns = new HashSet<>();
        alumns.add(a1);
        alumns.add(a2);
        Sistema sist = new Sistema(alumns);
        System.out.println(sist.cantAprobados());

    }

}

