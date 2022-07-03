class Solution {
    public int maximumProduct(int[] nums) {
        Arrays.sort(nums);
        int n = nums.length;
        return Math.max(
                nums[n - 1] * nums[n - 2] * nums[n - 3],
                nums[0] * nums[1] * nums[n - 1]    // consider the negative numbers
        );
    }
}

//got the solution from https://jmchung.gitbooks.io/leetcode-java/content/problems/628-maximum-product-of-three-numbers.html