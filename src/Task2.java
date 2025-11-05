import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int favoriteInt = InputHelper.getInt(scan, "Enter your favorite int");

        double favoriteDouble = InputHelper.getDouble(scan, "Enter your favorite double");

        System.out.println("Your favorite int is " + favoriteInt + " and your favorite double is " + favoriteDouble);
    }
}
