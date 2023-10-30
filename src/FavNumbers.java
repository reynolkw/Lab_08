import java.util.Scanner;

public class FavNumbers {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Your favorite integer is: " +
                SafeInput.getInt(in, "What is your favorite number (integer)?"));

        System.out.println("Your favorite double is: " +
                SafeInput.getDouble(in, "What is your favorite number (double)?"));
    }
}