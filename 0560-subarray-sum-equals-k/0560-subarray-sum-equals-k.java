class Solution {
    public int subarraySum(int[] nums, int k) {
        // int count=0;
        // for(int i=0;i<nums.length;i++){
        //     int cursum=0;
        //     for(int j=i;j<nums.length;j++){
        //         cursum=cursum+nums[j];
        //         if(cursum==k){
        //             count++;
        //         }
        //     }
        // }
        // return count;
//         int presum=0;
//         int count=0;
//         HashSet<Integer> s=new HashSet<>();
//         for(int i=0;i<nums.length;i++){
//             presum+=nums[i];
//             if(presum==k){
//                 count++;
//             }
//             if(s.contains(presum-k)){
//                 count++;
//             }
//             s.add(presum);
            
//         }
//         return count;
       
        int count = 0, sum = 0;
        HashMap < Integer, Integer > map = new HashMap < > ();
        map.put(0, 1);
      
        for (int i = 0; i < nums.length; i++) {
            sum += nums[i];
            if (map.containsKey(sum - k))
                count += map.get(sum - k);
            map.put(sum, map.getOrDefault(sum, 0) + 1);
        }
        return count;
    
    }
}