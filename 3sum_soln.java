class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        
        int len = nums.length;
        
        List<List<Integer>> ans = new ArrayList<>();
        
        if(nums.length < 3)
            return ans;
        
        //sort the given array.
        Arrays.sort(nums);
        
        int i =0;
        int j,k;
        while(i<len-2)
        {
            if(nums[i] > 0)
                break;
             j = i+1;
            k =len-1;
            while(j<k)
            {
                int sum = nums[i] + nums[j] + nums[k];
                //System.out.println("Sum="+sum);
                if(sum == 0 && j<k)
                 ans.add(Arrays.asList(nums[i],  nums[j],nums[k]));
                
                if(sum<=0 && j<k)
                {
                    while(nums[j] == nums[++j] && j<k );
                        //j++;
                }
                
                if(sum>0 && j<k)
                {
                    while(nums[k] == nums[--k] && j<k );
                       // k--;
                }
                
            }
            while(nums[i] == nums[++i] && i < len-2);
        }
        
        return ans;
    }
}
