package exercicio5oo.testes;

import exercicio5oo.classes.ContaBancaria;

public class TesteContaBancaria {
    public static void main(String[] args) {
        ContaBancaria conta = new ContaBancaria();
        conta.definirConta("12345", "Guilherme");

        conta.depositar(500);
        conta.sacar(200);
        conta.sacar(2000); // deve imprimir "Saldo insuficiente!"

        conta.imprimirSaldo();

    }
}
