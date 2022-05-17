package com.desafiodiobanco.desafiodiobanco;

import lombok.Data;

/**
 * Segundo o Sr. Venilton Falvo Jr. Pode-se usar get/setter ou o lombok.
 *
 * import lombok.Data;
 *
 * @Data
 * public class Cliente {
 *     public String nome;
 *
 */

@Data
 public class Cliente {
    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String nome;

}








