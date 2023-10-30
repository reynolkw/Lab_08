import java.util.Scanner;

public class CheckOut {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Welcome to the $10 store checkout system. Please begin checking out.");
        double checkoutTotal = 0;
        do {
            checkoutTotal += SafeInput.getRangedDouble(in,"Enter the item cost",0.50,10.00);
        } while (SafeInput.getYNConfirm(in, "Would you like to continue?"));

        System.out.printf("The checkout total is %.2f.", checkoutTotal);
    }

}
