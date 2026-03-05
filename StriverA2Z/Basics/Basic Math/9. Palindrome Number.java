class Solution {
    public boolean isPalindrome(int x) {
        if(x<0 || (x%10==0 && x!=0)) return false;
        int halfNumber=0;
        while(x>halfNumber){
            halfNumber=halfNumber*10+x%10;
            x/=10;
        }
        return x==halfNumber || x==halfNumber/10;
    }
}
