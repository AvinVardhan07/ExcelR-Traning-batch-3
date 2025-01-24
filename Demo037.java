import java.util.Scanner;

public class Demo037 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        System.out.println("Enter the values: ");
         int x = sc.nextInt();
         int y = sc.nextInt();
         int z = sc.nextInt();
         int F = sc.nextInt();
         if(x>y && x>z && x > F){
            System.out.println("x is greater");
         }
         else if(y>x && y>z & y>F){
            System.out.println("y is greater");
         }
         else if(z>x && z>y && z>F){
            System.out.println("z is greater");
         }
         else{
            System.out.println("F is greater");
         }


         sc.close();
    }
}