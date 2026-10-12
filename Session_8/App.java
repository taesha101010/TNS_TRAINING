abstract class Shape{
    private String colour;

    void setColor(String colour){
        this.colour = colour;
    }
    String getColor(){
        return colour;
}

abstract double calculateArea();
}

class Circle extends Shape{
    double radius;
    Circle(double radius){
        this.radius = radius;
    }
    @Override 
    double calculateArea(){
        return (3.14)*radius*radius;
    }
}

class Rectangle extends Shape{
    double length, breadth;
    Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double calculateArea(){
        return  length*breadth;
    }
}



public class App {
    public static void main(String[] args) {
        // Car bmw = new Car();
        // bmw.drive();

        // Address home1 = new Address("Mumbai", "MH", 400084);
        // Student tanisha = new Student("Tanisha", 2, home1);
        // tanisha.displayProfile();
        
        // Battery phbattery = new Battery(250);
        // Camera phcam = new Camera(450);
        // Phone motorola = new Phone("Motorola 673", phbattery, phcam);
        // motorola.snapPicture();

         
        Stud s1 = new Stud("Tanisha");
        Stud s2 = new Stud("Vishu");
        System.out.println(Stud.collegeName);
        System.out.println();
        s1.stuCol();
        s2.stuCol();



        // Branch b1 = new Branch();
        // b1.calculateIntrest();

        // Shape c = new Circle(5);
        // c.setColor("Orange");
        // Shape r = new Rectangle(10,4);
        // r.setColor("blue");
        // System.out.printf("%s Circle area is %.22f", c.getColor(), c.calculateArea() );
        // System.out.println();
        // System.out.printf("%s Rectangle area is %.22f", r.getColor(), r.calculateArea() );

    





    }
}

