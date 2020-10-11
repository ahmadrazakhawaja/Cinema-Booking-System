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
public class Rating {
    private int movieId;
    private String title;
    private double rate;

    public Rating(int movieId, String title, double rate) {
        this.movieId = movieId;
        this.title = title;
        this.rate = rate;
    }

    @Override
    public String toString() {
        return  "MovieId=" + movieId + ", Title=" + title + ", rating IMDB=" + rate;
    }
    
    
    
    
}
