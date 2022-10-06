package Customers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        String[] data = scanner.nextLine().split(" ");
        if(data.length > 5) {
            throw new IllegalArgumentException();
        }
        String command = data[0];
        String name = data[1];
        String surname = data[2];
        String email = data[3];
        String phone = data[4];
        if(!phone.matches("\\d+")) {
            throw new IllegalArgumentException();
        }
        if(!email.matches("")) {
            throw new IllegalArgumentException();
        }
        CustomerStorage customerStorage = new CustomerStorage();
            switch (command) {
                case "add":
                    customerStorage.addCustomer(name + " " + surname + " " + email + " " + phone);
                    break;
                case "list":
                    customerStorage.listCustomers();
                    break;
                case "remove":
                    customerStorage.removeCustomer(name + " " + surname);
                    break;
                case "count":
                    customerStorage.getCount();
                    break;
                case "help":
                    System.out.println("add - добавить клиента." +
                            "\n" +
                            "list - вывести список всех клиентов." +
                            "\n" +
                            "remove - удалить клиента." +
                            "\n" +
                            "count - подсчитать всех клиентов.");
                    break;
            }
        }

}
