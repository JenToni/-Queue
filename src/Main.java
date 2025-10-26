import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<String> firstClients = List.of("Anya", "Sveta", "Olya", "Alexandra", "Ruslana", "Olesya", "Vika");

        Queue<String> clientsQueue = new LinkedList<>(firstClients);


        while (!clientsQueue.isEmpty()) {
            String currentClient = clientsQueue.poll();

            System.out.println(currentClient + " сделал" + getGenderEnding(currentClient) + " новый маникюр.");

            if (Math.random() < 0.5) {
                String newClient = "a friend of " + currentClient;
                clientsQueue.offer(newClient);
                System.out.println("  -> " + currentClient + " привел(а) друга: " + newClient);
            } else {
                System.out.println("  -> " + currentClient + " никого не привел(а)");
            }

            System.out.println("Текущая очередь: " + clientsQueue);
            System.out.println("-".repeat(30));
        }

        System.out.println("Все клиенты обслужены! Рабочий день окончен.");
    }

    private static String getGenderEnding(String name) {
        if (name.endsWith("a") || name.endsWith("ya") || name.endsWith("ia")) {
            return "а";
        }
        return "";
    }
}