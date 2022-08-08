import java.text.DecimalFormat;
import java.util.Scanner;

public class Cuenta {

    private String nombreCliente;
    private int numeroDeCuenta;
    private float interes;
    private float saldo;

    public Cuenta() {
        this.nombreCliente =  "John Fall Guy";
        this.numeroDeCuenta = 123;
        this.interes = 50.2f;
        this.saldo = 40;
    }

    public Cuenta(String nombreCliente, int numeroDeCuenta, float interes, float saldo) {
        this.nombreCliente = nombreCliente;
        this.numeroDeCuenta = numeroDeCuenta;
        this.interes = interes;
        this.saldo = saldo;
    }

    public Cuenta(int numeroDeCuenta) {
        this.nombreCliente =  "King Kong";
        this.interes = 50.2f;
        this.saldo = 40;
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int getNumeroDeCuenta() {
        return numeroDeCuenta;
    }

    public void setNumeroDeCuenta(int numeroDeCuenta) {
        this.numeroDeCuenta = numeroDeCuenta;
    }

    public float getInteres() {
        return interes;
    }

    public void setInteres(float interes) {
        this.interes = interes;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public boolean intentarExtraerDinero(float extraccion){

        if (this.saldo>=extraccion){
            return true;
        }
        return false;
    }
    public void extraerDinero(){
        float extraccion = ingresoScanner();
        if (intentarExtraerDinero(extraccion)){
            System.out.println("Extraccion realizada");
        }
        else System.out.println("No se pudo hacer la extraccion");
    }

    public void ingresarDinero(float dinero){
        this.saldo+=dinero;
    }

    public void transferirDinero(Cuenta unaCuenta){
        float extraccion = ingresoScanner();
        if (intentarExtraerDinero(extraccion)){
            System.out.println("Extraccion realizada");
        }
        unaCuenta.ingresarDinero(extraccion);
    }

    public void modNum(int num){
        num = num+1;
    }
    public float ingresoScanner(){
        Scanner ingreso0 = new Scanner(System.in);
        float dinero = ingreso0.nextFloat();
        return dinero;
    }

    public static void main(String[] args){
        int uno = 1;
        Cuenta newCuenta = new Cuenta();
        newCuenta.modNum(uno);
        System.out.println(uno);
    }
}

