public class Remera extends Prenda implements FuncionesDelSistema{
    private float medidasDeEspalda;
    private float medidasContorno;
    private float largoDeTorso;

    public Remera(float medidasDeEspalda, float medidasContorno, float largoDeTorso) {
        this.medidasDeEspalda = medidasDeEspalda;
        this.medidasContorno = medidasContorno;
        this.largoDeTorso = largoDeTorso;
    }

    public float getMedidasDeEspalda() {
        return medidasDeEspalda;
    }

    public void setMedidasDeEspalda(float medidasDeEspalda) {
        this.medidasDeEspalda = medidasDeEspalda;
    }

    public float getMedidasContorno() {
        return medidasContorno;
    }

    public void setMedidasContorno(float medidasContorno) {
        this.medidasContorno = medidasContorno;
    }

    public float getLargoDeTorso() {
        return largoDeTorso;
    }

    public void setLargoDeTorso(float largoDeTorso) {
        this.largoDeTorso = largoDeTorso;
    }

    @Override
    public String toString(){
        Prenda aux = this;
        String myString = aux.toString()+" Contorno: "+this.medidasContorno+" Espalda: "+this.medidasDeEspalda+" Largo: "+largoDeTorso;
        return myString;
    }

    @Override
    public void prestar() {
        if(comprobar()) System.out.println("La remera será prestada");
        else System.out.println("La remera no se prestará");
    }

    @Override
    public void agregarElemento() {
        if(comprobar()) System.out.println("La remera será ingresada al sistema");
        else System.out.println("La remera no se puede ingresar al sistema");
    }

    @Override
    public boolean comprobar() {
        if(this.getEstado().equals("Buen estado")) return true;
        return false;
    }
}
