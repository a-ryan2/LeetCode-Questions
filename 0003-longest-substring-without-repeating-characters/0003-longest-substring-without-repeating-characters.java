class Solution {
    public int lengthOfLongestSubstring(String s) {
        /*
        int count=0;
        int curr=0;
        if(s.length()==0){
            return 0;
        }
        HashMap<Character,Integer> m=new HashMap<>();
        for(int i=0;i<s.length();i++){
            //m.put(s.charAt(i),m.getOrDefault(s.charAt(i),0)+1);
            if(m.containsKey(s.charAt(i))==true){
                i=m.get(s.charAt(i));
                m.clear();
                count=Math.max(count,curr);
                curr=0;
                
            }
            else{
                m.put(s.charAt(i),i);
                curr++;
            }
            
        }
        count=Math.max(count,curr);
        
        return count;
        */
        if (s.length()==0) return 0;
        HashMap<Character, Integer> map = new HashMap<Character, Integer>();
        int max=0;
        for (int i=0, j=0; i<s.length(); ++i){
            if (map.containsKey(s.charAt(i))){
                j = Math.max(j,map.get(s.charAt(i))+1);
            }
            map.put(s.charAt(i),i);
            max = Math.max(max,i-j+1);
        }
        return max;
    }
}