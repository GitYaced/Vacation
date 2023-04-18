package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
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
    ArrayList amenities;  //free Wi-Fi, swimming pool, gym etc.


Accomodation(){

//    name type adress
}
void checkInDate(){
//    scanner input
//    with try and catch
}
void checkOutDate(){
//    scanner input
//with if and else
}

void bookingDetails(){
//    date library to calculate the difference between 2 dates
//override bookingdetails and add numberOfGuests roomtype roomPrice

}

String payment(){
//    override the class.
//    return bookingStatus if yes than if no than
    return "";
}



}
