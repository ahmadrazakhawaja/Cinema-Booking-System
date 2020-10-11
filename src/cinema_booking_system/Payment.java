/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_booking_system;

/**
 *
 * @author Muhammad Affan
 */
public class Payment {
    
    private int Amount;
    public int Quantity;
    private int prices;

    public Payment(int Quantity, int prices) {
        this.Quantity = Quantity;
        this.prices = prices;
    }
    
    
   
    public int getAmount(){
   
    Amount = Quantity * prices;
    return Amount;
    
}
    
    

    @Override
    public String toString() {
        return "Payment:" + "Tickets = " + Quantity + " Total Amount= PKR " + Amount;
    }
    
}