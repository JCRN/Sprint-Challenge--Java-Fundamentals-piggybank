package local.jcrn.piggybank;

import java.text.DecimalFormat;
import java.util.ArrayList;

public class Main {

    // Instantiate DecimalFormat for currency formatting ($)
    static DecimalFormat fp = new DecimalFormat("$###,###.00");

    /********** Fields **********/
    // Total amount of all deposits
    static double total = 0;

    public static void main(String[] args) {
        // Instantiate ArrayList for deposits
        ArrayList<AbstractMoney> piggyBank = new ArrayList<>();

        // Deposits
        piggyBank.add(new Quarter());
        piggyBank.add(new Dime());
        piggyBank.add(new Dollar(5));
        piggyBank.add(new Nickel(3));
        piggyBank.add(new Dime(7));
        piggyBank.add(new Dollar());
        piggyBank.add(new Penny(10));

        // Print all deposits
        piggyBank.forEach((deposit) -> System.out.println(deposit));

        // Get the total amount of all deposits
        for (AbstractMoney deposits : piggyBank) {
            total += deposits.getTotal();
        }

        // Print the total amount of all deposits
        System.out.println("The piggy bank holds " + fp.format(total));
    }
}