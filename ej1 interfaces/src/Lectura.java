abstract class Lectura extends Elemento {
    private int codigo;
    private String titulo;
    private int año;

    public Lectura(int codigo, String titulo, int año) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.año = año;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    @Override
    public String toString(){
        String myString = "Codigo: "+this.codigo+" Titulo: "+this.titulo+" Año: "+this.año;
        return myString;
    }

}
