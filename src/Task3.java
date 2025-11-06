import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int year = InputHelper.getRangedInt(scan, "Year:", 1950, 2010);
        int month = InputHelper.getRangedInt(scan, "Month:", 1, 12);

        int maxDays;

        switch (month) {
            case 2:
                maxDays = 29;
                break;
            case 4: case 6: case 9: case 11:
                maxDays = 30;
                break;
            default:
                maxDays = 31;
                break;
        }

        int day = InputHelper.getRangedInt(scan, "Day:", 1, maxDays);
        int hour = InputHelper.getRangedInt(scan, "Hour:", 1, 24);
        int minute = InputHelper.getRangedInt(scan, "Minutes:", 1, 59);
    }
}
