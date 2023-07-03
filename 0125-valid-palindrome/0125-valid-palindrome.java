class Solution {
    public boolean isPalindrome(String s) {
        s=s.toLowerCase();
        String p=s.replaceAll("[^a-z0-9]","");
        //if(p.length%2==0){
        if(p.length()<2){
            return true;
        }
        for(int i=0;i<(p.length()/2);i++){
            
            if(p.charAt(i)!=p.charAt(p.length()-1-i))
                return false;
        }
        return true;
    }
}