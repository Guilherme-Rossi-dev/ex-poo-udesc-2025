package exercicio1oo;

class Carro {
    String modelo;
    String marca;
    int ano;
    double velocidade;

    void acelerar(double valor) {
        velocidade += valor;
    }

    void frear(double valor) {
        velocidade -= valor;
        if (velocidade < 0) velocidade = 0;
    }

    void exibirDados() {
        System.out.println("Modelo: " + modelo + ", Marca: " + marca + ", Ano: " + ano + ", Velocidade: " + velocidade);
    }
}
