/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincroretail.masterdata;

import java.util.LinkedList;
import java.util.List;
import sincroretail.model.CustomerType;
import sincroretail.model.Discount;

/**
 *
 * @author Akshay Velhal
 */
public class DiscountData {
    
    private static final List<Discount> regularDiscounts = new LinkedList<>();
    private static final List<Discount> premiumDiscounts = new LinkedList<>();
    
    static {
        Discount discount = new Discount(0, 5000, 0);
        regularDiscounts.add(discount);
        
        discount = new Discount(5000, 10000, 10);
        regularDiscounts.add(discount);
        
        discount = new Discount(10000, Double.MAX_VALUE, 20);
        regularDiscounts.add(discount);
        
        discount = new Discount(0, 4000, 10);
        premiumDiscounts.add(discount);
        
        discount = new Discount(4000, 8000, 15);
        premiumDiscounts.add(discount);
        
        discount = new Discount(8000, 12000, 20);
        premiumDiscounts.add(discount);
        
        discount = new Discount(12000, Double.MAX_VALUE, 30);
        premiumDiscounts.add(discount);
    }
    
    
    /**
     * 
     * Regular Customer 
     * Purchase Slab    Discount%
     * 0 - 5000            0
     * 5000 - 10000        10
     * 10000 - & above     20
     * 
     * 
     * Premium Customers
     * Purchase Slab    Discount%
     * 0 - 4000            0
     * 4000 - 8000         10
     * 8000 - 12000        20
     * 12000 - & above     30 
     * 
     * Note: Total discount would be the sum of discount calculated for each slab.
     * 
     */
    public static int calculateDiscount(CustomerType customerType, double billAmount) {
        
        //Get the Discount slabs based on the customer type
        List<Discount> discounts = customerType == CustomerType.REGULAR ? regularDiscounts : premiumDiscounts;
        
        int discountAmount = 0;
        double leftOverAmount = billAmount;
        
        
        for(Discount discount : discounts) {
            
            //Calculate discount for this slab if applicable.
            if( discount.getSlabStart() < billAmount) {
                if(discount.getSlabEnd() <= billAmount) {
                    discountAmount += ( (discount.getSlabEnd() - discount.getSlabStart()) * discount.getDiscount() / 100);
                } else {
                    discountAmount += (leftOverAmount * discount.getDiscount() / 100);
                }
            }
            
            //Update the left over amount
            leftOverAmount -= (discount.getSlabEnd() - discount.getSlabStart());
            
            if(leftOverAmount <=0) {
                //Since no left over amount, let's return.
                break;
            }
        }
        
        return discountAmount;
    }
}
