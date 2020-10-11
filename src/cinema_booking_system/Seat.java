/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinema_booking_system;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author Muhammad Affan
 */
public class Seat {
	private static int SeatID;
    private int xPosition;
    private int yPosition;
    private int count=0;
    public int quantity;
    private static ArrayList<Integer>  sc=new ArrayList<Integer>();
    
    public Seat(int quantity){
    	this.quantity=quantity;
    }
    public Seat(){
    	count++;
    }
      
    
    public int generateseatid() {
    	int count=0;
    	double k=Math.random();
    	double b=k*10000;
    	Seat.SeatID=(int) b;
    	for(int i=0;i<sc.size();i++) {
    		if(sc.get(i)==SeatID) {
    			generateseatid();
    		}
    	
    		else {int x=0;}
    	}
    	sc.add(SeatID);
    	return SeatID;
    	
    	
    }
  
    
    public void checkbookseat( String[][] s ) {
   	Scanner sc=new Scanner(System.in);
    	System.out.println("please select the row");
		 int a=sc.nextInt();
		 System.out.println("please select the column");
		 int b=sc.nextInt();
		 this.xPosition=a;
		 this.yPosition=b;
		 while (xPosition>s.length || xPosition==0) {
		      System.out.println("wrong row number selected please select the row between : "+s.length+" and "+1);
		      xPosition=sc.nextInt();
		   } 
		 while(yPosition>s[0].length || yPosition==0) {
		      // Displaying a message on the screen
		      System.out.println("wrong column number selected please select the row between : "+s.length+" and "+1);
		      yPosition=sc.nextInt();
		   } 
    	String k=s[xPosition-1][yPosition-1];
    	if(k!=null) {
    		System.out.println("This seat is already taken");
    		checkbookseat(s);
    	}
    	else
    	{
    	    	s[xPosition-1][yPosition-1]="booked";
    		System.out.println("Your seat is booked");
    	} 
    
    }
    public boolean seatavailibility(String[][] s) {
        
    int count=0;
        for(int i=0;i<s.length;i++) {
            for(int j=0;j<s[0].length;j++) {
                String m=s[i][j];
                if(m==null) { count++;}
            }
        }
        if(count>0){
            return true;
        }
        else{return false;}
    }
    		
    	
    
    
   
    
    
    
    public String toString() {
        return "Seat: " + "SeatID = " + SeatID + ", row: " + xPosition + ", column: " + yPosition;
    }
    
    
}
