class Solution {
    public boolean isPerfectSquare(int num) {
        for(long i=0 ; i<=num ; i++){
            if(i*i>num) break;
            if(i*i==num) return true;
        }
        return false;
        
    }
}