import java.util.Scanner;

public class credentialByUsingdoWhile {
    public static void main(String[] args) {
        String originalUsername = "user";
        String originalPhone = "999888";
        int originalAge = 20;

        Scanner scanner = new Scanner(System.in);
        String username;
        String phoneNumber;
     int age;

        do {
            System.out.print("Enter your username: ");
            username = scanner.nextLine();

            System.out.print("Enter your phone number: ");
            phoneNumber = scanner.nextLine();

            System.out.print("Enter your age: ");
            age = scanner.nextInt();
            
        } while (username == originalUsername && phoneNumber == originalPhone && age == originalAge);

        System.out.println("Entered username is " + username);
        System.out.println("Entered phone number is " + phoneNumber);
        System.out.println("Entered age is " + age);

        scanner.close();

    }
}
