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
public class Customer {
    private int mob;
    private String name;
    private CustomerType type;
    
    public Customer(int mob, String name, CustomerType customerType) {
        this.mob = mob;
        this.name = name;
        this.type = customerType;
    }

    public int getMob() {
        return mob;
    }

    public void setMob(int mob) {
        this.mob = mob;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CustomerType getType() {
        return type;
    }
    
    //TODO: Upgrade or downgrade customers if need be.
    public void upgradeCustomer() {
        this.type = CustomerType.PREMIUM;
    }
    
    public void downgradeCustomer() {
        this.type = CustomerType.REGULAR;
    }
    
}
