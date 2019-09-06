package local.jcrn.piggybank;

public class Dime extends AbstractMoney {

    /********* Constructors ********/
    // Default w/o count argument
    public Dime() {
        value = 0.1;
    }

    // Takes count as an argument
    public Dime(int count) {
        super(count);
        value = 0.1;
    }

    /******** Methods *******/

    // Override default toString method; returns count + "Dime" - handles plurals
    @Override
    public String toString() {
        if (count > 1) {
            return "`" + count + " Dimes`";
        } else {
            return "`" + count + " Dime`";
        }
    }
}