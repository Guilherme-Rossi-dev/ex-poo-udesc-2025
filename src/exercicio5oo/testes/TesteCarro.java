package exercicio5oo.testes;

import exercicio5oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("Viper");

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        carro.frear();

        carro.imprimirVelocidade();

        System.out.println(carro.toString());

        Carro carro2 = new Carro("Dodge Challenger", 50);
        carro2.acelerar();
        carro2.imprimirVelocidade();
        System.out.println(carro2.toString());
    }
}
