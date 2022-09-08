class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        HashMap<Integer, Integer> map = new HashMap<>();
        int index1 = 0;
        int index2 = 0;
        while(index1 < nums1.length && index2 < nums2.length) {
            if(nums1[index1] == nums2[index2]) {
                if(!map.containsKey(nums1[index1])) {
                    map.put(nums1[index1], 1);
                }
                index1++;
                index2++;
                
            } else {
                if(nums1[index1] < nums2[index2]) {
                    index1++;
                } else {
                    index2++;
                }
            }
        }
        int[] res = new int[map.size()];
        int index = 0;
        for(int num: map.keySet()) {
            res[index] = num;
            index++;
        }
        return res;
    }
}