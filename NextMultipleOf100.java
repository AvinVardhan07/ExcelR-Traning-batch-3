import java.util.Scanner;

public class NextMultipleOf100 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter any number:");
        int number = scanner.nextInt();

        int nextMultipleOf100 = ((number / 100) + 1) * 100;  //It rounds up the next upcoming mutiple of 100 according to the number which is entered.

        if (number % 100 == 0) { 
            nextMultipleOf100 = number;
        }

        System.out.println("The next multiple of 100 is: " + nextMultipleOf100);

        scanner.close();
    }
}
