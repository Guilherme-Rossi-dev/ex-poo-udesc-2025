package exercicio1oo;

public class TesteContaBancaria {
    public static void main(String[] args) {
        exercicio1oo.ContaBancaria conta = new exercicio1oo.ContaBancaria();
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
