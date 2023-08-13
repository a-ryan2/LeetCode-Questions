class Solution {
    public int findMinFibonacciNumbers(int k) {
//         int arr[]=new int[k];
//         arr[0]=0;
//         arr[1]=1;
//         for(int i=2;i<k;i++){
//             arr[i]=arr[i-2]+arr[i-1];
//         }
//         for(int i=0;i<k;i++){
            
//         }
        //int first=0;
        int a=1;
        int b=1;
        int c=0;
        while(c<k){
            c=a+b;
            a=b;
            b=c;
        }
        int count=0;
        while(k!=0){
            if(k>=c){
                k=k-c;
                count++;
            }
            c=b;
            b=a;
            a=c-b;
        }
        return count;
        
    }
}