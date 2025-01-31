public class LTCode008 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1; 
        int k = m + n - 1; 
       
        while (j >= 0) {
            if (i >= 0 && nums1[i] > nums2[j]) { 
                nums1[k] = nums1[i]; 
                i--; 
            } else {
                nums1[k] = nums2[j]; 
                j--;
            }
            k--;
        }
    }

    public static void main(String[] args) {
      
        LTCode008 solution = new LTCode008();

        
        int[] nums1 = {1, 2, 3, 0, 0, 0};
        int m = 3;
        int[] nums2 = {2, 5, 6};
        int n = 3;

       
        solution.merge(nums1, m, nums2, n);

      
        System.out.print("final array: ");
        for (int i : nums1) {
            System.out.print(i+ " ");
        }
    }
}
