package Vacation;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
class ChillingActivities extends Activities {
    String activityName;
    Date activityDate;
    int numberOfPeople;
    int duration;

    void menu(){
//        menu of 5 options user can choose 1
    }

    void bookDetails(){
//        overrides from booking
//        takes 4 parameters see above
//    this is like a reciet
    }

    String payment(){

        return "";
    }



}
