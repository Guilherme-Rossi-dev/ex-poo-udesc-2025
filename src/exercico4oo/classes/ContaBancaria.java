package exercicio4oo.classes;

public class ContaBancaria {
    private String numeroConta;
    private String titular;
    private double saldo;

    public void definirConta(String numeroConta, String titular) {
        this.numeroConta = numeroConta;
        this.titular = titular;
        this.saldo = 0; // saldo inicial
    }

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente!");
        }
    }

    public void imprimirSaldo() {
        System.out.println("Conta: " + numeroConta);
        System.out.println("Titular: " + titular);
        System.out.printf("Saldo atual: %.2f%n", saldo);
    }
}
