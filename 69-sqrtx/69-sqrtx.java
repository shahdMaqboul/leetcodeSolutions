class Solution {
    public int mySqrt(int x) {
        // if(x==1 || x==0) return x;
        // for(int i=0;i<=x/3;i++){
        //     if(((i+1) * (i+1)) > x){
        //         return i;
        //     }
        // }
        // // double xj = 1.0;
        // // xj++;
        // // System.out.println(xj);
        // return 0;
        
        // long s =0;
        if(x==1 || x==0) return x;
        for(long i=0;i<x;i++){
            if(i*i <= x && (i+1)*(i+1)>x){
                return (int)i;
            }
                
        }
        return 0;
        
    }
}