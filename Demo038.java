import java.util.Scanner;

public class Demo038 {
    public static void main(String[] args) {
       
        Scanner scanner = new Scanner(System.in);
        
        
        System.out.print("Enter a single character: ");
        char ch = scanner.next().charAt(0);

      
        if (Character.isLowerCase(ch)) {   //Character.isLowerCase() pre-built func is used to check lower-case or not.
            System.out.println(" is lowercase.");

        } else if (Character.isUpperCase(ch)) {  //Character.isUpperCase() pre-built func is used to check upper-case or not.
            System.out.println(" is uppercase.");
        } else {
            System.out.println(" is not an alphabetic letter.");
        }

        
        scanner.close();
    }
}
