class Solution {
    public int reverse(int x) {
        int revX=0;
        int copy=Math.abs(x);
        while(copy>0){
            revX=revX*10+copy%10;
            copy/=10;
        }
        if((revX>Integer.MIN_VALUE && revX<Integer.MAX_VALUE)){
            if(x<0){
                return -revX;
            }
            return revX;
        } 
        return 0;
    }
}
