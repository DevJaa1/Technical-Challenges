package SistemaCheckOut_Ecommerce;

public class produtoFisico extends Produto {

    private double pesoKg;

    public produtoFisico (double pesoKg, String nomeProduto,double precoBase) {
        this.pesoKg = pesoKg;
        super(nomeProduto,precoBase);
    }

    @Override 
    public double calcularFrete() {
        double zero = 0.0;
        return zero;
    }

}
