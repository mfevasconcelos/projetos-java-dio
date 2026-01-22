package livro;

import java.util.List;
import java.util.ArrayList;

public class CatalagoLivros {
    private List<Livro> livroList;

    public CatalagoLivros() {
        livroList = new ArrayList<>();
    }

    public void adicionarLivro(String titulo, String autor, int anoPublicacao) {
        livroList.add(new Livro(titulo, autor, anoPublicacao));
    }

    public List<Livro> pesquisarPorAutor(String autor) {
        List<Livro> livrosAutor = new ArrayList<>();

        if(!livroList.isEmpty()) {
            for(Livro l : livroList) {
                if(l.getAutor().equalsIgnoreCase(autor)) {
                    livrosAutor.add(l);
                }
            }
        } 

        return livrosAutor;
    }

    public List<Livro> pesquisarPorIntervaloAnos(int anoInicial, int anoFinal) {
        List<Livro> livrosIntervalo = new ArrayList<>();

        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getAnoPublicacao() >= anoInicial && l.getAnoPublicacao() <= anoFinal) {
                    livrosIntervalo.add(l);
                }
            }
        }

        return livrosIntervalo;
    }

    public Livro pesquisarPorTitulo(String titulo) {
        Livro livroPorTitulo = null;
        if (!livroList.isEmpty()) {
            for (Livro l : livroList) {
                if (l.getTitulo().equalsIgnoreCase(titulo)) {
                    livroPorTitulo = l;
                    break;
                }
            }
        }
        return livroPorTitulo;
    }

    public static void main(String[] args) {
        CatalagoLivros livros = new CatalagoLivros();

        livros.adicionarLivro("livro1", "autor1", 2021);
        livros.adicionarLivro("livro1", "autor2", 2023);
        livros.adicionarLivro("livro2", "autor2", 2005);
        livros.adicionarLivro("livro3", "autor2", 2008);
        livros.adicionarLivro("livro4", "autor3", 2008);

        System.out.println(livros.pesquisarPorTitulo("livro1"));;
        System.out.println();
        System.out.println("Livros encontrados: " + livros.pesquisarPorIntervaloAnos(2008, 2021));
    }
}
