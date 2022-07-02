class Solution {
    public double myPow(double x, int n) {
        
        if(n<0) return 1.0 / pow(x, n);
        else return pow(x, n);
        
    }
    
    public double pow(double x, int n) {
        if (n == 0) return 1.0;
        
        System.out.println(n);
        
        double y = pow(x, n / 2);//recursion
        
        if (n % 2 == 0) { //if exponent is even
            return y * y;
        } else {//if exponent is odd
            return y * y * x;
        }
    }
}