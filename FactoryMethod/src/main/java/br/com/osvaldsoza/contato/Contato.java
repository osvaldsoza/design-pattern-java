package br.com.osvaldsoza.contato;


import lombok.Data;

@Data
public class Contato {

    private String nome;
    private String email;

    public Contato(String nome, String email) {
        this.nome = nome;
        this.email = email;
    }
}
