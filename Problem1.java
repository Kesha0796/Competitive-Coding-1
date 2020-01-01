
// Find missing number
class Solution {
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);
        for(int i=1;i<nums.length;i++)
        {
            if(nums[0]==1)
                return 0;
            else
            {
                if(nums[i]-nums[i-1]!=1)
                    return nums[i]-1;
            }
        }
        if(nums.length==1 && nums[0]==1)
            return 0;
        return nums[nums.length-1]+1;
    }
}