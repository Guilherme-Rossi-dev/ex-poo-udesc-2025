package exercicio2oo.testes;

import exercicio2oo.classes.Circulo;

public class TesteCirculo {
    public static void main(String[] args) {
        Circulo c = new Circulo();
        c.raio = 10;

        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}
