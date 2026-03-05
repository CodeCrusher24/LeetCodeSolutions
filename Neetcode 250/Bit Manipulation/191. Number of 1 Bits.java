class Solution {
    public int hammingWeight(int n) {
        int countOfSetBits=0;
        while(n!=0){
            n=n&(n-1);
            countOfSetBits++;
        }
        return countOfSetBits;
    }
}
