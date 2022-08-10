import java.nio.DoubleBuffer;
import java.util.HashMap;

import static java.lang.Math.sqrt;

public class Polinomio {
    private Double a;
    private Double b;
    private Double c;

    public Polinomio(Double a, Double b, Double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public Double calcularDiscriminante(){
        return (b*b)-(4*a*c);
    }

    public HashMap<Integer,Double> calcularResultado(){
        HashMap<Integer, Double> resultados = new HashMap<>();

        if (calcularDiscriminante()>0){
            resultados.put(1,(-b+sqrt((b*b)-(4*a*c))/2*a));
            resultados.put(2,(-b-sqrt((b*b)-(4*a*c))/2*a));
        }

        else if (calcularDiscriminante()==0){
            resultados.put(1,(-b+sqrt((b*b)-(4*a*c))/2*a));
        }

        return resultados;
    }

    public static void main(String[] args){
        Polinomio unPolinomio = new Polinomio(2.0,1.0,0.0);
        System.out.println(unPolinomio.calcularResultado());
    }
}
