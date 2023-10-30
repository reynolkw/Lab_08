import java.util.Scanner;

public class Reggie {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String SSN = SafeInput.getRegExString(in,"Enter your social security number", "\\d{3}-\\d{2}-\\d{4}");
        String mNumber = SafeInput.getRegExString(in,"Enter your UC Student M number", "(M|m)\\d{5}");
        String menuChoice = SafeInput.getRegExString(in,"Enter your menu choice (Open Save View Quit) [OSVQ]","[OoSsVvQq]");

        System.out.println("Your SSN is: " + SSN);
        System.out.println("Your UC Student M number is: " + mNumber);
        System.out.println("Your menu choice is: " + menuChoice);
    }
}
