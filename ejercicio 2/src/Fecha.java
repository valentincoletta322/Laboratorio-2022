public class Fecha {

    private int dia;
    private int mes;
    private int año;

    public Fecha(int dia, int mes, int año) {
        this.dia = dia;
        this.mes = mes;
        this.año = año;
        if (comprobarFecha()){
            System.out.println("Fecha válida");
        }
        else System.out.println("Fecha inválida");
    }

    public boolean comprobarFecha(){
        if (comprobarMes()){
            return comprobarDia(diasDelMes());
        }
        return false;
    }

    public boolean comprobarMes(){
        if (this.mes>12||this.mes<1){
            return false;
        }
        return true;
    }

    public int diasDelMes(){
        if (this.mes==2) {
            if ((this.año % 4 == 0) && ((this.año % 100 != 0) || (this.año % 400 == 0)))
                return 29;
            else return 28;
        }
        else if (this.mes==1||this.mes==3||this.mes==5||this.mes==7||this.mes==8||this.mes==10||this.mes==12){
            return 31;
        }
        else return 30;
    }

    public boolean comprobarDia(int dias){
        dias = diasDelMes();
        if (this.dia<0||this.dia>dias) return false;
        else return true;
    }

    public static void main(String[] args){
        Fecha unaFecha = new Fecha(29,2,2023);
    }
}

