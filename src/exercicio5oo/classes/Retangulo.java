package exercicio5oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public Retangulo() {
        this.largura = 0;
        this.altura = 0;
    }

    public Retangulo(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public void definirDimensoes(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    // Método para calcular perímetro
    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }

    public String toString() {
        return "Retangulo{" +
                "largura=" + largura +
                ", altura=" + altura +
                ", area=" + calcularArea() +
                ", perimetro=" + calcularPerimetro() +
                '}';
    }
}
