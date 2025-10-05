package exercicio4oo.testes;

import exercicio4oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.definirDimensoes(5, 10);

        System.out.printf("Área: %.2f%n", r.calcularArea());
        System.out.printf("Perímetro: %.2f%n", r.calcularPerimetro());
    }
}
