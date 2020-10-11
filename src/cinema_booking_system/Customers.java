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
public class Customers {
    
    private int CustomerID;
    public String CustomerName;
    private long MobileNo;
     private long TelephoneNo;
    private String H_address;
   private Seat seat;
    private Show s;
    private String Brandc;
    private String cardNum;
    private String VNum;
    
    
    public Customers(){
        
    }
    
    public Customers(int CustomerID, String CustomerName, long MobileNo, long TelephoneNo, String H_address, Show s, Seat seat){
        
        this.CustomerID = CustomerID;
        this.CustomerName = CustomerName;
        this.MobileNo = MobileNo;
        this.TelephoneNo = TelephoneNo;
        this.H_address = H_address;
        this.s = s;
        this.seat = seat;
        cardNum = "";
        Brandc = "";
        VNum = "";
        
    }

    public void setVNum(String VNum) {
        this.VNum = VNum;
    }
    

    public void setBrandc(String Brandc) {
        this.Brandc = Brandc;
    }
    
    
    public void setCardNum(String s) {
        cardNum = s;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public void setCustomerID(int CustomerID) {
        this.CustomerID = CustomerID;
    }

    public void setCustomerName(String CustomerName) {
        this.CustomerName = CustomerName;
    }

    public void setMobileNo(long MobileNo) {
        this.MobileNo = MobileNo;
    }

    public void setTelephoneNo(long TelephoneNo) {
        this.TelephoneNo = TelephoneNo;
    }

    public void setH_address(String H_address) {
        this.H_address = H_address;
    }

    @Override
    public String toString() {
        return "Customers:" + "CustomerID=" + CustomerID + ", CustomerName=" + CustomerName + ", MobileNo=" + MobileNo + ", TelephoneNo=" + TelephoneNo + ", H_address=" + H_address;
    }

    public void setShow(Show s) {
        this.s = s;
    }
    

    public int getCustomerID() {
        return CustomerID;
    }

    public String getCustomerName() {
        return CustomerName;
    }

    public long getMobileNo() {
        return MobileNo;
    }

    public long getTelephoneNo() {
        return TelephoneNo;
    }

    public String getH_address() {
        return H_address;
    }

    public Seat getSeat() {
        return seat;
    }

    public Show getShow() {
        return s;
    }

    public String getBrandc() {
        return Brandc;
    }

    public String getCardNum() {
        return cardNum;
    }

    public String getVNum() {
        return VNum;
    }
    
    
    
    
}
