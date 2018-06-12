class Solution {
    public int[] twoSum(int[] nums, int target) {
       //Create a HashMap to store current difference value and position.
        Map<Integer, Integer> map = new HashMap<>();
        for(int i =0; i< nums.length;i++)
        {
            map.put(nums[i],i);
        }
        
        for(int i=0;i<nums.length;i++)
        {
            int comp = target - nums[i];
            if(map.containsKey(comp) && i!=map.get(comp))
            {
                return new int[] {i,map.get(comp)};
            }
        }
        
        return new int[] {-1,-1};
        
        
    }
}
