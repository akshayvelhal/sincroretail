/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincroretail.masterdata;

import java.util.HashMap;
import sincroretail.model.Customer;
import sincroretail.model.CustomerType;

/**
 *
 * @author Akshay Velhal
 */
public class CustomerData {
    
    private static final HashMap<Integer, Customer> customers = new HashMap();
    
    static {
        Customer customer = new Customer(1234567890, "Reg", CustomerType.REGULAR);
        customers.put(1234567890, customer);
        
        customer = new Customer(1234567891, "Pri", CustomerType.PREMIUM);
        customers.put(1234567891, customer);
    }
    
    public static Customer search(int mob) {
        return customers.get(mob);
    }
    
}
