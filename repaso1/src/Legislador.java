public class Legislador {
    private String nombre;
    private String apellido;
    private Integer edad;
    private boolean esLegislador;
    private Provincia provincia;
    private String partido;
    private int nroDeLegislador;
    private int nroDeLegislador2;

    public Legislador(String nombre, String apellido, Integer edad, boolean esLegislador, Provincia provincia, String partido, int nroDeLegislador, int nroDeLegislador2) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.esLegislador = esLegislador;
        this.provincia = provincia;
        this.partido = partido;
        this.nroDeLegislador = nroDeLegislador;
        this.nroDeLegislador2 = nroDeLegislador2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    public boolean isEsLegislador() {
        return esLegislador;
    }

    public void setEsLegislador(boolean esLegislador) {
        this.esLegislador = esLegislador;
    }

    public Provincia getProvincia() {
        return provincia;
    }

    public void setProvincia(Provincia provincia) {
        this.provincia = provincia;
    }

    public String getPartido() {
        return partido;
    }

    public void setPartido(String partido) {
        this.partido = partido;
    }

    public int getNroDeLegislador() {
        return nroDeLegislador;
    }

    public void setNroDeLegislador(int nroDeLegislador) {
        this.nroDeLegislador = nroDeLegislador;
    }

    public int getNroDeLegislador2() {
        return nroDeLegislador2;
    }

    public void setNroDeLegislador2(int nroDeLegislador2) {
        this.nroDeLegislador2 = nroDeLegislador2;
    }
}
