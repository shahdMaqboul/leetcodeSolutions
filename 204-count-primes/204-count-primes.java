class Solution {
    public int countPrimes(int n) {
        boolean[] prime =new boolean [n];
        Arrays.fill(prime,true);
        
        for(int i =2;i*i < n;i++){
            for(int j=i; i*j < n ;j++){
                if(prime[i]) prime[i*j] = false;
            }
        }
        
        int count=0;
        
        for(int i=2;i<prime.length;i++){
            if(prime[i]) {count++;}
        }
        
        return count;

    }
}

// [0,1,2,3,4,5,6,7,8,9,10]
// solved it with help of https://www.youtube.com/watch?v=XL_pcTDwlbw