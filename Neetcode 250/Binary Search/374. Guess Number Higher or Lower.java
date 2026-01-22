/** 
 * Forward declaration of guess API.
 * @param  num   your guess
 * @return 	     -1 if num is higher than the picked number
 *			      1 if num is lower than the picked number
 *               otherwise return 0
 * int guess(int num);
 */

public class Solution extends GuessGame {
    public int guessNumber(int n) {
        int start=1;
        int end=n;
        while(start<=end){
            int myGuess=start+(end-start)/2;
            int output=guess(myGuess);
            if(output==0) return myGuess;
            else if(output==-1){
                end=myGuess-1;
            }
            else if(output==1){
                start=myGuess+1;
            }
        }
        return -1;
    }
}
