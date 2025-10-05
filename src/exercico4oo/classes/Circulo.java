package exercicio4oo.classes;

public class Circulo {
    private double raio;

    public void definirRaio(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
