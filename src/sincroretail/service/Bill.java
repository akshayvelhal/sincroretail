/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincroretail.service;

import java.util.Map;
import sincroretail.masterdata.CustomerData;
import sincroretail.masterdata.DiscountData;
import sincroretail.model.Customer;
import sincroretail.model.Product;

/**
 *
 * @author Akshay Velhal
 */
public class Bill {
    
    public static double calculateBill(int mob,  Map<Product, Integer> basket) {
        
        Customer customer = CustomerData.search(mob);
        double billAmount = 0;
        
        //Calculate the total bill amount
        for( Map.Entry<Product, Integer> entry :basket.entrySet()) {
            Product product = entry.getKey();
            billAmount = billAmount + (product.getPrice() * entry.getValue());
        }
        
        //Get the discount to be applied for the current user & bill amount
        int totalDiscountAmount = DiscountData.calculateDiscount(customer.getType(), billAmount);
        
        //final bill
        double finalPrice = billAmount - totalDiscountAmount;
        
        return finalPrice;
    }
    
    
    
}
