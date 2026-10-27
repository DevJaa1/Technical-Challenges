package SistemaCheckOut_Ecommerce;

public class descontoPercentual implements EstrategiaDesconto{

    private double porcentagem;

    public descontoPercentual (double porcentagem) {
        this.porcentagem = porcentagem;
    }

    @Override 
    public double aplicarDesconto (double valorTotal) {
    
        return valorTotal * porcentagem;

    }


}
