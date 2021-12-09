package com.company;

public class Flight {
//    Attributes
    private int flightNumber;
    private String airlineOfFlight;
    private int capacity;
    private int bookedSeats;

//    Constructors
    public Flight(int flightNumber,String airlineOfFlight,int capacity,int bookedSeats){
        this.flightNumber = flightNumber;
        this.airlineOfFlight = airlineOfFlight;
        this.capacity = capacity;
        this.bookedSeats = bookedSeats;
    }


//  Getters and Setters
    public int getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getAirlineOfFlight() {
        return airlineOfFlight;
    }

    public void setAirlineOfFlight(String airlineOfFlight) {
        this.airlineOfFlight = airlineOfFlight;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getBookedSeats() {
        return bookedSeats;
    }

    public void setBookedSeats(int bookedSeats) {
        this.bookedSeats = bookedSeats;
    }

    //    Methods
    private String getFlightDetails(){
        return "";
    }
    public boolean isSeatAvailable(int capacity, int bookedSeats){
        return (capacity - bookedSeats) > 0;
    }
    public void updateBookedSeats(){

    }
}
