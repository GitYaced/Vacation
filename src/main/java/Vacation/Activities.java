package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.ArrayList;
import java.util.Date;

@Getter
@Setter
class Activities extends Booking {

    String activityName;
    String description;
    String location;
    Date date; // an array or list of Date or Time variables to hold the schedule of the activity such as start and end times or dates

    Activities() {

//    constructor which returns something


    }

    void budgetAllocated() {

//        overall budget and how much you want to allocate

    }
}

