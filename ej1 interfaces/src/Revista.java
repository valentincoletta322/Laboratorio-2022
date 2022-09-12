import org.w3c.dom.ls.LSOutput;

import javax.jws.soap.SOAPBinding;
import java.time.LocalDate;
import java.time.Period;

public class Revista extends Lectura implements FuncionesDelSistema{
    private LocalDate fechaDePublicacion;

    public Revista(int codigo, String titulo, int año, LocalDate fechaDePublicacion) {
        super(codigo, titulo, año);
        this.fechaDePublicacion = fechaDePublicacion;
    }

    public LocalDate getFechaDePublicacion() {
        return fechaDePublicacion;
    }

    public void setFechaDePublicacion(LocalDate fechaDePublicacion) {
        this.fechaDePublicacion = fechaDePublicacion;
    }

    @Override
    public String toString(){
        String myString;
        Lectura aux = this;
        myString = aux.toString()+" Fecha de publicacion: "+this.fechaDePublicacion.toString();
        return myString;
    }

    @Override
    public void prestar() {
            if(comprobar()) System.out.println("La revista será prestada");
            else System.out.println("La revista no puede ser prestada");
    }

    @Override
    public void agregarElemento() {
        if(comprobar()) System.out.println("La revista será ingresada al sistema");
        else System.out.println("La revista no puede ser ingresada al sistema");
    }

    @Override
    public boolean comprobar() {
        if(Period.between(this.fechaDePublicacion,LocalDate.now()).getMonths()>=3) return true;
        return false;
    }
}
