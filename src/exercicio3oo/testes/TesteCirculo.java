package exercicio3oo.testes;

import exercicio3oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.setRaio(4);

        System.out.printf("Área: %.2f%n", c.calcularArea());
        System.out.printf("Perímetro: %.2f%n", c.calcularPerimetro());
    }
}
