package exercicio1oo;

public class TesteCirculo {
    public static void main(String[] args) {
        exercicio1oo.Circulo c = new exercicio1oo.Circulo();
        c.raio = 10;

        System.out.println("Área: " + c.calcularArea());
        System.out.println("Perímetro: " + c.calcularPerimetro());
    }
}
