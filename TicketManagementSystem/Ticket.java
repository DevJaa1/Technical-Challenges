package TicketManagementSystem;

public abstract class Ticket {

    private String nameHolder;
    private double basePrice;
    private String cod;
    private TicketStatus ticketstatus;

    public Ticket(String nameholder, double baseprice, String cod) {

        this.nameHolder = nameholder;
        if (baseprice <= 0) {
            throw new IllegalArgumentException("O numero deve ser maior que 0");
        }
        this.basePrice = baseprice;
        this.cod = cod;
        this.ticketstatus = TicketStatus.AVALIABLE;

    }

    public String getNameHolder() {
        return nameHolder;
    }

    public void setNameHolder(String nameHolder) {
        this.nameHolder = nameHolder;
    }

    public double getBasePrice() {
        return basePrice;
    }

    public void setBasePrice(double basePrice) {
        this.basePrice = basePrice;
    }

    public String getCod() {
        return cod;
    }

    public void setCod(String cod) {
        this.cod = cod;
    }

    public TicketStatus getTicketstatus() {
        return ticketstatus;
    }

    public abstract double calcularPrecoFinal();

    public void reserve() {

        this.ticketstatus = TicketStatus.RESERVED;

    }

    public void cancel() {

        this.ticketstatus = TicketStatus.CANCELLED;
    }

    public String getResume() {
        return String.format("Código: %s | Titular: %s | Status: %s | Preço base: R$ %.2f | Preço final: R$ %.2f",
            cod,
            nameHolder,
            ticketstatus,
            basePrice,
            calcularPrecoFinal());
    }

}
