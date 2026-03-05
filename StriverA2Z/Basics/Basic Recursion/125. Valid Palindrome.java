class Solution {
    private boolean Pali(int i, char[] str){
        if(i>=str.length/2) return true;
        if(str[i]!=str[str.length-i-1]) return false;
        return Pali(i+1,str);
    }   
    public boolean isPalindrome(String s) {
        StringBuilder sb=new StringBuilder();
        for(char c: s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                sb.append(Character.toLowerCase(c));
            }
        }
        char[] arr = sb.toString().toCharArray();
        return Pali(0,arr);    
    }
}
