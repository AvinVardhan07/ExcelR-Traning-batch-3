import java.util.Scanner;

public class Demo053 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number broo: ");
        int number = sc.nextInt();

        // Checking if it is a strong number or not
        if (StrongNumber.isStrong(number)) { // acces
            System.out.println(number + " is a strong number.");
        } else {
            System.out.println(number + " is not a strong number.");
        }

        sc.close();
    }
}

class StrongNumber { // Note : in this class all the attributes or properties should be declared in
                     // "public static" key word methods only so that they can be used by another
                     // class
    public static boolean isStrong(int number) {// remember : method is consisting of static key word
        int sum = 0;
        int temp = number;

        // Extracting each digit and find its factorial sum
        while (temp > 0) {
            int digit = temp % 10; // Get last digit
            sum += factorial(digit); // Add factorial of the digit to sum
            temp /= 10; // Remove last digit
        }

        // If sum of factorials equals the original number, then it's a strong number
        return sum == number;
    }

    private static int factorial(int n) { // function for finding the factorial of a given number broo
                                          // remember : method is consisting of static key word
        int fact = 1;

        // Calculating factorial of "n" broo
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }

        return fact; // Return the factorial value
    }
}
