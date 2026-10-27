/*
-LocalDate
-LocalDate
-
*/

import java.time.LocalDate;
import java.time.Month;

class dataTime{
    public static void main(String[] args){
        LocalDate now = LocalDate.now();
//        System.out.println("Today date is: " + now);

//        //Current DATE
//        int dayOfMonth = now.getDayOfMonth();
//        Month month = now.getMonth();   //now.getMonth - october  //now.getMonthValue(); - 10
//        int year = now.getYear();
//
//        System.out.println("Day: " + dayOfMonth);
//        System.out.println("Month: " + month);
//        System.out.println("Year: " + year);


        //Customised date//
//        LocalDate customDate = LocalDate.of(2026,12,13);
//        System.out.println(customDate);

        //Past DAYS/DATES//
        System.out.println(now);
        LocalDate yesterday = now.minusDays(1);
        System.out.println("\nYesterday was: " + yesterday);

        LocalDate pastDate = now.minusMonths(100);
        System.out.println("100 Months before was: " + pastDate);

    }
}