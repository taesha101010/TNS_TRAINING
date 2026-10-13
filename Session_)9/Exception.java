// Exception Handling:
// 1. try catch
// 2. finally
// 3. throw

import java.io.FileReader;
import java.io.IOException;
import java.util.*;


class ExceptionsFile{
     static  void readFile() throws IOException{
            FileReader file = new FileReader("data.txt");
            System.out.println("File Opened.");
          }
          
}


public class Exception{
    public static void main(String[] args){
          int a = 10;
          int b = 0;

          /* 
          try{
            int rest = a/b;
            System.out.println(rest);
            // int[] numbers = {10,20,30};  if we write like this and try to put 2 catch statements it wont work. only the 1st statements will work.
            //System.out.println(numbers[5]);
          }

          catch(ArithmeticException e){
            System.out.println("you cannot divide by 0.");
            
          }

          try{
          
            int[] numbers = {10,20,30};
            System.out.println(numbers[5]);
          }

          catch(ArrayIndexOutOfBoundsException e){
            System.out.println("invalid array index");
          }

          try{
            int num = 10/0;
            System.out.println(num);
          }
          catch(ArithmeticException e){
            System.out.println("Do not divide by 0.");
            System.out.println("The error type was: "+ e.getMessage());
          }*/


          //////////Finally Cosing Statement: import javax.smartcardio.ATR
           
          
          /* 
          try{
            int res = 10/5;
            System.err.println(res);
          }
          catch(ArithmeticException e){
            System.out.println("cannot divide by 0.");
          }

          finally{
            System.out.println("finally block executed.");
          } */


          ///////////////THROW/////////////////////
         
          /* 
          Scanner sc = new Scanner(System.in);
          System.out.println("Enter your age: ");
          int age = sc.nextInt();

          if (age < 0){
            throw new IllegalArgumentException(
                "Age cannot be negative"
            );
          }

          System.out.println("Age: "+ age);*/


          ////////readfile and IO exception//////
          /* 
          try{
            ExceptionsFile.readFile();
          }
          catch(IOException e){
            System.out.println("Could not find file. ");
          }
            */
            
        int balance = 500000;
        int withdrawal = 12000;// success
        //int withdrawal = 6100000;  
      
        try {
            if (withdrawal > balance){
                throw new IllegalArgumentException("Insufficeint balance.");
            }
            balance -= withdrawal;
            System.out.println("Withdrawal successfull!");
            System.out.println("Remaining Balance: "+ balance);
        }

        catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }

        System.out.println("Program completed");

    } 
}
