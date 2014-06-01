package kauedb.spring.data.mongodb;

import java.util.Set;

/**
 * User: kauedb
 * Date: 4/2/14
 * Time: 8:56 AM
 */
public class SalesRules {

    private Store store;

    private SalesRegion salesRegion;

    private Set<AcceptedPaymentMethod> acceptedPaymentMethods;

    private Set<AcceptedProduct> acceptedProducts;

    public Store getStore() {
        return store;
    }

    public void setStore(Store store) {
        this.store = store;
    }

    public SalesRegion getSalesRegion() {
        return salesRegion;
    }

    public void setSalesRegion(SalesRegion salesRegion) {
        this.salesRegion = salesRegion;
    }

    public Set<AcceptedPaymentMethod> getAcceptedPaymentMethods() {
        return acceptedPaymentMethods;
    }

    public void setAcceptedPaymentMethods(Set<AcceptedPaymentMethod> acceptedPaymentMethods) {
        this.acceptedPaymentMethods = acceptedPaymentMethods;
    }

    public Set<AcceptedProduct> getAcceptedProducts() {
        return acceptedProducts;
    }

    public void setAcceptedProducts(Set<AcceptedProduct> acceptedProducts) {
        this.acceptedProducts = acceptedProducts;
    }
}
