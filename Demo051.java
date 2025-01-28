import java.util.Scanner;

public class Demo051 {
    public static void main(String[] args) {
        System.out.println("ENTER THE NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        

        int originalNum = num;
        int rev = 0;

   
        while (num > 0) {
            int digit = num % 10;
            rev = rev * 10 + digit;
            num /= 10;
        }

      
        String op = (originalNum == rev) ? "palindrome" : "not";

        System.out.println("The number is " + op);

        sc.close();
    }
}
