package entities;

import entities.OLD_Customer;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.1.v20130918-rNA", date="2014-01-27T00:58:44")
@StaticMetamodel(OLD_MicroMarket.class)
public class OLD_MicroMarket_ { 

    public static volatile SingularAttribute<OLD_MicroMarket, Double> areaLength;
    public static volatile CollectionAttribute<OLD_MicroMarket, OLD_Customer> customerCollection;
    public static volatile SingularAttribute<OLD_MicroMarket, String> zipCode;
    public static volatile SingularAttribute<OLD_MicroMarket, Double> radius;
    public static volatile SingularAttribute<OLD_MicroMarket, Double> areaWidth;

}