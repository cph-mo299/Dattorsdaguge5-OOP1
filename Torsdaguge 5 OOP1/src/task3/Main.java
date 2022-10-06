package task3;

import java.util.ArrayList;

public class Main {

    private static final ArrayList<Customer> customers = new ArrayList<>();

    public static void main(String[] args) {
        customers.add(new Customer("Benny Anger", "BennyAnger"));
        customers.add(new Customer("Anne Jul", "AnneJul"));
        customers.add(new Customer("Bo Nielsen", "BoNielsen"));
        customers.add(new Customer("Sanne Nielsen", "SanneNielsen"));
        customers.add(new Customer("Ole Konrad", "OleKonrad"));
        customers.add(new Customer("Ulrikke Konrad", "UlrikkeKonrad"));

        printCostumers();
    }

    public static void printCostumers() {
        for (Customer customer : customers) {
            System.out.println(customer);
        }
    }
}