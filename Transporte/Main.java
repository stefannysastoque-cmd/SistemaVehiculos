package Transporte;

public class Main {
    public static void main(String[] args) {

        Carro c = new Carro("ABC123", "Mazda", 180, 4);
        Moto m = new Moto("XYZ456", "Yamaha", 120, "Deportiva");
        Camion ca = new Camion("LMN789", "Volvo", 100, 8);

        c.mover();
        System.out.println(c.calcularPeaje());

        m.mover();
        System.out.println(m.calcularPeaje());

        ca.mover();
        System.out.println(ca.calcularPeaje());
    }
}
