import java.time.LocalDate;
import java.util.ArrayList;

public class Paciente extends Persona{
    private int numeroHistoriaClinica;
    private char sexo;
    private String grupoSanguineo;
    private ArrayList<String> alergias;

    public Paciente(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int numeroHistoriaClinica, char sexo, String grupoSanguineo, ArrayList<String> alergias) {
        super(dni, nombre, apellido, nacimiento, ciudadDeProcedencia);
        this.numeroHistoriaClinica = numeroHistoriaClinica;
        this.sexo = sexo;
        this.grupoSanguineo = grupoSanguineo;
        this.alergias = alergias;
    }

    public int getNumeroHistoriaClinica() {
        return numeroHistoriaClinica;
    }

    public void setNumeroHistoriaClinica(int numeroHistoriaClinica) {
        this.numeroHistoriaClinica = numeroHistoriaClinica;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public String getGrupoSanguineo() {
        return grupoSanguineo;
    }

    public void setGrupoSanguineo(String grupoSanguineo) {
        this.grupoSanguineo = grupoSanguineo;
    }

    public ArrayList<String> getAlergias() {
        return alergias;
    }

    public void setAlergias(ArrayList<String> alergias) {
        this.alergias = alergias;
    }
}
