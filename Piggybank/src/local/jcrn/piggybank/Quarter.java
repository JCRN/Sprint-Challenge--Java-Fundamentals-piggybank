package local.jcrn.piggybank;

public class Quarter extends AbstractMoney {

    /********* Constructors ********/
    // Default w/o count argument
    public Quarter() {
        value = 0.25;
    }

    // Takes count as an argument
    public Quarter(int count) {
        super(count);
        value = 0.25;
    }

    /******** Methods *******/

    // Override default toString method; returns count + "Dime" - handles plurals
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Quarters`";
        } else {
            return "`" + count + " Quarter`";
        }
    }
}