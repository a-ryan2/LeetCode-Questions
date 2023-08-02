class Solution {
    public void recurpermute(int[] nums,List<Integer> a,List<List<Integer>> b,boolean freq[]){
        if(a.size()==nums.length){
            b.add(new ArrayList<>(a));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(!freq[i]){
                freq[i]=true;
                a.add(nums[i]);
                recurpermute(nums,a,b,freq);
                a.remove(a.size()-1);
                freq[i]=false;
            }
        }
        
        
        
        
    }
    public List<List<Integer>> permute(int[] nums) {
        List<List<Integer>> n=new ArrayList<List<Integer>>();
        List<Integer> inner=new ArrayList<Integer>();
        boolean freq[]=new boolean[nums.length];
        recurpermute(nums,inner,n,freq);
        
        
        return n;
    }
}