public class greaterofThree {
     public static void main(String[] args) {
        int n1 = 10 , n2 = 2 , n3 = 4 ;

        if (n1 > n2 && n1 > n3){
            System.out.println("n1 is greater then remaining");
        }
        else if(n2 > n1 && n2 > n3) {
                 System.out.println("n2 is greater then remaining");
        }
        else{
            System.out.println("n3 is greater then remainig");
        }
     }
}
