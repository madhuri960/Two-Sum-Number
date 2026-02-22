class Solution {
    public int removeDuplicates(int[] nums) {
        
         int n = nums.length;  // travers the array
        int j = 2;           //define the postion of element
        for(int i = 2; i<n;i++){
            // check the conditon
            if(nums[i]!=nums[j-2]){

                //storre the value in nums[i]
                nums[j]= nums[i];
                j++;
            }
        }
        return j;
    }
}