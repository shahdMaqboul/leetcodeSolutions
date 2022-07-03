class Solution {
    public String reverseVowels(String s) {
        
        char[] sArr = s.toCharArray();
        char temp;
        int i=0;
        int j= sArr.length-1;
        while(i<j){
            
            if(isVowel(sArr[i]) && isVowel(sArr[j])){
                temp=sArr[j];
                sArr[j]=sArr[i];
                sArr[i]=temp;
                i++;
                j--;
            }else if(isVowel(sArr[i])){
                j--;
            }else if(isVowel(sArr[j])){
                i++;
            }else{
                i++;
                j--;
            }
            // System.out.println(i);
            // System.out.println(j);
        }
        return String.valueOf(sArr);
        
    }
    
    private boolean isVowel(char c) {
        return c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u' || c == 'A' || c == 'E' || c == 'I' || c == 'O' || c == 'U';
    }
}