class Solution {
    public boolean isPowerOfTwo(int n) {
        while(n>=2){
            if(n%2 != 0) return false;
            n=n/2;
        }
        return n==1;
        
    }
}
// This video helped me to solve it in a better complexity
// https://www.youtube.com/watch?v=GNb8vSyw-WE