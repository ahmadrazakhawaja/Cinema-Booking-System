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
public class Session {
	private String date;
    private String timeslot;
    private boolean three_d;
    public int price;
    public boolean seatavailibility;
    public String[][] s;
    
    
    
    public Session(String date, String timeslot, boolean three_d, int row,int column   ){
    	
        this.date = date;
        this.timeslot = timeslot;
        this.three_d = three_d;
        this.price=price;          
        s=new String[row][column];
    }

    @Override
    public String toString() {
        return "Session:" + "date=" + date + ", timeslot=" + timeslot + ", 3d=" + three_d;
    }
    
}
