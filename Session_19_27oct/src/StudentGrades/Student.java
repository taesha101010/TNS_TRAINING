package StudentGrades;

public class Student {
    private String name;
    private int rollNo;
    private int m1;
    private int m2;
    private int m3;

    Student(String name, int rollNo, int m1, int m2, int m3){
        this.name = name;
        this.rollNo = rollNo;
        this.m1 = m1;
        this.m2 = m2;
        this.m3 = m3;
    }

    double getTotal(){
        return m1+m2+m3;
    }

    double getAverage(){
        return  (m1+m2+m3)/3.0;
    }

    void getGrade(){
        if (getAverage() >= 90){
            System.out.println("A+");
        } else if ((getAverage() >= 75)) {
            System.out.println("A");
        }
        else if ((getAverage() >= 60)) {
            System.out.println("B");
        }
        else if ((getAverage() >= 40)) {
            System.out.println("C");
        }
        else {
            System.out.println("Fail");
        }
    }

    void display(){
        System.out.println("Name: " + name  );
        System.out.println("RollNo: " + rollNo);
        System.out.println("Marks of 1st subject: "+ m1);
        System.out.println("Marks of 2nd subject: "+ m2);
        System.out.println("Marks of 3rd subject: "+ m3);

    }


    public static class StudentDemo {
        public static void main(String[] args){
            Student s1 = new Student("Tanisha", 02, 90, 95, 99);
            Student s2 = new Student("Vishakha", 01, 98, 93, 92);
            System.out.println("Displaying the StudentGrades.Student information");
            s1.display();
            s2.display();
            System.out.println();
            System.out.println("Sum of marks: ");
            System.out.println(s1.getTotal());
            System.out.println(s2.getTotal());
            System.out.println();
            System.out.println("Display Average: ");
            System.out.println(s1.getAverage());
            System.out.println(s1.getAverage());

            System.out.println();
            System.out.println("Display Grade: ");
            s1.getGrade();
            s2.getGrade();



        }
    }
}
