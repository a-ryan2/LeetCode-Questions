    class Solution {
        public int maxProduct(int[] nums) {
            int n=nums.length;
            int m=Integer.MIN_VALUE;
            // if(n<=2){
            //     return (nums[0]-1)*(nums[1]-1);
            // }
            for(int i=0;i<n;i++){
                for(int j=i+1;j<n;j++){
                    int p=(nums[i]-1)*(nums[j]-1);
                    m=Math.max(m,p);
                }
            }
            return m;
        }
    }