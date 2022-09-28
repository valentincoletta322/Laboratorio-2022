public class Persona {
    public String nombre;
    public int edad;

    public Persona() {
        this.nombre = "Juan";
        this.edad = 18;
    }

    public void accionVoluntaria(){
    }

    public Persona(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean esMayor(){
        return this.edad>=18;
    }

}
