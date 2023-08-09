class Solution {
    public int sumOfUnique(int[] nums) {
        // HashMap<Integer,Integer> s=new HashMap<>();
        // int sum=0;
        // for(int i=0;i<nums.length;i++){
        //     s.put(nums[i],s.getOrDefault(nums[i],0)+1);
        //     if(s.get(nums[i])==1){
        //         sum=sum+nums[i];
        //     }
        //     else if(s.get(nums[i])==2){
        //         sum=sum-nums[i];
        //     }
        // }
        // return sum;
        HashMap<Integer,Integer> s=new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(s.containsKey(nums[i])){
                s.put(nums[i],s.get(nums[i])+1);
            }
            else
                s.put(nums[i],1);
        }
        int sum=0;
        for(Map.Entry<Integer,Integer> e:s.entrySet()){
            if(e.getValue()==1){
                sum=sum+e.getKey();
            }
        }
        return sum;
        
        
        
        
        
//     int[] counter = new int[101];
// 	int sum = 0;
// 	for (int num : nums) {
// 		counter[num]++;		
// 		if (counter[num] == 1)	
// 			sum += num;	

// 		if (counter[num] == 2)	
// 			sum -= num;			

// 	}
// 	return sum;

                
    }
}