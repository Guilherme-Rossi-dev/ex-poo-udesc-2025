package exercicio5oo.classes;

public class Circulo {
    private double raio;

    public Circulo() {
        this.raio = 0;
    }

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void definirRaio(double raio) {
        this.raio = raio;
    }

    public double calcularDiametro() {
        return 2 * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public String toString() {
        return "Circulo{" +
                "raio=" + raio +
                '}';
    }
}
