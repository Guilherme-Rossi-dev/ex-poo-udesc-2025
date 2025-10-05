package exercicio1oo;

public class TesteCarro {
    public static void main(String[] args) {
        exercicio1oo.Carro c = new exercicio1oo.Carro();
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
