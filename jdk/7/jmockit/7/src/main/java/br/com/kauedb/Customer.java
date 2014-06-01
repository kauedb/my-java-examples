package br.com.kauedb;

/**
 * User: kauedb
 * Date: 6/1/14
 * Time: 12:09 PM
 */
public class Customer implements Buyer{

    private final Long id;
    private final String name;

    private Customer(Long id, String name) {
        this.id = id;
        this.name = name;
    }

    public static Customer customer(Long id, String name) {
        return new Customer(id, name);
    }

    @Override
    public void buy(Subscription subscription){

    }



}
