package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class Vacation {
    String vacationName;
    String vacationType;  //beach, city, adventure
    String destination;
    Date startDate;
    Date endDate;
    double price;
    String accommodations;
    String activities;
    String transportation; //flight, rental car
    String bookingStatus; //confirmed, pending, cancelled
}


