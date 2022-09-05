public class Main {

    static void mostrarNombre(String nombre) throws NullPointerException {
        if (nombre==null) throw new NullPointerException();
        else System.out.println("El nombre es: " + nombre.length());
    }

    static void mostrarNombreConExcepcionPersonalizada(String nombre) throws NombreNulo {
        if (nombre==null) throw new NombreNulo("El nombre es null");
        else System.out.println("El nombre es: " + nombre.length());
    }

    public static void main(String[] args) {
        String nombre = null;
        /*
        try {
            System.out.println("El nombre es: " + nombre.length());
        }

        catch (Exception e){
            System.out.println("El valor es nulo");
        }
        System.out.println("Coletta, Chillemi y diaz");
        */

        /*
        if (nombre == null) throw new NullPointerException("El valor es nulo");
        else System.out.println("El nombre es: " + nombre.length());
        */

        try {
            mostrarNombreConExcepcionPersonalizada(nombre);
        }
        catch (NombreNulo e){
            e.printStackTrace();
            e.getMessage();
        }


    }
}
