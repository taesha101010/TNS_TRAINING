import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.Month;
import java.util.Scanner;
public class DateExplorer {

    LocalDate date ;


    public DateExplorer (LocalDate date){
        this.date = date;
    }


    public void lookBackMonths(Scanner sc){
        System.out.println("Enter how many months back you want to go: ");
        int noOfMonthsToMinus = sc.nextInt();
        LocalDate pastMonth = date.minusMonths(noOfMonthsToMinus);
        System.out.println(noOfMonthsToMinus +" Months before was: " + pastMonth);
    }

    public void displayDate(){
        DayOfWeek dayOfWeek = date.getDayOfWeek();
        Month month = date.getMonth();   //now.getMonth - october  //now.getMonthValue(); - 10
        int year = date.getYear();

         System.out.println("Day Of Week: " + dayOfWeek);
         System.out.println("Month: " + month);
         System.out.println("Year: " + year);
    }

    public void leapYear(){
        int year = date.getYear();
        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)){
            System.out.println(year + " is a leap year.");
        }
        else {
            System.out.println(year + " is not a Leap Year.");
        }
    }

    public void displayMonth() {
        Month month = date.getMonth();
        System.out.println("Month: " + month);
    }

    public void displayYear() {
        int year = date.getYear();
        System.out.println("Year: " + year);
    }



    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the date in the format of (YYYY-MM-DD): ");
        String input = sc.nextLine();

        LocalDate date = LocalDate.parse(input);
        DateExplorer obj = new DateExplorer(date);

        System.out.println("You Entered: " + date);



        int choice;
        do {
            System.out.println("---Date Explorer---");
            System.out.println("Enter your choice:\n1. Look Back in Months\n2. Display Day of Week\n3. Display Month\n4.Display Year\n5.Check Leap Year\n6.Exit");

            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    obj.lookBackMonths(sc);
                    break;

                case 2:
                    obj.displayDate();
                    break;

                case 3:
                    obj.displayMonth();
                    break;

                case 4:
                    obj.displayYear();
                    break;

                case 5:
                    obj.leapYear();
                    break;

                case 6:
                    System.out.println("Exiting Date Explorer...");
                    break;

                default:
                    System.out.println("Invalid choice. Try again.");
            }
        }while(choice != 6);

        sc.close();

    }
}
