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
    boolean bookingStatus; //yes or no
    String bookingType;  //accomodation, activities, flights and food
    double bookingCost;
    String paymentMethod;


    Booking(){
//        constructor that  returns id,date,cstnrname,email,status,type

    }
            void bookingDetails(){

            };

    String payment(){

//        2 parameters cost and payment paymentMethod
//                returns if booking was succesful
        return "";
    }
}
