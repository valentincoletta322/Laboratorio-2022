public class Voluntario extends Persona{
    private int puntaje;

    public Voluntario(int puntaje) {
        this.puntaje = puntaje;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }


    @Override
    public void accionVoluntaria(){
        System.out.println("Ofrezco mi ayuda");
        this.puntaje++;
    }
}
