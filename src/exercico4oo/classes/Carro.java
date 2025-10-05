package exercicio4oo.classes;

public class Carro {
    private String modelo;
    private double velocidadeAtual;

    public void definirModelo(String modelo) {
        this.modelo = modelo;
    }

    public void acelerar() {
        velocidadeAtual += 10;
    }

    public void frear() {
        velocidadeAtual = Math.max(0, velocidadeAtual - 10);
    }

    public void imprimirVelocidade() {
        System.out.println("Modelo: " + modelo);
        System.out.println("Velocidade atual: " + velocidadeAtual + " km/h");
    }
}