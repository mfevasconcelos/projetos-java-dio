package contato;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    private Set<Contato> contatoSet;

    public AgendaContatos() {
        contatoSet = new HashSet<>();
    }

    public void adcionarContato(String nome, int numero) {
        contatoSet.add(new Contato(nome, numero));
    }

    public void exibirContatos() {
        if(!contatoSet.isEmpty()) {
            System.out.println(contatoSet);
        } else {
            System.out.println("Lista de Contatos está vazia!");
        }
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPorNome = new HashSet<>();

        if(!contatoSet.isEmpty()) {
            for(Contato c : contatoSet) {
                if(c.getNome().startsWith(nome)) {
                    contatosPorNome.add(c);
                }
            }
        }

        return contatosPorNome;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for(Contato c : contatoSet) {
            if(c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos contatos = new AgendaContatos();

        contatos.adcionarContato("Maria", 123);
        contatos.adcionarContato("João", 456);
        contatos.adcionarContato("José", 789);
        contatos.adcionarContato("Maria Fernanda", 321);

        contatos.exibirContatos();

        System.out.println("Contatos que começam com 'Maria': " + contatos.pesquisarPorNome("Maria"));;

        System.out.println(contatos.atualizarNumeroContato("João", 0));
    }
}
