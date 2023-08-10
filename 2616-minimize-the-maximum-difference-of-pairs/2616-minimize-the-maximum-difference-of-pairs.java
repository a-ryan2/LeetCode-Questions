class Solution {
    static boolean isPossible(int nums[],int p,int diff){
        int n=nums.length;
        for(int i=1;i<n;i++){
            if(nums[i]-nums[i-1]<=diff){
                p--;
                i++;
            }
            
        }
        return p<=0;
    }
    public int minimizeMax(int[] nums, int p) {
        int n=nums.length;
        Arrays.sort(nums);
        int low=0;
        int high=nums[n-1]-nums[0];
        int ans=high;
        while(low<=high){
            int mid=(low+high)/2;
            if(isPossible(nums,p,mid)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return ans;
        
    }
}