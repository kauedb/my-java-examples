package br.com.kauedb;

/**
 * User: kauedb
 * Date: 6/1/14
 * Time: 12:11 PM
 */
public class Subscription {

    private final Customer customer;
    private Iterable<Product> products;

    public Subscription(Customer customer) {
        this.customer = customer;
    }
}
