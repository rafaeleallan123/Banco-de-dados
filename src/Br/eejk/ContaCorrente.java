package br.eejk.banco.model;

// Conta Corrente
public class ContaCorrente extends Conta implements Tributavel {

    // Atributos
    private double limite;
    private final double TAXA_SAQUE = 0.05;
    private final double TAXA_CONTA = 0.01;


    // Construtor
    public ContaCorrente(String numero, Titular titular, double saldo, double limite) {
        super(numero, titular, saldo);
        this.limite = limite;
    }

    // Sacar com Taxa
    @Override
    public void sacar(double valor) {
        if (valor < 0) {
            throw new IllegalArgumentException("Valor de saque não pode ser negativo.");
        }
        double valorTaxa = valor * TAXA_SAQUE;
        double valorTotal = valor + valorTaxa;
        double saldoDisponivel = getSaldo() + limite;
        if (valorTotal > saldoDisponivel) {
            throw new IllegalArgumentException("Saldo insuficiente, considerando o limite e a taxa de saque.");
        }
        this.saldo -= valor;
        System.out.println("Saque de R$ " + valor + " realizado com sucesso. Novo saldo: R$ " + this.saldo);
        System.out.println("Taxa de saque de R$ " + valorTaxa + " aplicada. Valor total debitado: R$ " + valorTotal);
    }

    @Override
    public double calcularTaxa() {
        return this.saldo * TAXA_CONTA;
    }

}
