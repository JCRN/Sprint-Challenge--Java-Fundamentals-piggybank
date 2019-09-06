package local.jcrn.piggybank;

public class Dollar extends AbstractMoney {

    /********* Constructors ********/
    // Default w/o count argument
    public Dollar() {
        value = 1;
    }

    // Takes count as an argument
    public Dollar(int count) {
        super(count);
        value = 1;
    }

    /******** Methods *******/

    // Override default toString method; returns "$" + count
    @Override
    public String toString() {
       return "`$" + count + "`";
    }
}