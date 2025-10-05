package exercicio3oo.testes;

import exercicio3oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.setLargura(5);
        r.setAltura(10);

        System.out.printf("Área: %.2f%n", r.calcularArea());
        System.out.printf("Perímetro: %.2f%n", r.calcularPerimetro());
    }
}
