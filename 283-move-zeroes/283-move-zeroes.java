class Solution {
    public void moveZeroes(int[] nums) {
        // for(int i = 0; i< nums.length-1; i++) {
        //     for(int j = 1; j< nums.length-i; j++) {
        //         if(nums[j-1] == 0) {
        //             nums[j-1] = nums[j];
        //             nums[j] = 0;
        //         }
        //     }
        // }

        int curr = 0;
        int next = 0;
        int index = 0;
        while(index<nums.length && nums[index] != 0) {
            index++;
        }
        if(index == nums.length-1) {
            return;
        }
        curr = index;
        while(index<nums.length && nums[index] == 0) {
            index++;
        }
        next = index;
        while(next < nums.length) {
            if(nums[curr] == 0 && nums[next] != 0) {
                nums[curr] = nums[next];
                nums[next] = 0;
                curr++;
                next++;
            }else if(nums[curr] == 0 && nums[next] == 0) {
                next++;
            }
        }
    }
}