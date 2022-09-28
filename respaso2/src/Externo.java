import java.time.LocalDate;

public class Externo extends Persona{
    private String nombreInstitucion;
    private String direccionInstitucion;
    private Banco banco;
    private LocalDate fechaDeCobro;
    private LocalDate fechaDeAlta;

    public Externo(String nombreInstitucion, String direccionInstitucion, Banco banco, LocalDate fechaDeCobro, LocalDate fechaDeAlta) {
        super();
        this.nombreInstitucion = nombreInstitucion;
        this.direccionInstitucion = direccionInstitucion;
        this.banco = banco;
        this.fechaDeCobro = fechaDeCobro;
        this.fechaDeAlta = fechaDeAlta;
    }

    public Externo() {
    }

    public String getNombreInstitucion() {
        return nombreInstitucion;
    }

    public void setNombreInstitucion(String nombreInstitucion) {
        this.nombreInstitucion = nombreInstitucion;
    }

    public String getDireccionInstitucion() {
        return direccionInstitucion;
    }

    public void setDireccionInstitucion(String direccionInstitucion) {
        this.direccionInstitucion = direccionInstitucion;
    }

    public Banco getBanco() {
        return banco;
    }

    public void setBanco(Banco banco) {
        this.banco = banco;
    }

    public LocalDate getFechaDeCobro() {
        return fechaDeCobro;
    }

    public void setFechaDeCobro(LocalDate fechaDeCobro) {
        this.fechaDeCobro = fechaDeCobro;
    }

    public LocalDate getFechaDeAlta() {
        return fechaDeAlta;
    }

    public void setFechaDeAlta(LocalDate fechaDeAlta) {
        this.fechaDeAlta = fechaDeAlta;
    }

}
