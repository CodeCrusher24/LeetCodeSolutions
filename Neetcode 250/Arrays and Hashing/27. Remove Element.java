class Solution {
    public int removeElement(int[] nums, int val) {
        int n=nums.length, i=0, j=n-1;
        while(i<=j){
            if(nums[i]!=val){
                i++;
            }
            else{
                nums[i]=nums[j];
                j--;
            }
        }
        return i;
    }
}
