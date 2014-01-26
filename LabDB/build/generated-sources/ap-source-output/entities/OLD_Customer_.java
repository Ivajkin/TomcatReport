package entities;

import entities.OLD_DiscountCode;
import entities.OLD_MicroMarket;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-01-27T00:58:44")
@StaticMetamodel(OLD_Customer.class)
public class OLD_Customer_ { 

    public static volatile SingularAttribute<OLD_Customer, String> addressline2;
    public static volatile SingularAttribute<OLD_Customer, OLD_MicroMarket> zip;
    public static volatile SingularAttribute<OLD_Customer, String> phone;
    public static volatile SingularAttribute<OLD_Customer, Integer> customerId;
    public static volatile SingularAttribute<OLD_Customer, String> addressline1;
    public static volatile SingularAttribute<OLD_Customer, String> fax;
    public static volatile SingularAttribute<OLD_Customer, String> email;
    public static volatile SingularAttribute<OLD_Customer, String> name;
    public static volatile SingularAttribute<OLD_Customer, String> state;
    public static volatile SingularAttribute<OLD_Customer, Integer> creditLimit;
    public static volatile SingularAttribute<OLD_Customer, OLD_DiscountCode> discountCode;
    public static volatile SingularAttribute<OLD_Customer, String> city;

}