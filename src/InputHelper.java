import java.util.Scanner;

public class InputHelper {
    public static String getRegExString(Scanner scan, String prompt, String regExPattern) {
        boolean valid = false;
        String userInput;

        System.out.println(prompt);
        do {
            userInput = scan.nextLine();
            if (userInput.matches(regExPattern)) {
                valid = true;
            } else {
                System.out.println("Error - must match specified pattern");
            }
        } while (!valid);
        return userInput;
    }

    public static String getNonZeroLenString(Scanner scan, String prompt) {
        String input;
        do {
            System.out.print(prompt + ": ");
            input = scan.nextLine();
            if (input.length() == 0) {
                System.out.println("Error - input cannot be empty.");
            }
        } while (input.length() == 0);
        return input;
    }

    public static int getInt(Scanner scan, String prompt) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                valid = true;
            } else {
                System.out.println("Error - must enter a valid integer.");
            }
            scan.nextLine();
        } while (!valid);
        return value;
    }

    public static double getDouble(Scanner scan, String prompt) {
        double value = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");
            if (scan.hasNextDouble()) {
                value = scan.nextDouble();
                valid = true;
            } else {
                System.out.println("Error - must enter a valid number.");
            }
            scan.nextLine();
        } while (!valid);
        return value;
    }

    public static int getRangedInt(Scanner scan, String prompt, int low, int high) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.printf("%s [%d - %d]: ", prompt, low, high);
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Error - number out of range.");
                }
            } else {
                System.out.println("Error - must enter an integer.");
            }
            scan.nextLine();
        } while (!valid);
        return value;
    }

    public static double getRangedDouble(Scanner scan, String prompt, double low, double high) {
        double value = 0;
        boolean valid = false;

        do {
            System.out.printf("%s [%.2f - %.2f]: ", prompt, low, high);
            if (scan.hasNextDouble()) {
                value = scan.nextDouble();
                if (value >= low && value <= high) {
                    valid = true;
                } else {
                    System.out.println("Error - number out of range.");
                }
            } else {
                System.out.println("Error - must enter a number.");
            }
            scan.nextLine();
        } while (!valid);
        return value;
    }

    public static int getPositiveNonZeroInt(Scanner scan, String prompt) {
        int value = 0;
        boolean valid = false;

        do {
            System.out.print(prompt + ": ");
            if (scan.hasNextInt()) {
                value = scan.nextInt();
                if (value > 0) {
                    valid = true;
                } else {
                    System.out.println("Error - must be positive and non-zero.");
                }
            } else {
                System.out.println("Error - must enter an integer.");
            }
            scan.nextLine();
        } while (!valid);
        return value;
    }

    public static boolean getYNConfirm(Scanner scan, String prompt) {
        String input;
        boolean valid = false;
        boolean result = false;

        do {
            System.out.print(prompt + " [Y/N]: ");
            input = scan.nextLine().trim().toUpperCase();
            if (input.equals("Y")) {
                result = true;
                valid = true;
            } else if (input.equals("N")) {
                result = false;
                valid = true;
            } else {
                System.out.println("Error - must enter Y or N.");
            }
        } while (!valid);
        return result;
    }
}