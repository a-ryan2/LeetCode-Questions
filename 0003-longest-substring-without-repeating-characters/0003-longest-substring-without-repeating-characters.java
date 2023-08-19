class Solution {
    public int lengthOfLongestSubstring(String s) {
        int count=0;
        int curr=0;
        HashMap<Character,Integer> h=new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(h.containsKey(s.charAt(i))==true){
                //curr=(i-h.getValue(s.charAt(i)));
                //h.put(s.charAt(i),i);
                i=h.get(s.charAt(i));
                h.clear();
                count=Math.max(count,curr);
                curr=0;
                //i--;
            }
            else{
                h.put(s.charAt(i),i);
                curr++;
            }
        }
        count=Math.max(count,curr);
        return count;
    }
}