package br.com.osvaldsoza.maladireta;

import br.com.osvaldsoza.contato.Contato;
import br.com.osvaldsoza.contato.Contatos;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class MalaDireta {

    private String nomeArquivo;

    protected abstract Contatos criarContatos();

    public boolean enviarEmail(String mensagem) {

        var contatos = criarContatos().todos();

        System.out.println("Conectando no servidor SMTP...");
        System.out.println("Mensagem a ser enviada: " + mensagem);
        System.out.println();

        for (Contato contato : contatos) {
            System.out.println("From: <contato@algaworks.com>");
            System.out.printf("To: [%s] <%s>\n", contato.getNome(), contato.getEmail());
            System.out.printf("Message: %s\n",mensagem);
            System.out.println();
        }

        return true;
    }
}
