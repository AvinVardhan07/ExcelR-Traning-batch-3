import java.util.Scanner;

public class RoundUpNumberManual {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        double number = scanner.nextDouble();

        int roundedNumber = (number == (int) number) ? (int) number : (int) number + 1;

        System.out.println("The number rounded up to the nearest whole number is: " + roundedNumber);

        scanner.close();
    }
}
