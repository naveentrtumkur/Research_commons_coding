class Solution {
    int ways = 0; // A global counter relating to number of ways target forms.

    public int findTargetSumWays(int[] nums, int S) {
        calculate(nums, 0, 0, S);
        return ways;
    }
    public void calculate(int[] nums, int i, int sum, int S) {
        if (i == nums.length) {
            if (sum == S)
                ways++;
        } else {
            calculate(nums, i + 1, sum + nums[i], S);
            calculate(nums, i + 1, sum - nums[i], S);
        }
    }
}
