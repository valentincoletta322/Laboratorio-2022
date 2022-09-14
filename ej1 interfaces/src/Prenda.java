abstract class Prenda extends Elemento {
    private String color;
    private String material;
    private String marca;
    private String estado;

    public Prenda() {
        super();
        this.color = "Blanco";
        this.material = "Seda";
        this.marca = "T1";
        this.estado = "Buen estado";
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString(){
        String myString = "Color: "+this.color+" Material: "+this.material+" Marca: "+this.marca+" Estado: "+this.estado;
        return myString;
    }

}
