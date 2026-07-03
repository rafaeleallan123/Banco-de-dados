package br.eejk.banco.model;

// Classe Titular
public class Titular {

    // Atributos
    private String nome;
    private String cpf;
    private String fone;

    // Construtor
    public Titular(String nome, String cpf, String fone) {
        this.setNome(nome);
        this.setCpf(cpf);
        this.setFone(fone);
    }

    // Getters e Setters
    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public String getFone() {
        return fone;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public void setFone(String fone) {
        this.fone = fone;
    }

    // toString
    @Override
    public String toString() {
        return "Titular{" + 
                "nome='" + nome + '\'' +
                "cpf=" + cpf +  '\'' +
                "fone=" + fone +  '\'' +
                "}";
    }

}
