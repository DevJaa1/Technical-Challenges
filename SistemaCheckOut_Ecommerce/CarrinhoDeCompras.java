package SistemaCheckOut_Ecommerce;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {

    private List<Object> carrinho;

    public CarrinhoDeCompras() {
        this.carrinho = new ArrayList<>();
    }

    public Produto adicionarProduto(Produto produto) {

        carrinho.add(produto);
        return produto;

    }

    public void removerProduto(Long id) {
        carrinho.remove(id);
    }

}
