import java.util.HashSet;

public class Asiento {
    private int fila;
    private char columna;

    private boolean libre;

    public Asiento(char columna, int fila) {
        this.columna = columna;
        this.fila = fila;
        this.libre = true;
    }

    public int getFila() {
        return fila;
    }

    public void setFila(int fila) {
        this.fila = fila;
    }

    public char getColumna() {
        return columna;
    }

    public void setColumna(char columna) {
        this.columna = columna;
    }

    public boolean isLibre() {
        return libre;
    }

    public void setLibre(boolean libre) {
        this.libre = libre;
    }
}
