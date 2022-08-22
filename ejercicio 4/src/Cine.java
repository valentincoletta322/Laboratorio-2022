import java.util.HashSet;

public class Cine {
    private Pelicula peliculaActual;
    private float precio;

    private HashSet<Asiento> asientos;

    public Cine(Pelicula peliculaActual, float precio) {
        this.peliculaActual = peliculaActual;
        this.precio = precio;
        this.asientos=new HashSet<>();
        for (int i = 1; i<5; i++){
            for (char j = 'a'; j<='i'; j++){
                Asiento unAsiento = new Asiento(j,i);
                this.asientos.add(unAsiento);
                System.out.println(i+""+j);
            }
        }
    }

    public Pelicula getPeliculaActual() {
        return peliculaActual;
    }

    public void setPeliculaActual(Pelicula peliculaActual) {
        this.peliculaActual = peliculaActual;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public boolean hayAsiento(){

        for(Asiento unAsiento : this.asientos){
            if (unAsiento.isLibre()){
                this.asientos.remove(unAsiento);
                unAsiento.setLibre(false);
                System.out.println(unAsiento.getFila()+" "+unAsiento.getColumna());
                return true;
            }
        }
        return false;
    }

    public void puedeComprar(Espectador unEspectador){
        if (hayAsiento() && unEspectador.getEdad()>=this.peliculaActual.getEdadMinima()){
            float dinero = unEspectador.getDinero();
            if (dinero>=this.precio) unEspectador.setDinero(dinero-this.precio);
            else System.out.println("No tiene dinero");
        }
        else System.out.println("No puede ver la pelicula");
    }



    public static void main(String[] args){
    }

}
