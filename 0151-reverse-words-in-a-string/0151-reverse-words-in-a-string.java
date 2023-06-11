class Solution {
    public String reverseWords(String s) {
        String result="";
        int p=s.length();
        int i=p-1;
        while(i>=0){
            if(s.charAt(i)==' '){
                i--;
                continue;
            }
            int j=i+1;
            while(i>=0 && s.charAt(i)!=' ') i--;
            if(result.equals(""))  result+=s.substring(i+1,j);
            
            else result+=" "+s.substring(i+1,j);

        }
        return result;
    }

}