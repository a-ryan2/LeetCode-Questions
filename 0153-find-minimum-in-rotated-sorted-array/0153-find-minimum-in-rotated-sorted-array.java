class Solution {
    public int findMin(int[] nums) {
        int low=0;
        int high=nums.length-1;
        int minimum=Integer.MAX_VALUE;
        while(low<=high){
            int mid=(low+high)/2;
            //min=nums[mid];
            // if(nums[mid]<=nums[high]&&nums[mid]<=nums[low]){
            //     low=low+1;
            //     high=high-1;
            //     min=nums[mid];
            // }
            if(nums[mid]>=nums[low]){
                minimum=Math.min(minimum,nums[low]);
                // low=mid+1;
                low=mid+1;           
            }
            else if(nums[mid]<=nums[high]){
                 minimum=Math.min(minimum,nums[mid]);
                 high=mid-1;
            }
            
        }
        return minimum;
        
        
        
    }
}