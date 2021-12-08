package com.company;

public class Passanger {
//    Attributes
    private boolean isTourist;
    private Contact contactDetails;
    private Address addressDetails;
    private static int idCounter=0;

//    Constructers
    public Passanger(){
        int id = idCounter++;
        this.contactDetails = new Contact();
        this.addressDetails = new Address();
    }

//  Getters and Setters
    public boolean isTourist() {
        return isTourist;
    }

    public void setTourist(boolean tourist) {
        isTourist = tourist;
    }

    public Contact getContactDetails() {
        return contactDetails;
    }

    public void setContactDetails(Contact contactDetails) {
        this.contactDetails = contactDetails;
    }

    public Address getAddressDetails() {
        return addressDetails;
    }

    public void setAddressDetails(Address addressDetails) {
        this.addressDetails = addressDetails;
    }

    //  Methods
    public Contact getContact() {
        return contactDetails;
    }

    public Address getAddress() {
        return addressDetails;
    }
    public int getPassangerCount(){
        return idCounter;
    }


    private static class Address {

        //    Attributes
        private String street;
        private String city;
        private String state;

        //    Getters and Setters

        public String getStreet() {
            return street;
        }

        public void setStreet(String street) {
            this.street = street;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }

        public String getState() {
            return state;
        }

        public void setState(String state) {
            this.state = state;
        }

        //     Methods
        public String getAddressDetails() {
            return "";
        }

        public void updateAddressDetails(String addressDetail) {

        }
    }

    private static class Contact{

        //    Attributes
        private String name;
        private String phoneNumber;
        private String emailId;


        //  Getters and Setters
        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getPhoneNumber() {
            return phoneNumber;
        }

        public void setPhoneNumber(String phoneNumber) {
            this.phoneNumber = phoneNumber;
        }

        public String getEmailId() {
            return emailId;
        }

        public void setEmailId(String emailId) {
            this.emailId = emailId;
        }

        //      Methods
        public String getContactDetails() {
            return "";
        }

        public void updateContactDetail(String contactDetail) {

        }

    }
}

