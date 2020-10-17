/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sincroretail.model;

/**
 *
 * @author Akshay Velhal
 */
public class Discount {
    
    private double slabStart;
    private double slabEnd;
    private int discount;

    public Discount(double slabStart, double slabEnd, int discount) {
        this.slabStart = slabStart;
        this.slabEnd = slabEnd;
        this.discount = discount;
    }
    
    public double getSlabStart() {
        return slabStart;
    }

    public void setSlabStart(double slabStart) {
        this.slabStart = slabStart;
    }

    public double getSlabEnd() {
        return slabEnd;
    }

    public void setSlabEnd(double slabEnd) {
        this.slabEnd = slabEnd;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }


    
    
}
