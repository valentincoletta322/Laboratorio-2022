public class Pantalon extends Prenda implements FuncionesDelSistema{
    private float medidasCintura;
    private float medidasCadera;
    private float largo;

    public Pantalon(float medidasCintura, float medidasCadera, float largo) {
        super();
        this.medidasCintura = medidasCintura;
        this.medidasCadera = medidasCadera;
        this.largo = largo;
    }

    @Override
    public String toString(){
        Prenda aux = this;
        String myString = aux.toString()+" Cadera: "+this.medidasCadera+" Cintura: "+this.medidasCintura+" Largo: "+largo;
        return myString;
    }

    @Override
    public void prestar() {
        if(comprobar()) System.out.println("El pantalón será prestado");
        else System.out.println("El pantalón no se prestará");
    }

    @Override
    public void agregarElemento() {
        if(comprobar()) System.out.println("El pantalón será ingresado al sistema");
        else System.out.println("El pantalón no se puede ingresar al sistema");
    }

    @Override
    public boolean comprobar() {
        if(this.getEstado().equals("Buen estado")) return true;
        return false;
    }
}
