import java.util.Scanner;

public class Demo047 {
    public static void main(String[] args) {
        int count =0;
        System.out.println("ENTER THE NUMBER: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        do {
            num/= 10;
             count ++;
        } while (num > 0);

        System.out.println("the final count: "+count);

        sc.close();

    }
}
