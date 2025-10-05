package exercicio1oo;

class ContaBancaria {
    String numeroConta;
    String titular;
    double saldo;

    void depositar(double valor) {
        saldo += valor;
    }

    boolean sacar(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }

    double consultarSaldo() {
        return saldo;
    }
}
