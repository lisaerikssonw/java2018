package accountdesign;
import java.util.Date;

public class AccountDesign {

    public static void main(String[] args) {
        
        Account a1 = new Account("Lisa");
        Account a2 = new Account("Ulf");
        
        a1.deposit(2000);
        a1.withdraw(100);
        
        a2.deposit(300);
        a2.transfer(75,a1);
        
        a1.printAll();
        a2.printAll();
     
    }

}
