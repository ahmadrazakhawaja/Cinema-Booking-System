/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_booking_system;

import java.util.Scanner;

/**
 *
 * @author Muhammad Affan
 */
public class Show {
  
   private String title;
   public String category;
   public static int prices;
 
   public static int Quantity;
   private Session s;
   private Payment payment;
  
   

    public Show(String title, String category, int prices, int Quantity, Session s, Payment payment) {
        this.title = title;
        this.category = category;
        this.prices = prices;
        this.Quantity = Quantity;
        this.s = s;
        this.payment = payment;
        
    }
    
     public static int Category(){
       
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the category of Cinema \n Platinum \n Gold \n Silver ");
        String cate = scan.next();
        int price = 0;
        if (cate.equalsIgnoreCase("gold")){
            price = 800;
            
        }
        else if (cate.equalsIgnoreCase("silver")){
            price = 550;
            
        }  
        else if (cate.equalsIgnoreCase("platinum")){
            price = 1200;
            
        }
        else{
            System.out.println("Category not listed \n Please try again  ");
             System.out.println();
           
           
        }
         return price;
     }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public static int getPrices() {
        return prices;
    }

    public static void setPrices(int prices) {
        Show.prices = prices;
    }

    public static int getQuantity() {
        return Quantity;
    }

    public static void setQuantity(int Quantity) {
        Show.Quantity = Quantity;
    }

    public Session getSession() {
        return s;
    }

    public void setSession(Session s) {
        this.s = s;
    }

    public Payment getPayment() {
        return payment;
    }

    public void setPayment(Payment payment) {
        this.payment = payment;
    }
     
    @Override
    public String toString() {
        return "Show: " + "Title= " + title + "\n Category= " + category + "\n " + s + "\n" + payment ;
    }
    
    
   
   
   
   
   
    
   
    
}
