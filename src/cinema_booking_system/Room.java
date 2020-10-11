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
public class Room {
    private int RoomId;
   private  int capacity;
   private String category;
   public int rows;
   public int column;
   
   
   public Room(int Roomid, String category,int rows,int column){
       this.RoomId = Roomid;
       this.category = category;
       capacity=rows*column;
       
   }

    @Override
    public String toString() {
        return "Room: " + "RoomId=" + RoomId + ", capacity=" + capacity + ", category=" + category;
    }
   
}
