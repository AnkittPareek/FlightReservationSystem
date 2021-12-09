package com.company;

public class Main {

    public static void main(String[] args) {

        String[] tourLocations = new String[]{"bestPlace0", "bestPlace1", "bestPlace2"};

//        Here I have created two passangers and two flight.

        Passanger happyGuy = new Passanger(false);
        Passanger freeGuy = new Passanger(true);
        Flight express001 = new Flight(001, "Jodhpur to Jaipur", 200, 40);
        Flight express555 = new Flight(555, "Jodhpur to Karnataka", 200, 154);

//        Two Tickets of different types.

        Ticket regularTicket = new RegularTicket("505050", "jodhpur",
                "jaipur", express001, "2", 12.30, happyGuy, 20,
                1500, false, "food");

        Ticket touristTicket = new TouristTicket("905490", "jodhpur",
                "Karnataka", express555, "2", 10.00, freeGuy, 84,
                8599, false, "freeCityHotel, Karnataka", tourLocations);

//       Printing Ticket Details by calling printTicketDetails method

        printTicketDetails(regularTicket);
        printTicketDetails(touristTicket);


    }

    //    Method to Print PNR number, we can add more lines to print more details of Ticket.
    public static void printTicketDetails(Ticket ticket) {
        System.out.println(ticket.getPnrNumber());
    }
}
