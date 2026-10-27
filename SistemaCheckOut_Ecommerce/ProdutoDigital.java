package SistemaCheckOut_Ecommerce;

public class ProdutoDigital extends Produto {

    private double tamanhoMb;

    public ProdutoDigital(double tamanhoMb, String nomeProduto, double precoBase) {
        this.tamanhoMb = tamanhoMb;
        super(nomeProduto, precoBase);

    }

    @Override 
    public double calcularFrete() {
        
        double zero = 0.0;
        return zero; 
    }

}
