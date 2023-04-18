package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
class Flights extends Booking {

    int flightNumber;
    String airlineName;
    String departureAirport;
    String arrivalAirport;
    Date departureDateTime;
    String arrivalDateTime;
    float flightDuration;
    double price;

    Flights() {
//        constructor that takes all these parameters
    }

    String payment(){

        return "";
    }

    @Override
    void bookingDetails() {
        super.bookingDetails();
    }
}
