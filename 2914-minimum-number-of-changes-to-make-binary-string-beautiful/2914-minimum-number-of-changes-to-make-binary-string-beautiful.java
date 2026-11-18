class Solution {
    public int minChanges(String s) {
        char m[]=s.toCharArray();
        int n=s.length();
        int count=0;
        for(int a=1;a<n;a++){
            if(a%2!=0 && m[a]!=m[a-1]){
                m[a]=m[a-1];
                count++;
            }
        }
        return count;
    }
}