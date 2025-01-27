import java.util.Scanner;

public class Demo049 {
    public static void main(String[] args) {
        int rev = 0;
        System.out.println("ENTER THE NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            int p = num % 10;
            rev = rev * 10 + p;  //main logic
            num /= 10;
        } while (num > 0);

        System.out.println("The reversed one: " + rev);

        sc.close();
    }
}
