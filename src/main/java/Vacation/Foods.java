package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@Getter
@Setter
class Foods extends Booking {

    Date date;
    String restaurant;

    enum cuisineType {Italian, Chinese, Mexican}

    void lunch() {
//        date,restaurant and budget
        bookingDetails();
    }

    void dinner() {
        //        date,restaurant and budget(from vacation)
        bookingDetails();
    }

    @Override
    void bookingDetails() {
//        override this function
        super.bookingDetails();
//        should return something
    }
}