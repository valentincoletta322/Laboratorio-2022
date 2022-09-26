/*
*
* Número   de   DNI,
* nombre,   apellido,   fecha   de   nacimiento, dirección,
* ciudad  de  procedencia,  código  de  Empleado,  número  de  horas  extras, fecha  de  ingreso,  área,  cargo
*
* */

import java.time.LocalDate;

public class Empleado extends Persona {
    private int codigo;
    private int numeroHorasExtra;
    private LocalDate ingreso;
    private String area;
    private String cargo;

    public Empleado(int dni, String nombre, String apellido, LocalDate nacimiento, String ciudadDeProcedencia, int codigo, int numeroHorasExtra, LocalDate ingreso, String area, String cargo) {
        super(dni,nombre,apellido,nacimiento,ciudadDeProcedencia);
        this.codigo = codigo;
        this.numeroHorasExtra = numeroHorasExtra;
        this.ingreso = ingreso;
        this.area = area;
        this.cargo = cargo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public int getNumeroHorasExtra() {
        return numeroHorasExtra;
    }

    public void setNumeroHorasExtra(int numeroHorasExtra) {
        this.numeroHorasExtra = numeroHorasExtra;
    }

    public LocalDate getIngreso() {
        return ingreso;
    }

    public void setIngreso(LocalDate ingreso) {
        this.ingreso = ingreso;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
