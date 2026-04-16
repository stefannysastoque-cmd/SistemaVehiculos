package Transporte;

public class Carro extends Vehiculo {
    private int numeroPuertas;

    public Carro(String placa, String marca, int velocidadMaxima, int numeroPuertas) {
        super(placa, marca, velocidadMaxima);
        this.numeroPuertas = numeroPuertas;
    }

    public void mover() {
        System.out.println("El carro se mueve por la via");
    }

    public double calcularPeaje() {
        return 5000;
    }
}
