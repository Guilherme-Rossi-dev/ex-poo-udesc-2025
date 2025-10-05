package exercicio1oo;

public class TesteRetangulo {
    public static void main(String[] args) {
        exercicio1oo.Retangulo r = new exercicio1oo.Retangulo();
        r.largura = 5;
        r.altura = 3;

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}
