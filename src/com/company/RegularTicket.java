package com.company;

public class RegularTicket {
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



    public String[] spacialServices = new String[10];

    public String[] findSpecialServiceAvailed(){
        return this.spacialServices;
    }
    public void updateSpecialService(String service){
        for(int i=0; i<this.spacialServices.length ; i++){
            if(this.spacialServices[i] == null){
                this.spacialServices[i] = service;
            }
        }
    }
}
