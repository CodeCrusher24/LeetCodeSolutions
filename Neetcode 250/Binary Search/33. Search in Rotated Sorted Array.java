class Solution {
    public int search(int[] nums, int target) {
        int low=0, n=nums.length, high=n-1;
        while(low<=high){
            int middle=low+(high-low)/2;
            if(nums[middle]==target) return middle;
            if(nums[middle]>nums[n-1]){
                if(nums[middle]<target){
                    low=middle+1;
                }
                if(nums[middle]>target){
                    if(nums[0]>target){
                        low=middle+1;
                    }
                    else{
                        high=middle-1;
                    }
                }
            }
            else{
                if(nums[middle]>target){
                    high=middle-1;
                }
                if(nums[middle]<target){
                    if(nums[n-1]<target){
                        high=middle-1;
                    }
                    else{
                        low=middle+1;
                    }
                }
            }
        }
        return -1;
    }
}
