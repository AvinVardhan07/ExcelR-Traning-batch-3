import java.util.Scanner;

public class Checking {
    public static void main(String[] args) {
        String originalUsername = "user";
        String originalPhone = "999888";
        String originalAge = "20";

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your username: ");
        String username = scanner.nextLine();

        System.out.print("Enter your phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter your age: ");
        String age = scanner.nextLine();

        if(username.equals(originalUsername) && phoneNumber.equals(originalPhone) && age.equals(originalAge)) {
            System.out.println("Entered username is " + username);
            System.out.println("Entered phone number is " + phoneNumber);
            System.out.println("Entered age is " + age);
        } else {
            System.out.println("Invalid credentials.");
        }

        scanner.close();
    }
}
