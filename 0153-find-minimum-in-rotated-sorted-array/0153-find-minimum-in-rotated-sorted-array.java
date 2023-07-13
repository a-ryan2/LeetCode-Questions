class Solution {
    public int findMin(int[] nums) {
        // int min=nums[0];
        // int low=0;
        // int high=nums.length-1;
        // while(low<=high){
        //     int mid=(low+high)/2;
        //     if(nums[mid]<min){
        //         min=nums[mid];
        //     }
        //     else if(nums[mid]>)
        // }
        int min=nums[0];
        for(int i=1;i<nums.length;i++){
            if(nums[i]<min){
                min =nums[i];
            }
            
        }
        return min;
    }
}