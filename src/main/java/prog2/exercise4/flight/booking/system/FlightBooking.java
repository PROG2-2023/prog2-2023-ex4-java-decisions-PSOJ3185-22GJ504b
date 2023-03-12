package prog2.exercise4.flight.booking.system;

import java.time.LocalDate;
import java.time.format.DateTimeParseException;
// import java.nio.file.SimpleFileVisitor;
// import java.util.Scanner;
// import javax.print.attribute.standard.Destination;
// import javax.sound.sampled.SourceDataLine;
// import java.time.LocalDate;
// import java.util.Date;
import java.util.Random;

public class FlightBooking {

    // static String usingMath(int length) {
    //     String alphabetsInUpperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
    //     String numbers = "0123456789";
    //     String flightID = alphabetsInUpperCase + numbers;
    //     StringBuffer randomString = new StringBuffer();
    //     for (int i = 0; i < length; i++) {
    //         int randomIndex = (int)(Math.random() * flightID.length());
    //         randomString.append(flightID.charAt(randomIndex));
    //     }
    //     return randomString.toString();
    // }

    public void setTripDate(int tripDate) {
    this.TripDate = tripDate;
    }
    public int getTripDate() {
        return TripDate;
    }

    public FlightBooking(String passengerFullName,LocalDate depart,LocalDate returnDate,int childPassengers,int adultPassengers){
        this.passengerFullName = passengerFullName;
        this.departureDate = depart;
        this.returnDate = returnDate;
        this.childPassengers = childPassengers;
        this.adultPassengers = adultPassengers;
    }

    String flightCompany;
    String flightID;
    String passengerFullName;
    LocalDate departureDate;
    LocalDate returnDate;
    int childPassengers;
    int adultPassengers;
    int totalPassengers;
    double departingTicketPrice;
    double returnTicketPrice;
    double totalTicketPrice;
    BookingClass bookingClass;
    TripDestination tripDestination;
    TripSource tripSource;
    TripType tripType;
    Airport sourceAirport;
    Airport destinationAirport;
    int TripDate;

    enum TripType{
        ONE_WAY,RETURN
    }
    enum BookingClass{
        FIRST,BUSINESS,ECONOMY
    }
    enum TripSource{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum TripDestination{
        NANJING,BEIJING,SHANGHAI,OULU,HELSINKI,PARIS
    }
    enum Airport{
        NANJING_LUKOU_INTERNATIONAL_AIRPORT,BEIJING_CAPITAL_INTERNATIONAL_AIRPORT,
        SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT,OULU_AIRPORT,HELSINKI_AIRPORT,
        PARIS_CHARLES_DE_GAULLE_AIRPORT
    }

    
    public void setPassengerFullName(String passengerFullName) {
        this.passengerFullName = passengerFullName;
    }
    public String getPassengerFullName() {
        return passengerFullName;
    }

    public void setFlightCompany(String flightCompany) {
        this.flightCompany = flightCompany;
    }
    public String getFlightCompany() {
        return flightCompany;
    }
    
    public void setFlightID(String flightID) {
        this.flightID = flightID;
    }
    public String getFlightID() {
        return flightID;
    }
          
    public void setBookingClass(String bookingClass){
        switch(bookingClass){
            case "1":
            this.bookingClass=BookingClass.FIRST;
            break;
            case "2":
            this.bookingClass=BookingClass.BUSINESS;
            break;
            case"3":
            this.bookingClass=BookingClass.ECONOMY;
            break;
            default:
            System.out.println("Invaild choice");
            break;
           }
    }
    public BookingClass getBookingClass(){
        return this.bookingClass;
    }
    
    public void setTripSource(String tripSource){
        switch(tripSource){
            case "1":
            this.tripSource=TripSource.NANJING;
            this.sourceAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.tripSource=TripSource.BEIJING;
            this.sourceAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.tripSource=TripSource.SHANGHAI;
            this.sourceAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.tripSource=TripSource.OULU;
            this.sourceAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.tripSource=TripSource.HELSINKI;
            this.sourceAirport=Airport.HELSINKI_AIRPORT;
            break;
            case "6":
            this.tripSource=TripSource.PARIS;
            this.sourceAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
            break;
            default:
            System.out.println("Invaild choice");
            break;
          }
    }
    public TripSource getTripSource(){
        return this.tripSource;
    }
    
    public void setTripDestination(String tripSource , String tripDestination){
        switch(tripDestination){
            case "1":
            this.tripDestination=TripDestination.NANJING;
            this.destinationAirport=Airport.NANJING_LUKOU_INTERNATIONAL_AIRPORT;
            break;
            case "2":
            this.tripDestination=TripDestination.BEIJING;
            this.destinationAirport=Airport.BEIJING_CAPITAL_INTERNATIONAL_AIRPORT;
            break;
            case "3":
            this.tripDestination=TripDestination.SHANGHAI;
            this.destinationAirport=Airport.SHANGHAI_PUDONG_INTERNATIONAL_AIRPORT;
            break;
            case "4":
            this.tripDestination=TripDestination.OULU;
            this.destinationAirport=Airport.OULU_AIRPORT;
            break;
            case "5":
            this.tripDestination=TripDestination.HELSINKI;
            this.destinationAirport=Airport.HELSINKI_AIRPORT;
            break;
            case "6":
            this.tripDestination=TripDestination.PARIS;
            this.destinationAirport=Airport.PARIS_CHARLES_DE_GAULLE_AIRPORT;
            break;
            default:
            System.out.println("Invaild choice");
            break;
              }
    }
    public String getTicketNumber(){
       return ticketNumber;
    }
    public TripDestination getTripDestination(){
        return tripDestination;
    }

    public int getChildPassengers() {
        return childPassengers;
    }
    public void setChildPassengers(int childPassengers) {
        this.childPassengers = childPassengers;
    }

    public int getAdultPassengers() {
        return adultPassengers;
    }
    public void setAdultPassengers(int adultPassengers) {
        this.adultPassengers = adultPassengers;
    }

    public void setTotalTicketPrice() {
        this.totalTicketPrice = Math.abs((((2 * ((300 + (0.1 * 300)) + (0.05 * 300))) + (5 * ((300 + (0.1 * 300)) + (0.05 * 300)))) + 250) * 2);
    }
    public double getTotalTicketPrice() {
        return  Math.abs((((2 *(300 * (0.1*300) + (0.05*300))) + (5*(300 * (0.1*300) + (0.05*300)))) + 250)*2);
    }

    public void setDepartingTicketPrice(int child, int adult) {
        this.departingTicketPrice = departingTicketPrice;
    }
    public double getDepartingTicketPrice() {
        return departingTicketPrice;
    }

    public void setReturnTicketPrice(){
        this.returnTicketPrice=returnTicketPrice;
    }
    public double getReturnTicketPrice(){
        return returnTicketPrice;
    }

    public void setTripType(String tripType) {
        switch(tripType){
            case "1":
            this.tripType=TripType.ONE_WAY;
            break;
            case "2":
            this.tripType=TripType.RETURN;
            break;
            default:
            System.out.println("Invaild choice");
            }
    }
    public TripType getTripType(){
        return this.tripType;
    }

    public LocalDate getDepartureDate() {
        return departureDate;
    }

    public LocalDate getReturnDate() {
        return returnDate;
    }

    public void setSourceAirport(Airport sourceAirport){
        if(sourceAirport.equals(destinationAirport)){
          this.sourceAirport=sourceAirport;
        }else{
          throw new IllegalArgumentException("Source cannot be the same as destination.");
        }
        }
        public Airport getSourceAirport(){
          return sourceAirport;
        }
        
    public void setTripDestination(Airport destinationAirport){
        if(destinationAirport.equals(sourceAirport)){
          this.destinationAirport=destinationAirport;
        }else{
          throw new IllegalArgumentException("Destination cannot be the same as source.");
        }
        }
        public Airport getDestinatiAirport(){
          return destinationAirport;
        }

    public void setDepartureDate(LocalDate departureDate) {
        //this.DepartureDate = DepartureDate;
        String departingString = "2023-03-04";
        this.departureDate = LocalDate.parse(departingString);
    }

    public void setReturnDate(LocalDate returnDate) {
        // this.ReturnDate = ReturnDate;
        String returningString = "2023-03-05";
        this.returnDate = departureDate.plusDays(2);
    }

    public String toString(){
        return "Dear " + passengerFullName + ". Thank you for booking your flight with " +
        flightCompany + ".\nFollowing are the details of your booking and the trip:" + "\n" +
                "Ticket Number: " + ticketNumber + "\n" +
                "From " + tripSource + " to " + tripDestination + "\n" +
                "Date of departure: " + departureDate + "\n" +
                "Date of return: " + returnDate + "\n" +
                "Total passengers: " + totalPassengers + "\n" +
                "Total ticket price in Euros: " + totalTicketPrice;
    }

    Random random = new Random();
    public String ticketNumber="11FASDFDOM";
    public void setTicketNumber() {
    
        switch (tripType) {
            case ONE_WAY:
                ticketNumber = "11";
                break;
            case RETURN:
                ticketNumber = "22";
                break;
        }
        switch (bookingClass) {
            case FIRST:
                ticketNumber = ticketNumber + "F";
                break;
            case BUSINESS:
                ticketNumber = ticketNumber + "B";
                break;
            case ECONOMY:
                ticketNumber = ticketNumber + "E";
                break;
        }
        for (int i = 0; i < 4; i++) {
            char f = (char) ((random.nextInt(26) + 65));
            ticketNumber = ticketNumber + f;
        }
        this.ticketNumber = ticketNumber + "DOM";
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            this.ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.HELSINKI) {
            this.ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.OULU) {
            this.ticketNumber = ticketNumber + "DOM";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.OULU) {
            this.ticketNumber = ticketNumber + "INT";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.NANJING) {
            this.ticketNumber = ticketNumber + "INT";
        }
        if (tripSource == TripSource.NANJING && tripDestination == TripDestination.HELSINKI) {
            this.ticketNumber = ticketNumber + "INT";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.NANJING) {
            this.ticketNumber = ticketNumber + "INT";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.OULU) {
            this.ticketNumber = ticketNumber + "INT";
        }
        if (tripSource == TripSource.OULU && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber = ticketNumber + "INT";
        }
        if (tripSource == TripSource.BEIJING && tripDestination == TripDestination.NANJING) {
            this.ticketNumber = ticketNumber + "INT";
        }
        if (tripSource == TripSource.HELSINKI && tripDestination == TripDestination.BEIJING) {
            this.ticketNumber = ticketNumber + "INT";
        }
    }
    

    ConfirmationMessage ConfirmationMessage;
    enum ConfirmationMessage {
        CHANGE, NOTCHANGE;
    }
    public void setConfirmationMessage(String confirmationmessage) {
        switch (confirmationmessage) {
            case "1":
                this.ConfirmationMessage = ConfirmationMessage.CHANGE;
                System.out.println("Thank you for booking your flight with " + flightCompany + ". Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + departureDate + "\n" +
                        "Date of return: ReturnDate (Changed from old ReturnDate to new\n" +
                        returnDate + ")\n" +
                        "Total passengers: " + totalPassengers + "\n" +
                        "Total ticket price in Euros: " + totalTicketPrice + "\n" +
                        "IMPORTANT NOTICE: As per our policy, the return date was changed because it was \n" +
                        "less than two days apart from your departure date");
                break;
            case "2":
                this.ConfirmationMessage = ConfirmationMessage.NOTCHANGE;
                System.out.println("Thank you for booking your flight with " + flightCompany + ".Following are the details \n" +
                        "of your booking and the trip: \n" +
                        "Ticket Number: " + ticketNumber + "\n" +
                        "Passenger Name: " + passengerFullName + "\n" +
                        "From TripSource to " + tripDestination + "\n" +
                        "Date of departure: " + departureDate + "\n" +
                        "Date of return: " + returnDate + "\n" +
                        "Total passengers: " + totalPassengers + "\n" +
                        "Total ticket price in Euros: " + totalTicketPrice + "\n");

                break;
        }
    }
    public void setTotalPassengers(int totalPassengers, int totalPassengers2){
    this.totalPassengers=childPassengers+adultPassengers;
    }
    public int getTotalPassengers() {
        return totalPassengers;
    }
    }
