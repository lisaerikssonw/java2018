package accountdesign;
public class TransferTo extends Transaction {

    private Account to;
    
    public TransferTo(int amount, Account to) {
        super(amount);
        this.to = to;
    }
    
    @Override
    public void print() {
        System.out.println(super.toString() + " transferred to "+ to.getOwner());
    }
}
