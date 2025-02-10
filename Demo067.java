public class Demo067 {
 
   public static void main(String[] args) {
      int arr[]  = {11,22,33,44,55};
      int  n =arr.length;
      int Even = 0;
      for (int i = 0; i < n; i++) {
        if (arr[i] % 2==0) {
           
             System.out.println(arr[i]);

        }
      }
     
   }
}