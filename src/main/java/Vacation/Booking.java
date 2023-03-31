package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
class Booking extends Vacation {

    int bookingID;
    Date bookingDate;
    String customerName;
    String customerEmail;
    String bookingStatus;
    String paymentStatus;
    String bookingType;
    String bookingDetails;
    double bookingCost;
    String paymentMethod;


}
