class Solution {
    public int longestOnes(int[] nums, int k) {
        int j=0,i;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                k--;
            }
            if(k<0){
                if(nums[j++]==0){
                    k++;
                }
            }
        }
        return i-j;
    }
}