package exercicio4oo.testes;

import exercicio4oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.definirModelo("Viper");

        carro.acelerar();
        carro.acelerar();
        carro.acelerar();

        carro.frear();

        carro.imprimirVelocidade();
    }
}
