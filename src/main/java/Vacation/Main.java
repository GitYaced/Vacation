package Vacation;


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    Scanner sc=new Scanner(System.in);
        System.out.println("What is the vacation name? ");
    sc.nextLine();
Vacation ricky=new Vacation("09-09-2023","10-10-2023", 5000,"Booked");

        ricky.print();

    }
}
