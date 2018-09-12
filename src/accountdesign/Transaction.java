package accountdesign;
import java.util.Date;

public abstract class Transaction {
    private Date timeStamp;
    private int amount;
    private int id;
    
    private static int nTransactions = 0;
    
    public Transaction(int amount) {
        timeStamp = new Date();
        this.amount = amount;
        nTransactions++;
        id = nTransactions;
    }
    
    public abstract void print();

    @Override
    public String toString() {
        return timeStamp+" ["+id+"] " + amount;
    }
    
    
}
