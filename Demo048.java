import java.util.Scanner;

public class Demo048 {
    public static void main(String[] args) {
        int sum = 0;
        System.out.println("ENTER THE NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            int p = num % 10;  
            sum += p;         
            num /= 10;            
        } while (num > 0);

        System.out.println("The final sum: " + sum);

        sc.close();
    }
}
