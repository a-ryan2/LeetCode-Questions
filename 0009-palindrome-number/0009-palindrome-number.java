class Solution {
    public boolean isPalindrome(int x) {
        String s=Integer.toString(x);
        if(s.length()==1){
            return true;
        }
        // if(s.length()==2){
        //     if(s.charAt(0)!=s.charAt(1)){
        //         return false;
        //     }
        //     return true;
        // }
        for(int i=0;i<(s.length())/2;i++){
            if(s.charAt(i)!=s.charAt(s.length()-1-i)){
                return false;
            }
        }
        return true;
        
        
        // while(x>=0){
        //     int p=x%10;
        //     x=x/10;
        //     arr.add(p);
        // }
        // int n=arr.size();
        // for(int i=0;i<n/2;i++){
        //     if(arr.get(i)!=arr.get(n-1-i)){
        //         return false;
        //     }
        // }
        // return true;
    }
}