class Solution {
    public int[] twoSum(int[] nums, int target) {
        if (nums.length < 2 || nums.length > 10000) {
            return null;
        }
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] < -1000000000 || nums[i] > 1000000000) {
                return null;
            }
        }
        if (target < -1000000000 || target > 1000000000) {
            return null;
        }
        int[] result = new int[2];
        for (int i = 0; i < nums.length; i++) {
            int temp = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                if (temp + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    return result;  
                }
            }
        }
        return null;
    }
}
