class Solution {
    public int sumOfUnique(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        int sum=0;
        for(int i=0;i<nums.length;i++){
            s.put(nums[i],s.getOrDefault(nums[i],0)+1);
            if(s.get(nums[i])==1){
                sum=sum+nums[i];
            }
            else if(s.get(nums[i])==2){
                sum=sum-nums[i];
            }
        }
        return sum;
                
    }
}