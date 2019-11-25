package local.jcrn.piggybank;

public class Nickel extends AbstractMoney {

    /********* Constructors ********/
    // Default w/o count argument
    public Nickel() {
        value = 0.05;
    }

    // Takes count as an argument
    public Nickel(int count) {
        super(count);
        value = 0.05;
    }

    /******** Methods *******/

    // Override default toString method; returns count + "Nickel" - handles plurals
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Nickels`";
        } else {
            return "`" + count + " Nickel`";
        }
    }
}