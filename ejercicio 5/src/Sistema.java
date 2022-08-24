import java.util.ArrayList;
import java.util.HashSet;

public class Sistema {
    private ArrayList<Compra> pedidosDeCompra;
    private ArrayList<Cliente> clientes;

    private HashSet<Componente> componentes;

    public Sistema() {
        this.pedidosDeCompra = new ArrayList<>();
        this.clientes = new ArrayList<>();
        this.componentes = new HashSet<>();
    }

    public HashSet<Componente> getComponentes() {
        return componentes;
    }

    public void setComponentes(HashSet<Componente> componentes) {
        this.componentes = componentes;
    }

    public ArrayList<Compra> getPedidosDeCompra() {
        return pedidosDeCompra;
    }

    public void setPedidosDeCompra(ArrayList<Compra> pedidosDeCompra) {
        this.pedidosDeCompra = pedidosDeCompra;
    }

    public ArrayList<Cliente> getClientes() {
        return clientes;
    }

    public void setClientes(ArrayList<Cliente> clientes) {
        this.clientes = clientes;
    }
}
