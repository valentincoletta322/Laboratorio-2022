public class Impresora extends DispositivoSalida{
    private String tipo;

    public Impresora(String nombreDeFabricante, String modelo, float precio, int stock, String puertoValido, String tipo) {
        super(nombreDeFabricante, modelo, precio, stock, puertoValido);
        this.tipo = tipo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
}
