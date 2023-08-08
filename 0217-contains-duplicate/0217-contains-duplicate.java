class Solution {
    public boolean containsDuplicate(int[] nums) {
        // HashSet<Integer> s=new HashSet<>();
        // for(int i=0;i<nums.length;i++){
        //     if(s.contains(nums[i])){
        //         return true;
        //     }
        //     s.add(nums[i]);
        // }
        //return false;
        // Arrays.sort(nums);
        // for(int i=0;i<nums.length-1;i++){
        //     if(nums[i]==nums[i+1]){
        //         return true;
        //     }
        // }
        // return false;
        HashSet<Integer> s = new HashSet<Integer>();
		 for(int i : nums)
			 if(!s.add(i))// if there is same
				 return true; 
		 return false;
    }
}