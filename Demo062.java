public class Demo062 {
    // program for printing the 1st , 2nd and last element of the array

    public static void main(String[] args) {

        int[] arr = { 10, 20, 30, 40, 50 }; // 5

        int n = arr.length;
        for (int i = 0; i < n; i++) {

            if (n >= 2) {

                System.out.println(
                        "The first element of the array is: " + arr[0] + " the second element of the array is: "
                                + arr[1] + " and the last element of the array is: " + arr[n - 1]);
                break;

            }

        }
    }
}
