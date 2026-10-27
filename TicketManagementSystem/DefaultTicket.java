package TicketManagementSystem;

public class DefaultTicket extends Ticket{

    public DefaultTicket (String nameholder, double baseprice, String cod) {
        super(nameholder,baseprice,cod);
    }

    @Override 
    public double calcularPrecoFinal () {
        return getBasePrice();
    }   

}
