package exercicio4oo.testes;

import exercicio4oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.definirRaio(4);

        System.out.printf("Raio: %.2f%n", 4.0);
        System.out.printf("Diâmetro: %.2f%n", c.calcularDiametro());
        System.out.printf("Área: %.2f%n", c.calcularDiametro());
        System.out.printf("Perímetro: %.2f%n", c.calcularPerimetro());
    }
}
