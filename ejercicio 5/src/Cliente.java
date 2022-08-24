import java.lang.reflect.Array;
import java.util.ArrayList;

public class Cliente {
    private String usuario;
    private String nombreCompleto;
    private int celular;

    public Compra hacerCompra(){
        ArrayList<Componente> listaDeComponentes = new ArrayList<>();
        Compra unaCompra = new Compra(this, listaDeComponentes);
        return unaCompra;
    }
}
