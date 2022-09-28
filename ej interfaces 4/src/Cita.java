import java.time.LocalDateTime;

public class Cita {
    private Paciente unPaciente;
    private Medico unMedico;
    private LocalDateTime fechaYHora;

    public Cita(Paciente unPaciente, Medico unMedico, LocalDateTime fechaYHora) {
        this.unPaciente = unPaciente;
        this.unMedico = unMedico;
        this.fechaYHora = fechaYHora;
    }

    public Paciente getUnPaciente() {
        return unPaciente;
    }

    public void setUnPaciente(Paciente unPaciente) {
        this.unPaciente = unPaciente;
    }

    public Medico getUnMedico() {
        return unMedico;
    }

    public void setUnMedico(Medico unMedico) {
        this.unMedico = unMedico;
    }

    public LocalDateTime getFechaYHora() {
        return fechaYHora;
    }

    public void setFechaYHora(LocalDateTime fechaYHora) {
        this.fechaYHora = fechaYHora;
    }
}
