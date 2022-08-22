public class Pelicula {
    private String director;
    private int edadMinima;
    private String titulo;

    public Pelicula(String director, int edadMinima, String titulo) {
        this.director = director;
        this.edadMinima = edadMinima;
        this.titulo = titulo;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }

    public int getEdadMinima() {
        return edadMinima;
    }

    public void setEdadMinima(int edadMinima) {
        this.edadMinima = edadMinima;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }
}
