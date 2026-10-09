class CoffeeShop{
    String name;
    double balance;

    CoffeeShop(String name, double intitialDeposit){
        this.name = name;
        this.balance = intitialDeposit;

    }

    void topUp(double amount){
        this.balance = this.balance + amount;
        System.out.println("Added rps " + amount + "New Balance: rps " + this.balance ); 
    }

    void makePurchase(double amount){
        if (amount > this.balance){
            System.out.println("Insufficeint Balance");

        }
        else {
            this.balance = this.balance - amount;
            System.out.println("Bought item for rps: " + amount +  " Remaning Balance is : " + this.balance);
    }

}

    void showOverview(){
        System.out.println("Name: " + this.name);
        System.out.println("Balance: " + this.balance);
    }

    }

public class CoffeeWallet {
    public static void main(String[] args) {
        
    
         CoffeeShop c = new CoffeeShop("Tanisha", 500 )   ;
         c.topUp(200);
         c.makePurchase(150);
         c.makePurchase(800);
         c.showOverview();
}

}
