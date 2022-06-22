class Solution {
    public boolean isValid(String s) {
        Stack <String> st = new Stack<String>();
        String [] arr = s.split("");
        for(int i =0;i<arr.length;i++){
                if(arr[i].equals("(")) st.push(")");
                else if (arr[i].equals("[")) st.push("]");
                else if (arr[i].equals("{")) st.push("}");
                else if (st.size() != 0){
                    if(arr[i].equals(st.pop()) == false) return false;
                }else{
                    return false;
                }    
        }
        if(st.size() == 0)
        return true;
        else{
            return false;
        }
    }
}