class Solution {
   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
       int n1=nums1.length;
       int n2=nums2.length;
       if (n1 > n2)
            return findMedianSortedArrays(nums2, nums1);
       int low=0;
       int high=n1;
       while(low<=high){
           int i1=(low+high)/2;
           int i2=((n1+n2+1)/2)-i1;
           int min1=(i1==n1)?Integer.MAX_VALUE:nums1[i1];
           int max1=(i1==0)?Integer.MIN_VALUE:nums1[i1-1];
           int min2=(i2==n2)?Integer.MAX_VALUE:nums2[i2];
           int max2=(i2==0)?Integer.MIN_VALUE:nums2[i2-1];
           if(max1<=min2 &&max2<=min1){
               if((n1+n2)%2==0){
                   return ((double)(Math.max(max1,max2)+Math.min(min1,min2)))/2;
               }
               else
                return((double)Math.max(max1,max2));
           }
           else if(max1>min2){
               high=i1-1;
           }
           else{
               low=i1+1;
           }
       }
       return -1;
   }
    
    
    
    
    

    
    // public double findMedianSortedArrays(int[] nums1, int[] nums2) {
    //     double result=0.0;
    //     double sum =0;
    //     int m=nums1.length;
    //     int n=nums2.length;
    //     double x=2.00;
    //     int[] bye =new int[m+n];
    //     for(int i=0;i<m;i++){
    //         bye[i]=nums1[i];
    //     }
    //     int j=0;
    //     for(int i=m;i<m+n;i++){
    //         bye[i]=nums2[j];
    //         j++;
    //     }
    //     Arrays.sort(bye);
    //     for(int i=0;i<m+n;i++){
    //         if((m+n)%2==0){
    //             sum+=bye[(m+n)/2]+bye[((m+n)/2)-1];
    //             return sum/x;
    //         }
    //         else 
    //             sum=bye[((m+n)/2)];
    //             return sum;
    //     }
    //     return 0.0000;
    // }
}