class Solution {
     public boolean isPowerOfFour(int n) {
        int count=0;
        while(count<100){
                if(Math.pow(4,count)==n) return true;
                count++;
        }
        return false;
    }
}