package br.com.osvaldsoza.maladireta;

import br.com.osvaldsoza.contato.Contatos;
import br.com.osvaldsoza.contato.ContatosXML;

public class MalaDiretaXML extends MalaDireta{

    public MalaDiretaXML(String nomerquivo){
        super(nomerquivo);
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosXML(getNomeArquivo());
    }
}