import java.time.LocalDateTime;
import java.util.HashSet;

public class Sistema {
    private HashSet<Medico> medicos;
    private HashSet<Paciente> pacientes;
    private HashSet<Empleado> empleados;
    private HashSet<Cita> citas;

    public void registrarPaciente(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int numeroHistoriaClinica, char sexo, String grupoSanguineo, ArrayList<String> alergias){
        Paciente p1 = new Paciente(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int numeroHistoriaClinica, char sexo, String grupoSanguineo, ArrayList<String> alergias);
        this.pacientes.add(p1);
    }

    public void registrarMedico(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, String especialidad, String servicio, int numeroConsultorio, int codigo, String cargo, int numeroHorasExtra, LocalDate ingreso, String area, int salario, int porcentajeAdicional){
        Medico m1 = new Medico(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, String especialidad, String servicio, int numeroConsultorio, int codigo, String cargo, int numeroHorasExtra, LocalDate ingreso, String area, int salario, int porcentajeAdicional);
        this.medicos.add(m1);
    }

    public void registrarEmpleadoEventual(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int codigo, int numeroHorasExtra, LocalDate ingreso, String area, String cargo, int honorariosPorHora, int horasTotales, LocalDate fechaDeTermino){
        Eventual e1 = new Eventual(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int codigo, int numeroHorasExtra, LocalDate ingreso, String area, String cargo, int honorariosPorHora, int horasTotales, LocalDate fechaDeTermino);
        this.empleados.add(e1);
    }

    public void regisrarEmpleadoPlanilla(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int codigo, int numeroHorasExtra, LocalDate ingreso, String area, String cargo, int salario, int porcentajeAdicional){
        Planilla p1 = new  Planilla(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int codigo, int numeroHorasExtra, LocalDate ingreso, String area, String cargo, int salario, int porcentajeAdicional)
        this.empleados.add(p1);
    }

    public void registrarCitaMedica(Paciente unPaciente, Medico unMedico, LocalDateTime fechaYHora){
        Cita cita1 = new Cita(unPaciente, unMedico, fechaYHora);
        this.citas.add(cita1);
    }

    public void mostrarPacientesPorMedico(int dni){
        for(Cita unaCita : this.citas){
            if (unaCita.getUnMedico().getDni()==dni) System.out.println(unaCita.getUnPaciente().getNombre()+" "+unaCita.getUnPaciente().getApellido());
        }
    }

    public static void main(String[] args) {
    }
}