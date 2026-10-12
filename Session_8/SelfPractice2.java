//Static students
class Students{
    String name;
    static int count = 0;

    Students(String name){
        this.name = name;
        Students.count++;
    }

    static void getCount(){
        System.out.println("The total numbers of students created are: "+ count);

    }

}

// static Bank account

class BankAccounts{
    String accHolder;
    static String bankName = "SBI Bank";

    BankAccounts(String accHolder){
        this.accHolder = accHolder;

    }

    void display(){
        System.out.println(accHolder + bankName);
    }
}

//Final Variable...
class Circle{
    final double pi = 3.14; //cant be changed

    void result(int radius){
        System.out.println("The Circumference of Circle with Radius "+ radius + " is "+ (2*pi*radius));
    }
}

//Final method
class Vehicle{
      final void Start(){
        System.out.println("Vehicle Started: ");
    }
}

// abstarct keyword

abstract class Employee{
    String name;

    Employee(String name){
        this.name = name;}

        abstract void calculateSalary();

        void displayInfo(){
            System.out.println("Employee name: "+ name);
        }

        
    
}

    class FullTimeEmp extends Employee {
        FullTimeEmp(String name){
            super(name);
        }

        @Override 
        void calculateSalary(){
            System.out.println("Full time salary : 300000 ");
        }
    }



public class SelfPractice2 {
    public static void main(String[] args) {
        //static students
        // Students s1 = new Students("Tanisha");
        // Students s2 = new Students("Vaibhav");
        // Students s3 = new Students("Vishakha");
        // Students.getCount();

        //static bankaccount
        // BankAccounts b1 = new BankAccounts("Tanisha ");
        // BankAccounts b2 = new BankAccounts("Vaibhav ");
        // b1.display();
        // b2.display();

        //final Variable
        // Circle c = new Circle();
        // c.result(5);

        //abstarct keyword
        FullTimeEmp e1 = new FullTimeEmp("Tanisha");
        e1.displayInfo();
        e1.calculateSalary();




    }
}
