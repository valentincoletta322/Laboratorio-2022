public class SensorPresion extends Alarma{
    public SensorPresion(boolean conectado, float valorUmbral, float medidaActual, int añoAdquisicion) {
        super(conectado, valorUmbral, medidaActual, añoAdquisicion);
    }

    @Override
    public void enviarMensaje(){
        System.out.println("Sensor de presion activado");
    }

    public void leerAlarma(){
        if (this.getMedidaActual()>this.getValorUmbral()) this.enviarMensaje();
    }

}
