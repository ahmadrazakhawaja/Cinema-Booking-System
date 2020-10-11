/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_booking_system;


 import java.util.*;

public class Cinema_Booking_System {

   
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
       MAIN  m = new MAIN();
       
       m.setVisible(true);
      
       
       //Session Booking
        
        Session sess = new Session("26 April", "6.35", true,10,10);
        
        // Calling Quantity
       // Quantity();
        
        //Category();
        
       // Seat();
        
        
        
        
      /*  System.out.println("Choose Payment Method \n 1: Cash on Delivery \n 2: Credit or Debit");
       int pay = scan.nextInt();
        if( pay == 2){
            System.out.println("Card Brand: ");
             String brand = scan.next();
            System.out.println("Card Number: ");
            long card_no = scan.nextLong();
            
            System.out.println("Verification code ");
            int v_code = scan.nextInt();*/
            
    
        Room r1=new Room(1213,"platinum",8,9);
        Session so=new Session("27 april","6.45",false,r1.rows,r1.rows);
        
    Seat sea=new Seat(4);
    Seat t=new Seat(1);
    System.out.println(sea.generateseatid());
    System.out.println("Welcome to Cine-Max ");
    for(int i=0;i<sea.quantity;i++) {
    	System.out.println("is seat available: "+sea.seatavailibility(sess.s));
        sea.checkbookseat(sess.s);
    	sea.generateseatid();
    	System.out.println(sea.toString());}
    
    /*System.out.println("Welcome to Cine-Max ");
    	for(int i=0;i<t.quantity;i++) {
        	t.checkbookseat(sess.s);
        	t.generateseatid();
        	System.out.println(t.toString());}
        	
        	System.out.println("Welcome to Cine-Max ");
        	for(int i=0;i<sea.quantity;i++) {
            	t.checkbookseat(so.s);
            	t.generateseatid();
            	System.out.println(t.toString());}
        	
        	System.out.println("Welcome to Cine-Max ");
        	for(int i=0;i<t.quantity;i++) {
            	t.checkbookseat(so.s);
            	t.generateseatid();
            	System.out.println(t.toString());}*/
        
        
    }
}
        
        
        
        
        
        
        
        
        /*
        System.out.println("Enter your Name");
        String name = scan.next();
        System.out.println("Mobile Number: ");
            long mob_no = scan.nextLong();
            System.out.println("Telephone Number: ");
            long tel_no = scan.nextLong();
            System.out.println("Enter your Address ");
            String address = scan.next();
        Customers c1 = new Customers(123, name, mob_no, tel_no, address);
        
        Room r1 = new Room(12,200, cate );
        Rating rat = new Rating(777,"Avengers End Game", 9.6 );
        
        Payment p = new Payment(q,price);
        p.getAmount();
       
        
        
       
        Show sh1 = new Show("Avengers End Game", cate, 800, q, sess, p );
        
        System.out.println();
        
        System.out.println(sh1);
           System.out.println();
        
        System.out.println(rat);
           System.out.println();
        
        System.out.println(r1);
           System.out.println();
        
        System.out.println(sea);
       
        
        
        
    }
    
    public static void Quantity(){
             Scanner scan = new Scanner(System.in);
         

        
        try {
        System.out.println("Enter the Quantity of tickets ");
        int q = scan.nextInt();
        if(q == 0){
            System.out.println("Quantity of tickets cannot be zero ");
        }
        
        } catch(InputMismatchException e){ System.out.println("Please input an integer number ");
        Quantity();}
    }
    
    
    
   
        
    } 
    public static void Seat(){
        try{
    Scanner scan = new Scanner(System.in);
    System.out.println("Choose your seat");
        System.out.println("row");
        int row =  scan.nextInt();
        System.out.println("coulmn");
        int column = scan.nextInt();
        
        
        Seat sea = new Seat(123, row, column);
        }catch(InputMismatchException e){ System.out.println("please enter the correct row / column number");
        Seat();}
}
**/
