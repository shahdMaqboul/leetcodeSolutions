class Solution {
    public boolean isPalindrome(String s) {
        
        s = s.replaceAll("\\s", ""); // using built in method to remove spaces
        s = s.replaceAll("\\p{Punct}", ""); // to remove punctuations
        s = s.toLowerCase();
        int len=s.length()-1;
        
        for(int i=0;i<s.length()/2;i++){
            if(s.charAt(i) != s.charAt(len-i)){
                return false;
            }
        }
        return true;
    }
}