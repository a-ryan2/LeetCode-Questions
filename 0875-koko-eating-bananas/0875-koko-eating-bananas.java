class Solution {
    public int totalh(int[] piles,int bperh){
        int totalhour=0;
        int n=piles.length;
        for(int i=0;i<n;i++){
            totalhour+=Math.ceil((double)piles[i]/(double)bperh);   
        }
        return totalhour;
        
    }
    public int minEatingSpeed(int[] piles, int h) {
        int low=0;
        int max=piles[0];
        int n=piles.length;
        for(int i=1;i<n;i++){
            if(piles[i]>max){
                max=piles[i];
            }
        }
        int high=max;
        while(low<=high){
            int mid=(low+high)/2;
            int totalhour=totalh(piles,mid);
            if(totalhour<=h){
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return low;
    }
}