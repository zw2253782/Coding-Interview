class Solution {
    public int threeSumSmaller(int[] nums, int target) {
        Arrays.sort(nums);
        int answer = 0;
        for(int i = 0; i < nums.length-2; i++) {
            int left = i+1;
            int right = nums.length-1;
            while (left < right) {
                if (nums[i]+nums[left]+nums[right] < target) {
                    answer += right-left;
                    left++;
                }
                else {
                    right--;
                }
            }
        }
        return answer;
    }
}
