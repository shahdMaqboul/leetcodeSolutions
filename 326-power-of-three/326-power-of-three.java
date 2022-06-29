class Solution {
    public boolean isPowerOfThree(int n) {
        int rem;
        
        if(n <=0 ) return false;
        
        while(n!=1 && n!= -1){
            System.out.println(n);
            if(n%3 != 0){
                System.out.println("n%3"+ n%3);
                return false;
                }
            n=n/3;
        }
        return true;
    
    }
}