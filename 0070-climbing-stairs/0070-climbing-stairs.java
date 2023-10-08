class Solution {
    public int climbStairs(int n) {
        int a=0;
        int b=1;
        int x=0;
        
        for(int i=0;i<n;i++){
            x=a+b;
            a=b;
            b=x;
            
        }
        return x;
        
        
    }
}