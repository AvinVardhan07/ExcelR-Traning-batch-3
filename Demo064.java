public class Demo064 {
    public static void main(String[] args) {
        int [] arr ={12,20,30,45,11};
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            if (n > 2) {
               int temp= arr[0];
               arr[0]= arr[n-1];
               arr[n-1]= temp;
                 System.out.println("first element "+arr[0]+" last element "+arr[n-1]);
                 break;

            } else {
                System.out.println("gone wrong");
            }
        }
    }
}
