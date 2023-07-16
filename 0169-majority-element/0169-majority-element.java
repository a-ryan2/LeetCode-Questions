class Solution {
    public int majorityElement(int[] nums) {
        int n=nums.length;
        int res=0;int count=1;
        for(int i=1;i<n;i++){
            if(nums[res]==nums[i]){
                count++;
            }
            else{
                count--;
            }
            if(count==0){
                res=i;count=1;
            }
        }
        
        count=0;
        for(int i=0;i<n;i++){
            if(nums[res]==nums[i]){
                count++;
            }
        }
        if(count<=n/2){
            return -1;
        }
        
        return nums[res];
        
        
        
        
        
        
        
        
        
        
        
        
        
//         int n=nums.length;
//         for(int i=0;i<n;i++){
//             int count=1;
//             for(int j=i+1;j<n;j++){
//                 if(nums[i]==nums[j]){
//                     count++;
//                 }
//             }
//             if(count>n/2){
//                 return nums[i];
//             }
            
//         }
        
//         return -1;
    }
}