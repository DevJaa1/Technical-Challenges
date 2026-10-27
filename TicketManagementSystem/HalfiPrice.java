package TicketManagementSystem;

public class HalfiPrice extends Ticket {

    private String Document;

    public HalfiPrice(
            String nameHolder,
            double baseprice,
            String cod,
            String doc) {

        super(nameHolder, baseprice, cod);

        if (Document == null || Document.length() < 5) {
            throw new IllegalArgumentException("The document must have at least 5 characters.");
        }

        this.Document = doc;

    }

    public String getDocument(){
        return Document;
    }

    @Override 
    public double calcularPrecoFinal() {
        return getBasePrice() * 0.5;
    }
}
