package com.desafiodiobanco.desafiodiobanco;

import java.sql.SQLOutput;

public class ContaPoupanca extends Conta {
    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("=== Extrato Conta Poupanca ===");
        super.extracted();
        System.out.println();
    }
}
