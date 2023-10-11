class Solution {
    public int[] merge(int[] nums1, int m, int[] nums2, int n) {
        int arr[]=new int[m+n];
        for(int i=0;i<m;i++){
            arr[i]=nums1[i];
        }
        for(int i=0;i<n;i++){
            arr[i+m]=nums2[i];
        }
        Arrays.sort(arr);
        for(int i=0;i<m+n;i++){
            nums1[i]=arr[i];
        }
        // System.out.print("[");
        // int i;
        // for(i=0;i<arr.length-1;i++){
        //     System.out.print(arr[i]+",");
        // }
        // System.out.print(arr[i]);
        // System.out.print("]");
        return nums1;
    }
}