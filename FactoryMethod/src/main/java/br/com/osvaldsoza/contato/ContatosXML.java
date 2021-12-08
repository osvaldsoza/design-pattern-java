package br.com.osvaldsoza.contato;

import com.thoughtworks.xstream.XStream;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.net.URL;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ContatosXML implements Contatos{

    private String nomeArquivo;
    @Override
    public List<Contato> todos() {
        XStream xstream = new XStream();
        xstream.alias("contatos", List.class);
        xstream.alias("contato", Contato.class);

        URL arquivo = this.getClass().getResource("/" + this.nomeArquivo);
        return (List<Contato>) xstream.fromXML(arquivo);
    }
}
