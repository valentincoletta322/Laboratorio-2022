public class SensorHumo extends Alarma{
    public SensorHumo(boolean conectado, float valorUmbral, float medidaActual, int añoAdquisicion) {
        super(conectado, valorUmbral, medidaActual, añoAdquisicion);
    }

    @Override
    public void enviarMensaje(){
        System.out.println("Llamando a los bomberos");
    }

    public void leerAlarma(){
        if (this.getMedidaActual()>this.getValorUmbral()) enviarMensaje();
    }

}
