class Solution {
    public int minimumPushes(String word) {
        int count=0,s=0;
        for(int a=0;a<word.length();a++){
            if(a%8==0) s++;
            count+=s;
        }
        return count;
    }
}