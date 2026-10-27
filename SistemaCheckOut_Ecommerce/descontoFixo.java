package SistemaCheckOut_Ecommerce;

public class descontoFixo implements EstrategiaDesconto {

    private double valorDesconto;

    public descontoFixo(double valorDesconto) {

        this.valorDesconto = valorDesconto;

    }

    @Override 
    public double aplicarDesconto(double valorTotal) { // o metodo recebe um valor total para aplicar o desconto
        return Math.min(valorDesconto, valorTotal);

    }


}
