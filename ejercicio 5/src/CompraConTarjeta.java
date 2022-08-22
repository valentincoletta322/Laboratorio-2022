import java.util.ArrayList;

public class CompraConTarjeta extends Compra{
    private Tarjeta tarjetaAsociada;

    public CompraConTarjeta(Cliente clienteAsociado, ArrayList<Componente> listaDeComponentes, Tarjeta tarjetaAsociada) {
        super(clienteAsociado, listaDeComponentes);
        this.tarjetaAsociada = tarjetaAsociada;
    }

    public Tarjeta getTarjetaAsociada() {
        return tarjetaAsociada;
    }

    public void setTarjetaAsociada(Tarjeta tarjetaAsociada) {
        this.tarjetaAsociada = tarjetaAsociada;
    }

    @Override
    public float calcularPrecio(){
        float precio = 0;
        for(Componente unComponente : this.getListaDeComponentes()){
            precio+=unComponente.getPrecio();
        }
        return precio+(5*100/precio);
    }

    static int recargo = 5;

}
