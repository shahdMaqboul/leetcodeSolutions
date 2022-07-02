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

//another solution for the same problem
// https://www.goodtecher.com/leetcode-69-sqrtx/

// class Solution {
//     public int mySqrt(int x) {
//         long start = 0;
//         long end = x;
        
//         while (start + 1 < end) {
//             long mid = start + (end - start) / 2;
//             if (mid * mid == x) {
//                 return (int)mid;
//             } else if (mid * mid < x) {
//                 start = mid;
//             } else {
//                 end = mid;
//             }
//         }
        
//         if (end * end == x) {
//             return (int)end;
//         }
//         return (int)start;
//     }
// }