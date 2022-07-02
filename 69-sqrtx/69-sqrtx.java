class Solution {
    public int mySqrt(int x) {
        
        if(x==1 || x==0) return x;
        for(long i=0;i<x;i++){
            if(i*i <= x && (i+1)*(i+1)>x){
                return (int)i;
            }
                
        }
        return 0;
        
    }
}