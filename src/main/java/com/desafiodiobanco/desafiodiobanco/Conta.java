package com.desafiodiobanco.desafiodiobanco;

public abstract class Conta implements InterfaceConta {

    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;


    public Conta(Cliente cliente) {
        this.agencia = Conta.AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
        this.cliente = cliente;
         }

        //métodos
        @Override
        public void sacar ( double valor){
        saldo -= valor;
    }

        @Override
        public void depositar ( double valor){
        saldo += valor;
    }

        @Override
        public void transferir ( double valor, Conta contaDestino){
        // Ação de sacar de uma conta para realizar o depósito em outra conta.
        this.sacar(valor);
        contaDestino.depositar(valor);
         }

        public void extracted () {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("Agencia: %d", this.agencia));
        System.out.println(String.format("Numero: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
        }
}