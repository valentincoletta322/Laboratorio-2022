import com.sun.xml.internal.ws.api.ComponentRegistry;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;

public class Compra {
    private Cliente clienteAsociado;
    private ArrayList<Componente> listaDeComponentes;
    public Compra(Cliente clienteAsociado, ArrayList<Componente> listaDeComponentes){
        this.clienteAsociado = clienteAsociado;
        this.listaDeComponentes = listaDeComponentes;
    }

    public float calcularPrecio(){
        float precio = 0;
        for(Componente unComponente : this.listaDeComponentes){
            precio+=unComponente.getPrecio();
        }
        return precio;
    }

    public boolean compraPosible(){
        boolean cpu = false, entrada = false, salida = false;
        for(Componente unComponente : this.listaDeComponentes){
            if(unComponente.getClass().equals("DispositivoEntrada")) entrada = true;
            else if(unComponente.getClass().equals("DispositivoSalida")) salida = true;
            else if(unComponente.getClass().equals("Cpu")) cpu = true;
            if (cpu&&entrada&&salida) return true;
        }
        return false;
    }

    public Cliente getClienteAsociado() {
        return clienteAsociado;
    }

    public void setClienteAsociado(Cliente clienteAsociado) {
        this.clienteAsociado = clienteAsociado;
    }

    public ArrayList<Componente> getListaDeComponentes() {
        return listaDeComponentes;
    }

    public void setListaDeComponentes(ArrayList<Componente> listaDeComponentes) {
        this.listaDeComponentes = listaDeComponentes;
    }
}
