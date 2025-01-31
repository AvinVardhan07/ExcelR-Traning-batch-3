import java.util.Scanner;

public class Demo057 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the required number machaa: ");
        int Complete_num = sc.nextInt();
      //  int first_digit;
        int last_digit = Complete_num % 10; // picking the last digit broo

        while (Complete_num >= 10) { // as we dont know how long the number wil be so, we are using the while loop
                                     // broo..
            Complete_num = Complete_num / 10; // continously iterating the number to get the first digit by eleminating
                                              // from last of the number
                                              // coming form left to right unitil the first digit by eleminating one
                                              // after another from last broo.
        }
        // here we using the complete_num variable it self insted of creating the new
        // variable to store the first digit of the given number broo
        int final_sum = Complete_num + last_digit;

        System.out.println("The final sum of the first and last digit is: " + final_sum);

        sc.close();
    }
}
