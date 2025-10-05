package exercicio2oo.testes;

import exercicio2oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro c = new Carro();
        c.modelo = "Viper";
        c.marca = "Dodge";
        c.ano = 2008;
        c.velocidade = 0;

        c.acelerar(60);
        c.exibirDados();

        c.frear(30);
        c.exibirDados();
    }
}
