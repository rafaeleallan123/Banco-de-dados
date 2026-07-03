package br.eejk.banco.model;

// Conta Poupança
public class ContaPoupanca extends Conta {

    // Atributos
    private final double RENDIMENTO_MENSAL = 0.01;

    // Construtor
    public ContaPoupanca(String numero, Titular titular, double saldo) {
        super(numero, titular, saldo);
    }

    // Render
    public void render() {
        double rendimento = getSaldo() * RENDIMENTO_MENSAL;
        depositar(rendimento);
        System.out.println("Rendimento mensal de R$ " + rendimento + " adicionado ao saldo da conta poupança.");
    }

    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser negativo.");
        }
        if (valor > getSaldo()) {
            throw new IllegalArgumentException("Saldo insuficiente.");
        }
        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso. Novo saldo: R$ " + this.saldo);
    }

}
