import java.util.Scanner;

class Lang 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("You know Python please say (yes/no)");
        String p = sc.nextLine();

        System.out.println("You know French please say (yes/no)");
        String f = sc.nextaisahaLine();

        if (p.equals("no") && f.equals("yes"))
        {
            System.out.println("You need to learn Python");
        }

        else if (p.equals("yes") && f.equals("no"))
        {
            System.out.println("You need to learn French");
        }

        else if (p.equals("no") && f.equals("no"))
        {
            System.out.println("You need to learn Python and French");
        }

        else
        {
            System.out.println("You can apply");
        }
    }
}