package com.company;

public class RegularTicket extends Ticket{
    //Attributes
    private String[] spacialServices = new String[10];


    public RegularTicket(String pnrNumber, String depLocation, String destination, Flight flight,
                         String dateOfDep, double timeOfDep, Passanger passanger, int
                                 seatNumber, int priceOfTicket, boolean isCancelled, String[] spacialServices){
        super(pnrNumber, depLocation, destination, flight, dateOfDep , timeOfDep, passanger,seatNumber, priceOfTicket, isCancelled);
        this.spacialServices = spacialServices;
    }

    //Getters and Setters
    public String[] getSpacialServices() {
        return spacialServices;
    }
    public void setSpacialServices(String[] spacialServices) {
        this.spacialServices = spacialServices;
    }

    //Methods
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
