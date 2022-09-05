import java.util.ArrayList;
import java.util.HashSet;

public class Main {

    public static void main(String[] args){

        SensorHumo humo1 = new SensorHumo(true,10,5,2002);
        SensorHumo humo2 = new SensorHumo(true,10,16,2002);
        SensorHumo humo3 = new SensorHumo(true,10,10,2002);

        ArrayList<Alarma> humos = new ArrayList<>();
        humos.add(humo1);
        humos.add(humo2);
        humos.add(humo3);

        SensorTemperatura temp1 = new SensorTemperatura(true,32,40,2002);
        SensorTemperatura temp2 = new SensorTemperatura(true,32,52,2002);
        SensorTemperatura temp3 = new SensorTemperatura(true,32,32,2002);

        ArrayList<Alarma> temps = new ArrayList<>();
        temps.add(temp1);
        temps.add(temp2);
        temps.add(temp3);

        ArrayList<ArrayList<Alarma>> alarmas = new ArrayList<>();
        for(int i = 0; i<2;i++){
            if (i==0) alarmas.add(humos);
            else alarmas.add(temps);
        }

        while (true){
            for (ArrayList<Alarma> unaLista:alarmas){
                int cont = 0;
                float total = 0;
                for(Alarma unaAlarma : unaLista){
                    if (unaAlarma.isConectado()) {
                        cont++;
                        total+=unaAlarma.getMedidaActual();
                    }
                }
                if (total/cont>unaLista.get(0).getValorUmbral()) unaLista.get(0).enviarMensaje();
            }
            break;
        }
    }

}
