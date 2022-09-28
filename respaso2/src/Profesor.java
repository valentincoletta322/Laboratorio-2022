import java.util.HashSet;
import java.util.regex.MatchResult;

public class Profesor extends Externo{
    HashSet<Materia> listaDeMaterias;

    public Profesor(HashSet<Materia> listaDeMaterias) {
        this.listaDeMaterias = listaDeMaterias;
    }

    public HashSet<Materia> getListaDeMaterias() {
        return listaDeMaterias;
    }

    public void setListaDeMaterias(HashSet<Materia> listaDeMaterias) {
        this.listaDeMaterias = listaDeMaterias;
    }

    @Override
    public void accionVoluntaria() {
        System.out.println(listaDeMaterias.toString());
    }
}
