package Vacation;

import lombok.Getter;
import lombok.Setter;
import java.util.Date;
@Getter
@Setter
class Accomodation extends Booking {

    String accommodationName;
    String accommodationType;
    String accommodationAddress;
    Date checkInDate;
    Date checkOutDate;
    int numberOfGuests;
    String roomType;
    double roomPrice;
    String amenities;  //free Wi-Fi, swimming pool, gym etc.
    String bookingStatus;
}
