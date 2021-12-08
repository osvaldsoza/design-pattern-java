package br.com.osvaldsoza.maladireta;

import br.com.osvaldsoza.contato.Contatos;
import br.com.osvaldsoza.contato.ContatosCSV;
import lombok.EqualsAndHashCode;


@EqualsAndHashCode(callSuper = true)
public class MalaDiretaCSV extends MalaDireta {

    public MalaDiretaCSV(String nomerquivo){
        super(nomerquivo);
    }

    @Override
    protected Contatos criarContatos() {
        return new ContatosCSV(getNomeArquivo());
    }
}
