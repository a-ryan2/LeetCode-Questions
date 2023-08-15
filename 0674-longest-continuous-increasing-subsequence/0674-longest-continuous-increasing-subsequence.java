class Solution {
    public int findLengthOfLCIS(int[] nums) {
        int res=1;
        int curr=1;
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]<nums[i+1]){
                curr+=1;
            }
            
            else{
                res=Math.max(res,curr);
                curr=1;
            }
            
        }
        res=Math.max(res,curr);
        
        // if(curr==nums.length){
        //     return curr;
        // }
        return res;
    }
}