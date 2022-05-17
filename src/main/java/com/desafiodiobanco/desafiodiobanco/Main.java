package com.desafiodiobanco.desafiodiobanco;
/**
 *
 * Extrato das contas só serão demonstrados se digitar o nome e senha previamente registrada.
 * Houve muitas ações de depósitos, transferências e saques.
 *
 */

import java.util.Scanner;

public class Main {

        public static void main(String[] args) {

                {
                        Scanner in = new Scanner(System.in);
                        System.out.println("Digite o nome: ");
                        String nome = in.nextLine();
                        System.out.println("Digite a senha: ");
                        String senha = in.nextLine();
                        if (nome.equals("Mirian") && senha.equals("Mon3y")) {
                                System.out.printf("Olá, %s! Estes são seus extratos :)", nome);
                                System.out.println();
                                System.out.println();

                                Cliente nomeCliente = new Cliente();
                                nomeCliente.setNome("Mirian");

                                Conta cc = new ContaCorrente(nomeCliente);
                                cc.depositar(5000);
                                cc.sacar(200);
                                cc.sacar(10);


                                Conta cp = new ContaPoupanca(nomeCliente);
                                cp.depositar(200);
                                cp.sacar(20);


                                Conta cs = new ContaSalario(nomeCliente);
                                cs.depositar(1230);
                                cs.transferir(1230, cc);
                                cs.depositar(10000);
                                cs.transferir(9000, cp);

                                ContaInvestimento ci = new ContaInvestimento(nomeCliente);
                                ci.depositar(200);
                                ci.depositar(9440);

                                cc.transferir(200, cp);
                                ci.transferir(100, cc);

                                //Extratos Bancários
                                cc.imprimirExtrato();
                                cp.imprimirExtrato();
                                cs.imprimirExtrato();
                                ci.imprimirExtrato();

                        } else {
                                System.out.println("Nome ou senha inválidos!");
                        }
                        System.out.println();
                }
        }
}
