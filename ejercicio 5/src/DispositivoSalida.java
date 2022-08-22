public class DispositivoSalida extends Componente{
    private String puertoValido;

    public DispositivoSalida(String nombreDeFabricante, String modelo, float precio, int stock, String puertoValido) {
        super(nombreDeFabricante, modelo, precio, stock);
        this.puertoValido = puertoValido;
    }

    public String getPuertoValido() {
        return puertoValido;
    }

    public void setPuertoValido(String puertoValido) {
        this.puertoValido = puertoValido;
    }
}
