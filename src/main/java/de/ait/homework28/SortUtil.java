package de.ait.homework28;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortUtil {

    public List<Product> sortByName(List<Product> products, boolean asc){
        //Ascending asc=true
        if(asc) {
           Collections.sort(products, Comparator.comparing(Product::getName));
           return products;
        }
        //descending, asc=false
        else {
            Collections.sort(products, Comparator.comparing(Product::getName).reversed());
            return products;
        }
    }

    public List<Product> sortByPrice(List<Product> products, boolean asc){
        //Ascending asc=true
        if(asc) {
            Collections.sort(products, Comparator.comparing(Product::getPrice));
            return products;
        }
        //descending, asc=false
        else {
            Collections.sort(products, Comparator.comparing(Product::getPrice).reversed());
            return products;
        }
    }

    public List<Product> sortByQuantity(List<Product> products, boolean asc){
        //Ascending asc=true
        if(asc) {
            Collections.sort(products, Comparator.comparing(Product::getQuantity));
            return products;
        }
        //descending, asc=false
        else {
            Collections.sort(products, Comparator.comparing(Product::getQuantity).reversed());
            return products;
        }
    }

}
