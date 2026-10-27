package TicketManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private String nameEvent;
    private int capacityMax;
    private List<Ticket> ticketsSaled;

    public Event (String nameevent, int capacityMAX) {

        this.nameEvent = nameevent;
        this.capacityMax = capacityMAX;
        this.ticketsSaled = new ArrayList<>();

    }


}
