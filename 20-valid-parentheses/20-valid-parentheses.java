class Solution {
    public boolean isValid(String s) {
        if(s.length() == 0) return true;
        if(s.length() == 1) return false;
        String p;
        Stack <String> st = new Stack<String>();
        String [] arr = s.split("");
        for(int i =0;i<arr.length;i++){
            if(arr[i].equals(")") || arr[i].equals("}") || arr[i].equals("]")){
                if(st.size() == 0) return false;
                p=st.pop();
                if((arr[i].equals(")") && !p.equals("("))
                   || (arr[i].equals("}") && !p.equals("{"))
                    || (arr[i].equals("]") && !p.equals("["))){
                    return false;
                }
            }else{
                st.push(arr[i]);
            }
        }
        if(st.size() == 0)
        return true;
        else{
            return false;
        }
    }
}