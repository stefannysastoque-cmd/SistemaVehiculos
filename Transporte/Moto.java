package Transporte;

public class Moto extends Vehiculo {
    private String tipo;

    public Moto(String placa, String marca, int velocidadMaxima, String tipo) {
        super(placa, marca, velocidadMaxima);
        this.tipo = tipo;
    }

    public void mover() {
        System.out.println("La moto se mueve rapido");
    }

    public double calcularPeaje() {
        return 2000;
    }
}
