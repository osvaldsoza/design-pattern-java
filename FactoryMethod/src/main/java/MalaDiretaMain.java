import br.com.osvaldsoza.maladireta.MalaDireta;
import br.com.osvaldsoza.maladireta.MalaDiretaCSV;
import br.com.osvaldsoza.maladireta.MalaDiretaXML;
import br.com.osvaldsoza.util.Mensagem;

public class MalaDiretaMain {

    public static void main(String[] args) {
        gerarMalaDiretaCSV();
     //   gerarMalaDiretaXML();
    }

    private static void gerarMalaDiretaCSV() {
        System.out.println("Gerando mala direta CSV");
        MalaDireta malaDireta = new MalaDiretaCSV("contatos.csv");
        Mensagem.show(malaDireta);
    }

    private static void gerarMalaDiretaXML() {
        System.out.println("Gerando mala direta XML");
        MalaDireta malaDireta = new MalaDiretaXML("contatos.xml");
        Mensagem.show(malaDireta);
    }
}
