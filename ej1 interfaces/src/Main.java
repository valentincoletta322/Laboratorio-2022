import java.util.HashSet;

public class Main {

    public static void main(String[] args){
        HashSet<Elemento> lista = new HashSet<>();
        Pantalon lompa = new Pantalon(10, 20, 30);
        lompa.agregarElemento();
        if (lompa.comprobar()) lista.add(lompa);
    }
}
