class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> res=new ArrayList<>();
        int e1=Integer.MIN_VALUE,e2=Integer.MIN_VALUE;
        int count1=0,count2=0;
        for(int i=0;i<nums.length;i++){
            if(count1==0 && e2!=nums[i]){
                count1=1;
                e1=nums[i];
            }
            else if(count2==0 && e1!=nums[i]){
                count2=1;
                e2=nums[i];
            }
            else if(e1==nums[i]){
                count1++;
            }
            else if(e2==nums[i]){
                count2++;
            }
            else{
                count1--;
                count2--;
            }
            
        }
        
        count1=0;count2=0;
        for(int i=0;i<nums.length;i++){
            if(e1==nums[i]){
                count1++;
            }
            if(e2==nums[i]){
                count2++;
            }
            
        }
        int min=(int)(nums.length/3)+1;
        if(count1>=min){
            res.add(e1);
        }
        if(count2>=min){
            res.add(e2);
        }
        return res;
    }
}