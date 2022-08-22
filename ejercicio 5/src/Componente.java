public abstract class Componente {
    private String nombreDeFabricante;
    private String modelo;
    private float precio;
    private int stock;

    public Componente(String nombreDeFabricante, String modelo, float precio, int stock) {
        this.nombreDeFabricante = nombreDeFabricante;
        this.modelo = modelo;
        this.precio = precio;
        this.stock = stock;
    }

    public String getNombreDeFabricante() {
        return nombreDeFabricante;
    }

    public void setNombreDeFabricante(String nombreDeFabricante) {
        this.nombreDeFabricante = nombreDeFabricante;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }
}
