class Solution {
    public int searchInsert(int[] nums, int target) {
        if(nums.length == 0 )
            return 0;
        
        int low = 0, high = nums.length-1;
        
        while(low<=high)
        {
            int mid = (low+(high))/2;
            if(nums[mid] == target)
                return mid;
            else if(nums[mid]< target)
                low = mid +1;
            else
                high = mid -1;
            
        }
        
        //Finally we encounter where low>high.
        // return low which would be the correct position to insert.
        return low;
    }
}
