package exercicio2oo.testes;

import exercicio2oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.numeroConta = "12345";
        conta.titular = "Guilherme";
        conta.saldo = 1000;

        conta.depositar(500);
        System.out.println("Saldo após depósito: " + conta.consultarSaldo());

        boolean saque = conta.sacar(300);
        System.out.println("Saque realizado? " + saque);
        System.out.println("Saldo final: " + conta.consultarSaldo());
    }
}
