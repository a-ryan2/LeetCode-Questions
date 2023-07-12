class Solution {
    public int searchInsert(int[] nums, int target) {
        int n=nums.length;
        int low=0;
        int high=n-1;
        //int m=0;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]==target){
                return mid;
            }
            else if(nums[mid]>target){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
            
        }
//         return m;
//         int i=0;
//         while(i<n){
//             if(nums[i]>target)
//                 i++;
            
//         }
//         return i;  
        return low;
    }
    
}