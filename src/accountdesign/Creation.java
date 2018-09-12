package accountdesign;

public class Creation extends Transaction{
    
    public Creation() {
        super(0);
    }

    @Override
    public void print() {
        System.out.println(super.toString() + " created");
    }
    
}
