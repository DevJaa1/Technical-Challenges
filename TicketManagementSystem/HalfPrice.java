package TicketManagementSystem;

public class HalfPrice extends Ticket {

    private String docPeople;

    public HalfPrice(
            String nameHolder,
            double baseprice,
            String cod,
            String doc) {

        super(nameHolder, baseprice, cod);

        if (docPeople == null || docPeople.length() < 5) {
            throw new IllegalArgumentException("The docPeople must have at least 5 characters.");
        }

        this.docPeople = doc;

    }

    public String getdocPeople(){
        return docPeople;
    }

    @Override 
    public double calcularPrecoFinal() {
        return getBasePrice() * 0.5;
    }
}
