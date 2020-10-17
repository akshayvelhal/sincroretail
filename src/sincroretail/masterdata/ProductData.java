package sincroretail.masterdata;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import sincroretail.model.Product;

/**
 *
 * @author Akshay Velhal
 */
public class ProductData {
    
    private static final List<Product> products = new LinkedList<>();
    
    static {
        //TODO: Get this data from DB
        Product product = new Product(1, "A", 2000d);
        products.add(product);
        
        product = new Product(2, "B", 4000d);
        products.add(product);
        
        product = new Product(3, "D", 1000d);
        products.add(product);
    }
    
    //TODO: no such method would exist in real life. Adding this for more readability.
    public static Optional<Product> getByPrice(double price) {
        return products.stream().filter( p -> p.getPrice() == price).findAny();
    }

    public List<Product> getProducts() {
        return products;
    }
    
}
