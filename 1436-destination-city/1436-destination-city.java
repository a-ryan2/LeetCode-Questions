class Solution {
    public String destCity(List<List<String>> paths) {
        int p=paths.size();
        HashSet<String> s=new HashSet<>();
        //int x=2*p;
        // List<String> one=new ArrayList<>();
        // one=paths.get(p-1);
        // String x=one.get(one.size()-1);
        
        for(int i=0;i<p;i++){
            List<String> a=new ArrayList<>();
            a=paths.get(i);
            s.add(a.get(1));
        }
        for(int i=0;i<p;i++){
            List<String> b=new ArrayList<>();
            b=paths.get(i);
            s.remove(b.get(0));
        }
        
        // Iterator value = s.iterator(); 
        // while (value.hasNext()) { 
        //     String pet=value.next(); 
        // } 
        String pet=s.toString();
        pet = pet.replaceAll("[\\[\\](){}]","");
        
        return pet;
        
    }
}