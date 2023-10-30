import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println(SafeInput.getRegExString(in, "enter your birth month [1-12]", "[a-zA-Z ]+"));
    }
}