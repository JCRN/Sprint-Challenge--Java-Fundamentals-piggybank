package local.jcrn.piggybank;

public class Penny extends AbstractMoney {

    /********* Constructors ********/
    // Default w/o count argument
    public Penny() {
        value = 0.01;
    }

    // Takes count as an argument
    public Penny(int count) {
        super(count);
        value = 0.01;
    }

    /******** Methods *******/

    // Override default toString method; returns count + "Penny" - handles plurals
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Pennies`";
        } else {
            return "`" + count + " Penny`";
        }
    }
}