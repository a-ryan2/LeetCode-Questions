import java.util.Map.Entry;
class Solution {
    /*
    public int findShortestSubArray(int[] nums) {
        HashMap<Integer,Integer> s=new HashMap<>();
        // int degree=0;
        // HashMap<Integer,Integer> first_seen=new HashMap<>();
        // int length=0;
        for(int i=0;i<nums.length;i++){
            // if(s.containsKey(nums[i])){
            //     s.put(nums[i],s.get(nums[i])+1);
            // }
            // s.put(nums[i],1);
            // first_seen.putIfAbsent(nums[i],i);
            s.put(nums[i],s.getOrDefault(nums[i],0)+1);
            
//             if(s.get(nums[i])>degree){
//                 degree=s.get(nums[i]);
//                 length=i-first_seen.get(nums[i])+1;
//             }
//             else if(s.get(nums[i])==degree){
//                 length=Math.min(length,i-first_seen.get(nums[i]));
//             }
         }
        
        int m= Collections.max(s.values());
        //return length;
        int n=0;
        for(Entry<Integer, Integer> entry: s.entrySet()) {
            if(entry.getValue() == m){
                n=entry.getKey();
            }
        }
        int low=0;
        int high=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==n){
                low=i;
                break;    
            }  
        }
        for(int i=nums.length-1;i>=0;i--){
            if(nums[i]==n){
                high=i;
                break;    
            }  
        }
        return high-low+1;
    }
    */
    public int findShortestSubArray(int[] A) {
        Map<Integer, Integer> count = new HashMap<>(), first = new HashMap<>();
        int res = 0, degree = 0;
        for (int i = 0; i < A.length; ++i) {
            first.putIfAbsent(A[i], i);
            count.put(A[i], count.getOrDefault(A[i], 0) + 1);
            if (count.get(A[i]) > degree) {
                degree = count.get(A[i]);
                res = i - first.get(A[i]) + 1;
            } else if (count.get(A[i]) == degree)
                res = Math.min(res, i - first.get(A[i]) + 1);
        }
        return res;
    }
}