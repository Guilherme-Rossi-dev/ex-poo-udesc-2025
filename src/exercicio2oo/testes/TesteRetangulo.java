package exercicio2oo.testes;

import exercicio2oo.classes.Retangulo;

public class TesteRetangulo {
    public static void main(String[] args) {
        Retangulo r = new Retangulo();
        r.largura = 5;
        r.altura = 3;

        System.out.println("Área: " + r.calcularArea());
        System.out.println("Perímetro: " + r.calcularPerimetro());
    }
}
