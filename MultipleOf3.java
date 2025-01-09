import java.util.Scanner;

public class MultipleOf3 {

    public static void check(int n) {
        if (n % 3 == 0 || n % 5 == 0) {
            System.out.println("fizz fizz");
        } else if (n % 3 == 0) {
            System.out.println("fizz");
        } else {
            System.out.println("nothing");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("enter the number: ");
        int n = scanner.nextInt();

        check(n);
        scanner.close();
    }
}
