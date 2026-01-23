class Solution {
    public String mergeAlternately(String word1, String word2) {
        StringBuilder sb=new StringBuilder();
        int i=0, j=0, n=word1.length()-1, m=word2.length()-1;
        while(i<=n && j<=m){
            sb.append(word1.charAt(i));
            i++;
            sb.append(word2.charAt(j));
            j++;
        }
        while(i<=n){
            sb.append(word1.charAt(i));
            i++;
        }
        while(j<=m){
            sb.append(word2.charAt(j));
            j++;
        }
        String result=sb.toString();
        return result;
    }
}
