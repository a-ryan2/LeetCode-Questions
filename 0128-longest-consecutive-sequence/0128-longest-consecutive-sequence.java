class Solution {
    public int longestConsecutive(int[] nums) {
        int count=1;
        int curr=1;
        if(nums.length==0){
            return 0;
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
            if(nums[i+1]-nums[i]==1){
                curr++;
            }
            else if(nums[i+1]-nums[i]==0){
                continue;
            }
            else{
                count=Math.max(count,curr);
                curr=1;
            }
            
            
        }
        count=Math.max(count,curr);
        
        return count;
            
    }
}