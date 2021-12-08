package com.company;

public class RegularTicket extends Ticket{
    //Attributes
    private String[] spacialServices = new String[10];


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
