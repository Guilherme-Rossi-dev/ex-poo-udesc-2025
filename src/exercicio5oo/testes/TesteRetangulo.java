package exercicio5oo.testes;

import exercicio5oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r1 = new Retangulo();
        r1.definirDimensoes(5, 10);

        System.out.printf("Área: %.2f%n", r1.calcularArea());
        System.out.printf("Perímetro: %.2f%n", r1.calcularPerimetro());
        System.out.println(r1.toString());

        Retangulo r2 = new Retangulo(7, 4);
        System.out.println(r2.toString());
    }
}

