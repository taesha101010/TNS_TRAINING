import java.util.ArrayList;

public class Wrapper {
    public static void main(String[] args) {
        String s1 = "123,456,789";
    
        String[] numbers = s1.split(",");

        int sum = 0;

        for (String num: numbers){
            int n = Integer.parseInt(num);
            sum = sum + n;
        }

        System.out.println("Total sum : " + sum);
        
        //////////////////
        //2.

        String password = "TaeSHA@0@3";
        int upper = 0;
        int lower = 0;
        int digit = 0;
        int special = 0;

        for (int i = 0; i < password.length();i++){
            char ch = password.charAt(i);

            if(Character.isUpperCase(ch)){
                upper++;
            }
            else if (Character.isLowerCase(ch)){
                lower++;
            }
            else if (Character.isDigit(ch)){
                digit++;
            }
            else{
                special++;
            }
        }


       System.out.println("Upper cases: " + upper);
       System.out.println("Lower cases: " + lower);
       System.out.println("Digits count: " + digit);
       System.out.println("Special cases: " + special);

       ///////////////////
       
       ArrayList<Integer> nums = new ArrayList<>();
        nums.add(2);
        nums.add(3);
        nums.add(4);
        nums.add(5);
        
        nums.removeIf(n ->n % 2 !=0);

        System.out.println(nums);

      
    }
}
