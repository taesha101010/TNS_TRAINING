class Employee{
    String name;
    double salary;

    Employee(String name, double salary){
        this.name = name;
        this.salary = salary;
    }

    void displaydetails(){
        System.out.println("Employee Name: "+ name);
        System.out.println("Employee Salary: "+ salary);
    }

}

class Manager extends Employee{
    String department;

    Manager(String name, double salary, String department){
        super(name, salary);
        this.department = department;
    }

     @Override
     void displaydetails(){
        super.displaydetails();
        System.out.println("Manager Department: "+ department);
        System.out.println("Role: Manager");
    }
}


public class EmpMgr {
    public static void main(String[] args){

        Manager m = new Manager("Tanisha", 100000, "IT");
        m.displaydetails();
        
    }
}
