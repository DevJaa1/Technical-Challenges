package TicketManagementSystem;

public class VIPTicket extends Ticket{

    private boolean openBar;
    private double cabin;

    public VIPTicket (
        String nameholder,
        double baseprice,
        String cod,
        boolean openBar,
        double cabin
    ) {
        super(nameholder, baseprice, cod);

        if(cabin < 0) {
            throw new IllegalArgumentException("the rate cannot be less than 0");
        }

        this.cabin = cabin;
        this.openBar = openBar;
    }

    @Override 
    public double calcularPrecoFinal() {
        return getBasePrice() + (getBasePrice() * cabin);
    }

    public boolean getIncluesOpenBar() {
        return openBar;
    }

    public double getCabin () {
        return cabin;
    }
}
