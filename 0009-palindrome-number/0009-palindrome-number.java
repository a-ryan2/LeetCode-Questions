class Solution {
    public boolean isPalindrome(int x) {
        // String s=Integer.toString(x);
        // if(s.length()==1){
        //     return true;
        // }
        // for(int i=0;i<(s.length())/2;i++){
        //     if(s.charAt(i)!=s.charAt(s.length()-1-i)){
        //         return false;
        //     }
        // }
        // return true;
        
        if(x<0||x!=0&&x%10==0){
            return false;
        }
        int rev=0;
        while(x>rev){
            rev=rev*10+x%10;
            x=x/10;
        }
        if(x==rev||x==rev/10){
            return true;
        }
        return false;
    }
}