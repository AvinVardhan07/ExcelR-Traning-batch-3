import java.util.Scanner;

public class Demo035 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the values: ");
         int x = sc.nextInt();
         int y = sc.nextInt();
         if(x>y){
            System.out.println("x is greater");
         }
         else if(x == y){
            System.out.println("both are equal");
         }
         else{
            System.out.println("y is greater");
         }


         sc.close();
    }
}
