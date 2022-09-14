import java.util.HashSet;

public class NominaLegisladores {
    private HashSet<Legislador> listaLegisladores;

    public NominaLegisladores() {
        this.listaLegisladores = new HashSet<>();
    }

    public int getTamaño(){
        return this.listaLegisladores.size();
    }

    public void agregarLegislador(Legislador leg){
        this.listaLegisladores.add(leg);
    }

    public void muestraContenido(){
        for (Legislador leg:this.listaLegisladores){
            leg.toString();
        }
    }
}
