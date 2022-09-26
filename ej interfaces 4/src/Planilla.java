import java.time.LocalDate;

public class Planilla extends Empleado{
    private int salario;
    private int porcentajeAdicional;


    public Planilla(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int codigo, int numeroHorasExtra, LocalDate ingreso, String area, String cargo, int salario, int porcentajeAdicional) {
        super(dni, nombre, apellido, nacimiento, ciudadDeProcedencia, codigo, numeroHorasExtra, ingreso, area, cargo);
        this.salario = salario;
        this.porcentajeAdicional = porcentajeAdicional;
    }


}
