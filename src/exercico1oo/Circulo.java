package exercicio1oo;

class Circulo {
    double raio;

    double calcularArea() {
        return Math.PI * raio * raio;
    }

    double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }
}
