import java.util.Scanner;

//sum of cubes of each digit of number broo
public class Demo056 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int CompleteNum = sc.nextInt();
        int Sum_Sq_Each_digit = 0; // global vaiable

        while (CompleteNum > 0) {
            int eachDigit = CompleteNum % 10;
            Sum_Sq_Each_digit += eachDigit * eachDigit * eachDigit;
            CompleteNum = CompleteNum / 10;
        }

        System.out.println("The final output: " + Sum_Sq_Each_digit);

        sc.close();
    }
}
