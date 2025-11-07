import java.util.Scanner;

public class Task6 {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double celsius = InputHelper.getDouble(scan, "Enter temperature in Celsius");

        double fahrenheit = celsiusToFahrenheit(celsius);

        System.out.println("The temperature in Fahrenheit is: " + fahrenheit);
    }
}