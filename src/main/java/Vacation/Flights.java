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
    String flightStatus;
    String cabinClass;
    double price;
    boolean seatAvailabilty; //probably a bit too much
}
