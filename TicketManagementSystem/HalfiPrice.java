package TicketManagementSystem;

public class HalfiPrice extends Ticket{ 

    private String Document;

    public HalfiPrice(
        String nameHolder,
        double baseprice,
        String cod,
        String doc
    ) {

        super(nameHolder, baseprice, cod);
        this.Document = doc;

        

    }

}
