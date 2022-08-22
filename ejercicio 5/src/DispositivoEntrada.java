public class DispositivoEntrada extends Componente {
    private String conector;
    private String puertoValido;

    public DispositivoEntrada(String conector, String puertoValido,String nombreDeFabricante, String modelo, float precio, int stock) {
        super(nombreDeFabricante,modelo,precio,stock);
        this.conector = conector;
        this.puertoValido = puertoValido;
    }

    public String getConector() {
        return conector;
    }

    public void setConector(String conector) {
        this.conector = conector;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }
}
