package kauedb.spring.data.mongodb;

import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;

/**
 * User: kauedb
 * Date: 4/2/14
 * Time: 9:10 AM
 */
public class SalesRulesBuilder {

    private final Collection<SalesRules> salesRulesCollection = new HashSet<>();

    private SalesRules salesRules;


    public static SalesRulesBuilder salesRulesBuilder(){
        return new SalesRulesBuilder();
    }

    public SalesRulesBuilder store(Store store){
       salesRules.setStore(store);
       return this;
    }

    public SalesRulesBuilder region(){

        return this;
    }

    /**
     * Set attributes on
     * @return
     */
    public SalesRulesBuilder and(){
        return this;
    }

    public SalesRulesBuilder or(){

        return this;
    }

    public Collection<SalesRules> build(){

        return Arrays.asList();
    }

}
