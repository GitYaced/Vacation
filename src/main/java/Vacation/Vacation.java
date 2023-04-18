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
    String startDate;
    String endDate;
    double budget;
    String vacationStatus; //confirmed, pending, cancelled
    
//    make a constructor startdate and enddate budget vacationStatus
//        void entervacationname scanner class to get information from user.

        Vacation(){}
        Vacation (String startDate, String endDate, double budget, String vacationStatus){
            this.startDate=startDate;
            this.endDate=endDate;
            this.budget=budget;
            this.vacationStatus=vacationStatus;
        }

        void print(){
            System.out.println("Values till now " +startDate +" " +endDate +" " +budget +" "+ vacationStatus);
        }

}


