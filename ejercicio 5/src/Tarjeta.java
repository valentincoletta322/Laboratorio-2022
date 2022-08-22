public class Tarjeta {
    private char tipo; //'c' o 'd' para credito o debito
    private String banco;
    private int numero;
    private String usuarioPropietario;

    public Tarjeta(char tipo, String banco, int numero, String usuarioPropietario) {
        this.tipo = tipo;
        this.banco = banco;
        this.numero = numero;
        this.usuarioPropietario = usuarioPropietario;
    }

    public String getUsuarioPropietario() {
        return usuarioPropietario;
    }

    public void setUsuarioPropietario(String usuarioPropietario) {
        this.usuarioPropietario = usuarioPropietario;
    }

    public char getTipo() {
        return tipo;
    }

    public void setTipo(char tipo) {
        this.tipo = tipo;
    }

    public String getBanco() {
        return banco;
    }

    public void setBanco(String banco) {
        this.banco = banco;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }
}
