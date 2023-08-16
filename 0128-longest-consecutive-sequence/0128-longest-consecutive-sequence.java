class Solution {
    public int longestConsecutive(int[] nums) {
        /*
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
         */
        int res=0;
        HashSet<Integer> s=new HashSet<>();
        for(int i=0;i<nums.length;i++){
            s.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++){
            if(s.contains(nums[i]-1)==false){
                int curr=1;
                while(s.contains(nums[i]+curr)){
                    curr+=1;
                }
                res=Math.max(res,curr);
            }
                
        }
        return res;
    }
}