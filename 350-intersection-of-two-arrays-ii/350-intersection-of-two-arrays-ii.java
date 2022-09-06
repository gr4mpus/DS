class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        int[] counterArray = new int[1001];
        int[] duplicate = new int[1001];
        int resSize = 0;
        for(int i = 0; i<nums1.length; i++) {
            counterArray[nums1[i]]++;
            duplicate[nums1[i]]++;
        }
        for(int i = 0; i<nums2.length; i++) {
            if(counterArray[nums2[i]] > 0 && duplicate[nums2[i]] > 0) {
                resSize++;
                duplicate[nums2[i]]--;
            }
        }
        int[] res = new int[resSize];
        int resIndex = 0;
        for(int i = 0; i<nums2.length; i++) {
            if(counterArray[nums2[i]] > 0) {
                res[resIndex] = nums2[i];
                resIndex++;
                counterArray[nums2[i]]--;
            }
        }
        return res;
    }
}