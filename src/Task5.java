import java.util.Scanner;

public class Task5 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String ssn = InputHelper.getRegExString(scan, "Enter a Social Security Number:", "\\d{3}-\\d{2}-\\d{4}");
        System.out.println("You entered valid SSN: " + ssn);

        String mNumber = InputHelper.getRegExString(scan, "Enter your Student M number:", "(M|m)\\d{5}");
        System.out.println("You entered valid M number: " + mNumber);

        String menuChoice = InputHelper.getRegExString(scan, "Menu: (O=Open, S=Save, V=View, Q=Quit):", "[OoSsVvQq]");System.out.println("You chose: " + menuChoice.toUpperCase());
    }
}
