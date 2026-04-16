package Transporte;

public class Vehiculo {
    private String placa;
    private String marca;
    private int velocidadMaxima;

    public Vehiculo(String placa, String marca, int velocidadMaxima) {
        this.placa = placa;
        this.marca = marca;
        this.velocidadMaxima = velocidadMaxima;
    }

    public void mover() {
        System.out.println("El vehiculo se esta moviendo");
    }

    public double calcularPeaje() {
        return 0;
    }
}
