import java.util.Scanner;

public class Demo022 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the year: ");
        int year = sc.nextInt();

        if (year < 0) {
            System.out.println("invalid year broo");
        }

        else if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {  //imp condition : year % 4 == 0 && year % 100 != 0 || year % 400 == 0
             System.out.println("its the leap year broo");             // The condition should check if the year is divisible by 4 and not divisible by 100 unless it's divisible by 400.
        }
        else{
            System.out.println("its not the leap year broo");
        }

        sc.close();
    }
}
