class Solution {
    public boolean check(int[] nums) {
       // for(int i=1;i<nums.length-1;i++){
       //    if(nums[i]<nums[i+1]&&nums[i]<nums[i-1]&&nums[i-1]<=nums[i+1]){
       //      return false;   
       //    } 
       // }
       //  return true;
        int k = 0, n = nums.length;
        for (int i = 0; i < n; ++i) {
            if (nums[i] > nums[(i + 1) % n]) {
                k++;
            }
            if (k > 1) {
                return false;
            }
        }
        return true;
    }
}