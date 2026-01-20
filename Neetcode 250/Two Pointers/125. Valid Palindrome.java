import java.util.*;
class Solution {
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for (char c: s.toCharArray()){
            if (Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        String result=sb.toString();
        int i=0, j=result.length()-1;
        while(i<j){
            if(result.charAt(i)!=result.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
        return true;
    }
}
