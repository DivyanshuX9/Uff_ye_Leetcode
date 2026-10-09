class Solution {
    public int minInsertions(String s) {
        int res=0;
        int need=0;
        int a=0;
        while(a<s.length()){
            char m=s.charAt(a++);
            if(m=='('){
                need+=2;
                if(need%2==1){
                    res++;
                    need--;
                }
            }else if(m==')'){
                need--;
                if(need==-1){
                    res++;
                    need=1;
                }
            }
        }
        return res+need;
    }
}