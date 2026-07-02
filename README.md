# 🏦 Sistema Bancário - Java POO

Este é um projeto educacional desenvolvido para demonstrar a aplicação prática de conceitos fundamentais da **Programação Orientada a Objetos (POO)** em Java. O sistema simula operações bancárias essenciais, utilizando uma arquitetura robusta baseada em herança, classes abstratas e polimorfismo.

## 📋 Funcionalidades

O sistema implementa o gerenciamento de contas bancárias com as seguintes operações:

*   **Depósito:** Adição de saldo a qualquer tipo de conta.
*   **Saque:** Retirada de valores com validação de saldo (e limite, no caso de Conta Corrente).
*   **Transferência:** Movimentação de recursos entre diferentes contas.
*   **Rendimento:** Aplicação de taxa de juros exclusiva para Contas Poupança.
*   **Gestão de Tipos:** Suporte a Conta Corrente (com limite de crédito) e Conta Poupança.

## 🚀 Como Executar

Para rodar o projeto, você precisará ter o JDK instalado.

### 1. Compilar o projeto:
```bash
javac -d bin -sourcepath src src/br/eejk/banco/**/*.java
```

### Executar o sistema bancário:
```bash
java -cp bin br.eejk.banco.Main
```

## 📚 Conceitos Abordados

- **Herança**: Subclasses estendem funcionalidades da classe base
- **Classes Abstratas**: Definem interfaces obrigatórias para subclasses
- **Polimorfismo**: Métodos específicos de cada tipo de animal/conta
- **Encapsulamento**: Atributos privados com getters e setters
- **Tratamento de Exceções**: Validação de operações bancárias

## 📁 Estrutura de Diretórios

```
aula/
├── README.md                               # Este arquivo
├── src/                                    # Código-fonte
│   └── br/eejk/
│       └── banco/
│           ├── Main.java                   # Entrada principal do sistema
│           └── model/
│               ├── Conta.java              # Classe abstrata base
│               ├── ContaCorrente.java      # Implementação de conta corrente
│               └── ContaPoupanca.java      # Implementação de conta poupança
└── bin/                                    # Arquivos compilados
```

## 👨‍💻 Autor

Projeto desenvolvido para fins educacionais na aula de programação orientada a objetos.
