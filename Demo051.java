import java.util.Scanner;

public class Demo051 {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        sc.close();

        // Store the original number for comparison
        int originalNum = num;
        int rev = 0;

        // Reverse the number
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

        // Check if the original number is equal to the reversed number
        String op = (originalNum == rev) ? "palindrome" : "not a palindrome";

        System.out.println("The number is " + op);
    }
}
