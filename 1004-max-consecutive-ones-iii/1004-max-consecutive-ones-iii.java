class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=0,i=0;
        while(i<nums.length){
            if(nums[i]==0){
                k--;
            }
            if(k<0){
                if(nums[j++]==0){
                    k++;
                }
            }
            i++;
        }
        return i-j;
    }
}