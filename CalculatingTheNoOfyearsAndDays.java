import java.util.Scanner;

public class CalculatingTheNoOfyearsAndDays{
    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);
        
        // Ask the user to enter the number of minutes
        System.out.println("Enter the number of minutes:");
        long minutes = scanner.nextLong();
        
        // Constants for calculations
        int minutesPerDay = 60 * 24;
        int minutesPerYear = minutesPerDay * 365;

        // Calculate the number of years and days
        long years = minutes / minutesPerYear;
        long remainingMinutes = minutes % minutesPerYear;
        long days = remainingMinutes / minutesPerDay;

        // Display the result
        System.out.println(minutes + " minutes is approximately " + years + " years and " + days + " days.");
        
        // Close the scanner
        scanner.close();
    }
}
