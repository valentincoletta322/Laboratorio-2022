public class Sistema {
    private HashSet<Medico> medicos;
    private HashSet<Paciente> pacientes;
    private HashSet<Empleado> empleados;
    
    public void registrarPaciente(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int numeroHistoriaClinica, char sexo, String grupoSanguineo, ArrayList<String> alergias){
        Paciente p1 = new Paciente(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int numeroHistoriaClinica, char sexo, String grupoSanguineo, ArrayList<String> alergias);
        pacientes.add(p1);
    }
    
    public void registrarMedico(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, String especialidad, String servicio, int numeroConsultorio, int codigo, String cargo, int numeroHorasExtra, LocalDate ingreso, String area, int salario, int porcentajeAdicional){
        Medico m1 = new Medico(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, String especialidad, String servicio, int numeroConsultorio, int codigo, String cargo, int numeroHorasExtra, LocalDate ingreso, String area, int salario, int porcentajeAdicional);
        medicos.add(m1);
    }
    
    public void registrarEmpleadoEventual(){
    
        empleados.add(e1);
    }
        
    public void regisrarEmpleadoPlanilla(){
    
        empleados.add(e1);
    }    
        
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}
