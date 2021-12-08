package com.company;

public class TouristTicket {
    public String pnrNumber;
    public String depLocation;
    public String destination;
    public Flight flight;
    public String dateOfDep;
    public double timeOfDep;
    public Passanger passanger;
    public int seatNumber;
    public int priceOfTicket;
    public boolean isCancelled;

    public boolean findStatus(){
        return isCancelled;
    }
    public double findDuration(double timeOfArrival, double timeOfDep){
        return  timeOfArrival-timeOfDep;
    }
    public void cancelTicket(){
        this.isCancelled = true;
    }


    public String hotelAddress;
    public String[] touristLocationSelected = new String[5];

    public void addTouristLocation(String location){
        for(int i=0; i<this.touristLocationSelected.length ; i++){
            if(this.touristLocationSelected[i] == null){
                this.touristLocationSelected[i] = location;
            }
        }
    }

    public void removeTouristLocation(String location){
        for(int i=0; i<this.touristLocationSelected.length ; i++){
            if(this.touristLocationSelected[i] == location){
                this.touristLocationSelected[i] = null;
            }
        }
    }

}
