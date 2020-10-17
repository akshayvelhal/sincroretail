/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincroretail;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import sincroretail.masterdata.ProductData;
import sincroretail.model.Product;
import sincroretail.service.Bill;

/**
 *
 * @author Akshay Velhal
 */
public class SincroRetail {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        //Test Case1 : Amount 5000, Customer Regular
        Map<Product, Integer> basket = new HashMap<>();
        Optional<Product> p1 = ProductData.getByPrice(1000d);
        Optional<Product> p2 = ProductData.getByPrice(4000d);
        
        basket.put(p1.get(), 1);
        basket.put(p2.get(), 1);
        
        //Check CustomerData - this mob is registered for Reg user
        System.out.println("Test Case1 : Amount 5000, Customer Regular. Bill Amount - "+ Bill.calculateBill(1234567890, basket));
        
        
        
        //Test Case2 : Amount 10000, Customer Regular
        Map<Product, Integer> basket2 = new HashMap<>();
        Optional<Product> p12 = ProductData.getByPrice(1000d);
        Optional<Product> p22 = ProductData.getByPrice(4000d);
        
        basket2.put(p12.get(), 2);
        basket2.put(p22.get(), 2);
        
        //Check CustomerData - this mob is registered for Reg user
        System.out.println("Test Case2 : Amount 10000, Customer Regular. Bill Amount - "+ Bill.calculateBill(1234567890, basket2));
        
        
        
        //Test Case3 : Amount 15000, Customer Regular
        Map<Product, Integer> basket3 = new HashMap<>();
        Optional<Product> p13 = ProductData.getByPrice(1000d);
        Optional<Product> p23 = ProductData.getByPrice(4000d);
        
        basket3.put(p13.get(), 3);
        basket3.put(p23.get(), 3);
        
        //Check CustomerData - this mob is registered for Reg user
        System.out.println("Test Case3 : Amount 15000, Customer Regular. Bill Amount - "+ Bill.calculateBill(1234567890, basket3));
        
        
        
        //Test Case4 : Amount 4000, Customer Premium
        Map<Product, Integer> basket4 = new HashMap<>();
        Optional<Product> p24 = ProductData.getByPrice(4000d);
        
        basket4.put(p24.get(), 1);
        //Check CustomerData - this mob is registered for Premium user
        System.out.println("Test Case4 : Amount 4000, Customer Premium. Bill Amount - "+ Bill.calculateBill(1234567891, basket4));
        
        
        
        //Test Case5 : Amount 8000, Customer Premium
        Map<Product, Integer> basket5 = new HashMap<>();
        Optional<Product> p25 = ProductData.getByPrice(4000d);
        
        basket5.put(p25.get(), 2);
        //Check CustomerData - this mob is registered for Premium user
        System.out.println("Test Case5 : Amount 8000, Customer Premium. Bill Amount - "+ Bill.calculateBill(1234567891, basket5));
        
        
        
        
        //Test Case6 : Amount 12000, Customer Premium
        Map<Product, Integer> basket6 = new HashMap<>();
        Optional<Product> p26 = ProductData.getByPrice(4000d);
        
        basket6.put(p26.get(), 3);
        //Check CustomerData - this mob is registered for Premium user
        System.out.println("Test Case6 : Amount 12000, Customer Premium. Bill Amount - "+ Bill.calculateBill(1234567891, basket6));
        
        
        
        
        //Test Case7 : Amount 20000, Customer Premium
        Map<Product, Integer> basket7 = new HashMap<>();
        Optional<Product> p27 = ProductData.getByPrice(4000d);
        
        basket7.put(p27.get(), 5);
        //Check CustomerData - this mob is registered for Premium user
        System.out.println("Test Case6 : Amount 12000, Customer Premium. Bill Amount - "+ Bill.calculateBill(1234567891, basket7));

        
        
    }
    
}
