public class SensorTemperatura extends Alarma{
    public SensorTemperatura(boolean conectado, float valorUmbral, float medidaActual, int añoAdquisicion) {
        super(conectado, valorUmbral, medidaActual, añoAdquisicion);
    }

    @Override
    public void enviarMensaje(){
        System.out.println("Cuidado, la temperatura sube");
    }

    public void leerAlarma(){
        if (this.getMedidaActual()>this.getValorUmbral()) enviarMensaje();
    }

}
