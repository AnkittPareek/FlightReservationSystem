package com.company;

public class RegularTicket {
    //Attributes
    private String pnrNumber;
    private String depLocation;
    private String destination;
    private Flight flight = new Flight();
    private String dateOfDep;
    private double timeOfDep;
    private Passanger passanger = new Passanger();
    private int seatNumber;
    private int priceOfTicket;
    private boolean isCancelled;
    private String[] spacialServices = new String[10];


    //Constructors
    public RegularTicket() {

    }
    public RegularTicket(Flight flight){
        this.flight = flight;
    }


    //Getters and Setters
    public String getPnrNumber() {
        return pnrNumber;
    }

    public void setPnrNumber(String pnrNumber) {
        this.pnrNumber = pnrNumber;
    }

    public String getDepLocation() {
        return depLocation;
    }

    public void setDepLocation(String depLocation) {
        this.depLocation = depLocation;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public Flight getFlight() {
        return flight;
    }

    public void setFlight(Flight flight) {
        this.flight = flight;
    }

    public String getDateOfDep() {
        return dateOfDep;
    }

    public void setDateOfDep(String dateOfDep) {
        this.dateOfDep = dateOfDep;
    }

    public double getTimeOfDep() {
        return timeOfDep;
    }

    public void setTimeOfDep(double timeOfDep) {
        this.timeOfDep = timeOfDep;
    }

    public Passanger getPassanger() {
        return passanger;
    }

    public void setPassanger(Passanger passanger) {
        this.passanger = passanger;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(int seatNumber) {
        this.seatNumber = seatNumber;
    }

    public int getPriceOfTicket() {
        return priceOfTicket;
    }

    public void setPriceOfTicket(int priceOfTicket) {
        this.priceOfTicket = priceOfTicket;
    }

    public boolean isCancelled() {
        return isCancelled;
    }

    public void setCancelled(boolean cancelled) {
        isCancelled = cancelled;
    }

    public String[] getSpacialServices() {
        return spacialServices;
    }

    public void setSpacialServices(String[] spacialServices) {
        this.spacialServices = spacialServices;
    }

    //Methods
    public boolean findStatus(){
        return isCancelled;
    }
    public double findDuration(double timeOfArrival, double timeOfDep){
        return  timeOfArrival-timeOfDep;
    }
    public void cancelTicket(){
        this.isCancelled = true;
    }
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
