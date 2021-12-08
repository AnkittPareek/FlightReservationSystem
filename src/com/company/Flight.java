package com.company;

public class Flight {
    public int flightNumber;
    public String airlineOfFlight;
    public int capacity;
    public int bookedSeats;
    public String getFlightDetails(){
        return "";
    }
    public boolean isSeatAvailable(int capacity, int bookedSeats){
        return (capacity - bookedSeats) > 0;
    }
    public void updateBookedSeats(){

    }
}
