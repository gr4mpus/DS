class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
//         Arrays.sort(nums1);
//         Arrays.sort(nums2);
//         HashMap<Integer, Integer> map = new HashMap<>();
//         int index1 = 0;
//         int index2 = 0;
//         while(index1 < nums1.length && index2 < nums2.length) {
//             if(nums1[index1] == nums2[index2]) {
//                 if(!map.containsKey(nums1[index1])) {
//                     map.put(nums1[index1], 1);
//                 }
//                 index1++;
//                 index2++;
                
//             } else {
//                 if(nums1[index1] < nums2[index2]) {
//                     index1++;
//                 } else {
//                     index2++;
//                 }
//             }
//         }
//         int[] res = new int[map.size()];
//         int index = 0;
//         for(int num: map.keySet()) {
//             res[index] = num;
//             index++;
//         }
//         return res;
        HashSet<Integer> set1 = new HashSet<Integer>();
        HashSet<Integer> set2 = new HashSet<Integer>();
        for(int num: nums1) {
            set1.add(num);
        }
        for(int num: nums2) {
            set2.add(num);
        }
        if(set1.size() > set2.size()) {
            return createArray(set1, set2);
        } else {
            return createArray(set2, set1);
        }
    }
    public int[] createArray(HashSet<Integer> set1, HashSet<Integer> set2) {
        int[] res = new int[set2.size()];
        int index = 0;
        for(int num: set1) {
            if(set2.contains(num)) {
                res[index] = num;
                index++;
            }
        }
        return Arrays.copyOf(res, index);
    }
}