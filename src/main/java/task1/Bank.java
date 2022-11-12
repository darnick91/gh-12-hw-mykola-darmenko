package task1;

import task1.entity.Customer;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private final List<Customer> customers;

    public Bank() {
        this.customers = new ArrayList<>();
    }

    public void addCustomer(Customer customer) {
        customers.add(customer);
    }

    Customer getCustomerById(int id) {
        for (Customer customer : customers) {
            if (customer.getId() == id) {
                return customer;
            }
        }
        return null;
    }

    double allActiveValueInBank(){
        double allActive = 0;
        for (Customer customer: customers) {
            allActive +=customer.allActive();
        }
        return allActive;
    }
}
