package Customers;

import java.util.ArrayList;
import java.util.List;

public class CustomerStorage {
    private final List<Customer> customers = new ArrayList<>();

    public void addCustomer(String str) {
        String[] data = str.split(" ");
        if(data.length > 4) {
            throw new IllegalArgumentException();
        }
        String name = data[0];
        String surname = data[1];
        String email = data[2];
        String phone = data[3];
        if(!phone.matches("\\d+")) {
            throw new IllegalArgumentException();
        }
        if(!email.matches("")) {
            throw new IllegalArgumentException();
        }
        Customer customer = new Customer(name, surname, email, phone);
        customers.add(customer);
    }

    public void listCustomers() {
        for (Customer customer : customers) {
            System.out.println(customer.toString());
        }
    }

    public void removeCustomer(String str) {
        String[] data = str.split(" ");
        if(data.length > 2) {
            throw new IllegalArgumentException();
        }
        String name = data[0];
        String surname = data[1];
        customers.removeIf(customer -> customer.getName().equals(name) && customer.getSurname().equals(surname));
    }

    public Customer getCustomer(String str) {
        String[] data = str.split(" ");
        if(data.length > 2) {
            throw new IllegalArgumentException();
        }
        String name = data[0];
        String surname = data[1];
        for (Customer customer : customers) {
            if (customer.getName().equals(name) && customer.getSurname().equals(surname)) {
                return customer;
            }
        }
        return null;
    }

    public int getCount() {
        return customers.size();
    }

}
