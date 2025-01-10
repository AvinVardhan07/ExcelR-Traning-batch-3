import java.util.Scanner;
public class AreaOfCircle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);              ///area of the triangle : 1/2 * base * height 
        System.out.println("Enter the radius: ");
       double r = sc.nextInt();
        
        
     double area =Math.PI * r * r;

     System.out.println("area of the circle is: " + area);

     sc.close();

        
    }
}
