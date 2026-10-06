class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int top=0;
        for(char a:s.toCharArray()){
            if(a=='(') top++;
            else if(a==')'){
                if(top-1<0) count++;
                else top--;
            } 
        }
        if(top>0) return count+top;
        return count;
    }
}