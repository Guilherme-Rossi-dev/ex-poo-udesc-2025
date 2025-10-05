package exercicio3oo.testes;

import exercicio3oo.classes.Carro;

public class TesteCarro {
    public static void main(String[] args) {
        Carro carro = new Carro();
        carro.setMarca("Dodge");
        carro.setModelo("Viper");
        carro.setAno(2008);
        carro.setVelocidade(0);

        carro.acelerar(50);
        carro.frear(20);

        System.out.printf("Carro: %s %s%n", carro.getMarca(), carro.getModelo());
        System.out.printf("Ano: %d%n", carro.getAno());
        System.out.printf("Velocidade: %.2f km/h%n", carro.getVelocidade());
    }
}
