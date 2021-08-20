package me.tuhin.functional;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumer {


    static Consumer<Customer> greetCustomerConsumer = customer -> System.out.println("Hello " + customer.name);

    static BiConsumer<Customer, Boolean> biGreetCustomerConsumer = (customer, showPhone) ->
            System.out.println("Hello " + customer.name +
                    (showPhone ? "," + customer.phone : ""));

    public static void main(String[] args) {

        Customer customer = new Customer("ABC", "123");

        //Consumer Function Interface
        System.err.println(Consumer.class);
        greetCustomerConsumer.accept(customer);

        // BiConsumer
        System.err.println(BiConsumer.class);
        biGreetCustomerConsumer.accept(customer, true);
    }

    static class Customer {
        private final String name;
        private final String phone;

        public Customer(String name, String phone) {
            this.name = name;
            this.phone = phone;
        }
    }

}
