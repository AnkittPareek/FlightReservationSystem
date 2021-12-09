package com.company;

public class RegularTicket extends Ticket {
    //Attributes
    private String spacialServices;


    public RegularTicket(String pnrNumber, String depLocation, String destination, Flight flight,
                         String dateOfDep, double timeOfDep, Passanger passanger, int
                                 seatNumber, int priceOfTicket, boolean isCancelled, String spacialServices) {
        super(pnrNumber, depLocation, destination, flight, dateOfDep, timeOfDep, passanger, seatNumber, priceOfTicket, isCancelled);
        this.spacialServices = spacialServices;
    }


    //Methods
    public String findSpecialServiceAvailed() {
        return this.spacialServices;
    }

    public void updateSpecialService(String service) {
        this.spacialServices = spacialServices;
    }
}
