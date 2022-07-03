class Solution {
    public boolean isHappy(int n) {
        HashSet <Integer> hs = new HashSet<Integer>();
        int sum;
        while(! hs.contains(n)){
            hs.add(n);
            sum =0;
            
            while(n>0){
                sum += ((n%10) * (n%10));
                n=n/10;
            }
            n=sum;
            System.out.println(n);
        }
        return n==1;
    }
}

// Solved with help of https://www.youtube.com/watch?v=UhD5sj7R-m8