class Solution {
    public char findTheDifference(String s, String t) {
        char charArrayS[] = s.toCharArray();
        Arrays.sort(charArrayS);
        
        char charArrayT[] = t.toCharArray();
        Arrays.sort(charArrayT);
        
        char ret=' ';
        
        for(int i=0;i<charArrayT.length;i++ ){
            if(i == charArrayT.length-1 
              || charArrayT[i]!=charArrayS[i]){
                ret = charArrayT[i];
                break;
            }
        }
        return ret;
    }
}