public class Alarma {
    private boolean conectado;
    private float valorUmbral;
    private float medidaActual;
    private int añoAdquisicion;

    public Alarma(boolean conectado, float valorUmbral, float medidaActual, int añoAdquisicion) {
        this.conectado = conectado;
        this.valorUmbral = valorUmbral;
        this.medidaActual = medidaActual;
        this.añoAdquisicion = añoAdquisicion;
    }

    public boolean isConectado() {
        return conectado;
    }

    public void setConectado(boolean conectado) {
        this.conectado = conectado;
    }

    public float getValorUmbral() {
        return valorUmbral;
    }

    public void setValorUmbral(float valorUmbral) {
        this.valorUmbral = valorUmbral;
    }

    public int getAñoAdquisicion() {
        return añoAdquisicion;
    }

    public void setAñoAdquisicion(int añoAdquisicion) {
        this.añoAdquisicion = añoAdquisicion;
    }

    public float getMedidaActual() {
        return medidaActual;
    }

    public void setMedidaActual(float medidaActual) {
        this.medidaActual = medidaActual;
    }

    public void enviarMensaje(){
        System.out.println("Alarma activada");
    }

}

