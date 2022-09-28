import java.time.LocalDate;
import java.util.regex.*;
public class Administrativo extends Externo{
    private String usuario;
    private String contraseña;

    public Administrativo(String usuario, String contraseña, String nombreInstitucion, String direccionInstitucion, Banco banco, LocalDate fechaDeCobro, LocalDate fechaDeAlta) {
        super(nombreInstitucion, direccionInstitucion, banco, fechaDeCobro, fechaDeAlta);
        this.usuario = usuario;
        this.contraseña = contraseña;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public boolean checkContraseña(String str){
        String regex = "^(?=.*[a-z])(?=."
                + "*[A-Z])(?=.*\\d)"
                + "(?=.*[-+_!@#$%^&*., ?]).+$";

        // Compile the ReGex
        Pattern p = Pattern.compile(regex);

        // If the string is empty
        // then print No
        if (str == null) {
            System.out.println("No");
            return false;
        }

        // Find match between given string
        // & regular expression
        Matcher m = p.matcher(str);

        // Print Yes if string
        // matches ReGex
        if (m.matches())
            return true;
        else
            return false;
    }

    @Override
    public void accionVoluntaria(){
        System.out.printf(usuario+" "+this.getNombre());
    }


}
