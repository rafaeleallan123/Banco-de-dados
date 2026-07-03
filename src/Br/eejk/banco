package br.eejk.banco;

import br.eejk.banco.model.Conta;
import br.eejk.banco.model.ContaCorrente;
import br.eejk.banco.model.ContaPoupanca;
import br.eejk.banco.model.Titular;

public class Main {

    public static void main(String[] args) {
        // Criando titulares
        Titular joao = new Titular("João Silva", "123.456.789-00", "(11) 98765-4321");
        Titular maria = new Titular("Maria Oliveira", "987.654.321-00", "(11) 12345-6789");

        // Criando contas
        ContaCorrente contaCorrente = new ContaCorrente("12345-6", joao, 1000.00, 500.00);
        ContaPoupanca contaPoupanca = new ContaPoupanca("65432-1", maria, 2000.00);

        // Exibindo informações iniciais
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);

        // Realizando operações
        contaCorrente.depositar(500.00);
        contaCorrente.sacar(200.00);
        contaCorrente.transferir(300.00, contaPoupanca);

        contaPoupanca.render();

        // Exibindo informações finais
        System.out.println(contaCorrente);
        System.out.println(contaPoupanca);
    }

}
