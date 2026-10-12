
class UserAccount{
    private String userName;
    private static int totalUsers = 0;

    UserAccount(String userName, int totalUsers){
        this.userName = userName;
         UserAccount.totalUsers++;
    }

       String getUsername(){
        return userName;
    }

     static int getTotalUsers() {
        return totalUsers;
    }
        


    
}

public class StaticDemo1 {
    public static void main(String[] args) {
        System.out.println("Initial user count: " + UserAccount.getTotalUsers());
        UserAccount user1 = new UserAccount("Tanisha", 1);
         UserAccount user2 = new UserAccount("Vishakha", 2);
          UserAccount user3 = new UserAccount("Taesha", 3);
        
       System.out.println(user1.getUsername());
       System.out.println(user2.getUsername());
       System.out.println(user3.getUsername());
       
        System.out.println("Total users registered: " + UserAccount.getTotalUsers());
    }
}
