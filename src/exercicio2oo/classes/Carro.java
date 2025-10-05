package exercicio2oo.classes;

public class Carro {
    public String modelo;
    public String marca;
    public int ano;
    public double velocidade;

    public void acelerar(double valor) {
        velocidade += valor;
    }

    public void frear(double valor) {
        velocidade -= valor;
        if (velocidade < 0) velocidade = 0;
    }

    public void exibirDados() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Velocidade: " + velocidade);
    }
}
