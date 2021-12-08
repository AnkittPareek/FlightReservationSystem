package com.company;

public class TouristTicket extends Ticket {
    //Attributes

    private String hotelAddress;
    private String[] touristLocationSelected = new String[5];

    //Getters And Setters


    public String getHotelAddress() {
        return hotelAddress;
    }

    public void setHotelAddress(String hotelAddress) {
        this.hotelAddress = hotelAddress;
    }

    public String[] getTouristLocationSelected() {
        return touristLocationSelected;
    }

    public void setTouristLocationSelected(String[] touristLocationSelected) {
        this.touristLocationSelected = touristLocationSelected;
    }


    //Methods
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
