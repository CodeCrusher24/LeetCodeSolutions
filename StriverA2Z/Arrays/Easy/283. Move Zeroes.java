class Solution {
    public void moveZeroes(int[] nums) {
        int n=nums.length;
        int i=0, j=0;
        while(i<n){
            if(nums[i]!=0){
                if(i!=j){
                    nums[j]=nums[i];
                    nums[i]=0;
                }
                j++;
            }
            i++;
        }
    }
}
