package TicketManagementSystem;

public class Main {
    public static void main(String[] args) {
        // 1. Criar um evento com capacidade para 3 bilhetes
        Event meuEvento = new Event("Show de Rock", 3);

        // 2. Criar diferentes tipos de bilhetes
        Ticket t1 = new DefaultTicket("Ana Silva", 100.0, "T001");
        Ticket t2 = new VIPTicket("Carlos Souza", 150.0, "T002", true, 0.30);
        Ticket t3 = new HalfPrice("Mariana Costa", 120.0, "T003", "123456");

        // 3. Vender os bilhetes para o evento
        meuEvento.sellTicket(t1);
        meuEvento.sellTicket(t2);
        meuEvento.sellTicket(t3);

        // 4. Exibir o resumo individual de cada bilhete
        System.out.println(t1.getResume());
        System.out.println(t2.getResume());
        System.out.println(t3.getResume());

        // 5. Calcular o faturamento total esperado
        System.out.printf("Faturamento Total: R$ %.2f%n", meuEvento.calculateRevenue());

        // 6. Testar cancelamento de um bilhete
        meuEvento.cancelTicket(t1);
        System.out.println("Após o cancelamento:");
        System.out.println(meuEvento.calculateRevenue());
    }
}