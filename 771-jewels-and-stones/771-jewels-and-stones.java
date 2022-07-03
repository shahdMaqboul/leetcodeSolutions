class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        HashSet<Character> j=new HashSet<Character>();
        int num=0;
        
        for(int i =0;i< jewels.length();i++){
            j.add(jewels.charAt(i));
        }
        
        for(int i =0;i< stones.length();i++){
            if(j.contains(stones.charAt(i)))
                num++;
        }
        
       return num; 
    }
}