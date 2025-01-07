import java.util.Scanner;

public class AreaOfaTriangle {
  
    
 public static void main(String[] args) {
  

        double radius;
         System.out.println("enter the radius broo: ");
        Scanner sc = new Scanner(System.in);

          radius = sc.nextDouble(); 
        double area = Math.PI * radius * radius;
        
        System.out.println("The area of the circle is: " + area);


        sc.close();
    }

}
