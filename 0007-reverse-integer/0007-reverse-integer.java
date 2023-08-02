class Solution {
    public int reverse(int x) {
        // if(x<0){
        //     x=-1*x;
        //     int y=0;
        //     while(x>0){
        //         y=(10*y)+x%10;
        //         x=x/10;
        //     }
        //     return -y;
        // }
            
        
        long y=0;
        while(x!=0){
            y=((y*10)+(x%10));
            x=x/10;
            
        }
        if(y>Integer.MAX_VALUE||y<Integer.MIN_VALUE){
            return 0;
        }
        return (int)y;
    }
}