package TicketManagementSystem;

import java.util.ArrayList;
import java.util.List;

public class Event {

    private String nameEvent;
    private int capacityMax;
    private List<Ticket> ticketsSaled;

    public Event(String nameevent, int capacityMAX) {

        if (capacityMAX < 0) {
            throw new IllegalArgumentException("The maximum capacity must be greater than zero.");
        }

        this.nameEvent = nameevent;
        this.capacityMax = capacityMAX;
        this.ticketsSaled = new ArrayList<>();

    }

    public boolean sellTicket(Ticket tckt) {
        if (ticketsSaled.size() >= capacityMax) {
            throw new IllegalArgumentException("Max capacity Full!");
        }
        tckt.reserve();
        ticketsSaled.add(tckt);

        return true;
    }

    public double calculateRevenue() {

        double revenue = 0.0;

        for (Ticket tc : ticketsSaled) {
            revenue += tc.calcularPrecoFinal();
        }

        return revenue;

    }

    public boolean cancelTicket(String codTckt) {

        for (Ticket tck : ticketsSaled) {
            if (tck.getCod().equals(codTckt)) {
                tck.cancel();
                ticketsSaled.remove(codTckt);
                return true;
            }
        }

        return false;

    
    }

     public void exibirRelatorio() {

        System.out.println("===== RELATÓRIO DO EVENTO =====");
        System.out.println("Evento: " + nameEvent);
        System.out.println(
            "Ocupação: " + ticketsSaled.size()
            + "/" + capacityMax
        );
        System.out.printf(
            "Faturamento total: R$ %.2f%n",
            calculateRevenue()
        );

        System.out.println("\n===== INGRESSOS VENDIDOS =====");

        for (Ticket ingresso : ticketsSaled) {
            System.out.println(ingresso.getResume());
        }
    }
}
