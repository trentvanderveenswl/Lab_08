import java.util.Scanner;

public class Task4 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double totalCost = 0.0;
        boolean moreItems;

        do {
            double price = InputHelper.getRangedDouble(scan, "Enter the price of your item", 0.50, 9.99);
            totalCost += price;
            moreItems = InputHelper.getYNConfirm(scan, "Do you have more items?");
        } while (moreItems);

        System.out.printf("Your total cost is: $%.2f%n", totalCost);
    }
}
