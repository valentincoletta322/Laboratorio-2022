import java.util.HashSet;

public class Alumno {
    private int dni;
    private String apellido;
    private String nombre;
    private HashSet<Examen> examenes;

    public boolean estaAprobado(){

        for(Examen unExamen:this.examenes){
            if (unExamen.getClass().getSimpleName().equals("Oral")){
                Oral oral = (Oral) unExamen;
                if (oral.getSatisfaccion()==Satisfaccion.INSUFICIENTE) return false;
            }
            else if (unExamen.getNota()<6)return false;
        }

        return true;
    }

}