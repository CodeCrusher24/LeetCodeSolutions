class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        int ld;
        int dup=x;
        int rev=0;
        while(dup>0){
            ld=dup%10;
            rev=rev*10+ld;
            dup/=10;
        }
        return x==rev;
    }
}
