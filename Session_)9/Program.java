import java.util.*;
public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter 1st number: ");
        int a = sc.nextInt();
        System.out.println("Enter 2nd number: ");
        int b = sc.nextInt();
        
        try{
            int res = a/b;
            System.out.println("Result: "+ res);
        }

        catch(ArithmeticException e){
            System.out.println("Error: cannot divide by 0.");
        }
         finally{
            System.out.println("Program Executed..");
         }

        
        
    }
}
