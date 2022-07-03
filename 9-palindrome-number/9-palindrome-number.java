class Solution {
    public boolean isPalindrome(int x) {
        if(x<0) return false;
        String temp = Integer.toString(x);
        int last=temp.length()-1;
        
        for(int i=0 ; i < temp.length()/2;i++){
            if(temp.charAt(i) != temp.charAt(last-i)){
                return false;
            }
        }
        return true;
    }
}