

class Solution {
    public int majorityElement(int[] nums) {
        int n = nums.length;
        HashMap<Integer, Integer> map = new HashMap<>();

        // Count frequency of each element
        for (int i = 0; i < n; i++) {
            if (map.containsKey(nums[i])) {
                int count = map.get(nums[i]);
                map.put(nums[i], count + 1);
            } else {
                map.put(nums[i], 1);
            }
        }

        // Find element with frequency > n/2
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue() > n / 2) {
                return entry.getKey();
            }
        }

        return 0; // Default return (though problem guarantees majority element exists)
    }
}