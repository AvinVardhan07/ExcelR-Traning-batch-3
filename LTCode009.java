class LTCode009 {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int m = nums1.length, n = nums2.length;
        int mergedSize = m + n;
        
        int[] merged = new int[mergedSize];
        
        for (int i = 0; i < m; i++) {
            merged[i] = nums1[i];
        }
        
        for (int j = 0; j < n; j++) {
            merged[m + j] = nums2[j];
        }

        for (int i = 0; i < mergedSize - 1; i++) {
            for (int j = 0; j < mergedSize - i - 1; j++) {
                if (merged[j] > merged[j + 1]) {
                    int temp = merged[j];
                    merged[j] = merged[j + 1];
                    merged[j + 1] = temp;
                }
            }
        }

        if (mergedSize % 2 == 1) {
            return merged[mergedSize / 2]; 
        } else {
            int mid1 = merged[mergedSize / 2 - 1];
            int mid2 = merged[mergedSize / 2];
            return (mid1 + mid2) / 2.0; 
        }
    }

    public static void main(String[] args) {
        LTCode009 obj = new LTCode009();
        
        int[] nums1 = {1, 3};
        int[] nums2 = {2};
        
        double median = obj.findMedianSortedArrays(nums1, nums2);
        
        System.out.println("final  combined median of both the arrays:  " + median);
    }
}
