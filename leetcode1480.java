class Solution {
    public int[] runningSum(int[] nums) {
        int[] memo = new int[nums.length];
        memo[0] = nums[0];
        for(int i =1; i< nums.length; i++){
            memo[i] = memo[i-1] + nums[i];
        }
        return memo;
    }
}