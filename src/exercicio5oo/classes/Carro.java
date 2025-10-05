package exercicio5oo.classes;

public class Carro {
    private String modelo;
    private double velocidadeAtual;

    public Carro() {
        this.modelo = "";
        this.velocidadeAtual = 0;
    }

    public Carro(String modelo, double velocidadeAtual) {
        this.modelo = modelo;
        this.velocidadeAtual = velocidadeAtual;
    }

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

    public String toString() {
        return "Carro{" +
                "modelo='" + modelo + '\'' +
                ", velocidadeAtual=" + velocidadeAtual +
                '}';
    }
}
