import java.util.Scanner;

public class Fibo {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the number: ");
        int n = scanner.nextInt();

        int first = 0, second = 1;

        System.out.println("Series:");
        for (int i = 0; i < n; i++) {
            System.out.print(first + " ");

            // int next = first + second;
            // first = second;
            // second = next;
        }

        scanner.close();
    }
}