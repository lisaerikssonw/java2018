package accountdesign;

public class TransferFrom extends Transaction {

    private Account from;
    
    public TransferFrom(int amount, Account from) {
        super(amount);
        this.from = from;
    }
    
    @Override
    public void print() {
        System.out.println(super.toString() + " transferred from "+ from.getOwner());
    }
}
