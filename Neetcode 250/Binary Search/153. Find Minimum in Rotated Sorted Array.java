class Solution {
    public int findMin(int[] nums) {
        int low=0, high=nums.length-1, result=-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            if(nums[middle]>nums[nums.length-1]){
                low=middle+1;
            }
            else{
                result=nums[middle];
                high=middle-1;
            }
        }
        return result;
    }
}
