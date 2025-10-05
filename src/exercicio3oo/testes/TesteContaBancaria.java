package exercicio3oo.testes;

import exercicio3oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.setNumeroConta("12345");
        conta.setTitular("Guilherme");
        conta.setSaldo(1000);

        conta.depositar(500);
        conta.sacar(200);

        System.out.printf("Titular: %s%n", conta.getTitular());
        System.out.printf("Número da Conta: %s%n", conta.getNumeroConta());
        System.out.printf("Saldo: %.2f%n", conta.getSaldo());
    }
}
