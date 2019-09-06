package local.jcrn.piggybank;

public abstract class AbstractMoney {

    /******** Fields ********/
    // Count of currency deposited for each deposit
    public int count;
    // Value of each type of currency
    public double value;

    /******** Constructors ********/

    // Default w/o an argument (count = 1)
    public AbstractMoney() {
        count = 1;
    }

    // Takes a count argument
    public AbstractMoney(int count) {
        this.count = count;
    }

    /******* Methods ********/

    // Get the total value for each deposit
    public double getTotal() {
        return value * count;
    }

}