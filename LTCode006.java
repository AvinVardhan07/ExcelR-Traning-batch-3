public class LTCode006 {

    static class Solution {
        public int removeDuplicates(int[] nums) {
            int k = 0;

            for (int x : nums) {
                if (k == 0 || x != nums[k - 1]) {
                    nums[k++] = x;
                }
            }
            return k;
        }
    }

    public static void main(String[] args) {
        Solution solution = new Solution();

        
        int[] nums = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};

      
        int k = solution.removeDuplicates(nums);

      
        System.out.println("unique elements: " + k);
        System.out.print("final array: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}
