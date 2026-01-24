package produtos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    private Set<Produto> setProdutos;

    public CadastroProdutos() {
        setProdutos = new HashSet<>();
    }

    public void adicionarProduto (String nome, int cod, double preco, int quantidade) {
        setProdutos.add(new Produto(nome, cod, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(setProdutos);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(setProdutos);
        return produtosPorPreco;
    }
}
