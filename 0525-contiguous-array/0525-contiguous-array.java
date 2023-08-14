class Solution {
    public int findMaxLength(int[] nums) {
//         int res=0;
//         for(int i=0;i<nums.length;i++){
//             int sum=0;
//             for(int j=i;j<nums.length;j++){
//                 if(nums[j]==1){
//                     sum=sum+1;
//                 }
//                 else if(nums[j]==0)
//                     sum=sum-1;
//                 if(sum==0){
//                     res=Math.max(res,j-i+1);
//                 }
                
//             }
            
            
//         }
//         return res;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==0){
                nums[i]=-1;
            }
        }
        HashMap<Integer,Integer> s=new HashMap<>();
        int presum=0;
        int res=0;
        for(int i=0;i<nums.length;i++){
            presum+=nums[i];
            if(presum==0){
                res=i+1;
            }
            if(s.containsKey(presum)==false){
                s.put(presum,i);
            }
            if(s.containsKey(presum-0)){
                res=Math.max(res,i-s.get(presum-0));
            }
        }
        return res;
    }
}