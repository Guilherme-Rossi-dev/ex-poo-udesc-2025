package exercicio4oo.classes;

public class Retangulo {
    private double largura;
    private double altura;

    public void definirDimensoes(double largura, double altura) {
        this.largura = largura;
        this.altura = altura;
    }

    public double calcularArea() {
        return largura * altura;
    }

    public double calcularPerimetro() {
        return 2 * (largura + altura);
    }
}
