package exercicio5oo.testes;

import exercicio5oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.definirRaio(4);

        System.out.printf("Raio: %.2f%n", 4.0);
        System.out.printf("Diâmetro: %.2f%n", c.calcularDiametro());
        System.out.printf("Área: %.2f%n", c.calcularArea());
        System.out.printf("Perímetro: %.2f%n", c.calcularPerimetro());

        System.out.println(c.toString());

        Circulo c2 = new Circulo(5);
        System.out.println(c2.toString());
        System.out.printf("Área: %.2f%n", c2.calcularArea());
    }
}

