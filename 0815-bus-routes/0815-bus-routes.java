class Solution {
    public int numBusesToDestination(int[][] routes, int S, int T) {
        if(S==T) return 0;
        
        Set<Integer> visited = new HashSet<>();
        
        // Map a Stop to Routes e.g. 
        // 1->0   - stop #1 belongs to one route line i.e. I can choose routes #0 only
        // 7->0,1 - stop #7 is a cross-platform interchange i.e. I can choose two routes: #0 and #1
        Map<Integer, ArrayList<Integer>> stopToRoutes = new HashMap<Integer, ArrayList<Integer>>();
        for(int i=0; i<routes.length; i++){
            for(int stop : routes[i]){
                if(stopToRoutes.get(stop)==null) stopToRoutes.put(stop, new ArrayList<>());
                stopToRoutes.get(stop).add(i);
            }
        }
         
        // BFS Shortest Path template is used below
        // you can check the `Word Ladder` problem as another example
        Queue<Integer> q = new LinkedList<>();
        q.add(S);
        
        int level=1;
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int currentStop = q.remove();
                
                // get all routes available from the current stop 
                for(int routeId : stopToRoutes.get(currentStop)){ 
                    if(!visited.contains(routeId)){
                        visited.add(routeId);
                        
                        // get all stops from the route
                        for(int stop : routes[routeId]){
                            if(stop==T) return level;                        
                            q.add(stop);                            
                        }
                    }
                }
            }
            level++;
        }
        
        return -1;
    }
}