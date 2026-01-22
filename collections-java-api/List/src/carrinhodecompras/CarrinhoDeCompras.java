package carrinhodecompras;
import java.util.List;
import java.util.ArrayList;

public class CarrinhoDeCompras {
    List<Item> carrinhoDeCompras;

    public CarrinhoDeCompras() {
        carrinhoDeCompras = new ArrayList<>();
    }
    
    public void adicionarItem(String nome, double preco, int quantidade) {
        carrinhoDeCompras.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> removeItens = new ArrayList<>();

        if(!carrinhoDeCompras.isEmpty()) {
            for(Item i : carrinhoDeCompras) {
                if(i.getNome().equalsIgnoreCase(nome)) {
                    removeItens.add(i);
                }
            }
            carrinhoDeCompras.removeAll(removeItens);
        } else {
            System.out.println("O Carrinho de Compras está vazio!");
        }
    }

    public double calcularValorTotal() {
        double total = 0;
        if(!carrinhoDeCompras.isEmpty()) {
            for(Item i : carrinhoDeCompras) {
                total += (i.getPreco() * i.getQuantidade());
            }
        }
        return total;
    }

    public void exibirItens() {
        if(!carrinhoDeCompras.isEmpty()) {
            System.out.println(carrinhoDeCompras);
        } else {
            System.out.println("O Carrinho de Compras está vazio!");
        }
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinho = new CarrinhoDeCompras();

        carrinho.adicionarItem("arroz", 3.50, 4);
        carrinho.adicionarItem("arroz", 3.50, 2);
        carrinho.adicionarItem("feijao", 5.0, 2);
        
        carrinho.exibirItens();
        System.out.println("O valor total do carrinho de compras é: " + carrinho.calcularValorTotal());
    }
}
