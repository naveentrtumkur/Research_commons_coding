class Solution {
    public int minCostClimbingStairs(int[] cost) {
        
        if(cost.length == 0)
            return 0;
        
        if(cost.length == 1)
            return cost[0];
        
        if(cost.length ==2 )
            return Math.min(cost[0],cost[1]);
        
        int f0 = cost[0];
        int f1 = cost[1];
        
        
        for(int i=2;i<cost.length;i++)
        {
            
            int temp = Math.min(f0,f1) + cost[i];
            f0 = f1;
            f1 = temp;
        }
        return Math.min(f0,f1);
        
        
    }
}
