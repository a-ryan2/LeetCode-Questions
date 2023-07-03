class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        s=s.replaceAll("[^a-z0-9]","");
        //if(p.length%2==0){
        if(s.length()<2){
            return true;
        }
        for(int i=0;i<(s.length()/2);i++){
            
            if(s.charAt(i)!=s.charAt(s.length()-1-i))
                return false;
        }
        return true;
    }
}