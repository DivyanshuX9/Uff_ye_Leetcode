class Solution {
    public String removeOuterParentheses(String s) {
        StringBuilder str=new StringBuilder();
        int top=0;
        for(int i=0;i<s.length();i++){ 
            if(s.charAt(i)=='('){
                top++;
                if (top > 1) {
                    str.append('(');
                }
            }else{
                 if (top > 1) {
                    str.append(')');
                }
                top--;
            }
        }
        return str.toString();
    }
}