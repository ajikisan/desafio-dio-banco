package com.desafiodiobanco.desafiodiobanco;

/**
 * Método na classe de interface é considerado público, por isso, pode-se omitir a palavra public antes de void.
 * Assinatura define o contrato de uso.
 * Polimorfismo - recebe tanto CP conta poupança quanto CC conta corrente, CI conta investimento ou CS conta salário.
 */

public interface InterfaceConta {
     void sacar(double valor);
     void depositar(double valor);
     void transferir(double valor, Conta contaDestino);
     default void saldo(double valor) {
     }
     void imprimirExtrato();
}
