package Transporte;

public class Camion extends Vehiculo {
    private double capacidadCarga;

    public Camion(String placa, String marca, int velocidadMaxima, double capacidadCarga) {
        super(placa, marca, velocidadMaxima);
        this.capacidadCarga = capacidadCarga;
    }

    public void mover() {
        System.out.println("El camion transporta carga");
    }

    public double calcularPeaje() {
        return 10000;
    }
}
