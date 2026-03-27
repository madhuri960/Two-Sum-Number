class Solution {
    public int minSubArrayLen(int target, int[] nums) {
      int left = 0;
int currSum = 0;
int minlen = Integer.MAX_VALUE;

for (int right = 0; right < nums.length; right++) {
    currSum += nums[right];

    while (currSum >= target) {
        minlen = Math.min(minlen, right - left + 1);
        currSum -= nums[left];   // FIXED HERE
        left++;
    }
}

if (minlen == Integer.MAX_VALUE) {
    return 0;
}
return minlen;
    }
}