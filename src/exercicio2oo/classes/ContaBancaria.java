package exercicio2oo.classes;

public class ContaBancaria {
    public String numeroConta;
    public String titular;
    public double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
