class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs.length==0) return "";
//         String prefix=strs[0];
//         for(int i=1;i<strs.length;i++){
//             while(strs[i].indexOf(prefix)!=0){
//                 prefix=prefix.substring(0,prefix.length()-1);
//             }
            
//         }
//         return prefix;
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs);
        char[] First=strs[0].toCharArray();
        char[] Last=strs[strs.length-1].toCharArray();
        for(int i=0;i<First.length;i++){
            if(First[i]!=Last[i]){
                break;
            }
            sb.append(First[i]);
        }
        return sb.toString();
    }
}