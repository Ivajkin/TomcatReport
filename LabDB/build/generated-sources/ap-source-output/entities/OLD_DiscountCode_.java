package entities;

import entities.OLD_Customer;
import java.math.BigDecimal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-01-27T00:58:44")
@StaticMetamodel(OLD_DiscountCode.class)
public class OLD_DiscountCode_ { 

    public static volatile SingularAttribute<OLD_DiscountCode, BigDecimal> rate;
    public static volatile CollectionAttribute<OLD_DiscountCode, OLD_Customer> customerCollection;
    public static volatile SingularAttribute<OLD_DiscountCode, Character> discountCode;

}