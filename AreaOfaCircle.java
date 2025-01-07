
import java.util.Scanner;
public class AreaOfaCircle {

    public static void main(String[] args) {
  

        double base;
        double height;
    
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the base broo: ");
          base = sc.nextDouble(); 
        
          System.out.println("enter the height  broo: ");
          height  = sc.nextDouble(); 
          

        double area = 0.5 * base * height;
        
        System.out.println("The area of the triangle is: " + area);


        sc.close();
    }
}
