package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
class ThrillingActivities extends Activities{
    String activityName;
    Date activityDate;
    int numberOfPeople;
    int duration;

    void menu(){
//        menu of 5 options user can choose 1
//        instructor() returns the instructor which is needed for the activity
    }

    void bookDetails(){
//        overrides from booking
//        takes 4 parameters see above
//    this is like a reciet
    }

    String payment(){

        return "";
    }

    String instructor() {
//        will use the output from scanner from the menu to decide which instructor to choose
        return "";
    }
}

