class Solution {
    public int addDigits(int num) {
        int r=10;
        
        while(r>9){
            r=0;
            while(num>0){
                r+=num%10;
                num=num/10; 
            }
            num=r;
        }
        return r;
    }
}