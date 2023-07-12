class Solution {
    public static int firstoccur(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
                
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                if(mid==0||nums[mid-1]!=nums[mid]){
                    return mid;
                }
                else 
                    high=mid-1;
            }
        }    
        return -1;
    }
    public static int lastoccur(int[] nums, int target){
        int low=0;
        int high=nums.length-1;
        while(low<=high){
            int mid=(low+high)/2;
            if(nums[mid]>target){
                high=mid-1;
                
            }
            else if(nums[mid]<target){
                low=mid+1;
            }
            else{
                if(mid==nums.length-1||nums[mid+1]!=nums[mid]){
                    return mid; 
                }
                else{
                    low=mid+1;
                }
            }
        }    
        return -1;
    }
    public int[] searchRange(int[] nums, int target) {
        int[] arr={-1,-1};
        int first =firstoccur(nums,target);
        if(first==-1){
            return arr;
        }
        int last=lastoccur(nums,target);
        arr[0]=first;
        arr[1]=last;
        return arr;
        
    }
}