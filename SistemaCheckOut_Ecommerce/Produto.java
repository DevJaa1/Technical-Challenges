package SistemaCheckOut_Ecommerce;

public abstract class Produto {

    private String nomeProduto;
    private Long id;
    private double precoBase;

    Produto(String nomeProduto, double precoBase) {
        this.nomeProduto = nomeProduto;
        this.precoBase = precoBase;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public double getPrecoBase() {
        return precoBase;
    }

    public void setPrecoBase(double precoBase) {
        this.precoBase = precoBase;
    }

    public abstract double calcularFrete();

}
