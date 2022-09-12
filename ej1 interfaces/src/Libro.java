import java.util.HashMap;

public class Libro extends Lectura implements FuncionesDelSistema{
    private HashMap<Integer, Integer> paginasPorCapitulo;

    public Libro(int codigo, String titulo, int año, HashMap<Integer, Integer> paginasPorCapitulo) {
        super(codigo, titulo, año);
        this.paginasPorCapitulo = new HashMap<>();
    }

    public HashMap<Integer, Integer> getPaginasPorCapitulo() {
        return paginasPorCapitulo;
    }

    public void setPaginasPorCapitulo(HashMap<Integer, Integer> paginasPorCapitulo) {
        this.paginasPorCapitulo = paginasPorCapitulo;
    }

    @Override
    public String toString(){
        String myString;
        Lectura aux = this;
        myString = aux.toString()+" Capitulo-Paginas: "+this.paginasPorCapitulo.toString();
        return myString;
    }

    @Override
    public void prestar() {
        if(comprobar()) System.out.println("El libro sera prestado");
        else System.out.println("El libro no sera prestado");
    }

    @Override
    public void agregarElemento() {
        if(comprobar()) System.out.println("El libro cumple con las caracteristicas");
        else System.out.println("El libro no cumple con las caracteristicas");
    }

    @Override
    public boolean comprobar() {
        if(this.paginasPorCapitulo.size()%2!=0) return true;
            return false;
    }


}
