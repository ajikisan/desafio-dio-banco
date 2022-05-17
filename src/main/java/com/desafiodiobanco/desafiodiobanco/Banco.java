package com.desafiodiobanco.desafiodiobanco;

import java.util.List;

public class Banco {
	private String nomeBanco;
	private List<Conta> contas;

	public String getNomeBanco() {
		return nomeBanco;
	}
	public void setNomeBanco(String nomeBanco) {
		this.nomeBanco = nomeBanco;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
}
