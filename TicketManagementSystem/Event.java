package TicketManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private String nameEvent;
    private int capacityMax;
    private List<Ticket> ticketsSaled;

    public Event(String nameevent, int capacityMAX) {

        this.nameEvent = nameevent;
        this.capacityMax = capacityMAX;
        this.ticketsSaled = new ArrayList<>();

    }

    public void sellTicket(Ticket tckt) {
        if (ticketsSaled.size() >= capacityMax) {
            throw new IllegalArgumentException("Max capacity Full!");
        }
        tckt.reserve();
        ticketsSaled.add(tckt);
    }
    
    public double calculateRevenue() {
        
        double revenue = 0.0;

        for(Ticket tc : ticketsSaled) {
            revenue += tc.calcularPrecoFinal();
        }

        return revenue;

    }

    public void cancelTicket(Ticket tckt) {
        tckt.cancel();
        ticketsSaled.remove(tckt);
    }
}
