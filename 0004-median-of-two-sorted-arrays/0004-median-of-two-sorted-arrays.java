class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        double result=0.0;
        double sum =0;
        int m=nums1.length;
        int n=nums2.length;
        double x=2.00;
        int[] bye =new int[m+n];
        for(int i=0;i<m;i++){
            bye[i]=nums1[i];
        }
        int j=0;
        for(int i=m;i<m+n;i++){
            bye[i]=nums2[j];
            j++;
        }
        Arrays.sort(bye);
        for(int i=0;i<m+n;i++){
            if((m+n)%2==0){
                sum+=bye[(m+n)/2]+bye[((m+n)/2)-1];
                return sum/x;
            }
            else 
                sum=bye[((m+n)/2)];
                return sum;
        }
        return 0.0000;
    }
}