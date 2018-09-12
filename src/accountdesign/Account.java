package accountdesign;
import java.util.ArrayList;

public class Account {
    private String owner;
    private int balance;
    private int number;
    
    private ArrayList<Transaction> transactionList;
    
    private static int nAccounts = 0;
    
    public Account(String name) {
        owner = name;
        balance = 0;
        nAccounts++;
        number = nAccounts;
        transactionList = new ArrayList<>();
        transactionList.add(new Creation());
    }
    
    public void deposit(int amount) {
        balance+=amount;
        transactionList.add(new Deposit(amount));
    }
    
    public void withdraw(int amount) {
        if(amount>balance) {
            System.out.println("Withdraw: not enough balance. Ignored");
        } else {
            balance-=amount;
            transactionList.add(new Withdrawal(amount));
        }
    }
    
    public void transfer(int amount, Account to) {
        if(amount>balance) {
            System.out.println("Transfer: not enough balance. Ignored");
        } else {
            balance -= amount;
            transactionList.add(new TransferTo(amount, to));
            to.balance += amount;
            transactionList.add(new TransferFrom(amount, this)); //this = kontot som ropat på metoden
        }
    }
    
    public void printAll() {
        System.out.println(number+"/"+owner+": "+balance);
        System.out.println("Transactions:");
        for (Transaction t : transactionList) {
            t.print();
        }
    }
    
    public int getBalance() {
        return balance;
    }

    public String getOwner() {
        return owner;
    }
    
}
